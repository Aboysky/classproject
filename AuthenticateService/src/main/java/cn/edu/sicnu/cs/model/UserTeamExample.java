package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
import java.util.List;

public class UserTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTeamExample() {
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

        public Criteria andUtidIsNull() {
            addCriterion("utid is null");
            return (Criteria) this;
        }

        public Criteria andUtidIsNotNull() {
            addCriterion("utid is not null");
            return (Criteria) this;
        }

        public Criteria andUtidEqualTo(Long value) {
            addCriterion("utid =", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidNotEqualTo(Long value) {
            addCriterion("utid <>", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidGreaterThan(Long value) {
            addCriterion("utid >", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidGreaterThanOrEqualTo(Long value) {
            addCriterion("utid >=", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidLessThan(Long value) {
            addCriterion("utid <", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidLessThanOrEqualTo(Long value) {
            addCriterion("utid <=", value, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidIn(List<Long> values) {
            addCriterion("utid in", values, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidNotIn(List<Long> values) {
            addCriterion("utid not in", values, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidBetween(Long value1, Long value2) {
            addCriterion("utid between", value1, value2, "utid");
            return (Criteria) this;
        }

        public Criteria andUtidNotBetween(Long value1, Long value2) {
            addCriterion("utid not between", value1, value2, "utid");
            return (Criteria) this;
        }

        public Criteria andUtTidIsNull() {
            addCriterion("ut_tid is null");
            return (Criteria) this;
        }

        public Criteria andUtTidIsNotNull() {
            addCriterion("ut_tid is not null");
            return (Criteria) this;
        }

        public Criteria andUtTidEqualTo(Integer value) {
            addCriterion("ut_tid =", value, "utTid");
            return (Criteria) this;
        }

        public Criteria andUtTidNotEqualTo(Integer value) {
            addCriterion("ut_tid <>", value, "utTid");
            return (Criteria) this;
        }

        public Criteria andUtTidGreaterThan(Integer value) {
            addCriterion("ut_tid >", value, "utTid");
            return (Criteria) this;
        }

        public Criteria andUtTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ut_tid >=", value, "utTid");
            return (Criteria) this;
        }

        public Criteria andUtTidLessThan(Integer value) {
            addCriterion("ut_tid <", value, "utTid");
            return (Criteria) this;
        }

        public Criteria andUtTidLessThanOrEqualTo(Integer value) {
            addCriterion("ut_tid <=", value, "utTid");
            return (Criteria) this;
        }

        public Criteria andUtTidIn(List<Integer> values) {
            addCriterion("ut_tid in", values, "utTid");
            return (Criteria) this;
        }

        public Criteria andUtTidNotIn(List<Integer> values) {
            addCriterion("ut_tid not in", values, "utTid");
            return (Criteria) this;
        }

        public Criteria andUtTidBetween(Integer value1, Integer value2) {
            addCriterion("ut_tid between", value1, value2, "utTid");
            return (Criteria) this;
        }

        public Criteria andUtTidNotBetween(Integer value1, Integer value2) {
            addCriterion("ut_tid not between", value1, value2, "utTid");
            return (Criteria) this;
        }

        public Criteria andUtUidIsNull() {
            addCriterion("ut_uid is null");
            return (Criteria) this;
        }

        public Criteria andUtUidIsNotNull() {
            addCriterion("ut_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUtUidEqualTo(Integer value) {
            addCriterion("ut_uid =", value, "utUid");
            return (Criteria) this;
        }

        public Criteria andUtUidNotEqualTo(Integer value) {
            addCriterion("ut_uid <>", value, "utUid");
            return (Criteria) this;
        }

        public Criteria andUtUidGreaterThan(Integer value) {
            addCriterion("ut_uid >", value, "utUid");
            return (Criteria) this;
        }

        public Criteria andUtUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ut_uid >=", value, "utUid");
            return (Criteria) this;
        }

        public Criteria andUtUidLessThan(Integer value) {
            addCriterion("ut_uid <", value, "utUid");
            return (Criteria) this;
        }

        public Criteria andUtUidLessThanOrEqualTo(Integer value) {
            addCriterion("ut_uid <=", value, "utUid");
            return (Criteria) this;
        }

        public Criteria andUtUidIn(List<Integer> values) {
            addCriterion("ut_uid in", values, "utUid");
            return (Criteria) this;
        }

        public Criteria andUtUidNotIn(List<Integer> values) {
            addCriterion("ut_uid not in", values, "utUid");
            return (Criteria) this;
        }

        public Criteria andUtUidBetween(Integer value1, Integer value2) {
            addCriterion("ut_uid between", value1, value2, "utUid");
            return (Criteria) this;
        }

        public Criteria andUtUidNotBetween(Integer value1, Integer value2) {
            addCriterion("ut_uid not between", value1, value2, "utUid");
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