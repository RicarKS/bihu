package com.xt.bihu.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class QuestionCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionCommentExample() {
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

        public Criteria andQuestionCommentIdIsNull() {
            addCriterion("question_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdIsNotNull() {
            addCriterion("question_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdEqualTo(Long value) {
            addCriterion("question_comment_id =", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdNotEqualTo(Long value) {
            addCriterion("question_comment_id <>", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdGreaterThan(Long value) {
            addCriterion("question_comment_id >", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("question_comment_id >=", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdLessThan(Long value) {
            addCriterion("question_comment_id <", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("question_comment_id <=", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdIn(List<Long> values) {
            addCriterion("question_comment_id in", values, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdNotIn(List<Long> values) {
            addCriterion("question_comment_id not in", values, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdBetween(Long value1, Long value2) {
            addCriterion("question_comment_id between", value1, value2, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("question_comment_id not between", value1, value2, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountIsNull() {
            addCriterion("question_comment_liked_count is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountIsNotNull() {
            addCriterion("question_comment_liked_count is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountEqualTo(Integer value) {
            addCriterion("question_comment_liked_count =", value, "questionCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountNotEqualTo(Integer value) {
            addCriterion("question_comment_liked_count <>", value, "questionCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountGreaterThan(Integer value) {
            addCriterion("question_comment_liked_count >", value, "questionCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_comment_liked_count >=", value, "questionCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountLessThan(Integer value) {
            addCriterion("question_comment_liked_count <", value, "questionCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountLessThanOrEqualTo(Integer value) {
            addCriterion("question_comment_liked_count <=", value, "questionCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountIn(List<Integer> values) {
            addCriterion("question_comment_liked_count in", values, "questionCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountNotIn(List<Integer> values) {
            addCriterion("question_comment_liked_count not in", values, "questionCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountBetween(Integer value1, Integer value2) {
            addCriterion("question_comment_liked_count between", value1, value2, "questionCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLikedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("question_comment_liked_count not between", value1, value2, "questionCommentLikedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeIsNull() {
            addCriterion("question_comment_create_time is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeIsNotNull() {
            addCriterion("question_comment_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeEqualTo(Date value) {
            addCriterion("question_comment_create_time =", value, "questionCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeNotEqualTo(Date value) {
            addCriterion("question_comment_create_time <>", value, "questionCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeGreaterThan(Date value) {
            addCriterion("question_comment_create_time >", value, "questionCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("question_comment_create_time >=", value, "questionCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeLessThan(Date value) {
            addCriterion("question_comment_create_time <", value, "questionCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("question_comment_create_time <=", value, "questionCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeIn(List<Date> values) {
            addCriterion("question_comment_create_time in", values, "questionCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeNotIn(List<Date> values) {
            addCriterion("question_comment_create_time not in", values, "questionCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeBetween(Date value1, Date value2) {
            addCriterion("question_comment_create_time between", value1, value2, "questionCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("question_comment_create_time not between", value1, value2, "questionCommentCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdIsNull() {
            addCriterion("question_comment_at_user_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdIsNotNull() {
            addCriterion("question_comment_at_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdEqualTo(Long value) {
            addCriterion("question_comment_at_user_id =", value, "questionCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdNotEqualTo(Long value) {
            addCriterion("question_comment_at_user_id <>", value, "questionCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdGreaterThan(Long value) {
            addCriterion("question_comment_at_user_id >", value, "questionCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("question_comment_at_user_id >=", value, "questionCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdLessThan(Long value) {
            addCriterion("question_comment_at_user_id <", value, "questionCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdLessThanOrEqualTo(Long value) {
            addCriterion("question_comment_at_user_id <=", value, "questionCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdIn(List<Long> values) {
            addCriterion("question_comment_at_user_id in", values, "questionCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdNotIn(List<Long> values) {
            addCriterion("question_comment_at_user_id not in", values, "questionCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdBetween(Long value1, Long value2) {
            addCriterion("question_comment_at_user_id between", value1, value2, "questionCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserIdNotBetween(Long value1, Long value2) {
            addCriterion("question_comment_at_user_id not between", value1, value2, "questionCommentAtUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameIsNull() {
            addCriterion("question_comment_at_user_name is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameIsNotNull() {
            addCriterion("question_comment_at_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameEqualTo(String value) {
            addCriterion("question_comment_at_user_name =", value, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameNotEqualTo(String value) {
            addCriterion("question_comment_at_user_name <>", value, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameGreaterThan(String value) {
            addCriterion("question_comment_at_user_name >", value, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("question_comment_at_user_name >=", value, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameLessThan(String value) {
            addCriterion("question_comment_at_user_name <", value, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameLessThanOrEqualTo(String value) {
            addCriterion("question_comment_at_user_name <=", value, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameLike(String value) {
            addCriterion("question_comment_at_user_name like", value, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameNotLike(String value) {
            addCriterion("question_comment_at_user_name not like", value, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameIn(List<String> values) {
            addCriterion("question_comment_at_user_name in", values, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameNotIn(List<String> values) {
            addCriterion("question_comment_at_user_name not in", values, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameBetween(String value1, String value2) {
            addCriterion("question_comment_at_user_name between", value1, value2, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentAtUserNameNotBetween(String value1, String value2) {
            addCriterion("question_comment_at_user_name not between", value1, value2, "questionCommentAtUserName");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Long value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Long value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Long value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Long value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Long value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Long> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Long> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Long value1, Long value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Long value1, Long value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
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