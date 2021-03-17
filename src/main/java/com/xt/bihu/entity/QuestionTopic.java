package com.xt.bihu.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class QuestionTopic {
    private Long questionTopicId;

    private Long topicId;

    private Long questionId;

    public Long getQuestionTopicId() {
        return questionTopicId;
    }

    public void setQuestionTopicId(Long questionTopicId) {
        this.questionTopicId = questionTopicId;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}