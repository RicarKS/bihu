package com.xt.bihu.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Topic {
    private Long topicId;

    private String topicName;

    private String topicImageUrl;

    private Integer topicFollowedCount;

    private String topicDesc;

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName == null ? null : topicName.trim();
    }

    public String getTopicImageUrl() {
        return topicImageUrl;
    }

    public void setTopicImageUrl(String topicImageUrl) {
        this.topicImageUrl = topicImageUrl == null ? null : topicImageUrl.trim();
    }

    public Integer getTopicFollowedCount() {
        return topicFollowedCount;
    }

    public void setTopicFollowedCount(Integer topicFollowedCount) {
        this.topicFollowedCount = topicFollowedCount;
    }

    public String getTopicDesc() {
        return topicDesc;
    }

    public void setTopicDesc(String topicDesc) {
        this.topicDesc = topicDesc == null ? null : topicDesc.trim();
    }
}