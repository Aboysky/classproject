package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCmobileIsNull() {
            addCriterion("cmobile is null");
            return (Criteria) this;
        }

        public Criteria andCmobileIsNotNull() {
            addCriterion("cmobile is not null");
            return (Criteria) this;
        }

        public Criteria andCmobileEqualTo(String value) {
            addCriterion("cmobile =", value, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCmobileNotEqualTo(String value) {
            addCriterion("cmobile <>", value, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCmobileGreaterThan(String value) {
            addCriterion("cmobile >", value, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCmobileGreaterThanOrEqualTo(String value) {
            addCriterion("cmobile >=", value, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCmobileLessThan(String value) {
            addCriterion("cmobile <", value, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCmobileLessThanOrEqualTo(String value) {
            addCriterion("cmobile <=", value, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCmobileLike(String value) {
            addCriterion("cmobile like", value, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCmobileNotLike(String value) {
            addCriterion("cmobile not like", value, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCmobileIn(List<String> values) {
            addCriterion("cmobile in", values, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCmobileNotIn(List<String> values) {
            addCriterion("cmobile not in", values, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCmobileBetween(String value1, String value2) {
            addCriterion("cmobile between", value1, value2, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCmobileNotBetween(String value1, String value2) {
            addCriterion("cmobile not between", value1, value2, "cmobile");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNull() {
            addCriterion("caddress is null");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNotNull() {
            addCriterion("caddress is not null");
            return (Criteria) this;
        }

        public Criteria andCaddressEqualTo(String value) {
            addCriterion("caddress =", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotEqualTo(String value) {
            addCriterion("caddress <>", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThan(String value) {
            addCriterion("caddress >", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThanOrEqualTo(String value) {
            addCriterion("caddress >=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThan(String value) {
            addCriterion("caddress <", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThanOrEqualTo(String value) {
            addCriterion("caddress <=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLike(String value) {
            addCriterion("caddress like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotLike(String value) {
            addCriterion("caddress not like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIn(List<String> values) {
            addCriterion("caddress in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotIn(List<String> values) {
            addCriterion("caddress not in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressBetween(String value1, String value2) {
            addCriterion("caddress between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotBetween(String value1, String value2) {
            addCriterion("caddress not between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCzipcodeIsNull() {
            addCriterion("czipcode is null");
            return (Criteria) this;
        }

        public Criteria andCzipcodeIsNotNull() {
            addCriterion("czipcode is not null");
            return (Criteria) this;
        }

        public Criteria andCzipcodeEqualTo(String value) {
            addCriterion("czipcode =", value, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCzipcodeNotEqualTo(String value) {
            addCriterion("czipcode <>", value, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCzipcodeGreaterThan(String value) {
            addCriterion("czipcode >", value, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCzipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("czipcode >=", value, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCzipcodeLessThan(String value) {
            addCriterion("czipcode <", value, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCzipcodeLessThanOrEqualTo(String value) {
            addCriterion("czipcode <=", value, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCzipcodeLike(String value) {
            addCriterion("czipcode like", value, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCzipcodeNotLike(String value) {
            addCriterion("czipcode not like", value, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCzipcodeIn(List<String> values) {
            addCriterion("czipcode in", values, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCzipcodeNotIn(List<String> values) {
            addCriterion("czipcode not in", values, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCzipcodeBetween(String value1, String value2) {
            addCriterion("czipcode between", value1, value2, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCzipcodeNotBetween(String value1, String value2) {
            addCriterion("czipcode not between", value1, value2, "czipcode");
            return (Criteria) this;
        }

        public Criteria andCwebsiteIsNull() {
            addCriterion("cwebsite is null");
            return (Criteria) this;
        }

        public Criteria andCwebsiteIsNotNull() {
            addCriterion("cwebsite is not null");
            return (Criteria) this;
        }

        public Criteria andCwebsiteEqualTo(String value) {
            addCriterion("cwebsite =", value, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCwebsiteNotEqualTo(String value) {
            addCriterion("cwebsite <>", value, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCwebsiteGreaterThan(String value) {
            addCriterion("cwebsite >", value, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCwebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("cwebsite >=", value, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCwebsiteLessThan(String value) {
            addCriterion("cwebsite <", value, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCwebsiteLessThanOrEqualTo(String value) {
            addCriterion("cwebsite <=", value, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCwebsiteLike(String value) {
            addCriterion("cwebsite like", value, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCwebsiteNotLike(String value) {
            addCriterion("cwebsite not like", value, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCwebsiteIn(List<String> values) {
            addCriterion("cwebsite in", values, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCwebsiteNotIn(List<String> values) {
            addCriterion("cwebsite not in", values, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCwebsiteBetween(String value1, String value2) {
            addCriterion("cwebsite between", value1, value2, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCwebsiteNotBetween(String value1, String value2) {
            addCriterion("cwebsite not between", value1, value2, "cwebsite");
            return (Criteria) this;
        }

        public Criteria andCdeletedIsNull() {
            addCriterion("cdeleted is null");
            return (Criteria) this;
        }

        public Criteria andCdeletedIsNotNull() {
            addCriterion("cdeleted is not null");
            return (Criteria) this;
        }

        public Criteria andCdeletedEqualTo(String value) {
            addCriterion("cdeleted =", value, "cdeleted");
            return (Criteria) this;
        }

        public Criteria andCdeletedNotEqualTo(String value) {
            addCriterion("cdeleted <>", value, "cdeleted");
            return (Criteria) this;
        }

        public Criteria andCdeletedGreaterThan(String value) {
            addCriterion("cdeleted >", value, "cdeleted");
            return (Criteria) this;
        }

        public Criteria andCdeletedGreaterThanOrEqualTo(String value) {
            addCriterion("cdeleted >=", value, "cdeleted");
            return (Criteria) this;
        }

        public Criteria andCdeletedLessThan(String value) {
            addCriterion("cdeleted <", value, "cdeleted");
            return (Criteria) this;
        }

        public Criteria andCdeletedLessThanOrEqualTo(String value) {
            addCriterion("cdeleted <=", value, "cdeleted");
            return (Criteria) this;
        }

        public Criteria andCdeletedLike(String value) {
            addCriterion("cdeleted like", value, "cdeleted");
            return (Criteria) this;
        }

        public Criteria andCdeletedNotLike(String value) {
            addCriterion("cdeleted not like", value, "cdeleted");
            return (Criteria) this;
        }

        public Criteria andCdeletedIn(List<String> values) {
            addCriterion("cdeleted in", values, "cdeleted");
            return (Criteria) this;
        }

        public Criteria andCdeletedNotIn(List<String> values) {
            addCriterion("cdeleted not in", values, "cdeleted");
            return (Criteria) this;
        }

        public Criteria andCdeletedBetween(String value1, String value2) {
            addCriterion("cdeleted between", value1, value2, "cdeleted");
            return (Criteria) this;
        }

        public Criteria andCdeletedNotBetween(String value1, String value2) {
            addCriterion("cdeleted not between", value1, value2, "cdeleted");
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