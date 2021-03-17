package com.xt.bihu.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ToString
public class Question {
    private Long questionId;

    private String questionTitle;

    private String questionTopicList;

    private Integer questionFollowedCount;

    private Integer questionScannedCount;

    private Date questionCreateTime;

    private Long userId;

    private String questionContent;

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle == null ? null : questionTitle.trim();
    }

    public String getQuestionTopicList() {
        return questionTopicList;
    }

    public void setQuestionTopicList(String questionTopicList) {
        this.questionTopicList = questionTopicList == null ? null : questionTopicList.trim();
    }

    public Integer getQuestionFollowedCount() {
        return questionFollowedCount;
    }

    public void setQuestionFollowedCount(Integer questionFollowedCount) {
        this.questionFollowedCount = questionFollowedCount;
    }

    public Integer getQuestionScannedCount() {
        return questionScannedCount;
    }

    public void setQuestionScannedCount(Integer questionScannedCount) {
        this.questionScannedCount = questionScannedCount;
    }

    public Date getQuestionCreateTime() {
        return questionCreateTime;
    }

    public void setQuestionCreateTime(Date questionCreateTime) {
        this.questionCreateTime = questionCreateTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }
}