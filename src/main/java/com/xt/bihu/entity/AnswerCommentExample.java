package com.xt.bihu.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class AnswerCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerCommentExample() {
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

        public Criteria andAnswerCommentIdIsNull() {
            addCriterion("answer_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentIdIsNotNull() {
            addCriterion("answer_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentIdEqualTo(Long value) {
            addCriterion("answer_comment_id =", value, "answerCommentId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentIdNotEqualTo(Long value) {
            addCriterion("answer_comment_id <>", value, "answerCommentId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentIdGreaterThan(Long value) {
            addCriterion("answer_comment_id >", value, "answerCommentId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("answer_comment_id >=", value, "answerCommentId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentIdLessThan(Long value) {
            addCriterion("answer_comment_id <", value, "answerCommentId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("answer_comment_id <=", value, "answerCommentId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentIdIn(List<Long> values) {
            addCriterion("answer_comment_id in", values, "answerCommentId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentIdNotIn(List<Long> values) {
            addCriterion("answer_comment_id not in", values, "answerCommentId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentIdBetween(Long value1, Long value2) {
            addCriterion("answer_comment_id between", value1, value2, "answerCommentId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("answer_comment_id not between", value1, value2, "answerCommentId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountIsNull() {
            addCriterion("answer_comment_liked_count is null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountIsNotNull() {
            addCriterion("answer_comment_liked_count is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountEqualTo(Integer value) {
            addCriterion("answer_comment_liked_count =", value, "answerCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountNotEqualTo(Integer value) {
            addCriterion("answer_comment_liked_count <>", value, "answerCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountGreaterThan(Integer value) {
            addCriterion("answer_comment_liked_count >", value, "answerCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_comment_liked_count >=", value, "answerCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountLessThan(Integer value) {
            addCriterion("answer_comment_liked_count <", value, "answerCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountLessThanOrEqualTo(Integer value) {
            addCriterion("answer_comment_liked_count <=", value, "answerCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountIn(List<Integer> values) {
            addCriterion("answer_comment_liked_count in", values, "answerCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountNotIn(List<Integer> values) {
            addCriterion("answer_comment_liked_count not in", values, "answerCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountBetween(Integer value1, Integer value2) {
            addCriterion("answer_comment_liked_count between", value1, value2, "answerCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentLikedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_comment_liked_count not between", value1, value2, "answerCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeIsNull() {
            addCriterion("answer_comment_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeIsNotNull() {
            addCriterion("answer_comment_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeEqualTo(Date value) {
            addCriterion("answer_comment_create_time =", value, "answerCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeNotEqualTo(Date value) {
            addCriterion("answer_comment_create_time <>", value, "answerCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeGreaterThan(Date value) {
            addCriterion("answer_comment_create_time >", value, "answerCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("answer_comment_create_time >=", value, "answerCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeLessThan(Date value) {
            addCriterion("answer_comment_create_time <", value, "answerCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("answer_comment_create_time <=", value, "answerCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeIn(List<Date> values) {
            addCriterion("answer_comment_create_time in", values, "answerCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeNotIn(List<Date> values) {
            addCriterion("answer_comment_create_time not in", values, "answerCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeBetween(Date value1, Date value2) {
            addCriterion("answer_comment_create_time between", value1, value2, "answerCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("answer_comment_create_time not between", value1, value2, "answerCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdIsNull() {
            addCriterion("answer_comment_at_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdIsNotNull() {
            addCriterion("answer_comment_at_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdEqualTo(Long value) {
            addCriterion("answer_comment_at_user_id =", value, "answerCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdNotEqualTo(Long value) {
            addCriterion("answer_comment_at_user_id <>", value, "answerCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdGreaterThan(Long value) {
            addCriterion("answer_comment_at_user_id >", value, "answerCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("answer_comment_at_user_id >=", value, "answerCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdLessThan(Long value) {
            addCriterion("answer_comment_at_user_id <", value, "answerCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdLessThanOrEqualTo(Long value) {
            addCriterion("answer_comment_at_user_id <=", value, "answerCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdIn(List<Long> values) {
            addCriterion("answer_comment_at_user_id in", values, "answerCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdNotIn(List<Long> values) {
            addCriterion("answer_comment_at_user_id not in", values, "answerCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdBetween(Long value1, Long value2) {
            addCriterion("answer_comment_at_user_id between", value1, value2, "answerCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserIdNotBetween(Long value1, Long value2) {
            addCriterion("answer_comment_at_user_id not between", value1, value2, "answerCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameIsNull() {
            addCriterion("answer_comment_at_user_name is null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameIsNotNull() {
            addCriterion("answer_comment_at_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameEqualTo(String value) {
            addCriterion("answer_comment_at_user_name =", value, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameNotEqualTo(String value) {
            addCriterion("answer_comment_at_user_name <>", value, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameGreaterThan(String value) {
            addCriterion("answer_comment_at_user_name >", value, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("answer_comment_at_user_name >=", value, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameLessThan(String value) {
            addCriterion("answer_comment_at_user_name <", value, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameLessThanOrEqualTo(String value) {
            addCriterion("answer_comment_at_user_name <=", value, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameLike(String value) {
            addCriterion("answer_comment_at_user_name like", value, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameNotLike(String value) {
            addCriterion("answer_comment_at_user_name not like", value, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameIn(List<String> values) {
            addCriterion("answer_comment_at_user_name in", values, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameNotIn(List<String> values) {
            addCriterion("answer_comment_at_user_name not in", values, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameBetween(String value1, String value2) {
            addCriterion("answer_comment_at_user_name between", value1, value2, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentAtUserNameNotBetween(String value1, String value2) {
            addCriterion("answer_comment_at_user_name not between", value1, value2, "answerCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNull() {
            addCriterion("answer_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNotNull() {
            addCriterion("answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdEqualTo(Long value) {
            addCriterion("answer_id =", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotEqualTo(Long value) {
            addCriterion("answer_id <>", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThan(Long value) {
            addCriterion("answer_id >", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("answer_id >=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThan(Long value) {
            addCriterion("answer_id <", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThanOrEqualTo(Long value) {
            addCriterion("answer_id <=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIn(List<Long> values) {
            addCriterion("answer_id in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotIn(List<Long> values) {
            addCriterion("answer_id not in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdBetween(Long value1, Long value2) {
            addCriterion("answer_id between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotBetween(Long value1, Long value2) {
            addCriterion("answer_id not between", value1, value2, "answerId");
            return (Criteria) this;
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