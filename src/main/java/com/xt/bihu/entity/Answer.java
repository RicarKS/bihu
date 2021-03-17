package com.xt.bihu.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ToString
public class Answer {
    private Long answerId;

    private Integer answerLikedCount;

    private Integer answerCommentCount;

    private Date answerCreateTime;

    private Date answerUpdateTime;

    private Long questionId;

    private Long userId;

    private String answerContent;

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public Integer getAnswerLikedCount() {
        return answerLikedCount;
    }

    public void setAnswerLikedCount(Integer answerLikedCount) {
        this.answerLikedCount = answerLikedCount;
    }

    public Integer getAnswerCommentCount() {
        return answerCommentCount;
    }

    public void setAnswerCommentCount(Integer answerCommentCount) {
        this.answerCommentCount = answerCommentCount;
    }

    public Date getAnswerCreateTime() {
        return answerCreateTime;
    }

    public void setAnswerCreateTime(Date answerCreateTime) {
        this.answerCreateTime = answerCreateTime;
    }

    public Date getAnswerUpdateTime() {
        return answerUpdateTime;
    }

    public void setAnswerUpdateTime(Date answerUpdateTime) {
        this.answerUpdateTime = answerUpdateTime;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
    }
}