package com.app.ymsq.controller;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.app.ymsq.constant.BaseResp;
import com.app.ymsq.constant.ErrCode;
import com.app.ymsq.model.comment.Comment;
import com.app.ymsq.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(description = "评论接口")
@RequestMapping("/app/yamei/comment")
public class CommentController {

    private static Logger logger = LogManager.getLogger(CommentController.class);

    @Autowired
    private CommentService commentService;

    private BaseResp baseResp = new BaseResp<>(ErrCode.SUCCESS,"success");

    @RequestMapping(value = "/commentList",method = RequestMethod.POST)
    @ApiOperation(value = "根据某个商品获取评论列表", notes = "王波")
    @ResponseBody
    public BaseResp getCommentByGoodsId(Comment comment) {
        if (null == comment.getGoodsid()) {
            logger.warn("# getCommentByGoodsId() : goodsid is null");
            return new BaseResp<>(ErrCode.VALIDATE_FAILED,"goodsid is null");
        }
        try {
            List<Comment> commentByGoodsId = commentService.getCommentByGoodsId(comment);
            if (CollectionUtils.isEmpty(commentByGoodsId)) {
                baseResp = new BaseResp<>(ErrCode.SUCCESS,"获取评论列表为空");
            } else {
                baseResp.setDetail(commentByGoodsId);
            }
        } catch (Exception e) {
            logger.error("获取评论列表失败:{}",e);
            baseResp = new BaseResp<>(ErrCode.FAILED,"获取评论列表失败");
        }
        return baseResp;
    }
}
