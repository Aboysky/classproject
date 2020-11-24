package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        public Criteria andTezidIsNull() {
            addCriterion("tezid is null");
            return (Criteria) this;
        }

        public Criteria andTezidIsNotNull() {
            addCriterion("tezid is not null");
            return (Criteria) this;
        }

        public Criteria andTezidEqualTo(Integer value) {
            addCriterion("tezid =", value, "tezid");
            return (Criteria) this;
        }

        public Criteria andTezidNotEqualTo(Integer value) {
            addCriterion("tezid <>", value, "tezid");
            return (Criteria) this;
        }

        public Criteria andTezidGreaterThan(Integer value) {
            addCriterion("tezid >", value, "tezid");
            return (Criteria) this;
        }

        public Criteria andTezidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tezid >=", value, "tezid");
            return (Criteria) this;
        }

        public Criteria andTezidLessThan(Integer value) {
            addCriterion("tezid <", value, "tezid");
            return (Criteria) this;
        }

        public Criteria andTezidLessThanOrEqualTo(Integer value) {
            addCriterion("tezid <=", value, "tezid");
            return (Criteria) this;
        }

        public Criteria andTezidIn(List<Integer> values) {
            addCriterion("tezid in", values, "tezid");
            return (Criteria) this;
        }

        public Criteria andTezidNotIn(List<Integer> values) {
            addCriterion("tezid not in", values, "tezid");
            return (Criteria) this;
        }

        public Criteria andTezidBetween(Integer value1, Integer value2) {
            addCriterion("tezid between", value1, value2, "tezid");
            return (Criteria) this;
        }

        public Criteria andTezidNotBetween(Integer value1, Integer value2) {
            addCriterion("tezid not between", value1, value2, "tezid");
            return (Criteria) this;
        }

        public Criteria andTeDidIsNull() {
            addCriterion("te_did is null");
            return (Criteria) this;
        }

        public Criteria andTeDidIsNotNull() {
            addCriterion("te_did is not null");
            return (Criteria) this;
        }

        public Criteria andTeDidEqualTo(Integer value) {
            addCriterion("te_did =", value, "teDid");
            return (Criteria) this;
        }

        public Criteria andTeDidNotEqualTo(Integer value) {
            addCriterion("te_did <>", value, "teDid");
            return (Criteria) this;
        }

        public Criteria andTeDidGreaterThan(Integer value) {
            addCriterion("te_did >", value, "teDid");
            return (Criteria) this;
        }

        public Criteria andTeDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("te_did >=", value, "teDid");
            return (Criteria) this;
        }

        public Criteria andTeDidLessThan(Integer value) {
            addCriterion("te_did <", value, "teDid");
            return (Criteria) this;
        }

        public Criteria andTeDidLessThanOrEqualTo(Integer value) {
            addCriterion("te_did <=", value, "teDid");
            return (Criteria) this;
        }

        public Criteria andTeDidIn(List<Integer> values) {
            addCriterion("te_did in", values, "teDid");
            return (Criteria) this;
        }

        public Criteria andTeDidNotIn(List<Integer> values) {
            addCriterion("te_did not in", values, "teDid");
            return (Criteria) this;
        }

        public Criteria andTeDidBetween(Integer value1, Integer value2) {
            addCriterion("te_did between", value1, value2, "teDid");
            return (Criteria) this;
        }

        public Criteria andTeDidNotBetween(Integer value1, Integer value2) {
            addCriterion("te_did not between", value1, value2, "teDid");
            return (Criteria) this;
        }

        public Criteria andTeUidIsNull() {
            addCriterion("te_uid is null");
            return (Criteria) this;
        }

        public Criteria andTeUidIsNotNull() {
            addCriterion("te_uid is not null");
            return (Criteria) this;
        }

        public Criteria andTeUidEqualTo(Integer value) {
            addCriterion("te_uid =", value, "teUid");
            return (Criteria) this;
        }

        public Criteria andTeUidNotEqualTo(Integer value) {
            addCriterion("te_uid <>", value, "teUid");
            return (Criteria) this;
        }

        public Criteria andTeUidGreaterThan(Integer value) {
            addCriterion("te_uid >", value, "teUid");
            return (Criteria) this;
        }

        public Criteria andTeUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("te_uid >=", value, "teUid");
            return (Criteria) this;
        }

        public Criteria andTeUidLessThan(Integer value) {
            addCriterion("te_uid <", value, "teUid");
            return (Criteria) this;
        }

        public Criteria andTeUidLessThanOrEqualTo(Integer value) {
            addCriterion("te_uid <=", value, "teUid");
            return (Criteria) this;
        }

        public Criteria andTeUidIn(List<Integer> values) {
            addCriterion("te_uid in", values, "teUid");
            return (Criteria) this;
        }

        public Criteria andTeUidNotIn(List<Integer> values) {
            addCriterion("te_uid not in", values, "teUid");
            return (Criteria) this;
        }

        public Criteria andTeUidBetween(Integer value1, Integer value2) {
            addCriterion("te_uid between", value1, value2, "teUid");
            return (Criteria) this;
        }

        public Criteria andTeUidNotBetween(Integer value1, Integer value2) {
            addCriterion("te_uid not between", value1, value2, "teUid");
            return (Criteria) this;
        }

        public Criteria andTedaysIsNull() {
            addCriterion("tedays is null");
            return (Criteria) this;
        }

        public Criteria andTedaysIsNotNull() {
            addCriterion("tedays is not null");
            return (Criteria) this;
        }

        public Criteria andTedaysEqualTo(Integer value) {
            addCriterion("tedays =", value, "tedays");
            return (Criteria) this;
        }

        public Criteria andTedaysNotEqualTo(Integer value) {
            addCriterion("tedays <>", value, "tedays");
            return (Criteria) this;
        }

        public Criteria andTedaysGreaterThan(Integer value) {
            addCriterion("tedays >", value, "tedays");
            return (Criteria) this;
        }

        public Criteria andTedaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("tedays >=", value, "tedays");
            return (Criteria) this;
        }

        public Criteria andTedaysLessThan(Integer value) {
            addCriterion("tedays <", value, "tedays");
            return (Criteria) this;
        }

        public Criteria andTedaysLessThanOrEqualTo(Integer value) {
            addCriterion("tedays <=", value, "tedays");
            return (Criteria) this;
        }

        public Criteria andTedaysIn(List<Integer> values) {
            addCriterion("tedays in", values, "tedays");
            return (Criteria) this;
        }

        public Criteria andTedaysNotIn(List<Integer> values) {
            addCriterion("tedays not in", values, "tedays");
            return (Criteria) this;
        }

        public Criteria andTedaysBetween(Integer value1, Integer value2) {
            addCriterion("tedays between", value1, value2, "tedays");
            return (Criteria) this;
        }

        public Criteria andTedaysNotBetween(Integer value1, Integer value2) {
            addCriterion("tedays not between", value1, value2, "tedays");
            return (Criteria) this;
        }

        public Criteria andTehoursIsNull() {
            addCriterion("tehours is null");
            return (Criteria) this;
        }

        public Criteria andTehoursIsNotNull() {
            addCriterion("tehours is not null");
            return (Criteria) this;
        }

        public Criteria andTehoursEqualTo(Float value) {
            addCriterion("tehours =", value, "tehours");
            return (Criteria) this;
        }

        public Criteria andTehoursNotEqualTo(Float value) {
            addCriterion("tehours <>", value, "tehours");
            return (Criteria) this;
        }

        public Criteria andTehoursGreaterThan(Float value) {
            addCriterion("tehours >", value, "tehours");
            return (Criteria) this;
        }

        public Criteria andTehoursGreaterThanOrEqualTo(Float value) {
            addCriterion("tehours >=", value, "tehours");
            return (Criteria) this;
        }

        public Criteria andTehoursLessThan(Float value) {
            addCriterion("tehours <", value, "tehours");
            return (Criteria) this;
        }

        public Criteria andTehoursLessThanOrEqualTo(Float value) {
            addCriterion("tehours <=", value, "tehours");
            return (Criteria) this;
        }

        public Criteria andTehoursIn(List<Float> values) {
            addCriterion("tehours in", values, "tehours");
            return (Criteria) this;
        }

        public Criteria andTehoursNotIn(List<Float> values) {
            addCriterion("tehours not in", values, "tehours");
            return (Criteria) this;
        }

        public Criteria andTehoursBetween(Float value1, Float value2) {
            addCriterion("tehours between", value1, value2, "tehours");
            return (Criteria) this;
        }

        public Criteria andTehoursNotBetween(Float value1, Float value2) {
            addCriterion("tehours not between", value1, value2, "tehours");
            return (Criteria) this;
        }

        public Criteria andTeestimateIsNull() {
            addCriterion("teestimate is null");
            return (Criteria) this;
        }

        public Criteria andTeestimateIsNotNull() {
            addCriterion("teestimate is not null");
            return (Criteria) this;
        }

        public Criteria andTeestimateEqualTo(Integer value) {
            addCriterion("teestimate =", value, "teestimate");
            return (Criteria) this;
        }

        public Criteria andTeestimateNotEqualTo(Integer value) {
            addCriterion("teestimate <>", value, "teestimate");
            return (Criteria) this;
        }

        public Criteria andTeestimateGreaterThan(Integer value) {
            addCriterion("teestimate >", value, "teestimate");
            return (Criteria) this;
        }

        public Criteria andTeestimateGreaterThanOrEqualTo(Integer value) {
            addCriterion("teestimate >=", value, "teestimate");
            return (Criteria) this;
        }

        public Criteria andTeestimateLessThan(Integer value) {
            addCriterion("teestimate <", value, "teestimate");
            return (Criteria) this;
        }

        public Criteria andTeestimateLessThanOrEqualTo(Integer value) {
            addCriterion("teestimate <=", value, "teestimate");
            return (Criteria) this;
        }

        public Criteria andTeestimateIn(List<Integer> values) {
            addCriterion("teestimate in", values, "teestimate");
            return (Criteria) this;
        }

        public Criteria andTeestimateNotIn(List<Integer> values) {
            addCriterion("teestimate not in", values, "teestimate");
            return (Criteria) this;
        }

        public Criteria andTeestimateBetween(Integer value1, Integer value2) {
            addCriterion("teestimate between", value1, value2, "teestimate");
            return (Criteria) this;
        }

        public Criteria andTeestimateNotBetween(Integer value1, Integer value2) {
            addCriterion("teestimate not between", value1, value2, "teestimate");
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