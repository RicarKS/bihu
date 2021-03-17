package com.xt.bihu.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNull() {
            addCriterion("user_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNotNull() {
            addCriterion("user_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeEqualTo(Date value) {
            addCriterion("user_create_time =", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotEqualTo(Date value) {
            addCriterion("user_create_time <>", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThan(Date value) {
            addCriterion("user_create_time >", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_create_time >=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThan(Date value) {
            addCriterion("user_create_time <", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_create_time <=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIn(List<Date> values) {
            addCriterion("user_create_time in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotIn(List<Date> values) {
            addCriterion("user_create_time not in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("user_create_time between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_create_time not between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlIsNull() {
            addCriterion("user_avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlIsNotNull() {
            addCriterion("user_avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlEqualTo(String value) {
            addCriterion("user_avatar_url =", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlNotEqualTo(String value) {
            addCriterion("user_avatar_url <>", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlGreaterThan(String value) {
            addCriterion("user_avatar_url >", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("user_avatar_url >=", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlLessThan(String value) {
            addCriterion("user_avatar_url <", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("user_avatar_url <=", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlLike(String value) {
            addCriterion("user_avatar_url like", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlNotLike(String value) {
            addCriterion("user_avatar_url not like", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlIn(List<String> values) {
            addCriterion("user_avatar_url in", values, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlNotIn(List<String> values) {
            addCriterion("user_avatar_url not in", values, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlBetween(String value1, String value2) {
            addCriterion("user_avatar_url between", value1, value2, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("user_avatar_url not between", value1, value2, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(String value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(String value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(String value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(String value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(String value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLike(String value) {
            addCriterion("user_gender like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotLike(String value) {
            addCriterion("user_gender not like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<String> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<String> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(String value1, String value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(String value1, String value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescIsNull() {
            addCriterion("user_simple_desc is null");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescIsNotNull() {
            addCriterion("user_simple_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescEqualTo(String value) {
            addCriterion("user_simple_desc =", value, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescNotEqualTo(String value) {
            addCriterion("user_simple_desc <>", value, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescGreaterThan(String value) {
            addCriterion("user_simple_desc >", value, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescGreaterThanOrEqualTo(String value) {
            addCriterion("user_simple_desc >=", value, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescLessThan(String value) {
            addCriterion("user_simple_desc <", value, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescLessThanOrEqualTo(String value) {
            addCriterion("user_simple_desc <=", value, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescLike(String value) {
            addCriterion("user_simple_desc like", value, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescNotLike(String value) {
            addCriterion("user_simple_desc not like", value, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescIn(List<String> values) {
            addCriterion("user_simple_desc in", values, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescNotIn(List<String> values) {
            addCriterion("user_simple_desc not in", values, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescBetween(String value1, String value2) {
            addCriterion("user_simple_desc between", value1, value2, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserSimpleDescNotBetween(String value1, String value2) {
            addCriterion("user_simple_desc not between", value1, value2, "userSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountIsNull() {
            addCriterion("user_liked_count is null");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountIsNotNull() {
            addCriterion("user_liked_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountEqualTo(Integer value) {
            addCriterion("user_liked_count =", value, "userLikedCount");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountNotEqualTo(Integer value) {
            addCriterion("user_liked_count <>", value, "userLikedCount");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountGreaterThan(Integer value) {
            addCriterion("user_liked_count >", value, "userLikedCount");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_liked_count >=", value, "userLikedCount");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountLessThan(Integer value) {
            addCriterion("user_liked_count <", value, "userLikedCount");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_liked_count <=", value, "userLikedCount");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountIn(List<Integer> values) {
            addCriterion("user_liked_count in", values, "userLikedCount");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountNotIn(List<Integer> values) {
            addCriterion("user_liked_count not in", values, "userLikedCount");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountBetween(Integer value1, Integer value2) {
            addCriterion("user_liked_count between", value1, value2, "userLikedCount");
            return (Criteria) this;
        }

        public Criteria andUserLikedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_liked_count not between", value1, value2, "userLikedCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountIsNull() {
            addCriterion("user_collected_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountIsNotNull() {
            addCriterion("user_collected_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountEqualTo(Integer value) {
            addCriterion("user_collected_count =", value, "userCollectedCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountNotEqualTo(Integer value) {
            addCriterion("user_collected_count <>", value, "userCollectedCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountGreaterThan(Integer value) {
            addCriterion("user_collected_count >", value, "userCollectedCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_collected_count >=", value, "userCollectedCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountLessThan(Integer value) {
            addCriterion("user_collected_count <", value, "userCollectedCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_collected_count <=", value, "userCollectedCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountIn(List<Integer> values) {
            addCriterion("user_collected_count in", values, "userCollectedCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountNotIn(List<Integer> values) {
            addCriterion("user_collected_count not in", values, "userCollectedCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountBetween(Integer value1, Integer value2) {
            addCriterion("user_collected_count between", value1, value2, "userCollectedCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_collected_count not between", value1, value2, "userCollectedCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountIsNull() {
            addCriterion("user_followed_count is null");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountIsNotNull() {
            addCriterion("user_followed_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountEqualTo(Integer value) {
            addCriterion("user_followed_count =", value, "userFollowedCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountNotEqualTo(Integer value) {
            addCriterion("user_followed_count <>", value, "userFollowedCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountGreaterThan(Integer value) {
            addCriterion("user_followed_count >", value, "userFollowedCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_followed_count >=", value, "userFollowedCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountLessThan(Integer value) {
            addCriterion("user_followed_count <", value, "userFollowedCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_followed_count <=", value, "userFollowedCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountIn(List<Integer> values) {
            addCriterion("user_followed_count in", values, "userFollowedCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountNotIn(List<Integer> values) {
            addCriterion("user_followed_count not in", values, "userFollowedCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountBetween(Integer value1, Integer value2) {
            addCriterion("user_followed_count between", value1, value2, "userFollowedCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_followed_count not between", value1, value2, "userFollowedCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountIsNull() {
            addCriterion("user_collect_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountIsNotNull() {
            addCriterion("user_collect_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountEqualTo(Integer value) {
            addCriterion("user_collect_count =", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountNotEqualTo(Integer value) {
            addCriterion("user_collect_count <>", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountGreaterThan(Integer value) {
            addCriterion("user_collect_count >", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_collect_count >=", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountLessThan(Integer value) {
            addCriterion("user_collect_count <", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_collect_count <=", value, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountIn(List<Integer> values) {
            addCriterion("user_collect_count in", values, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountNotIn(List<Integer> values) {
            addCriterion("user_collect_count not in", values, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountBetween(Integer value1, Integer value2) {
            addCriterion("user_collect_count between", value1, value2, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserCollectCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_collect_count not between", value1, value2, "userCollectCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountIsNull() {
            addCriterion("user_follow_count is null");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountIsNotNull() {
            addCriterion("user_follow_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountEqualTo(Integer value) {
            addCriterion("user_follow_count =", value, "userFollowCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountNotEqualTo(Integer value) {
            addCriterion("user_follow_count <>", value, "userFollowCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountGreaterThan(Integer value) {
            addCriterion("user_follow_count >", value, "userFollowCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_follow_count >=", value, "userFollowCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountLessThan(Integer value) {
            addCriterion("user_follow_count <", value, "userFollowCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_follow_count <=", value, "userFollowCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountIn(List<Integer> values) {
            addCriterion("user_follow_count in", values, "userFollowCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountNotIn(List<Integer> values) {
            addCriterion("user_follow_count not in", values, "userFollowCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountBetween(Integer value1, Integer value2) {
            addCriterion("user_follow_count between", value1, value2, "userFollowCount");
            return (Criteria) this;
        }

        public Criteria andUserFollowCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_follow_count not between", value1, value2, "userFollowCount");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountIsNull() {
            addCriterion("user_scanned_count is null");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountIsNotNull() {
            addCriterion("user_scanned_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountEqualTo(Integer value) {
            addCriterion("user_scanned_count =", value, "userScannedCount");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountNotEqualTo(Integer value) {
            addCriterion("user_scanned_count <>", value, "userScannedCount");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountGreaterThan(Integer value) {
            addCriterion("user_scanned_count >", value, "userScannedCount");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_scanned_count >=", value, "userScannedCount");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountLessThan(Integer value) {
            addCriterion("user_scanned_count <", value, "userScannedCount");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_scanned_count <=", value, "userScannedCount");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountIn(List<Integer> values) {
            addCriterion("user_scanned_count in", values, "userScannedCount");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountNotIn(List<Integer> values) {
            addCriterion("user_scanned_count not in", values, "userScannedCount");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountBetween(Integer value1, Integer value2) {
            addCriterion("user_scanned_count between", value1, value2, "userScannedCount");
            return (Criteria) this;
        }

        public Criteria andUserScannedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_scanned_count not between", value1, value2, "userScannedCount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}