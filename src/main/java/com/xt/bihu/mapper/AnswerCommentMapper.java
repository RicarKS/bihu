package com.xt.bihu.mapper;

import com.xt.bihu.entity.AnswerComment;
import com.xt.bihu.entity.AnswerCommentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerCommentMapper {
    int countByExample(AnswerCommentExample example);

    int deleteByExample(AnswerCommentExample example);

    int deleteByPrimaryKey(Long answerCommentId);

    int insert(AnswerComment record);

    int insertSelective(AnswerComment record);

    List<AnswerComment> selectByExampleWithBLOBs(AnswerCommentExample example);

    List<AnswerComment> selectByExample(AnswerCommentExample example);

    AnswerComment selectByPrimaryKey(Long answerCommentId);

    int updateByExampleSelective(@Param("record") AnswerComment record, @Param("example") AnswerCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") AnswerComment record, @Param("example") AnswerCommentExample example);

    int updateByExample(@Param("record") AnswerComment record, @Param("example") AnswerCommentExample example);

    int updateByPrimaryKeySelective(AnswerComment record);

    int updateByPrimaryKeyWithBLOBs(AnswerComment record);

    int updateByPrimaryKey(AnswerComment record);
}