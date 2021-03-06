package com.xt.bihu.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopicExample() {
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

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Long value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Long value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Long value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Long value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Long value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Long> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Long> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Long value1, Long value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Long value1, Long value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicNameIsNull() {
            addCriterion("topic_name is null");
            return (Criteria) this;
        }

        public Criteria andTopicNameIsNotNull() {
            addCriterion("topic_name is not null");
            return (Criteria) this;
        }

        public Criteria andTopicNameEqualTo(String value) {
            addCriterion("topic_name =", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotEqualTo(String value) {
            addCriterion("topic_name <>", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThan(String value) {
            addCriterion("topic_name >", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThanOrEqualTo(String value) {
            addCriterion("topic_name >=", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThan(String value) {
            addCriterion("topic_name <", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThanOrEqualTo(String value) {
            addCriterion("topic_name <=", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLike(String value) {
            addCriterion("topic_name like", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotLike(String value) {
            addCriterion("topic_name not like", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameIn(List<String> values) {
            addCriterion("topic_name in", values, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotIn(List<String> values) {
            addCriterion("topic_name not in", values, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameBetween(String value1, String value2) {
            addCriterion("topic_name between", value1, value2, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotBetween(String value1, String value2) {
            addCriterion("topic_name not between", value1, value2, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlIsNull() {
            addCriterion("topic_image_url is null");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlIsNotNull() {
            addCriterion("topic_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlEqualTo(String value) {
            addCriterion("topic_image_url =", value, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlNotEqualTo(String value) {
            addCriterion("topic_image_url <>", value, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlGreaterThan(String value) {
            addCriterion("topic_image_url >", value, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("topic_image_url >=", value, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlLessThan(String value) {
            addCriterion("topic_image_url <", value, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlLessThanOrEqualTo(String value) {
            addCriterion("topic_image_url <=", value, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlLike(String value) {
            addCriterion("topic_image_url like", value, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlNotLike(String value) {
            addCriterion("topic_image_url not like", value, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlIn(List<String> values) {
            addCriterion("topic_image_url in", values, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlNotIn(List<String> values) {
            addCriterion("topic_image_url not in", values, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlBetween(String value1, String value2) {
            addCriterion("topic_image_url between", value1, value2, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicImageUrlNotBetween(String value1, String value2) {
            addCriterion("topic_image_url not between", value1, value2, "topicImageUrl");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountIsNull() {
            addCriterion("topic_followed_count is null");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountIsNotNull() {
            addCriterion("topic_followed_count is not null");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountEqualTo(Integer value) {
            addCriterion("topic_followed_count =", value, "topicFollowedCount");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountNotEqualTo(Integer value) {
            addCriterion("topic_followed_count <>", value, "topicFollowedCount");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountGreaterThan(Integer value) {
            addCriterion("topic_followed_count >", value, "topicFollowedCount");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_followed_count >=", value, "topicFollowedCount");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountLessThan(Integer value) {
            addCriterion("topic_followed_count <", value, "topicFollowedCount");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountLessThanOrEqualTo(Integer value) {
            addCriterion("topic_followed_count <=", value, "topicFollowedCount");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountIn(List<Integer> values) {
            addCriterion("topic_followed_count in", values, "topicFollowedCount");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountNotIn(List<Integer> values) {
            addCriterion("topic_followed_count not in", values, "topicFollowedCount");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountBetween(Integer value1, Integer value2) {
            addCriterion("topic_followed_count between", value1, value2, "topicFollowedCount");
            return (Criteria) this;
        }

        public Criteria andTopicFollowedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_followed_count not between", value1, value2, "topicFollowedCount");
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