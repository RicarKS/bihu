package com.xt.bihu.mapper;

import com.xt.bihu.entity.QuestionComment;
import com.xt.bihu.entity.QuestionCommentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QuestionCommentMapper {
    int countByExample(QuestionCommentExample example);

    int deleteByExample(QuestionCommentExample example);

    int deleteByPrimaryKey(Long questionCommentId);

    int insert(QuestionComment record);

    int insertSelective(QuestionComment record);

    List<QuestionComment> selectByExampleWithBLOBs(QuestionCommentExample example);

    List<QuestionComment> selectByExample(QuestionCommentExample example);

    QuestionComment selectByPrimaryKey(Long questionCommentId);

    int updateByExampleSelective(@Param("record") QuestionComment record, @Param("example") QuestionCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionComment record, @Param("example") QuestionCommentExample example);

    int updateByExample(@Param("record") QuestionComment record, @Param("example") QuestionCommentExample example);

    int updateByPrimaryKeySelective(QuestionComment record);

    int updateByPrimaryKeyWithBLOBs(QuestionComment record);

    int updateByPrimaryKey(QuestionComment record);
}