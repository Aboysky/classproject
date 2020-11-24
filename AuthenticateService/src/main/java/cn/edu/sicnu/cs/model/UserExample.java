package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdIsNull() {
            addCriterion("ucompany_id is null");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdIsNotNull() {
            addCriterion("ucompany_id is not null");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdEqualTo(Integer value) {
            addCriterion("ucompany_id =", value, "ucompanyId");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdNotEqualTo(Integer value) {
            addCriterion("ucompany_id <>", value, "ucompanyId");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdGreaterThan(Integer value) {
            addCriterion("ucompany_id >", value, "ucompanyId");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ucompany_id >=", value, "ucompanyId");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdLessThan(Integer value) {
            addCriterion("ucompany_id <", value, "ucompanyId");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ucompany_id <=", value, "ucompanyId");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdIn(List<Integer> values) {
            addCriterion("ucompany_id in", values, "ucompanyId");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdNotIn(List<Integer> values) {
            addCriterion("ucompany_id not in", values, "ucompanyId");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("ucompany_id between", value1, value2, "ucompanyId");
            return (Criteria) this;
        }

        public Criteria andUcompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ucompany_id not between", value1, value2, "ucompanyId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUroleIdIsNull() {
            addCriterion("urole_id is null");
            return (Criteria) this;
        }

        public Criteria andUroleIdIsNotNull() {
            addCriterion("urole_id is not null");
            return (Criteria) this;
        }

        public Criteria andUroleIdEqualTo(Integer value) {
            addCriterion("urole_id =", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdNotEqualTo(Integer value) {
            addCriterion("urole_id <>", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdGreaterThan(Integer value) {
            addCriterion("urole_id >", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("urole_id >=", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdLessThan(Integer value) {
            addCriterion("urole_id <", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdLessThanOrEqualTo(Integer value) {
            addCriterion("urole_id <=", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdIn(List<Integer> values) {
            addCriterion("urole_id in", values, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdNotIn(List<Integer> values) {
            addCriterion("urole_id not in", values, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdBetween(Integer value1, Integer value2) {
            addCriterion("urole_id between", value1, value2, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("urole_id not between", value1, value2, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUrealnameIsNull() {
            addCriterion("urealname is null");
            return (Criteria) this;
        }

        public Criteria andUrealnameIsNotNull() {
            addCriterion("urealname is not null");
            return (Criteria) this;
        }

        public Criteria andUrealnameEqualTo(String value) {
            addCriterion("urealname =", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotEqualTo(String value) {
            addCriterion("urealname <>", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameGreaterThan(String value) {
            addCriterion("urealname >", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("urealname >=", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLessThan(String value) {
            addCriterion("urealname <", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLessThanOrEqualTo(String value) {
            addCriterion("urealname <=", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLike(String value) {
            addCriterion("urealname like", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotLike(String value) {
            addCriterion("urealname not like", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameIn(List<String> values) {
            addCriterion("urealname in", values, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotIn(List<String> values) {
            addCriterion("urealname not in", values, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameBetween(String value1, String value2) {
            addCriterion("urealname between", value1, value2, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotBetween(String value1, String value2) {
            addCriterion("urealname not between", value1, value2, "urealname");
            return (Criteria) this;
        }

        public Criteria andUgenderIsNull() {
            addCriterion("ugender is null");
            return (Criteria) this;
        }

        public Criteria andUgenderIsNotNull() {
            addCriterion("ugender is not null");
            return (Criteria) this;
        }

        public Criteria andUgenderEqualTo(String value) {
            addCriterion("ugender =", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotEqualTo(String value) {
            addCriterion("ugender <>", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderGreaterThan(String value) {
            addCriterion("ugender >", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderGreaterThanOrEqualTo(String value) {
            addCriterion("ugender >=", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderLessThan(String value) {
            addCriterion("ugender <", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderLessThanOrEqualTo(String value) {
            addCriterion("ugender <=", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderLike(String value) {
            addCriterion("ugender like", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotLike(String value) {
            addCriterion("ugender not like", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderIn(List<String> values) {
            addCriterion("ugender in", values, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotIn(List<String> values) {
            addCriterion("ugender not in", values, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderBetween(String value1, String value2) {
            addCriterion("ugender between", value1, value2, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotBetween(String value1, String value2) {
            addCriterion("ugender not between", value1, value2, "ugender");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("uemail is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("uemail is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("uemail =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("uemail <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("uemail >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("uemail >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("uemail <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("uemail <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("uemail like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("uemail not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("uemail in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("uemail not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("uemail between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("uemail not between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUmobileIsNull() {
            addCriterion("umobile is null");
            return (Criteria) this;
        }

        public Criteria andUmobileIsNotNull() {
            addCriterion("umobile is not null");
            return (Criteria) this;
        }

        public Criteria andUmobileEqualTo(String value) {
            addCriterion("umobile =", value, "umobile");
            return (Criteria) this;
        }

        public Criteria andUmobileNotEqualTo(String value) {
            addCriterion("umobile <>", value, "umobile");
            return (Criteria) this;
        }

        public Criteria andUmobileGreaterThan(String value) {
            addCriterion("umobile >", value, "umobile");
            return (Criteria) this;
        }

        public Criteria andUmobileGreaterThanOrEqualTo(String value) {
            addCriterion("umobile >=", value, "umobile");
            return (Criteria) this;
        }

        public Criteria andUmobileLessThan(String value) {
            addCriterion("umobile <", value, "umobile");
            return (Criteria) this;
        }

        public Criteria andUmobileLessThanOrEqualTo(String value) {
            addCriterion("umobile <=", value, "umobile");
            return (Criteria) this;
        }

        public Criteria andUmobileLike(String value) {
            addCriterion("umobile like", value, "umobile");
            return (Criteria) this;
        }

        public Criteria andUmobileNotLike(String value) {
            addCriterion("umobile not like", value, "umobile");
            return (Criteria) this;
        }

        public Criteria andUmobileIn(List<String> values) {
            addCriterion("umobile in", values, "umobile");
            return (Criteria) this;
        }

        public Criteria andUmobileNotIn(List<String> values) {
            addCriterion("umobile not in", values, "umobile");
            return (Criteria) this;
        }

        public Criteria andUmobileBetween(String value1, String value2) {
            addCriterion("umobile between", value1, value2, "umobile");
            return (Criteria) this;
        }

        public Criteria andUmobileNotBetween(String value1, String value2) {
            addCriterion("umobile not between", value1, value2, "umobile");
            return (Criteria) this;
        }

        public Criteria andUjoinIsNull() {
            addCriterion("ujoin is null");
            return (Criteria) this;
        }

        public Criteria andUjoinIsNotNull() {
            addCriterion("ujoin is not null");
            return (Criteria) this;
        }

        public Criteria andUjoinEqualTo(Date value) {
            addCriterion("ujoin =", value, "ujoin");
            return (Criteria) this;
        }

        public Criteria andUjoinNotEqualTo(Date value) {
            addCriterion("ujoin <>", value, "ujoin");
            return (Criteria) this;
        }

        public Criteria andUjoinGreaterThan(Date value) {
            addCriterion("ujoin >", value, "ujoin");
            return (Criteria) this;
        }

        public Criteria andUjoinGreaterThanOrEqualTo(Date value) {
            addCriterion("ujoin >=", value, "ujoin");
            return (Criteria) this;
        }

        public Criteria andUjoinLessThan(Date value) {
            addCriterion("ujoin <", value, "ujoin");
            return (Criteria) this;
        }

        public Criteria andUjoinLessThanOrEqualTo(Date value) {
            addCriterion("ujoin <=", value, "ujoin");
            return (Criteria) this;
        }

        public Criteria andUjoinIn(List<Date> values) {
            addCriterion("ujoin in", values, "ujoin");
            return (Criteria) this;
        }

        public Criteria andUjoinNotIn(List<Date> values) {
            addCriterion("ujoin not in", values, "ujoin");
            return (Criteria) this;
        }

        public Criteria andUjoinBetween(Date value1, Date value2) {
            addCriterion("ujoin between", value1, value2, "ujoin");
            return (Criteria) this;
        }

        public Criteria andUjoinNotBetween(Date value1, Date value2) {
            addCriterion("ujoin not between", value1, value2, "ujoin");
            return (Criteria) this;
        }

        public Criteria andUvisitsIsNull() {
            addCriterion("uvisits is null");
            return (Criteria) this;
        }

        public Criteria andUvisitsIsNotNull() {
            addCriterion("uvisits is not null");
            return (Criteria) this;
        }

        public Criteria andUvisitsEqualTo(Integer value) {
            addCriterion("uvisits =", value, "uvisits");
            return (Criteria) this;
        }

        public Criteria andUvisitsNotEqualTo(Integer value) {
            addCriterion("uvisits <>", value, "uvisits");
            return (Criteria) this;
        }

        public Criteria andUvisitsGreaterThan(Integer value) {
            addCriterion("uvisits >", value, "uvisits");
            return (Criteria) this;
        }

        public Criteria andUvisitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("uvisits >=", value, "uvisits");
            return (Criteria) this;
        }

        public Criteria andUvisitsLessThan(Integer value) {
            addCriterion("uvisits <", value, "uvisits");
            return (Criteria) this;
        }

        public Criteria andUvisitsLessThanOrEqualTo(Integer value) {
            addCriterion("uvisits <=", value, "uvisits");
            return (Criteria) this;
        }

        public Criteria andUvisitsIn(List<Integer> values) {
            addCriterion("uvisits in", values, "uvisits");
            return (Criteria) this;
        }

        public Criteria andUvisitsNotIn(List<Integer> values) {
            addCriterion("uvisits not in", values, "uvisits");
            return (Criteria) this;
        }

        public Criteria andUvisitsBetween(Integer value1, Integer value2) {
            addCriterion("uvisits between", value1, value2, "uvisits");
            return (Criteria) this;
        }

        public Criteria andUvisitsNotBetween(Integer value1, Integer value2) {
            addCriterion("uvisits not between", value1, value2, "uvisits");
            return (Criteria) this;
        }

        public Criteria andUipIsNull() {
            addCriterion("uip is null");
            return (Criteria) this;
        }

        public Criteria andUipIsNotNull() {
            addCriterion("uip is not null");
            return (Criteria) this;
        }

        public Criteria andUipEqualTo(String value) {
            addCriterion("uip =", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipNotEqualTo(String value) {
            addCriterion("uip <>", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipGreaterThan(String value) {
            addCriterion("uip >", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipGreaterThanOrEqualTo(String value) {
            addCriterion("uip >=", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipLessThan(String value) {
            addCriterion("uip <", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipLessThanOrEqualTo(String value) {
            addCriterion("uip <=", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipLike(String value) {
            addCriterion("uip like", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipNotLike(String value) {
            addCriterion("uip not like", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipIn(List<String> values) {
            addCriterion("uip in", values, "uip");
            return (Criteria) this;
        }

        public Criteria andUipNotIn(List<String> values) {
            addCriterion("uip not in", values, "uip");
            return (Criteria) this;
        }

        public Criteria andUipBetween(String value1, String value2) {
            addCriterion("uip between", value1, value2, "uip");
            return (Criteria) this;
        }

        public Criteria andUipNotBetween(String value1, String value2) {
            addCriterion("uip not between", value1, value2, "uip");
            return (Criteria) this;
        }

        public Criteria andUlasttimeIsNull() {
            addCriterion("ulasttime is null");
            return (Criteria) this;
        }

        public Criteria andUlasttimeIsNotNull() {
            addCriterion("ulasttime is not null");
            return (Criteria) this;
        }

        public Criteria andUlasttimeEqualTo(Date value) {
            addCriterion("ulasttime =", value, "ulasttime");
            return (Criteria) this;
        }

        public Criteria andUlasttimeNotEqualTo(Date value) {
            addCriterion("ulasttime <>", value, "ulasttime");
            return (Criteria) this;
        }

        public Criteria andUlasttimeGreaterThan(Date value) {
            addCriterion("ulasttime >", value, "ulasttime");
            return (Criteria) this;
        }

        public Criteria andUlasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ulasttime >=", value, "ulasttime");
            return (Criteria) this;
        }

        public Criteria andUlasttimeLessThan(Date value) {
            addCriterion("ulasttime <", value, "ulasttime");
            return (Criteria) this;
        }

        public Criteria andUlasttimeLessThanOrEqualTo(Date value) {
            addCriterion("ulasttime <=", value, "ulasttime");
            return (Criteria) this;
        }

        public Criteria andUlasttimeIn(List<Date> values) {
            addCriterion("ulasttime in", values, "ulasttime");
            return (Criteria) this;
        }

        public Criteria andUlasttimeNotIn(List<Date> values) {
            addCriterion("ulasttime not in", values, "ulasttime");
            return (Criteria) this;
        }

        public Criteria andUlasttimeBetween(Date value1, Date value2) {
            addCriterion("ulasttime between", value1, value2, "ulasttime");
            return (Criteria) this;
        }

        public Criteria andUlasttimeNotBetween(Date value1, Date value2) {
            addCriterion("ulasttime not between", value1, value2, "ulasttime");
            return (Criteria) this;
        }

        public Criteria andUlockedIsNull() {
            addCriterion("ulocked is null");
            return (Criteria) this;
        }

        public Criteria andUlockedIsNotNull() {
            addCriterion("ulocked is not null");
            return (Criteria) this;
        }

        public Criteria andUlockedEqualTo(String value) {
            addCriterion("ulocked =", value, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUlockedNotEqualTo(String value) {
            addCriterion("ulocked <>", value, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUlockedGreaterThan(String value) {
            addCriterion("ulocked >", value, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUlockedGreaterThanOrEqualTo(String value) {
            addCriterion("ulocked >=", value, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUlockedLessThan(String value) {
            addCriterion("ulocked <", value, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUlockedLessThanOrEqualTo(String value) {
            addCriterion("ulocked <=", value, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUlockedLike(String value) {
            addCriterion("ulocked like", value, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUlockedNotLike(String value) {
            addCriterion("ulocked not like", value, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUlockedIn(List<String> values) {
            addCriterion("ulocked in", values, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUlockedNotIn(List<String> values) {
            addCriterion("ulocked not in", values, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUlockedBetween(String value1, String value2) {
            addCriterion("ulocked between", value1, value2, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUlockedNotBetween(String value1, String value2) {
            addCriterion("ulocked not between", value1, value2, "ulocked");
            return (Criteria) this;
        }

        public Criteria andUdeletedIsNull() {
            addCriterion("udeleted is null");
            return (Criteria) this;
        }

        public Criteria andUdeletedIsNotNull() {
            addCriterion("udeleted is not null");
            return (Criteria) this;
        }

        public Criteria andUdeletedEqualTo(String value) {
            addCriterion("udeleted =", value, "udeleted");
            return (Criteria) this;
        }

        public Criteria andUdeletedNotEqualTo(String value) {
            addCriterion("udeleted <>", value, "udeleted");
            return (Criteria) this;
        }

        public Criteria andUdeletedGreaterThan(String value) {
            addCriterion("udeleted >", value, "udeleted");
            return (Criteria) this;
        }

        public Criteria andUdeletedGreaterThanOrEqualTo(String value) {
            addCriterion("udeleted >=", value, "udeleted");
            return (Criteria) this;
        }

        public Criteria andUdeletedLessThan(String value) {
            addCriterion("udeleted <", value, "udeleted");
            return (Criteria) this;
        }

        public Criteria andUdeletedLessThanOrEqualTo(String value) {
            addCriterion("udeleted <=", value, "udeleted");
            return (Criteria) this;
        }

        public Criteria andUdeletedLike(String value) {
            addCriterion("udeleted like", value, "udeleted");
            return (Criteria) this;
        }

        public Criteria andUdeletedNotLike(String value) {
            addCriterion("udeleted not like", value, "udeleted");
            return (Criteria) this;
        }

        public Criteria andUdeletedIn(List<String> values) {
            addCriterion("udeleted in", values, "udeleted");
            return (Criteria) this;
        }

        public Criteria andUdeletedNotIn(List<String> values) {
            addCriterion("udeleted not in", values, "udeleted");
            return (Criteria) this;
        }

        public Criteria andUdeletedBetween(String value1, String value2) {
            addCriterion("udeleted between", value1, value2, "udeleted");
            return (Criteria) this;
        }

        public Criteria andUdeletedNotBetween(String value1, String value2) {
            addCriterion("udeleted not between", value1, value2, "udeleted");
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