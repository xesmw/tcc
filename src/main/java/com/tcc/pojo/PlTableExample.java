package com.tcc.pojo;

import java.util.ArrayList;
import java.util.List;

public class PlTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlTableExample() {
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

        public Criteria andPlIdIsNull() {
            addCriterion("pl_id is null");
            return (Criteria) this;
        }

        public Criteria andPlIdIsNotNull() {
            addCriterion("pl_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlIdEqualTo(Integer value) {
            addCriterion("pl_id =", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotEqualTo(Integer value) {
            addCriterion("pl_id <>", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdGreaterThan(Integer value) {
            addCriterion("pl_id >", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_id >=", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdLessThan(Integer value) {
            addCriterion("pl_id <", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdLessThanOrEqualTo(Integer value) {
            addCriterion("pl_id <=", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdIn(List<Integer> values) {
            addCriterion("pl_id in", values, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotIn(List<Integer> values) {
            addCriterion("pl_id not in", values, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdBetween(Integer value1, Integer value2) {
            addCriterion("pl_id between", value1, value2, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pl_id not between", value1, value2, "plId");
            return (Criteria) this;
        }

        public Criteria andPlParkingIsNull() {
            addCriterion("pl_parking is null");
            return (Criteria) this;
        }

        public Criteria andPlParkingIsNotNull() {
            addCriterion("pl_parking is not null");
            return (Criteria) this;
        }

        public Criteria andPlParkingEqualTo(String value) {
            addCriterion("pl_parking =", value, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlParkingNotEqualTo(String value) {
            addCriterion("pl_parking <>", value, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlParkingGreaterThan(String value) {
            addCriterion("pl_parking >", value, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlParkingGreaterThanOrEqualTo(String value) {
            addCriterion("pl_parking >=", value, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlParkingLessThan(String value) {
            addCriterion("pl_parking <", value, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlParkingLessThanOrEqualTo(String value) {
            addCriterion("pl_parking <=", value, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlParkingLike(String value) {
            addCriterion("pl_parking like", value, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlParkingNotLike(String value) {
            addCriterion("pl_parking not like", value, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlParkingIn(List<String> values) {
            addCriterion("pl_parking in", values, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlParkingNotIn(List<String> values) {
            addCriterion("pl_parking not in", values, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlParkingBetween(String value1, String value2) {
            addCriterion("pl_parking between", value1, value2, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlParkingNotBetween(String value1, String value2) {
            addCriterion("pl_parking not between", value1, value2, "plParking");
            return (Criteria) this;
        }

        public Criteria andPlStateIsNull() {
            addCriterion("pl_state is null");
            return (Criteria) this;
        }

        public Criteria andPlStateIsNotNull() {
            addCriterion("pl_state is not null");
            return (Criteria) this;
        }

        public Criteria andPlStateEqualTo(String value) {
            addCriterion("pl_state =", value, "plState");
            return (Criteria) this;
        }

        public Criteria andPlStateNotEqualTo(String value) {
            addCriterion("pl_state <>", value, "plState");
            return (Criteria) this;
        }

        public Criteria andPlStateGreaterThan(String value) {
            addCriterion("pl_state >", value, "plState");
            return (Criteria) this;
        }

        public Criteria andPlStateGreaterThanOrEqualTo(String value) {
            addCriterion("pl_state >=", value, "plState");
            return (Criteria) this;
        }

        public Criteria andPlStateLessThan(String value) {
            addCriterion("pl_state <", value, "plState");
            return (Criteria) this;
        }

        public Criteria andPlStateLessThanOrEqualTo(String value) {
            addCriterion("pl_state <=", value, "plState");
            return (Criteria) this;
        }

        public Criteria andPlStateLike(String value) {
            addCriterion("pl_state like", value, "plState");
            return (Criteria) this;
        }

        public Criteria andPlStateNotLike(String value) {
            addCriterion("pl_state not like", value, "plState");
            return (Criteria) this;
        }

        public Criteria andPlStateIn(List<String> values) {
            addCriterion("pl_state in", values, "plState");
            return (Criteria) this;
        }

        public Criteria andPlStateNotIn(List<String> values) {
            addCriterion("pl_state not in", values, "plState");
            return (Criteria) this;
        }

        public Criteria andPlStateBetween(String value1, String value2) {
            addCriterion("pl_state between", value1, value2, "plState");
            return (Criteria) this;
        }

        public Criteria andPlStateNotBetween(String value1, String value2) {
            addCriterion("pl_state not between", value1, value2, "plState");
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