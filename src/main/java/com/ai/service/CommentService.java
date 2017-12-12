package com.ai.service;

import com.ai.dao.CommentDAO;
import com.ai.model.Comment;
import org.apache.commons.digester.annotations.rules.AttributeCallParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qian on 2017/12/12.
 */
@Service
public class CommentService {
    @Autowired
    private CommentDAO commentDAO;
    public List<Comment> getCommentsByEntity(int entityId, int entityType){
        return commentDAO.selectByEntity(entityId,entityType);
    }
    public int addComment(Comment comment){
        return commentDAO.addComment(comment);
    }
    public int getCommentCount(int entityId, int entityType){
        return commentDAO.getCommentCount(entityId,entityType);
    }
    public void deleteComment(int entityId, int entityType){
         commentDAO.updateStatus(entityId,entityType,1);
    }
}
