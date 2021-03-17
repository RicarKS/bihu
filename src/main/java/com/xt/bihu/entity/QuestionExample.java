package com.xt.bihu.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQuestionTitleIsNull() {
            addCriterion("question_title is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleIsNotNull() {
            addCriterion("question_title is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleEqualTo(String value) {
            addCriterion("question_title =", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleNotEqualTo(String value) {
            addCriterion("question_title <>", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleGreaterThan(String value) {
            addCriterion("question_title >", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("question_title >=", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleLessThan(String value) {
            addCriterion("question_title <", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleLessThanOrEqualTo(String value) {
            addCriterion("question_title <=", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleLike(String value) {
            addCriterion("question_title like", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleNotLike(String value) {
            addCriterion("question_title not like", value, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleIn(List<String> values) {
            addCriterion("question_title in", values, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleNotIn(List<String> values) {
            addCriterion("question_title not in", values, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleBetween(String value1, String value2) {
            addCriterion("question_title between", value1, value2, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTitleNotBetween(String value1, String value2) {
            addCriterion("question_title not between", value1, value2, "questionTitle");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListIsNull() {
            addCriterion("question_topic_list is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListIsNotNull() {
            addCriterion("question_topic_list is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListEqualTo(String value) {
            addCriterion("question_topic_list =", value, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListNotEqualTo(String value) {
            addCriterion("question_topic_list <>", value, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListGreaterThan(String value) {
            addCriterion("question_topic_list >", value, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListGreaterThanOrEqualTo(String value) {
            addCriterion("question_topic_list >=", value, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListLessThan(String value) {
            addCriterion("question_topic_list <", value, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListLessThanOrEqualTo(String value) {
            addCriterion("question_topic_list <=", value, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListLike(String value) {
            addCriterion("question_topic_list like", value, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListNotLike(String value) {
            addCriterion("question_topic_list not like", value, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListIn(List<String> values) {
            addCriterion("question_topic_list in", values, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListNotIn(List<String> values) {
            addCriterion("question_topic_list not in", values, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListBetween(String value1, String value2) {
            addCriterion("question_topic_list between", value1, value2, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionTopicListNotBetween(String value1, String value2) {
            addCriterion("question_topic_list not between", value1, value2, "questionTopicList");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountIsNull() {
            addCriterion("question_followed_count is null");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountIsNotNull() {
            addCriterion("question_followed_count is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountEqualTo(Integer value) {
            addCriterion("question_followed_count =", value, "questionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountNotEqualTo(Integer value) {
            addCriterion("question_followed_count <>", value, "questionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountGreaterThan(Integer value) {
            addCriterion("question_followed_count >", value, "questionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_followed_count >=", value, "questionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountLessThan(Integer value) {
            addCriterion("question_followed_count <", value, "questionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountLessThanOrEqualTo(Integer value) {
            addCriterion("question_followed_count <=", value, "questionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountIn(List<Integer> values) {
            addCriterion("question_followed_count in", values, "questionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountNotIn(List<Integer> values) {
            addCriterion("question_followed_count not in", values, "questionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountBetween(Integer value1, Integer value2) {
            addCriterion("question_followed_count between", value1, value2, "questionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionFollowedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("question_followed_count not between", value1, value2, "questionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountIsNull() {
            addCriterion("question_scanned_count is null");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountIsNotNull() {
            addCriterion("question_scanned_count is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountEqualTo(Integer value) {
            addCriterion("question_scanned_count =", value, "questionScannedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountNotEqualTo(Integer value) {
            addCriterion("question_scanned_count <>", value, "questionScannedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountGreaterThan(Integer value) {
            addCriterion("question_scanned_count >", value, "questionScannedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_scanned_count >=", value, "questionScannedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountLessThan(Integer value) {
            addCriterion("question_scanned_count <", value, "questionScannedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountLessThanOrEqualTo(Integer value) {
            addCriterion("question_scanned_count <=", value, "questionScannedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountIn(List<Integer> values) {
            addCriterion("question_scanned_count in", values, "questionScannedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountNotIn(List<Integer> values) {
            addCriterion("question_scanned_count not in", values, "questionScannedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountBetween(Integer value1, Integer value2) {
            addCriterion("question_scanned_count between", value1, value2, "questionScannedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionScannedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("question_scanned_count not between", value1, value2, "questionScannedCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeIsNull() {
            addCriterion("question_create_time is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeIsNotNull() {
            addCriterion("question_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeEqualTo(Date value) {
            addCriterion("question_create_time =", value, "questionCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeNotEqualTo(Date value) {
            addCriterion("question_create_time <>", value, "questionCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeGreaterThan(Date value) {
            addCriterion("question_create_time >", value, "questionCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("question_create_time >=", value, "questionCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeLessThan(Date value) {
            addCriterion("question_create_time <", value, "questionCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("question_create_time <=", value, "questionCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeIn(List<Date> values) {
            addCriterion("question_create_time in", values, "questionCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeNotIn(List<Date> values) {
            addCriterion("question_create_time not in", values, "questionCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeBetween(Date value1, Date value2) {
            addCriterion("question_create_time between", value1, value2, "questionCreateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("question_create_time not between", value1, value2, "questionCreateTime");
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