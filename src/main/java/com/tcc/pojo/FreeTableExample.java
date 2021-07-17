package com.tcc.pojo;

import java.util.ArrayList;
import java.util.List;

public class FreeTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FreeTableExample() {
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

        public Criteria andFreeIdIsNull() {
            addCriterion("free_id is null");
            return (Criteria) this;
        }

        public Criteria andFreeIdIsNotNull() {
            addCriterion("free_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreeIdEqualTo(Integer value) {
            addCriterion("free_id =", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotEqualTo(Integer value) {
            addCriterion("free_id <>", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdGreaterThan(Integer value) {
            addCriterion("free_id >", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_id >=", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdLessThan(Integer value) {
            addCriterion("free_id <", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("free_id <=", value, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdIn(List<Integer> values) {
            addCriterion("free_id in", values, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotIn(List<Integer> values) {
            addCriterion("free_id not in", values, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdBetween(Integer value1, Integer value2) {
            addCriterion("free_id between", value1, value2, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("free_id not between", value1, value2, "freeId");
            return (Criteria) this;
        }

        public Criteria andFreeCarIsNull() {
            addCriterion("free_car is null");
            return (Criteria) this;
        }

        public Criteria andFreeCarIsNotNull() {
            addCriterion("free_car is not null");
            return (Criteria) this;
        }

        public Criteria andFreeCarEqualTo(String value) {
            addCriterion("free_car =", value, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeCarNotEqualTo(String value) {
            addCriterion("free_car <>", value, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeCarGreaterThan(String value) {
            addCriterion("free_car >", value, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeCarGreaterThanOrEqualTo(String value) {
            addCriterion("free_car >=", value, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeCarLessThan(String value) {
            addCriterion("free_car <", value, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeCarLessThanOrEqualTo(String value) {
            addCriterion("free_car <=", value, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeCarLike(String value) {
            addCriterion("free_car like", value, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeCarNotLike(String value) {
            addCriterion("free_car not like", value, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeCarIn(List<String> values) {
            addCriterion("free_car in", values, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeCarNotIn(List<String> values) {
            addCriterion("free_car not in", values, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeCarBetween(String value1, String value2) {
            addCriterion("free_car between", value1, value2, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeCarNotBetween(String value1, String value2) {
            addCriterion("free_car not between", value1, value2, "freeCar");
            return (Criteria) this;
        }

        public Criteria andFreeTypeIsNull() {
            addCriterion("free_type is null");
            return (Criteria) this;
        }

        public Criteria andFreeTypeIsNotNull() {
            addCriterion("free_type is not null");
            return (Criteria) this;
        }

        public Criteria andFreeTypeEqualTo(String value) {
            addCriterion("free_type =", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeNotEqualTo(String value) {
            addCriterion("free_type <>", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeGreaterThan(String value) {
            addCriterion("free_type >", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("free_type >=", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeLessThan(String value) {
            addCriterion("free_type <", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeLessThanOrEqualTo(String value) {
            addCriterion("free_type <=", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeLike(String value) {
            addCriterion("free_type like", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeNotLike(String value) {
            addCriterion("free_type not like", value, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeIn(List<String> values) {
            addCriterion("free_type in", values, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeNotIn(List<String> values) {
            addCriterion("free_type not in", values, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeBetween(String value1, String value2) {
            addCriterion("free_type between", value1, value2, "freeType");
            return (Criteria) this;
        }

        public Criteria andFreeTypeNotBetween(String value1, String value2) {
            addCriterion("free_type not between", value1, value2, "freeType");
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