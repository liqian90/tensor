package com.ai.dao;

import com.ai.model.Comment;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by qian on 2017/12/12.
 */
@Mapper
public interface CommentDAO {
    String TABLE_NAME = " comment ";
    String INSERT_FIELDS = " user_id, content, created_date, entity_id, entity_type, status ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME," ( ",INSERT_FIELDS,") values (#{userId}, #{content},#{createDate},#{entityId},#{status})"})
    int addComment(Comment comment);

    @Update({"update from ",TABLE_NAME," set status=#{status} where entity_id=#{entityId} and entity_type=#{entityType}"})
    void updateStatus(@Param("entityId") int entityId, @Param("entityType") int entityType, @Param("status") int status);

    @Select({"select count(id) from ",TABLE_NAME," where entity_id=#{entityId} and entity_type=#{entityType}"})
    int getCommentCount(@Param("entityId") int entityId,@Param("entityTye") int entityType);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME,
            " where entity_id=#{entityId} and entity_type=#{entityType} order by id desc"})
    List<Comment> selectByEntity(@Param("entityId") int entityId, @Param("entityType") int entityType);
}
