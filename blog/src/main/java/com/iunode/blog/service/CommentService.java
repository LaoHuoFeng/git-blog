package com.iunode.blog.service;

import com.iunode.blog.po.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listCommentByBlog(Long id);

    Comment saveComment(Comment comment);

}
