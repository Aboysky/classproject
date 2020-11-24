package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FaqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaqExample() {
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

        public Criteria andQidIsNull() {
            addCriterion("qid is null");
            return (Criteria) this;
        }

        public Criteria andQidIsNotNull() {
            addCriterion("qid is not null");
            return (Criteria) this;
        }

        public Criteria andQidEqualTo(Integer value) {
            addCriterion("qid =", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotEqualTo(Integer value) {
            addCriterion("qid <>", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThan(Integer value) {
            addCriterion("qid >", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qid >=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThan(Integer value) {
            addCriterion("qid <", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThanOrEqualTo(Integer value) {
            addCriterion("qid <=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidIn(List<Integer> values) {
            addCriterion("qid in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotIn(List<Integer> values) {
            addCriterion("qid not in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidBetween(Integer value1, Integer value2) {
            addCriterion("qid between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotBetween(Integer value1, Integer value2) {
            addCriterion("qid not between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQnameIsNull() {
            addCriterion("qname is null");
            return (Criteria) this;
        }

        public Criteria andQnameIsNotNull() {
            addCriterion("qname is not null");
            return (Criteria) this;
        }

        public Criteria andQnameEqualTo(String value) {
            addCriterion("qname =", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotEqualTo(String value) {
            addCriterion("qname <>", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameGreaterThan(String value) {
            addCriterion("qname >", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameGreaterThanOrEqualTo(String value) {
            addCriterion("qname >=", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLessThan(String value) {
            addCriterion("qname <", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLessThanOrEqualTo(String value) {
            addCriterion("qname <=", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameLike(String value) {
            addCriterion("qname like", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotLike(String value) {
            addCriterion("qname not like", value, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameIn(List<String> values) {
            addCriterion("qname in", values, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotIn(List<String> values) {
            addCriterion("qname not in", values, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameBetween(String value1, String value2) {
            addCriterion("qname between", value1, value2, "qname");
            return (Criteria) this;
        }

        public Criteria andQnameNotBetween(String value1, String value2) {
            addCriterion("qname not between", value1, value2, "qname");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdIsNull() {
            addCriterion("qcreater_id is null");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdIsNotNull() {
            addCriterion("qcreater_id is not null");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdEqualTo(Integer value) {
            addCriterion("qcreater_id =", value, "qcreaterId");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdNotEqualTo(Integer value) {
            addCriterion("qcreater_id <>", value, "qcreaterId");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdGreaterThan(Integer value) {
            addCriterion("qcreater_id >", value, "qcreaterId");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qcreater_id >=", value, "qcreaterId");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdLessThan(Integer value) {
            addCriterion("qcreater_id <", value, "qcreaterId");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("qcreater_id <=", value, "qcreaterId");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdIn(List<Integer> values) {
            addCriterion("qcreater_id in", values, "qcreaterId");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdNotIn(List<Integer> values) {
            addCriterion("qcreater_id not in", values, "qcreaterId");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdBetween(Integer value1, Integer value2) {
            addCriterion("qcreater_id between", value1, value2, "qcreaterId");
            return (Criteria) this;
        }

        public Criteria andQcreaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qcreater_id not between", value1, value2, "qcreaterId");
            return (Criteria) this;
        }

        public Criteria andQtimeIsNull() {
            addCriterion("qtime is null");
            return (Criteria) this;
        }

        public Criteria andQtimeIsNotNull() {
            addCriterion("qtime is not null");
            return (Criteria) this;
        }

        public Criteria andQtimeEqualTo(Date value) {
            addCriterion("qtime =", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeNotEqualTo(Date value) {
            addCriterion("qtime <>", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeGreaterThan(Date value) {
            addCriterion("qtime >", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("qtime >=", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeLessThan(Date value) {
            addCriterion("qtime <", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeLessThanOrEqualTo(Date value) {
            addCriterion("qtime <=", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeIn(List<Date> values) {
            addCriterion("qtime in", values, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeNotIn(List<Date> values) {
            addCriterion("qtime not in", values, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeBetween(Date value1, Date value2) {
            addCriterion("qtime between", value1, value2, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeNotBetween(Date value1, Date value2) {
            addCriterion("qtime not between", value1, value2, "qtime");
            return (Criteria) this;
        }

        public Criteria andQuptimestampIsNull() {
            addCriterion("quptimestamp is null");
            return (Criteria) this;
        }

        public Criteria andQuptimestampIsNotNull() {
            addCriterion("quptimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andQuptimestampEqualTo(Date value) {
            addCriterion("quptimestamp =", value, "quptimestamp");
            return (Criteria) this;
        }

        public Criteria andQuptimestampNotEqualTo(Date value) {
            addCriterion("quptimestamp <>", value, "quptimestamp");
            return (Criteria) this;
        }

        public Criteria andQuptimestampGreaterThan(Date value) {
            addCriterion("quptimestamp >", value, "quptimestamp");
            return (Criteria) this;
        }

        public Criteria andQuptimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("quptimestamp >=", value, "quptimestamp");
            return (Criteria) this;
        }

        public Criteria andQuptimestampLessThan(Date value) {
            addCriterion("quptimestamp <", value, "quptimestamp");
            return (Criteria) this;
        }

        public Criteria andQuptimestampLessThanOrEqualTo(Date value) {
            addCriterion("quptimestamp <=", value, "quptimestamp");
            return (Criteria) this;
        }

        public Criteria andQuptimestampIn(List<Date> values) {
            addCriterion("quptimestamp in", values, "quptimestamp");
            return (Criteria) this;
        }

        public Criteria andQuptimestampNotIn(List<Date> values) {
            addCriterion("quptimestamp not in", values, "quptimestamp");
            return (Criteria) this;
        }

        public Criteria andQuptimestampBetween(Date value1, Date value2) {
            addCriterion("quptimestamp between", value1, value2, "quptimestamp");
            return (Criteria) this;
        }

        public Criteria andQuptimestampNotBetween(Date value1, Date value2) {
            addCriterion("quptimestamp not between", value1, value2, "quptimestamp");
            return (Criteria) this;
        }

        public Criteria andQtypeIsNull() {
            addCriterion("qtype is null");
            return (Criteria) this;
        }

        public Criteria andQtypeIsNotNull() {
            addCriterion("qtype is not null");
            return (Criteria) this;
        }

        public Criteria andQtypeEqualTo(String value) {
            addCriterion("qtype =", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotEqualTo(String value) {
            addCriterion("qtype <>", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThan(String value) {
            addCriterion("qtype >", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThanOrEqualTo(String value) {
            addCriterion("qtype >=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThan(String value) {
            addCriterion("qtype <", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThanOrEqualTo(String value) {
            addCriterion("qtype <=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLike(String value) {
            addCriterion("qtype like", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotLike(String value) {
            addCriterion("qtype not like", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeIn(List<String> values) {
            addCriterion("qtype in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotIn(List<String> values) {
            addCriterion("qtype not in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeBetween(String value1, String value2) {
            addCriterion("qtype between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotBetween(String value1, String value2) {
            addCriterion("qtype not between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andQgoodIsNull() {
            addCriterion("qgood is null");
            return (Criteria) this;
        }

        public Criteria andQgoodIsNotNull() {
            addCriterion("qgood is not null");
            return (Criteria) this;
        }

        public Criteria andQgoodEqualTo(Integer value) {
            addCriterion("qgood =", value, "qgood");
            return (Criteria) this;
        }

        public Criteria andQgoodNotEqualTo(Integer value) {
            addCriterion("qgood <>", value, "qgood");
            return (Criteria) this;
        }

        public Criteria andQgoodGreaterThan(Integer value) {
            addCriterion("qgood >", value, "qgood");
            return (Criteria) this;
        }

        public Criteria andQgoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("qgood >=", value, "qgood");
            return (Criteria) this;
        }

        public Criteria andQgoodLessThan(Integer value) {
            addCriterion("qgood <", value, "qgood");
            return (Criteria) this;
        }

        public Criteria andQgoodLessThanOrEqualTo(Integer value) {
            addCriterion("qgood <=", value, "qgood");
            return (Criteria) this;
        }

        public Criteria andQgoodIn(List<Integer> values) {
            addCriterion("qgood in", values, "qgood");
            return (Criteria) this;
        }

        public Criteria andQgoodNotIn(List<Integer> values) {
            addCriterion("qgood not in", values, "qgood");
            return (Criteria) this;
        }

        public Criteria andQgoodBetween(Integer value1, Integer value2) {
            addCriterion("qgood between", value1, value2, "qgood");
            return (Criteria) this;
        }

        public Criteria andQgoodNotBetween(Integer value1, Integer value2) {
            addCriterion("qgood not between", value1, value2, "qgood");
            return (Criteria) this;
        }

        public Criteria andQbadIsNull() {
            addCriterion("qbad is null");
            return (Criteria) this;
        }

        public Criteria andQbadIsNotNull() {
            addCriterion("qbad is not null");
            return (Criteria) this;
        }

        public Criteria andQbadEqualTo(Integer value) {
            addCriterion("qbad =", value, "qbad");
            return (Criteria) this;
        }

        public Criteria andQbadNotEqualTo(Integer value) {
            addCriterion("qbad <>", value, "qbad");
            return (Criteria) this;
        }

        public Criteria andQbadGreaterThan(Integer value) {
            addCriterion("qbad >", value, "qbad");
            return (Criteria) this;
        }

        public Criteria andQbadGreaterThanOrEqualTo(Integer value) {
            addCriterion("qbad >=", value, "qbad");
            return (Criteria) this;
        }

        public Criteria andQbadLessThan(Integer value) {
            addCriterion("qbad <", value, "qbad");
            return (Criteria) this;
        }

        public Criteria andQbadLessThanOrEqualTo(Integer value) {
            addCriterion("qbad <=", value, "qbad");
            return (Criteria) this;
        }

        public Criteria andQbadIn(List<Integer> values) {
            addCriterion("qbad in", values, "qbad");
            return (Criteria) this;
        }

        public Criteria andQbadNotIn(List<Integer> values) {
            addCriterion("qbad not in", values, "qbad");
            return (Criteria) this;
        }

        public Criteria andQbadBetween(Integer value1, Integer value2) {
            addCriterion("qbad between", value1, value2, "qbad");
            return (Criteria) this;
        }

        public Criteria andQbadNotBetween(Integer value1, Integer value2) {
            addCriterion("qbad not between", value1, value2, "qbad");
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