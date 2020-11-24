package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VersionhistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VersionhistoryExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVbigversionIsNull() {
            addCriterion("vbigversion is null");
            return (Criteria) this;
        }

        public Criteria andVbigversionIsNotNull() {
            addCriterion("vbigversion is not null");
            return (Criteria) this;
        }

        public Criteria andVbigversionEqualTo(String value) {
            addCriterion("vbigversion =", value, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVbigversionNotEqualTo(String value) {
            addCriterion("vbigversion <>", value, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVbigversionGreaterThan(String value) {
            addCriterion("vbigversion >", value, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVbigversionGreaterThanOrEqualTo(String value) {
            addCriterion("vbigversion >=", value, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVbigversionLessThan(String value) {
            addCriterion("vbigversion <", value, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVbigversionLessThanOrEqualTo(String value) {
            addCriterion("vbigversion <=", value, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVbigversionLike(String value) {
            addCriterion("vbigversion like", value, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVbigversionNotLike(String value) {
            addCriterion("vbigversion not like", value, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVbigversionIn(List<String> values) {
            addCriterion("vbigversion in", values, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVbigversionNotIn(List<String> values) {
            addCriterion("vbigversion not in", values, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVbigversionBetween(String value1, String value2) {
            addCriterion("vbigversion between", value1, value2, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVbigversionNotBetween(String value1, String value2) {
            addCriterion("vbigversion not between", value1, value2, "vbigversion");
            return (Criteria) this;
        }

        public Criteria andVversionIsNull() {
            addCriterion("vversion is null");
            return (Criteria) this;
        }

        public Criteria andVversionIsNotNull() {
            addCriterion("vversion is not null");
            return (Criteria) this;
        }

        public Criteria andVversionEqualTo(String value) {
            addCriterion("vversion =", value, "vversion");
            return (Criteria) this;
        }

        public Criteria andVversionNotEqualTo(String value) {
            addCriterion("vversion <>", value, "vversion");
            return (Criteria) this;
        }

        public Criteria andVversionGreaterThan(String value) {
            addCriterion("vversion >", value, "vversion");
            return (Criteria) this;
        }

        public Criteria andVversionGreaterThanOrEqualTo(String value) {
            addCriterion("vversion >=", value, "vversion");
            return (Criteria) this;
        }

        public Criteria andVversionLessThan(String value) {
            addCriterion("vversion <", value, "vversion");
            return (Criteria) this;
        }

        public Criteria andVversionLessThanOrEqualTo(String value) {
            addCriterion("vversion <=", value, "vversion");
            return (Criteria) this;
        }

        public Criteria andVversionLike(String value) {
            addCriterion("vversion like", value, "vversion");
            return (Criteria) this;
        }

        public Criteria andVversionNotLike(String value) {
            addCriterion("vversion not like", value, "vversion");
            return (Criteria) this;
        }

        public Criteria andVversionIn(List<String> values) {
            addCriterion("vversion in", values, "vversion");
            return (Criteria) this;
        }

        public Criteria andVversionNotIn(List<String> values) {
            addCriterion("vversion not in", values, "vversion");
            return (Criteria) this;
        }

        public Criteria andVversionBetween(String value1, String value2) {
            addCriterion("vversion between", value1, value2, "vversion");
            return (Criteria) this;
        }

        public Criteria andVversionNotBetween(String value1, String value2) {
            addCriterion("vversion not between", value1, value2, "vversion");
            return (Criteria) this;
        }

        public Criteria andVtimeIsNull() {
            addCriterion("vtime is null");
            return (Criteria) this;
        }

        public Criteria andVtimeIsNotNull() {
            addCriterion("vtime is not null");
            return (Criteria) this;
        }

        public Criteria andVtimeEqualTo(Date value) {
            addCriterion("vtime =", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeNotEqualTo(Date value) {
            addCriterion("vtime <>", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeGreaterThan(Date value) {
            addCriterion("vtime >", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vtime >=", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeLessThan(Date value) {
            addCriterion("vtime <", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeLessThanOrEqualTo(Date value) {
            addCriterion("vtime <=", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeIn(List<Date> values) {
            addCriterion("vtime in", values, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeNotIn(List<Date> values) {
            addCriterion("vtime not in", values, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeBetween(Date value1, Date value2) {
            addCriterion("vtime between", value1, value2, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeNotBetween(Date value1, Date value2) {
            addCriterion("vtime not between", value1, value2, "vtime");
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