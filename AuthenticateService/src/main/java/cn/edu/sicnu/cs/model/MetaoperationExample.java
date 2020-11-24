package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
import java.util.List;

public class MetaoperationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MetaoperationExample() {
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

        public Criteria andMoidIsNull() {
            addCriterion("moid is null");
            return (Criteria) this;
        }

        public Criteria andMoidIsNotNull() {
            addCriterion("moid is not null");
            return (Criteria) this;
        }

        public Criteria andMoidEqualTo(Integer value) {
            addCriterion("moid =", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotEqualTo(Integer value) {
            addCriterion("moid <>", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidGreaterThan(Integer value) {
            addCriterion("moid >", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("moid >=", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidLessThan(Integer value) {
            addCriterion("moid <", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidLessThanOrEqualTo(Integer value) {
            addCriterion("moid <=", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidIn(List<Integer> values) {
            addCriterion("moid in", values, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotIn(List<Integer> values) {
            addCriterion("moid not in", values, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidBetween(Integer value1, Integer value2) {
            addCriterion("moid between", value1, value2, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotBetween(Integer value1, Integer value2) {
            addCriterion("moid not between", value1, value2, "moid");
            return (Criteria) this;
        }

        public Criteria andMonameIsNull() {
            addCriterion("moname is null");
            return (Criteria) this;
        }

        public Criteria andMonameIsNotNull() {
            addCriterion("moname is not null");
            return (Criteria) this;
        }

        public Criteria andMonameEqualTo(String value) {
            addCriterion("moname =", value, "moname");
            return (Criteria) this;
        }

        public Criteria andMonameNotEqualTo(String value) {
            addCriterion("moname <>", value, "moname");
            return (Criteria) this;
        }

        public Criteria andMonameGreaterThan(String value) {
            addCriterion("moname >", value, "moname");
            return (Criteria) this;
        }

        public Criteria andMonameGreaterThanOrEqualTo(String value) {
            addCriterion("moname >=", value, "moname");
            return (Criteria) this;
        }

        public Criteria andMonameLessThan(String value) {
            addCriterion("moname <", value, "moname");
            return (Criteria) this;
        }

        public Criteria andMonameLessThanOrEqualTo(String value) {
            addCriterion("moname <=", value, "moname");
            return (Criteria) this;
        }

        public Criteria andMonameLike(String value) {
            addCriterion("moname like", value, "moname");
            return (Criteria) this;
        }

        public Criteria andMonameNotLike(String value) {
            addCriterion("moname not like", value, "moname");
            return (Criteria) this;
        }

        public Criteria andMonameIn(List<String> values) {
            addCriterion("moname in", values, "moname");
            return (Criteria) this;
        }

        public Criteria andMonameNotIn(List<String> values) {
            addCriterion("moname not in", values, "moname");
            return (Criteria) this;
        }

        public Criteria andMonameBetween(String value1, String value2) {
            addCriterion("moname between", value1, value2, "moname");
            return (Criteria) this;
        }

        public Criteria andMonameNotBetween(String value1, String value2) {
            addCriterion("moname not between", value1, value2, "moname");
            return (Criteria) this;
        }

        public Criteria andMolurlIsNull() {
            addCriterion("molurl is null");
            return (Criteria) this;
        }

        public Criteria andMolurlIsNotNull() {
            addCriterion("molurl is not null");
            return (Criteria) this;
        }

        public Criteria andMolurlEqualTo(String value) {
            addCriterion("molurl =", value, "molurl");
            return (Criteria) this;
        }

        public Criteria andMolurlNotEqualTo(String value) {
            addCriterion("molurl <>", value, "molurl");
            return (Criteria) this;
        }

        public Criteria andMolurlGreaterThan(String value) {
            addCriterion("molurl >", value, "molurl");
            return (Criteria) this;
        }

        public Criteria andMolurlGreaterThanOrEqualTo(String value) {
            addCriterion("molurl >=", value, "molurl");
            return (Criteria) this;
        }

        public Criteria andMolurlLessThan(String value) {
            addCriterion("molurl <", value, "molurl");
            return (Criteria) this;
        }

        public Criteria andMolurlLessThanOrEqualTo(String value) {
            addCriterion("molurl <=", value, "molurl");
            return (Criteria) this;
        }

        public Criteria andMolurlLike(String value) {
            addCriterion("molurl like", value, "molurl");
            return (Criteria) this;
        }

        public Criteria andMolurlNotLike(String value) {
            addCriterion("molurl not like", value, "molurl");
            return (Criteria) this;
        }

        public Criteria andMolurlIn(List<String> values) {
            addCriterion("molurl in", values, "molurl");
            return (Criteria) this;
        }

        public Criteria andMolurlNotIn(List<String> values) {
            addCriterion("molurl not in", values, "molurl");
            return (Criteria) this;
        }

        public Criteria andMolurlBetween(String value1, String value2) {
            addCriterion("molurl between", value1, value2, "molurl");
            return (Criteria) this;
        }

        public Criteria andMolurlNotBetween(String value1, String value2) {
            addCriterion("molurl not between", value1, value2, "molurl");
            return (Criteria) this;
        }

        public Criteria andMomethodIsNull() {
            addCriterion("momethod is null");
            return (Criteria) this;
        }

        public Criteria andMomethodIsNotNull() {
            addCriterion("momethod is not null");
            return (Criteria) this;
        }

        public Criteria andMomethodEqualTo(String value) {
            addCriterion("momethod =", value, "momethod");
            return (Criteria) this;
        }

        public Criteria andMomethodNotEqualTo(String value) {
            addCriterion("momethod <>", value, "momethod");
            return (Criteria) this;
        }

        public Criteria andMomethodGreaterThan(String value) {
            addCriterion("momethod >", value, "momethod");
            return (Criteria) this;
        }

        public Criteria andMomethodGreaterThanOrEqualTo(String value) {
            addCriterion("momethod >=", value, "momethod");
            return (Criteria) this;
        }

        public Criteria andMomethodLessThan(String value) {
            addCriterion("momethod <", value, "momethod");
            return (Criteria) this;
        }

        public Criteria andMomethodLessThanOrEqualTo(String value) {
            addCriterion("momethod <=", value, "momethod");
            return (Criteria) this;
        }

        public Criteria andMomethodLike(String value) {
            addCriterion("momethod like", value, "momethod");
            return (Criteria) this;
        }

        public Criteria andMomethodNotLike(String value) {
            addCriterion("momethod not like", value, "momethod");
            return (Criteria) this;
        }

        public Criteria andMomethodIn(List<String> values) {
            addCriterion("momethod in", values, "momethod");
            return (Criteria) this;
        }

        public Criteria andMomethodNotIn(List<String> values) {
            addCriterion("momethod not in", values, "momethod");
            return (Criteria) this;
        }

        public Criteria andMomethodBetween(String value1, String value2) {
            addCriterion("momethod between", value1, value2, "momethod");
            return (Criteria) this;
        }

        public Criteria andMomethodNotBetween(String value1, String value2) {
            addCriterion("momethod not between", value1, value2, "momethod");
            return (Criteria) this;
        }

        public Criteria andModescIsNull() {
            addCriterion("modesc is null");
            return (Criteria) this;
        }

        public Criteria andModescIsNotNull() {
            addCriterion("modesc is not null");
            return (Criteria) this;
        }

        public Criteria andModescEqualTo(String value) {
            addCriterion("modesc =", value, "modesc");
            return (Criteria) this;
        }

        public Criteria andModescNotEqualTo(String value) {
            addCriterion("modesc <>", value, "modesc");
            return (Criteria) this;
        }

        public Criteria andModescGreaterThan(String value) {
            addCriterion("modesc >", value, "modesc");
            return (Criteria) this;
        }

        public Criteria andModescGreaterThanOrEqualTo(String value) {
            addCriterion("modesc >=", value, "modesc");
            return (Criteria) this;
        }

        public Criteria andModescLessThan(String value) {
            addCriterion("modesc <", value, "modesc");
            return (Criteria) this;
        }

        public Criteria andModescLessThanOrEqualTo(String value) {
            addCriterion("modesc <=", value, "modesc");
            return (Criteria) this;
        }

        public Criteria andModescLike(String value) {
            addCriterion("modesc like binary", value, "modesc");
            return (Criteria) this;
        }

        public Criteria andModescNotLike(String value) {
            addCriterion("modesc not like binary", value, "modesc");
            return (Criteria) this;
        }

        public Criteria andModescIn(List<String> values) {
            addCriterion("modesc in", values, "modesc");
            return (Criteria) this;
        }

        public Criteria andModescNotIn(List<String> values) {
            addCriterion("modesc not in", values, "modesc");
            return (Criteria) this;
        }

        public Criteria andModescBetween(String value1, String value2) {
            addCriterion("modesc between", value1, value2, "modesc");
            return (Criteria) this;
        }

        public Criteria andModescNotBetween(String value1, String value2) {
            addCriterion("modesc not between", value1, value2, "modesc");
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