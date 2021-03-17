package com.xt.bihu.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class CollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionExample() {
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

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(Long value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(Long value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(Long value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(Long value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(Long value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<Long> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<Long> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(Long value1, Long value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(Long value1, Long value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionNameIsNull() {
            addCriterion("collection_name is null");
            return (Criteria) this;
        }

        public Criteria andCollectionNameIsNotNull() {
            addCriterion("collection_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionNameEqualTo(String value) {
            addCriterion("collection_name =", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotEqualTo(String value) {
            addCriterion("collection_name <>", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameGreaterThan(String value) {
            addCriterion("collection_name >", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("collection_name >=", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameLessThan(String value) {
            addCriterion("collection_name <", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameLessThanOrEqualTo(String value) {
            addCriterion("collection_name <=", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameLike(String value) {
            addCriterion("collection_name like", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotLike(String value) {
            addCriterion("collection_name not like", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameIn(List<String> values) {
            addCriterion("collection_name in", values, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotIn(List<String> values) {
            addCriterion("collection_name not in", values, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameBetween(String value1, String value2) {
            addCriterion("collection_name between", value1, value2, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotBetween(String value1, String value2) {
            addCriterion("collection_name not between", value1, value2, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeIsNull() {
            addCriterion("collection_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeIsNotNull() {
            addCriterion("collection_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeEqualTo(Date value) {
            addCriterion("collection_create_time =", value, "collectionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeNotEqualTo(Date value) {
            addCriterion("collection_create_time <>", value, "collectionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeGreaterThan(Date value) {
            addCriterion("collection_create_time >", value, "collectionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collection_create_time >=", value, "collectionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeLessThan(Date value) {
            addCriterion("collection_create_time <", value, "collectionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("collection_create_time <=", value, "collectionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeIn(List<Date> values) {
            addCriterion("collection_create_time in", values, "collectionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeNotIn(List<Date> values) {
            addCriterion("collection_create_time not in", values, "collectionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeBetween(Date value1, Date value2) {
            addCriterion("collection_create_time between", value1, value2, "collectionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("collection_create_time not between", value1, value2, "collectionCreateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeIsNull() {
            addCriterion("collection_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeIsNotNull() {
            addCriterion("collection_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeEqualTo(Date value) {
            addCriterion("collection_update_time =", value, "collectionUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeNotEqualTo(Date value) {
            addCriterion("collection_update_time <>", value, "collectionUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeGreaterThan(Date value) {
            addCriterion("collection_update_time >", value, "collectionUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collection_update_time >=", value, "collectionUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeLessThan(Date value) {
            addCriterion("collection_update_time <", value, "collectionUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("collection_update_time <=", value, "collectionUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeIn(List<Date> values) {
            addCriterion("collection_update_time in", values, "collectionUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeNotIn(List<Date> values) {
            addCriterion("collection_update_time not in", values, "collectionUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("collection_update_time between", value1, value2, "collectionUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("collection_update_time not between", value1, value2, "collectionUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountIsNull() {
            addCriterion("collection_followed_count is null");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountIsNotNull() {
            addCriterion("collection_followed_count is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountEqualTo(Integer value) {
            addCriterion("collection_followed_count =", value, "collectionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountNotEqualTo(Integer value) {
            addCriterion("collection_followed_count <>", value, "collectionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountGreaterThan(Integer value) {
            addCriterion("collection_followed_count >", value, "collectionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_followed_count >=", value, "collectionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountLessThan(Integer value) {
            addCriterion("collection_followed_count <", value, "collectionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountLessThanOrEqualTo(Integer value) {
            addCriterion("collection_followed_count <=", value, "collectionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountIn(List<Integer> values) {
            addCriterion("collection_followed_count in", values, "collectionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountNotIn(List<Integer> values) {
            addCriterion("collection_followed_count not in", values, "collectionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountBetween(Integer value1, Integer value2) {
            addCriterion("collection_followed_count between", value1, value2, "collectionFollowedCount");
            return (Criteria) this;
        }

        public Criteria andCollectionFollowedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_followed_count not between", value1, value2, "collectionFollowedCount");
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