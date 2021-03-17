package com.xt.bihu.mapper;

import com.xt.bihu.entity.QuestionTopic;
import com.xt.bihu.entity.QuestionTopicExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QuestionTopicMapper {
    int countByExample(QuestionTopicExample example);

    int deleteByExample(QuestionTopicExample example);

    int deleteByPrimaryKey(Long questionTopicId);

    int insert(QuestionTopic record);

    int insertSelective(QuestionTopic record);

    List<QuestionTopic> selectByExample(QuestionTopicExample example);

    QuestionTopic selectByPrimaryKey(Long questionTopicId);

    int updateByExampleSelective(@Param("record") QuestionTopic record, @Param("example") QuestionTopicExample example);

    int updateByExample(@Param("record") QuestionTopic record, @Param("example") QuestionTopicExample example);

    int updateByPrimaryKeySelective(QuestionTopic record);

    int updateByPrimaryKey(QuestionTopic record);
}