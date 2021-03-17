package com.xt.bihu.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ToString
public class User {
    private Long userId;

    private String email;

    private String userName;

    private String userPassword;

    private Date userCreateTime;

    private String userAvatarUrl;

    private String userGender;

    private String userSimpleDesc;

    private Integer userLikedCount;

    private Integer userCollectedCount;

    private Integer userFollowedCount;

    private Integer userCollectCount;

    private Integer userFollowCount;

    private Integer userScannedCount;

    private String userFullDesc;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public String getUserAvatarUrl() {
        return userAvatarUrl;
    }

    public void setUserAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl == null ? null : userAvatarUrl.trim();
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }

    public String getUserSimpleDesc() {
        return userSimpleDesc;
    }

    public void setUserSimpleDesc(String userSimpleDesc) {
        this.userSimpleDesc = userSimpleDesc == null ? null : userSimpleDesc.trim();
    }

    public Integer getUserLikedCount() {
        return userLikedCount;
    }

    public void setUserLikedCount(Integer userLikedCount) {
        this.userLikedCount = userLikedCount;
    }

    public Integer getUserCollectedCount() {
        return userCollectedCount;
    }

    public void setUserCollectedCount(Integer userCollectedCount) {
        this.userCollectedCount = userCollectedCount;
    }

    public Integer getUserFollowedCount() {
        return userFollowedCount;
    }

    public void setUserFollowedCount(Integer userFollowedCount) {
        this.userFollowedCount = userFollowedCount;
    }

    public Integer getUserCollectCount() {
        return userCollectCount;
    }

    public void setUserCollectCount(Integer userCollectCount) {
        this.userCollectCount = userCollectCount;
    }

    public Integer getUserFollowCount() {
        return userFollowCount;
    }

    public void setUserFollowCount(Integer userFollowCount) {
        this.userFollowCount = userFollowCount;
    }

    public Integer getUserScannedCount() {
        return userScannedCount;
    }

    public void setUserScannedCount(Integer userScannedCount) {
        this.userScannedCount = userScannedCount;
    }

    public String getUserFullDesc() {
        return userFullDesc;
    }

    public void setUserFullDesc(String userFullDesc) {
        this.userFullDesc = userFullDesc == null ? null : userFullDesc.trim();
    }
}