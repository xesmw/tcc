package com.tcc.pojo;

import java.util.ArrayList;
import java.util.List;

public class StTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StTableExample() {
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

        public Criteria andStIdIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Integer value) {
            addCriterion("st_id =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Integer value) {
            addCriterion("st_id <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Integer value) {
            addCriterion("st_id >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_id >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Integer value) {
            addCriterion("st_id <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Integer value) {
            addCriterion("st_id <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Integer> values) {
            addCriterion("st_id in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Integer> values) {
            addCriterion("st_id not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Integer value1, Integer value2) {
            addCriterion("st_id between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("st_id not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStSfIsNull() {
            addCriterion("st_sf is null");
            return (Criteria) this;
        }

        public Criteria andStSfIsNotNull() {
            addCriterion("st_sf is not null");
            return (Criteria) this;
        }

        public Criteria andStSfEqualTo(Integer value) {
            addCriterion("st_sf =", value, "stSf");
            return (Criteria) this;
        }

        public Criteria andStSfNotEqualTo(Integer value) {
            addCriterion("st_sf <>", value, "stSf");
            return (Criteria) this;
        }

        public Criteria andStSfGreaterThan(Integer value) {
            addCriterion("st_sf >", value, "stSf");
            return (Criteria) this;
        }

        public Criteria andStSfGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_sf >=", value, "stSf");
            return (Criteria) this;
        }

        public Criteria andStSfLessThan(Integer value) {
            addCriterion("st_sf <", value, "stSf");
            return (Criteria) this;
        }

        public Criteria andStSfLessThanOrEqualTo(Integer value) {
            addCriterion("st_sf <=", value, "stSf");
            return (Criteria) this;
        }

        public Criteria andStSfIn(List<Integer> values) {
            addCriterion("st_sf in", values, "stSf");
            return (Criteria) this;
        }

        public Criteria andStSfNotIn(List<Integer> values) {
            addCriterion("st_sf not in", values, "stSf");
            return (Criteria) this;
        }

        public Criteria andStSfBetween(Integer value1, Integer value2) {
            addCriterion("st_sf between", value1, value2, "stSf");
            return (Criteria) this;
        }

        public Criteria andStSfNotBetween(Integer value1, Integer value2) {
            addCriterion("st_sf not between", value1, value2, "stSf");
            return (Criteria) this;
        }

        public Criteria andStBtIsNull() {
            addCriterion("st_bt is null");
            return (Criteria) this;
        }

        public Criteria andStBtIsNotNull() {
            addCriterion("st_bt is not null");
            return (Criteria) this;
        }

        public Criteria andStBtEqualTo(Integer value) {
            addCriterion("st_bt =", value, "stBt");
            return (Criteria) this;
        }

        public Criteria andStBtNotEqualTo(Integer value) {
            addCriterion("st_bt <>", value, "stBt");
            return (Criteria) this;
        }

        public Criteria andStBtGreaterThan(Integer value) {
            addCriterion("st_bt >", value, "stBt");
            return (Criteria) this;
        }

        public Criteria andStBtGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_bt >=", value, "stBt");
            return (Criteria) this;
        }

        public Criteria andStBtLessThan(Integer value) {
            addCriterion("st_bt <", value, "stBt");
            return (Criteria) this;
        }

        public Criteria andStBtLessThanOrEqualTo(Integer value) {
            addCriterion("st_bt <=", value, "stBt");
            return (Criteria) this;
        }

        public Criteria andStBtIn(List<Integer> values) {
            addCriterion("st_bt in", values, "stBt");
            return (Criteria) this;
        }

        public Criteria andStBtNotIn(List<Integer> values) {
            addCriterion("st_bt not in", values, "stBt");
            return (Criteria) this;
        }

        public Criteria andStBtBetween(Integer value1, Integer value2) {
            addCriterion("st_bt between", value1, value2, "stBt");
            return (Criteria) this;
        }

        public Criteria andStBtNotBetween(Integer value1, Integer value2) {
            addCriterion("st_bt not between", value1, value2, "stBt");
            return (Criteria) this;
        }

        public Criteria andStYearIsNull() {
            addCriterion("st_year is null");
            return (Criteria) this;
        }

        public Criteria andStYearIsNotNull() {
            addCriterion("st_year is not null");
            return (Criteria) this;
        }

        public Criteria andStYearEqualTo(Integer value) {
            addCriterion("st_year =", value, "stYear");
            return (Criteria) this;
        }

        public Criteria andStYearNotEqualTo(Integer value) {
            addCriterion("st_year <>", value, "stYear");
            return (Criteria) this;
        }

        public Criteria andStYearGreaterThan(Integer value) {
            addCriterion("st_year >", value, "stYear");
            return (Criteria) this;
        }

        public Criteria andStYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_year >=", value, "stYear");
            return (Criteria) this;
        }

        public Criteria andStYearLessThan(Integer value) {
            addCriterion("st_year <", value, "stYear");
            return (Criteria) this;
        }

        public Criteria andStYearLessThanOrEqualTo(Integer value) {
            addCriterion("st_year <=", value, "stYear");
            return (Criteria) this;
        }

        public Criteria andStYearIn(List<Integer> values) {
            addCriterion("st_year in", values, "stYear");
            return (Criteria) this;
        }

        public Criteria andStYearNotIn(List<Integer> values) {
            addCriterion("st_year not in", values, "stYear");
            return (Criteria) this;
        }

        public Criteria andStYearBetween(Integer value1, Integer value2) {
            addCriterion("st_year between", value1, value2, "stYear");
            return (Criteria) this;
        }

        public Criteria andStYearNotBetween(Integer value1, Integer value2) {
            addCriterion("st_year not between", value1, value2, "stYear");
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