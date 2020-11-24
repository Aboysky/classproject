package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
import java.util.List;

public class PrigroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrigroupExample() {
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

        public Criteria andPgidIsNull() {
            addCriterion("pgid is null");
            return (Criteria) this;
        }

        public Criteria andPgidIsNotNull() {
            addCriterion("pgid is not null");
            return (Criteria) this;
        }

        public Criteria andPgidEqualTo(Integer value) {
            addCriterion("pgid =", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidNotEqualTo(Integer value) {
            addCriterion("pgid <>", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidGreaterThan(Integer value) {
            addCriterion("pgid >", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pgid >=", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidLessThan(Integer value) {
            addCriterion("pgid <", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidLessThanOrEqualTo(Integer value) {
            addCriterion("pgid <=", value, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidIn(List<Integer> values) {
            addCriterion("pgid in", values, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidNotIn(List<Integer> values) {
            addCriterion("pgid not in", values, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidBetween(Integer value1, Integer value2) {
            addCriterion("pgid between", value1, value2, "pgid");
            return (Criteria) this;
        }

        public Criteria andPgidNotBetween(Integer value1, Integer value2) {
            addCriterion("pgid not between", value1, value2, "pgid");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameIsNull() {
            addCriterion("prigroupname is null");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameIsNotNull() {
            addCriterion("prigroupname is not null");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameEqualTo(String value) {
            addCriterion("prigroupname =", value, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameNotEqualTo(String value) {
            addCriterion("prigroupname <>", value, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameGreaterThan(String value) {
            addCriterion("prigroupname >", value, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("prigroupname >=", value, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameLessThan(String value) {
            addCriterion("prigroupname <", value, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameLessThanOrEqualTo(String value) {
            addCriterion("prigroupname <=", value, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameLike(String value) {
            addCriterion("prigroupname like", value, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameNotLike(String value) {
            addCriterion("prigroupname not like", value, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameIn(List<String> values) {
            addCriterion("prigroupname in", values, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameNotIn(List<String> values) {
            addCriterion("prigroupname not in", values, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameBetween(String value1, String value2) {
            addCriterion("prigroupname between", value1, value2, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupnameNotBetween(String value1, String value2) {
            addCriterion("prigroupname not between", value1, value2, "prigroupname");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescIsNull() {
            addCriterion("prigroupdesc is null");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescIsNotNull() {
            addCriterion("prigroupdesc is not null");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescEqualTo(String value) {
            addCriterion("prigroupdesc =", value, "prigroupdesc");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescNotEqualTo(String value) {
            addCriterion("prigroupdesc <>", value, "prigroupdesc");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescGreaterThan(String value) {
            addCriterion("prigroupdesc >", value, "prigroupdesc");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescGreaterThanOrEqualTo(String value) {
            addCriterion("prigroupdesc >=", value, "prigroupdesc");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescLessThan(String value) {
            addCriterion("prigroupdesc <", value, "prigroupdesc");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescLessThanOrEqualTo(String value) {
            addCriterion("prigroupdesc <=", value, "prigroupdesc");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescLike(String value) {
            addCriterion("prigroupdesc like", value, "prigroupdesc");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescNotLike(String value) {
            addCriterion("prigroupdesc not like", value, "prigroupdesc");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescIn(List<String> values) {
            addCriterion("prigroupdesc in", values, "prigroupdesc");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescNotIn(List<String> values) {
            addCriterion("prigroupdesc not in", values, "prigroupdesc");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescBetween(String value1, String value2) {
            addCriterion("prigroupdesc between", value1, value2, "prigroupdesc");
            return (Criteria) this;
        }

        public Criteria andPrigroupdescNotBetween(String value1, String value2) {
            addCriterion("prigroupdesc not between", value1, value2, "prigroupdesc");
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