package cn.edu.sicnu.sc.softwareproduction.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TaskestimateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskestimateExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaidIsNull() {
            addCriterion("taid is null");
            return (Criteria) this;
        }

        public Criteria andTaidIsNotNull() {
            addCriterion("taid is not null");
            return (Criteria) this;
        }

        public Criteria andTaidEqualTo(Long value) {
            addCriterion("taid =", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidNotEqualTo(Long value) {
            addCriterion("taid <>", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidGreaterThan(Long value) {
            addCriterion("taid >", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidGreaterThanOrEqualTo(Long value) {
            addCriterion("taid >=", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidLessThan(Long value) {
            addCriterion("taid <", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidLessThanOrEqualTo(Long value) {
            addCriterion("taid <=", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidIn(List<Long> values) {
            addCriterion("taid in", values, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidNotIn(List<Long> values) {
            addCriterion("taid not in", values, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidBetween(Long value1, Long value2) {
            addCriterion("taid between", value1, value2, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidNotBetween(Long value1, Long value2) {
            addCriterion("taid not between", value1, value2, "taid");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andLeftIsNull() {
            addCriterion("left is null");
            return (Criteria) this;
        }

        public Criteria andLeftIsNotNull() {
            addCriterion("left is not null");
            return (Criteria) this;
        }

        public Criteria andLeftEqualTo(Float value) {
            addCriterion("left =", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftNotEqualTo(Float value) {
            addCriterion("left <>", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftGreaterThan(Float value) {
            addCriterion("left >", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftGreaterThanOrEqualTo(Float value) {
            addCriterion("left >=", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftLessThan(Float value) {
            addCriterion("left <", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftLessThanOrEqualTo(Float value) {
            addCriterion("left <=", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftIn(List<Float> values) {
            addCriterion("left in", values, "left");
            return (Criteria) this;
        }

        public Criteria andLeftNotIn(List<Float> values) {
            addCriterion("left not in", values, "left");
            return (Criteria) this;
        }

        public Criteria andLeftBetween(Float value1, Float value2) {
            addCriterion("left between", value1, value2, "left");
            return (Criteria) this;
        }

        public Criteria andLeftNotBetween(Float value1, Float value2) {
            addCriterion("left not between", value1, value2, "left");
            return (Criteria) this;
        }

        public Criteria andConsumedIsNull() {
            addCriterion("consumed is null");
            return (Criteria) this;
        }

        public Criteria andConsumedIsNotNull() {
            addCriterion("consumed is not null");
            return (Criteria) this;
        }

        public Criteria andConsumedEqualTo(Float value) {
            addCriterion("consumed =", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedNotEqualTo(Float value) {
            addCriterion("consumed <>", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedGreaterThan(Float value) {
            addCriterion("consumed >", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedGreaterThanOrEqualTo(Float value) {
            addCriterion("consumed >=", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedLessThan(Float value) {
            addCriterion("consumed <", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedLessThanOrEqualTo(Float value) {
            addCriterion("consumed <=", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedIn(List<Float> values) {
            addCriterion("consumed in", values, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedNotIn(List<Float> values) {
            addCriterion("consumed not in", values, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedBetween(Float value1, Float value2) {
            addCriterion("consumed between", value1, value2, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedNotBetween(Float value1, Float value2) {
            addCriterion("consumed not between", value1, value2, "consumed");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
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