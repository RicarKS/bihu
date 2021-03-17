package com.xt.bihu.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ToString
public class Collection {
    private Long collectionId;

    private String collectionName;

    private Date collectionCreateTime;

    private Date collectionUpdateTime;

    private Integer collectionFollowedCount;

    private Long userId;

    public Long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Long collectionId) {
        this.collectionId = collectionId;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName == null ? null : collectionName.trim();
    }

    public Date getCollectionCreateTime() {
        return collectionCreateTime;
    }

    public void setCollectionCreateTime(Date collectionCreateTime) {
        this.collectionCreateTime = collectionCreateTime;
    }

    public Date getCollectionUpdateTime() {
        return collectionUpdateTime;
    }

    public void setCollectionUpdateTime(Date collectionUpdateTime) {
        this.collectionUpdateTime = collectionUpdateTime;
    }

    public Integer getCollectionFollowedCount() {
        return collectionFollowedCount;
    }

    public void setCollectionFollowedCount(Integer collectionFollowedCount) {
        this.collectionFollowedCount = collectionFollowedCount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}