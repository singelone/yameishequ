package com.app.ymsq.service.impl;

import com.app.ymsq.dao.comment.CommentDao;
import com.app.ymsq.model.comment.Comment;
import com.app.ymsq.model.comment.CommentQuery;
import com.app.ymsq.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public List<Comment> getCommentByGoodsId(Comment comment) {
        CommentQuery query = new CommentQuery();
        CommentQuery.Criteria criteria = query.createCriteria();
        if (null != comment.getGoodsid()) {
            criteria.andGoodsidEqualTo(comment.getGoodsid());
            List<Comment> comments = commentDao.selectByExample(query);
            return comments;
        }
        return null;
    }
}
