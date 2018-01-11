package com.app.ymsq.controller;

import com.app.ymsq.constant.BaseResp;
import com.app.ymsq.constant.ErrCode;
import com.app.ymsq.model.goods.Goods;
import com.app.ymsq.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SuppressWarnings("all")
@Controller
@Api(description = "商品服务接口")
@RequestMapping("/app/yamei/enjoy")
public class GoodsController {

    private static Logger logger = LogManager.getLogger(GoodsController.class);

    @Autowired
    private GoodsService goodsService;

    private BaseResp baseResp = new BaseResp<>(ErrCode.SUCCESS,"success");

    /**
     * 共享服务商品列表
     * @param goods
     * @return
     */
    @RequestMapping(value = "/goodsList",method = RequestMethod.POST)
    @ApiOperation(value = "共享服务商品列表", notes = "王波")
    @ResponseBody
    public BaseResp getGoodsList(Goods goods) {
        if (null == goods.getGoodsType()) {
            logger.warn("# getGoodsList() : goodsType is null");
            return new BaseResp<>(ErrCode.VALIDATE_FAILED,"goodsType is null");
        }
        try {
            List<Goods> goodsList = goodsService.getEnjoinGoods(goods);
            if (CollectionUtils.isEmpty(goodsList))
                baseResp.setResultNote("goodsList is null");
            baseResp.setDetail(goodsList);
        } catch (Exception e) {
            logger.error("获取商品列表失败:{}",e);
            baseResp = new BaseResp<>(ErrCode.FAILED,"获取商品列表失败");
        }
        return baseResp;
    }

    /**
     * 获取共享商品详情
     * @param goods
     * @return
     */
    @RequestMapping(value = "/getOneGoods",method = RequestMethod.POST)
    @ApiOperation(value = "根据id获取一个商品", notes = "王波")
    @ResponseBody
    public BaseResp getOneGoods(Goods goods) {
        if (null == goods.getGoodsId()) {
            logger.warn("# getOneGoods() : goodsId is null");
            return new BaseResp<>(ErrCode.VALIDATE_FAILED,"goodsId is null");
        }
        try {
            Goods goodsByPrimaryKey = goodsService.getGoodsByPrimaryKey(goods);
            if (null == goodsByPrimaryKey)
                baseResp.setResultNote("goods is null");
            baseResp.setDetail(goodsByPrimaryKey);
        } catch (Exception e) {
            logger.error("获取一个商品失败:{}",e);
            baseResp = new BaseResp<>(ErrCode.FAILED,"获取一个商品失败");
        }
        return baseResp;
    }

    @RequestMapping(value = "/goodsSimilarList",method = RequestMethod.POST)
    @ApiOperation(value = "推荐商品列表", notes = "王波")
    @ResponseBody
    public BaseResp goodsSimilarList(Goods goods) {
        if (null == goods.getGoodsType()) {
            logger.warn("# goodsSimilarList() : goodsType is null");
            return new BaseResp<>(ErrCode.VALIDATE_FAILED,"goodsType is null");
        }
        if (null == goods.getGoodsCategory()) {
            logger.warn("# goodsSimilarList() : goodsCategory is null");
            return new BaseResp<>(ErrCode.VALIDATE_FAILED,"goodsCategory is null");
        }
        try {
            List<Goods> goodsList = goodsService.getEnjoinGoods(goods);
            if (CollectionUtils.isEmpty(goodsList))
                baseResp.setResultNote("goodsList is null");
            baseResp.setDetail(goodsList);
        } catch (Exception e) {
            logger.error("获取商品列表失败:{}",e);
            baseResp = new BaseResp<>(ErrCode.FAILED,"获取商品列表失败");
        }
        return baseResp;
    }

    /**
     * 超市商品列表
     * @param goods
     * @return
     */
    @RequestMapping(value = "/maketGoodsList",method = RequestMethod.POST)
    @ApiOperation(value = "超市商品列表", notes = "王波")
    @ResponseBody
    public BaseResp maketGoodsList(Goods goods) {
        if (null == goods.getGoodsType()) {
            logger.warn("# getGoodsList() : goodsType is null");
            return new BaseResp<>(ErrCode.VALIDATE_FAILED,"goodsType is null");
        }
        try {
            List<Goods> goodsList = goodsService.getEnjoinGoods(goods);
            if (CollectionUtils.isEmpty(goodsList))
                baseResp.setResultNote("goodsList is null");
            baseResp.setDetail(goodsList);
        } catch (Exception e) {
            logger.error("获取商品列表失败:{}",e);
            baseResp = new BaseResp<>(ErrCode.FAILED,"获取商品列表失败");
        }
        return baseResp;
    }

    /**
     * 超市商品发布
     * @param goods
     * @return
     */
    @RequestMapping(value = "/addMaketGoods",method = RequestMethod.POST)
    @ApiOperation(value = "超市商品发布", notes = "王波")
    @ResponseBody
    public BaseResp addMaketGoods(Goods goods) {
        if (null == goods) {
            logger.warn("# goods : goods is null");
            return new BaseResp<>(ErrCode.VALIDATE_FAILED,"goods is null");
        }
        try {
             goodsService.addGoods(goods);
            if (1 != goodsService.addGoods(goods))
                baseResp.setResultNote("保存goods失败!");
            baseResp.setResultNote("保存成功!");
        } catch (Exception e) {
            logger.error("获取商品列表失败:{}",e);
            baseResp = new BaseResp<>(ErrCode.FAILED,"获取商品列表失败");
        }
        return baseResp;
    }

}
