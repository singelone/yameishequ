package com.app.ymsq.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.app.ymsq.dao.goods.GoodsDao;
import com.app.ymsq.model.goods.Goods;
import com.app.ymsq.model.goods.GoodsQuery;
import com.app.ymsq.service.EnjoyGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnjoyGoodsServiceImpl implements EnjoyGoodsService {

    @Autowired
    private GoodsDao goodsDao;


    @Override
    public List<Goods> getGoods(Goods goods) { GoodsQuery example = new GoodsQuery();
        GoodsQuery.Criteria criteria = example.createCriteria();
        if (null != goods.getGoodsCategory())
            criteria.andGoodsCategoryEqualTo(goods.getGoodsCategory());
        if (StringUtils.isNotEmpty(goods.getName()))
            criteria.andNameEqualTo(goods.getName());
        if (StringUtils.isNotEmpty(goods.getBrand()))
            criteria.andBrandEqualTo(goods.getBrand());
        if (null != goods.getGoodsCategory()) {
            criteria.andGoodsCategoryEqualTo(goods.getGoodsCategory());
        }
        if (null != goods.getRangeAge()) {
            criteria.andRangeAgeLessThanOrEqualTo(goods.getRangeAge());
        }
        if (null != goods.getSellPrice())
        criteria.andSellPriceLessThanOrEqualTo(goods.getSellPrice());
        if (null != goods.getBrand())
        criteria.andBrandEqualTo(goods.getBrand());
        criteria.andStatusEqualTo(new Byte("0"));
        return goodsDao.selectByExample(example);
    }

    @Override
    public Goods getGoodsByPrimaryKey(Goods goods) {
        Goods goodsSelect = goodsDao.selectByPrimaryKey(goods.getGoodsId());
        if (null == goodsSelect)
            return null;
        return goodsSelect;
    }
}
