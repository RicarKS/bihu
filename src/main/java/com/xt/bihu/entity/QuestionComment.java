package com.xt.bihu.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ToString
public class QuestionComment {
    private Long questionCommentId;

    private Integer questionCommentLikedCount;

    private Date questionCommentCreateTime;

    private Long questionCommentAtUserId;

    private String questionCommentAtUserName;

    private Long questionId;

    private Long userId;

    private String questionCommentContent;

    public Long getQuestionCommentId() {
        return questionCommentId;
    }

    public void setQuestionCommentId(Long questionCommentId) {
        this.questionCommentId = questionCommentId;
    }

    public Integer getQuestionCommentLikedCount() {
        return questionCommentLikedCount;
    }

    public void setQuestionCommentLikedCount(Integer questionCommentLikedCount) {
        this.questionCommentLikedCount = questionCommentLikedCount;
    }

    public Date getQuestionCommentCreateTime() {
        return questionCommentCreateTime;
    }

    public void setQuestionCommentCreateTime(Date questionCommentCreateTime) {
        this.questionCommentCreateTime = questionCommentCreateTime;
    }

    public Long getQuestionCommentAtUserId() {
        return questionCommentAtUserId;
    }

    public void setQuestionCommentAtUserId(Long questionCommentAtUserId) {
        this.questionCommentAtUserId = questionCommentAtUserId;
    }

    public String getQuestionCommentAtUserName() {
        return questionCommentAtUserName;
    }

    public void setQuestionCommentAtUserName(String questionCommentAtUserName) {
        this.questionCommentAtUserName = questionCommentAtUserName == null ? null : questionCommentAtUserName.trim();
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

    public String getQuestionCommentContent() {
        return questionCommentContent;
    }

    public void setQuestionCommentContent(String questionCommentContent) {
        this.questionCommentContent = questionCommentContent == null ? null : questionCommentContent.trim();
    }
}