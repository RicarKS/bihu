package com.xt.bihu.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class AnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerExample() {
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

        public Criteria andAnswerLikedCountIsNull() {
            addCriterion("answer_liked_count is null");
            return (Criteria) this;
        }

        public Criteria andAnswerLikedCountIsNotNull() {
            addCriterion("answer_liked_count is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerLikedCountEqualTo(Integer value) {
            addCriterion("answer_liked_count =", value, "answerLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerLikedCountNotEqualTo(Integer value) {
            addCriterion("answer_liked_count <>", value, "answerLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerLikedCountGreaterThan(Integer value) {
            addCriterion("answer_liked_count >", value, "answerLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerLikedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_liked_count >=", value, "answerLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerLikedCountLessThan(Integer value) {
            addCriterion("answer_liked_count <", value, "answerLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerLikedCountLessThanOrEqualTo(Integer value) {
            addCriterion("answer_liked_count <=", value, "answerLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerLikedCountIn(List<Integer> values) {
            addCriterion("answer_liked_count in", values, "answerLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerLikedCountNotIn(List<Integer> values) {
            addCriterion("answer_liked_count not in", values, "answerLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerLikedCountBetween(Integer value1, Integer value2) {
            addCriterion("answer_liked_count between", value1, value2, "answerLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerLikedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_liked_count not between", value1, value2, "answerLikedCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountIsNull() {
            addCriterion("answer_comment_count is null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountIsNotNull() {
            addCriterion("answer_comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountEqualTo(Integer value) {
            addCriterion("answer_comment_count =", value, "answerCommentCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountNotEqualTo(Integer value) {
            addCriterion("answer_comment_count <>", value, "answerCommentCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountGreaterThan(Integer value) {
            addCriterion("answer_comment_count >", value, "answerCommentCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_comment_count >=", value, "answerCommentCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountLessThan(Integer value) {
            addCriterion("answer_comment_count <", value, "answerCommentCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("answer_comment_count <=", value, "answerCommentCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountIn(List<Integer> values) {
            addCriterion("answer_comment_count in", values, "answerCommentCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountNotIn(List<Integer> values) {
            addCriterion("answer_comment_count not in", values, "answerCommentCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("answer_comment_count between", value1, value2, "answerCommentCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_comment_count not between", value1, value2, "answerCommentCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeIsNull() {
            addCriterion("answer_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeIsNotNull() {
            addCriterion("answer_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeEqualTo(Date value) {
            addCriterion("answer_create_time =", value, "answerCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeNotEqualTo(Date value) {
            addCriterion("answer_create_time <>", value, "answerCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeGreaterThan(Date value) {
            addCriterion("answer_create_time >", value, "answerCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("answer_create_time >=", value, "answerCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeLessThan(Date value) {
            addCriterion("answer_create_time <", value, "answerCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("answer_create_time <=", value, "answerCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeIn(List<Date> values) {
            addCriterion("answer_create_time in", values, "answerCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeNotIn(List<Date> values) {
            addCriterion("answer_create_time not in", values, "answerCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeBetween(Date value1, Date value2) {
            addCriterion("answer_create_time between", value1, value2, "answerCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("answer_create_time not between", value1, value2, "answerCreateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeIsNull() {
            addCriterion("answer_update_time is null");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeIsNotNull() {
            addCriterion("answer_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeEqualTo(Date value) {
            addCriterion("answer_update_time =", value, "answerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeNotEqualTo(Date value) {
            addCriterion("answer_update_time <>", value, "answerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeGreaterThan(Date value) {
            addCriterion("answer_update_time >", value, "answerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("answer_update_time >=", value, "answerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeLessThan(Date value) {
            addCriterion("answer_update_time <", value, "answerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("answer_update_time <=", value, "answerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeIn(List<Date> values) {
            addCriterion("answer_update_time in", values, "answerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeNotIn(List<Date> values) {
            addCriterion("answer_update_time not in", values, "answerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("answer_update_time between", value1, value2, "answerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAnswerUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("answer_update_time not between", value1, value2, "answerUpdateTime");
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