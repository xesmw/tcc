package com.tcc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarTableExample() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNull() {
            addCriterion("car_brand is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNotNull() {
            addCriterion("car_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandEqualTo(String value) {
            addCriterion("car_brand =", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotEqualTo(String value) {
            addCriterion("car_brand <>", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThan(String value) {
            addCriterion("car_brand >", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThanOrEqualTo(String value) {
            addCriterion("car_brand >=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThan(String value) {
            addCriterion("car_brand <", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThanOrEqualTo(String value) {
            addCriterion("car_brand <=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLike(String value) {
            addCriterion("car_brand like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotLike(String value) {
            addCriterion("car_brand not like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandIn(List<String> values) {
            addCriterion("car_brand in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotIn(List<String> values) {
            addCriterion("car_brand not in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandBetween(String value1, String value2) {
            addCriterion("car_brand between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotBetween(String value1, String value2) {
            addCriterion("car_brand not between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarPlIsNull() {
            addCriterion("car_pl is null");
            return (Criteria) this;
        }

        public Criteria andCarPlIsNotNull() {
            addCriterion("car_pl is not null");
            return (Criteria) this;
        }

        public Criteria andCarPlEqualTo(String value) {
            addCriterion("car_pl =", value, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarPlNotEqualTo(String value) {
            addCriterion("car_pl <>", value, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarPlGreaterThan(String value) {
            addCriterion("car_pl >", value, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarPlGreaterThanOrEqualTo(String value) {
            addCriterion("car_pl >=", value, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarPlLessThan(String value) {
            addCriterion("car_pl <", value, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarPlLessThanOrEqualTo(String value) {
            addCriterion("car_pl <=", value, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarPlLike(String value) {
            addCriterion("car_pl like", value, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarPlNotLike(String value) {
            addCriterion("car_pl not like", value, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarPlIn(List<String> values) {
            addCriterion("car_pl in", values, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarPlNotIn(List<String> values) {
            addCriterion("car_pl not in", values, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarPlBetween(String value1, String value2) {
            addCriterion("car_pl between", value1, value2, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarPlNotBetween(String value1, String value2) {
            addCriterion("car_pl not between", value1, value2, "carPl");
            return (Criteria) this;
        }

        public Criteria andCarUtimeIsNull() {
            addCriterion("car_utime is null");
            return (Criteria) this;
        }

        public Criteria andCarUtimeIsNotNull() {
            addCriterion("car_utime is not null");
            return (Criteria) this;
        }

        public Criteria andCarUtimeEqualTo(String value) {
            addCriterion("car_utime =", value, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarUtimeNotEqualTo(String value) {
            addCriterion("car_utime <>", value, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarUtimeGreaterThan(String value) {
            addCriterion("car_utime >", value, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarUtimeGreaterThanOrEqualTo(String value) {
            addCriterion("car_utime >=", value, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarUtimeLessThan(String value) {
            addCriterion("car_utime <", value, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarUtimeLessThanOrEqualTo(String value) {
            addCriterion("car_utime <=", value, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarUtimeLike(String value) {
            addCriterion("car_utime like", value, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarUtimeNotLike(String value) {
            addCriterion("car_utime not like", value, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarUtimeIn(List<String> values) {
            addCriterion("car_utime in", values, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarUtimeNotIn(List<String> values) {
            addCriterion("car_utime not in", values, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarUtimeBetween(String value1, String value2) {
            addCriterion("car_utime between", value1, value2, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarUtimeNotBetween(String value1, String value2) {
            addCriterion("car_utime not between", value1, value2, "carUtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeIsNull() {
            addCriterion("car_otime is null");
            return (Criteria) this;
        }

        public Criteria andCarOtimeIsNotNull() {
            addCriterion("car_otime is not null");
            return (Criteria) this;
        }

        public Criteria andCarOtimeEqualTo(String value) {
            addCriterion("car_otime =", value, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeNotEqualTo(String value) {
            addCriterion("car_otime <>", value, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeGreaterThan(String value) {
            addCriterion("car_otime >", value, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeGreaterThanOrEqualTo(String value) {
            addCriterion("car_otime >=", value, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeLessThan(String value) {
            addCriterion("car_otime <", value, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeLessThanOrEqualTo(String value) {
            addCriterion("car_otime <=", value, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeLike(String value) {
            addCriterion("car_otime like", value, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeNotLike(String value) {
            addCriterion("car_otime not like", value, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeIn(List<String> values) {
            addCriterion("car_otime in", values, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeNotIn(List<String> values) {
            addCriterion("car_otime not in", values, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeBetween(String value1, String value2) {
            addCriterion("car_otime between", value1, value2, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarOtimeNotBetween(String value1, String value2) {
            addCriterion("car_otime not between", value1, value2, "carOtime");
            return (Criteria) this;
        }

        public Criteria andCarMoneyIsNull() {
            addCriterion("car_money is null");
            return (Criteria) this;
        }

        public Criteria andCarMoneyIsNotNull() {
            addCriterion("car_money is not null");
            return (Criteria) this;
        }

        public Criteria andCarMoneyEqualTo(String value) {
            addCriterion("car_money =", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyNotEqualTo(String value) {
            addCriterion("car_money <>", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyGreaterThan(String value) {
            addCriterion("car_money >", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("car_money >=", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyLessThan(String value) {
            addCriterion("car_money <", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyLessThanOrEqualTo(String value) {
            addCriterion("car_money <=", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyLike(String value) {
            addCriterion("car_money like", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyNotLike(String value) {
            addCriterion("car_money not like", value, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyIn(List<String> values) {
            addCriterion("car_money in", values, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyNotIn(List<String> values) {
            addCriterion("car_money not in", values, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyBetween(String value1, String value2) {
            addCriterion("car_money between", value1, value2, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarMoneyNotBetween(String value1, String value2) {
            addCriterion("car_money not between", value1, value2, "carMoney");
            return (Criteria) this;
        }

        public Criteria andCarStateIsNull() {
            addCriterion("car_state is null");
            return (Criteria) this;
        }

        public Criteria andCarStateIsNotNull() {
            addCriterion("car_state is not null");
            return (Criteria) this;
        }

        public Criteria andCarStateEqualTo(String value) {
            addCriterion("car_state =", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotEqualTo(String value) {
            addCriterion("car_state <>", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateGreaterThan(String value) {
            addCriterion("car_state >", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateGreaterThanOrEqualTo(String value) {
            addCriterion("car_state >=", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLessThan(String value) {
            addCriterion("car_state <", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLessThanOrEqualTo(String value) {
            addCriterion("car_state <=", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLike(String value) {
            addCriterion("car_state like", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotLike(String value) {
            addCriterion("car_state not like", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateIn(List<String> values) {
            addCriterion("car_state in", values, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotIn(List<String> values) {
            addCriterion("car_state not in", values, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateBetween(String value1, String value2) {
            addCriterion("car_state between", value1, value2, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotBetween(String value1, String value2) {
            addCriterion("car_state not between", value1, value2, "carState");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
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