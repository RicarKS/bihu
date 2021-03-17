package com.xt.bihu.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ToString
public class AnswerComment {
    private Long answerCommentId;

    private Integer answerCommentLikedCount;

    private Date answerCommentCreateTime;

    private Long answerCommentAtUserId;

    private String answerCommentAtUserName;

    private Long answerId;

    private Long userId;

    private String answerCommentContent;

    public Long getAnswerCommentId() {
        return answerCommentId;
    }

    public void setAnswerCommentId(Long answerCommentId) {
        this.answerCommentId = answerCommentId;
    }

    public Integer getAnswerCommentLikedCount() {
        return answerCommentLikedCount;
    }

    public void setAnswerCommentLikedCount(Integer answerCommentLikedCount) {
        this.answerCommentLikedCount = answerCommentLikedCount;
    }

    public Date getAnswerCommentCreateTime() {
        return answerCommentCreateTime;
    }

    public void setAnswerCommentCreateTime(Date answerCommentCreateTime) {
        this.answerCommentCreateTime = answerCommentCreateTime;
    }

    public Long getAnswerCommentAtUserId() {
        return answerCommentAtUserId;
    }

    public void setAnswerCommentAtUserId(Long answerCommentAtUserId) {
        this.answerCommentAtUserId = answerCommentAtUserId;
    }

    public String getAnswerCommentAtUserName() {
        return answerCommentAtUserName;
    }

    public void setAnswerCommentAtUserName(String answerCommentAtUserName) {
        this.answerCommentAtUserName = answerCommentAtUserName == null ? null : answerCommentAtUserName.trim();
    }

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAnswerCommentContent() {
        return answerCommentContent;
    }

    public void setAnswerCommentContent(String answerCommentContent) {
        this.answerCommentContent = answerCommentContent == null ? null : answerCommentContent.trim();
    }
}