package com.tcc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YearTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YearTableExample() {
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

        public Criteria andYearIdIsNull() {
            addCriterion("year_id is null");
            return (Criteria) this;
        }

        public Criteria andYearIdIsNotNull() {
            addCriterion("year_id is not null");
            return (Criteria) this;
        }

        public Criteria andYearIdEqualTo(Integer value) {
            addCriterion("year_id =", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotEqualTo(Integer value) {
            addCriterion("year_id <>", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThan(Integer value) {
            addCriterion("year_id >", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_id >=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThan(Integer value) {
            addCriterion("year_id <", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThanOrEqualTo(Integer value) {
            addCriterion("year_id <=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdIn(List<Integer> values) {
            addCriterion("year_id in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotIn(List<Integer> values) {
            addCriterion("year_id not in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdBetween(Integer value1, Integer value2) {
            addCriterion("year_id between", value1, value2, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotBetween(Integer value1, Integer value2) {
            addCriterion("year_id not between", value1, value2, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearCarIsNull() {
            addCriterion("year_car is null");
            return (Criteria) this;
        }

        public Criteria andYearCarIsNotNull() {
            addCriterion("year_car is not null");
            return (Criteria) this;
        }

        public Criteria andYearCarEqualTo(String value) {
            addCriterion("year_car =", value, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearCarNotEqualTo(String value) {
            addCriterion("year_car <>", value, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearCarGreaterThan(String value) {
            addCriterion("year_car >", value, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearCarGreaterThanOrEqualTo(String value) {
            addCriterion("year_car >=", value, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearCarLessThan(String value) {
            addCriterion("year_car <", value, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearCarLessThanOrEqualTo(String value) {
            addCriterion("year_car <=", value, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearCarLike(String value) {
            addCriterion("year_car like", value, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearCarNotLike(String value) {
            addCriterion("year_car not like", value, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearCarIn(List<String> values) {
            addCriterion("year_car in", values, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearCarNotIn(List<String> values) {
            addCriterion("year_car not in", values, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearCarBetween(String value1, String value2) {
            addCriterion("year_car between", value1, value2, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearCarNotBetween(String value1, String value2) {
            addCriterion("year_car not between", value1, value2, "yearCar");
            return (Criteria) this;
        }

        public Criteria andYearTypeIsNull() {
            addCriterion("year_type is null");
            return (Criteria) this;
        }

        public Criteria andYearTypeIsNotNull() {
            addCriterion("year_type is not null");
            return (Criteria) this;
        }

        public Criteria andYearTypeEqualTo(String value) {
            addCriterion("year_type =", value, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearTypeNotEqualTo(String value) {
            addCriterion("year_type <>", value, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearTypeGreaterThan(String value) {
            addCriterion("year_type >", value, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearTypeGreaterThanOrEqualTo(String value) {
            addCriterion("year_type >=", value, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearTypeLessThan(String value) {
            addCriterion("year_type <", value, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearTypeLessThanOrEqualTo(String value) {
            addCriterion("year_type <=", value, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearTypeLike(String value) {
            addCriterion("year_type like", value, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearTypeNotLike(String value) {
            addCriterion("year_type not like", value, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearTypeIn(List<String> values) {
            addCriterion("year_type in", values, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearTypeNotIn(List<String> values) {
            addCriterion("year_type not in", values, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearTypeBetween(String value1, String value2) {
            addCriterion("year_type between", value1, value2, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearTypeNotBetween(String value1, String value2) {
            addCriterion("year_type not between", value1, value2, "yearType");
            return (Criteria) this;
        }

        public Criteria andYearStimeIsNull() {
            addCriterion("year_stime is null");
            return (Criteria) this;
        }

        public Criteria andYearStimeIsNotNull() {
            addCriterion("year_stime is not null");
            return (Criteria) this;
        }

        public Criteria andYearStimeEqualTo(Date value) {
            addCriterion("year_stime =", value, "yearStime");
            return (Criteria) this;
        }

        public Criteria andYearStimeNotEqualTo(Date value) {
            addCriterion("year_stime <>", value, "yearStime");
            return (Criteria) this;
        }

        public Criteria andYearStimeGreaterThan(Date value) {
            addCriterion("year_stime >", value, "yearStime");
            return (Criteria) this;
        }

        public Criteria andYearStimeGreaterThanOrEqualTo(Date value) {
            addCriterion("year_stime >=", value, "yearStime");
            return (Criteria) this;
        }

        public Criteria andYearStimeLessThan(Date value) {
            addCriterion("year_stime <", value, "yearStime");
            return (Criteria) this;
        }

        public Criteria andYearStimeLessThanOrEqualTo(Date value) {
            addCriterion("year_stime <=", value, "yearStime");
            return (Criteria) this;
        }

        public Criteria andYearStimeIn(List<Date> values) {
            addCriterion("year_stime in", values, "yearStime");
            return (Criteria) this;
        }

        public Criteria andYearStimeNotIn(List<Date> values) {
            addCriterion("year_stime not in", values, "yearStime");
            return (Criteria) this;
        }

        public Criteria andYearStimeBetween(Date value1, Date value2) {
            addCriterion("year_stime between", value1, value2, "yearStime");
            return (Criteria) this;
        }

        public Criteria andYearStimeNotBetween(Date value1, Date value2) {
            addCriterion("year_stime not between", value1, value2, "yearStime");
            return (Criteria) this;
        }

        public Criteria andYearOtimeIsNull() {
            addCriterion("year_otime is null");
            return (Criteria) this;
        }

        public Criteria andYearOtimeIsNotNull() {
            addCriterion("year_otime is not null");
            return (Criteria) this;
        }

        public Criteria andYearOtimeEqualTo(Date value) {
            addCriterion("year_otime =", value, "yearOtime");
            return (Criteria) this;
        }

        public Criteria andYearOtimeNotEqualTo(Date value) {
            addCriterion("year_otime <>", value, "yearOtime");
            return (Criteria) this;
        }

        public Criteria andYearOtimeGreaterThan(Date value) {
            addCriterion("year_otime >", value, "yearOtime");
            return (Criteria) this;
        }

        public Criteria andYearOtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("year_otime >=", value, "yearOtime");
            return (Criteria) this;
        }

        public Criteria andYearOtimeLessThan(Date value) {
            addCriterion("year_otime <", value, "yearOtime");
            return (Criteria) this;
        }

        public Criteria andYearOtimeLessThanOrEqualTo(Date value) {
            addCriterion("year_otime <=", value, "yearOtime");
            return (Criteria) this;
        }

        public Criteria andYearOtimeIn(List<Date> values) {
            addCriterion("year_otime in", values, "yearOtime");
            return (Criteria) this;
        }

        public Criteria andYearOtimeNotIn(List<Date> values) {
            addCriterion("year_otime not in", values, "yearOtime");
            return (Criteria) this;
        }

        public Criteria andYearOtimeBetween(Date value1, Date value2) {
            addCriterion("year_otime between", value1, value2, "yearOtime");
            return (Criteria) this;
        }

        public Criteria andYearOtimeNotBetween(Date value1, Date value2) {
            addCriterion("year_otime not between", value1, value2, "yearOtime");
            return (Criteria) this;
        }

        public Criteria andYearMoneyIsNull() {
            addCriterion("year_money is null");
            return (Criteria) this;
        }

        public Criteria andYearMoneyIsNotNull() {
            addCriterion("year_money is not null");
            return (Criteria) this;
        }

        public Criteria andYearMoneyEqualTo(Integer value) {
            addCriterion("year_money =", value, "yearMoney");
            return (Criteria) this;
        }

        public Criteria andYearMoneyNotEqualTo(Integer value) {
            addCriterion("year_money <>", value, "yearMoney");
            return (Criteria) this;
        }

        public Criteria andYearMoneyGreaterThan(Integer value) {
            addCriterion("year_money >", value, "yearMoney");
            return (Criteria) this;
        }

        public Criteria andYearMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_money >=", value, "yearMoney");
            return (Criteria) this;
        }

        public Criteria andYearMoneyLessThan(Integer value) {
            addCriterion("year_money <", value, "yearMoney");
            return (Criteria) this;
        }

        public Criteria andYearMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("year_money <=", value, "yearMoney");
            return (Criteria) this;
        }

        public Criteria andYearMoneyIn(List<Integer> values) {
            addCriterion("year_money in", values, "yearMoney");
            return (Criteria) this;
        }

        public Criteria andYearMoneyNotIn(List<Integer> values) {
            addCriterion("year_money not in", values, "yearMoney");
            return (Criteria) this;
        }

        public Criteria andYearMoneyBetween(Integer value1, Integer value2) {
            addCriterion("year_money between", value1, value2, "yearMoney");
            return (Criteria) this;
        }

        public Criteria andYearMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("year_money not between", value1, value2, "yearMoney");
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