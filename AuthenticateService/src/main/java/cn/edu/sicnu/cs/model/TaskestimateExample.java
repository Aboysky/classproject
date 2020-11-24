package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
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

        public Criteria andTazidIsNull() {
            addCriterion("tazid is null");
            return (Criteria) this;
        }

        public Criteria andTazidIsNotNull() {
            addCriterion("tazid is not null");
            return (Criteria) this;
        }

        public Criteria andTazidEqualTo(Long value) {
            addCriterion("tazid =", value, "tazid");
            return (Criteria) this;
        }

        public Criteria andTazidNotEqualTo(Long value) {
            addCriterion("tazid <>", value, "tazid");
            return (Criteria) this;
        }

        public Criteria andTazidGreaterThan(Long value) {
            addCriterion("tazid >", value, "tazid");
            return (Criteria) this;
        }

        public Criteria andTazidGreaterThanOrEqualTo(Long value) {
            addCriterion("tazid >=", value, "tazid");
            return (Criteria) this;
        }

        public Criteria andTazidLessThan(Long value) {
            addCriterion("tazid <", value, "tazid");
            return (Criteria) this;
        }

        public Criteria andTazidLessThanOrEqualTo(Long value) {
            addCriterion("tazid <=", value, "tazid");
            return (Criteria) this;
        }

        public Criteria andTazidIn(List<Long> values) {
            addCriterion("tazid in", values, "tazid");
            return (Criteria) this;
        }

        public Criteria andTazidNotIn(List<Long> values) {
            addCriterion("tazid not in", values, "tazid");
            return (Criteria) this;
        }

        public Criteria andTazidBetween(Long value1, Long value2) {
            addCriterion("tazid between", value1, value2, "tazid");
            return (Criteria) this;
        }

        public Criteria andTazidNotBetween(Long value1, Long value2) {
            addCriterion("tazid not between", value1, value2, "tazid");
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

        public Criteria andTaconsumedIsNull() {
            addCriterion("taconsumed is null");
            return (Criteria) this;
        }

        public Criteria andTaconsumedIsNotNull() {
            addCriterion("taconsumed is not null");
            return (Criteria) this;
        }

        public Criteria andTaconsumedEqualTo(Float value) {
            addCriterion("taconsumed =", value, "taconsumed");
            return (Criteria) this;
        }

        public Criteria andTaconsumedNotEqualTo(Float value) {
            addCriterion("taconsumed <>", value, "taconsumed");
            return (Criteria) this;
        }

        public Criteria andTaconsumedGreaterThan(Float value) {
            addCriterion("taconsumed >", value, "taconsumed");
            return (Criteria) this;
        }

        public Criteria andTaconsumedGreaterThanOrEqualTo(Float value) {
            addCriterion("taconsumed >=", value, "taconsumed");
            return (Criteria) this;
        }

        public Criteria andTaconsumedLessThan(Float value) {
            addCriterion("taconsumed <", value, "taconsumed");
            return (Criteria) this;
        }

        public Criteria andTaconsumedLessThanOrEqualTo(Float value) {
            addCriterion("taconsumed <=", value, "taconsumed");
            return (Criteria) this;
        }

        public Criteria andTaconsumedIn(List<Float> values) {
            addCriterion("taconsumed in", values, "taconsumed");
            return (Criteria) this;
        }

        public Criteria andTaconsumedNotIn(List<Float> values) {
            addCriterion("taconsumed not in", values, "taconsumed");
            return (Criteria) this;
        }

        public Criteria andTaconsumedBetween(Float value1, Float value2) {
            addCriterion("taconsumed between", value1, value2, "taconsumed");
            return (Criteria) this;
        }

        public Criteria andTaconsumedNotBetween(Float value1, Float value2) {
            addCriterion("taconsumed not between", value1, value2, "taconsumed");
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