package com.app.ymsq.service;

import com.app.ymsq.model.comment.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getCommentByGoodsId(Comment comment);
}
