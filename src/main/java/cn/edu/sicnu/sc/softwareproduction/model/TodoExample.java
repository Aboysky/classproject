package cn.edu.sicnu.sc.softwareproduction.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TodoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TodoExample() {
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

        public Criteria andBeginIsNull() {
            addCriterion("begin is null");
            return (Criteria) this;
        }

        public Criteria andBeginIsNotNull() {
            addCriterion("begin is not null");
            return (Criteria) this;
        }

        public Criteria andBeginEqualTo(Short value) {
            addCriterion("begin =", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginNotEqualTo(Short value) {
            addCriterion("begin <>", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginGreaterThan(Short value) {
            addCriterion("begin >", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginGreaterThanOrEqualTo(Short value) {
            addCriterion("begin >=", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginLessThan(Short value) {
            addCriterion("begin <", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginLessThanOrEqualTo(Short value) {
            addCriterion("begin <=", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginIn(List<Short> values) {
            addCriterion("begin in", values, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginNotIn(List<Short> values) {
            addCriterion("begin not in", values, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginBetween(Short value1, Short value2) {
            addCriterion("begin between", value1, value2, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginNotBetween(Short value1, Short value2) {
            addCriterion("begin not between", value1, value2, "begin");
            return (Criteria) this;
        }

        public Criteria andEndIsNull() {
            addCriterion("end is null");
            return (Criteria) this;
        }

        public Criteria andEndIsNotNull() {
            addCriterion("end is not null");
            return (Criteria) this;
        }

        public Criteria andEndEqualTo(Short value) {
            addCriterion("end =", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotEqualTo(Short value) {
            addCriterion("end <>", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThan(Short value) {
            addCriterion("end >", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThanOrEqualTo(Short value) {
            addCriterion("end >=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThan(Short value) {
            addCriterion("end <", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThanOrEqualTo(Short value) {
            addCriterion("end <=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndIn(List<Short> values) {
            addCriterion("end in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotIn(List<Short> values) {
            addCriterion("end not in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndBetween(Short value1, Short value2) {
            addCriterion("end between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotBetween(Short value1, Short value2) {
            addCriterion("end not between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("cycle is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(Byte value) {
            addCriterion("cycle =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(Byte value) {
            addCriterion("cycle <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(Byte value) {
            addCriterion("cycle >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(Byte value) {
            addCriterion("cycle >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(Byte value) {
            addCriterion("cycle <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(Byte value) {
            addCriterion("cycle <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<Byte> values) {
            addCriterion("cycle in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<Byte> values) {
            addCriterion("cycle not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(Byte value1, Byte value2) {
            addCriterion("cycle between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(Byte value1, Byte value2) {
            addCriterion("cycle not between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andIdvalueIsNull() {
            addCriterion("idvalue is null");
            return (Criteria) this;
        }

        public Criteria andIdvalueIsNotNull() {
            addCriterion("idvalue is not null");
            return (Criteria) this;
        }

        public Criteria andIdvalueEqualTo(Integer value) {
            addCriterion("idvalue =", value, "idvalue");
            return (Criteria) this;
        }

        public Criteria andIdvalueNotEqualTo(Integer value) {
            addCriterion("idvalue <>", value, "idvalue");
            return (Criteria) this;
        }

        public Criteria andIdvalueGreaterThan(Integer value) {
            addCriterion("idvalue >", value, "idvalue");
            return (Criteria) this;
        }

        public Criteria andIdvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("idvalue >=", value, "idvalue");
            return (Criteria) this;
        }

        public Criteria andIdvalueLessThan(Integer value) {
            addCriterion("idvalue <", value, "idvalue");
            return (Criteria) this;
        }

        public Criteria andIdvalueLessThanOrEqualTo(Integer value) {
            addCriterion("idvalue <=", value, "idvalue");
            return (Criteria) this;
        }

        public Criteria andIdvalueIn(List<Integer> values) {
            addCriterion("idvalue in", values, "idvalue");
            return (Criteria) this;
        }

        public Criteria andIdvalueNotIn(List<Integer> values) {
            addCriterion("idvalue not in", values, "idvalue");
            return (Criteria) this;
        }

        public Criteria andIdvalueBetween(Integer value1, Integer value2) {
            addCriterion("idvalue between", value1, value2, "idvalue");
            return (Criteria) this;
        }

        public Criteria andIdvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("idvalue not between", value1, value2, "idvalue");
            return (Criteria) this;
        }

        public Criteria andPriIsNull() {
            addCriterion("pri is null");
            return (Criteria) this;
        }

        public Criteria andPriIsNotNull() {
            addCriterion("pri is not null");
            return (Criteria) this;
        }

        public Criteria andPriEqualTo(Byte value) {
            addCriterion("pri =", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotEqualTo(Byte value) {
            addCriterion("pri <>", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriGreaterThan(Byte value) {
            addCriterion("pri >", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriGreaterThanOrEqualTo(Byte value) {
            addCriterion("pri >=", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriLessThan(Byte value) {
            addCriterion("pri <", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriLessThanOrEqualTo(Byte value) {
            addCriterion("pri <=", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriIn(List<Byte> values) {
            addCriterion("pri in", values, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotIn(List<Byte> values) {
            addCriterion("pri not in", values, "pri");
            return (Criteria) this;
        }

        public Criteria andPriBetween(Byte value1, Byte value2) {
            addCriterion("pri between", value1, value2, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotBetween(Byte value1, Byte value2) {
            addCriterion("pri not between", value1, value2, "pri");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPrivateIsNull() {
            addCriterion("private is null");
            return (Criteria) this;
        }

        public Criteria andPrivateIsNotNull() {
            addCriterion("private is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateEqualTo(Boolean value) {
            addCriterion("private =", value, "private");
            return (Criteria) this;
        }

        public Criteria andPrivateNotEqualTo(Boolean value) {
            addCriterion("private <>", value, "private");
            return (Criteria) this;
        }

        public Criteria andPrivateGreaterThan(Boolean value) {
            addCriterion("private >", value, "private");
            return (Criteria) this;
        }

        public Criteria andPrivateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("private >=", value, "private");
            return (Criteria) this;
        }

        public Criteria andPrivateLessThan(Boolean value) {
            addCriterion("private <", value, "private");
            return (Criteria) this;
        }

        public Criteria andPrivateLessThanOrEqualTo(Boolean value) {
            addCriterion("private <=", value, "private");
            return (Criteria) this;
        }

        public Criteria andPrivateIn(List<Boolean> values) {
            addCriterion("private in", values, "private");
            return (Criteria) this;
        }

        public Criteria andPrivateNotIn(List<Boolean> values) {
            addCriterion("private not in", values, "private");
            return (Criteria) this;
        }

        public Criteria andPrivateBetween(Boolean value1, Boolean value2) {
            addCriterion("private between", value1, value2, "private");
            return (Criteria) this;
        }

        public Criteria andPrivateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("private not between", value1, value2, "private");
            return (Criteria) this;
        }

        public Criteria andConfigIsNull() {
            addCriterion("config is null");
            return (Criteria) this;
        }

        public Criteria andConfigIsNotNull() {
            addCriterion("config is not null");
            return (Criteria) this;
        }

        public Criteria andConfigEqualTo(String value) {
            addCriterion("config =", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotEqualTo(String value) {
            addCriterion("config <>", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThan(String value) {
            addCriterion("config >", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThanOrEqualTo(String value) {
            addCriterion("config >=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThan(String value) {
            addCriterion("config <", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThanOrEqualTo(String value) {
            addCriterion("config <=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLike(String value) {
            addCriterion("config like", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotLike(String value) {
            addCriterion("config not like", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigIn(List<String> values) {
            addCriterion("config in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotIn(List<String> values) {
            addCriterion("config not in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigBetween(String value1, String value2) {
            addCriterion("config between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotBetween(String value1, String value2) {
            addCriterion("config not between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andAssignedtoIsNull() {
            addCriterion("assignedTo is null");
            return (Criteria) this;
        }

        public Criteria andAssignedtoIsNotNull() {
            addCriterion("assignedTo is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedtoEqualTo(String value) {
            addCriterion("assignedTo =", value, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedtoNotEqualTo(String value) {
            addCriterion("assignedTo <>", value, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedtoGreaterThan(String value) {
            addCriterion("assignedTo >", value, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedtoGreaterThanOrEqualTo(String value) {
            addCriterion("assignedTo >=", value, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedtoLessThan(String value) {
            addCriterion("assignedTo <", value, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedtoLessThanOrEqualTo(String value) {
            addCriterion("assignedTo <=", value, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedtoLike(String value) {
            addCriterion("assignedTo like", value, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedtoNotLike(String value) {
            addCriterion("assignedTo not like", value, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedtoIn(List<String> values) {
            addCriterion("assignedTo in", values, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedtoNotIn(List<String> values) {
            addCriterion("assignedTo not in", values, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedtoBetween(String value1, String value2) {
            addCriterion("assignedTo between", value1, value2, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedtoNotBetween(String value1, String value2) {
            addCriterion("assignedTo not between", value1, value2, "assignedto");
            return (Criteria) this;
        }

        public Criteria andAssignedbyIsNull() {
            addCriterion("assignedBy is null");
            return (Criteria) this;
        }

        public Criteria andAssignedbyIsNotNull() {
            addCriterion("assignedBy is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedbyEqualTo(String value) {
            addCriterion("assignedBy =", value, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssignedbyNotEqualTo(String value) {
            addCriterion("assignedBy <>", value, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssignedbyGreaterThan(String value) {
            addCriterion("assignedBy >", value, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssignedbyGreaterThanOrEqualTo(String value) {
            addCriterion("assignedBy >=", value, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssignedbyLessThan(String value) {
            addCriterion("assignedBy <", value, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssignedbyLessThanOrEqualTo(String value) {
            addCriterion("assignedBy <=", value, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssignedbyLike(String value) {
            addCriterion("assignedBy like", value, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssignedbyNotLike(String value) {
            addCriterion("assignedBy not like", value, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssignedbyIn(List<String> values) {
            addCriterion("assignedBy in", values, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssignedbyNotIn(List<String> values) {
            addCriterion("assignedBy not in", values, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssignedbyBetween(String value1, String value2) {
            addCriterion("assignedBy between", value1, value2, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssignedbyNotBetween(String value1, String value2) {
            addCriterion("assignedBy not between", value1, value2, "assignedby");
            return (Criteria) this;
        }

        public Criteria andAssigneddateIsNull() {
            addCriterion("assignedDate is null");
            return (Criteria) this;
        }

        public Criteria andAssigneddateIsNotNull() {
            addCriterion("assignedDate is not null");
            return (Criteria) this;
        }

        public Criteria andAssigneddateEqualTo(Date value) {
            addCriterion("assignedDate =", value, "assigneddate");
            return (Criteria) this;
        }

        public Criteria andAssigneddateNotEqualTo(Date value) {
            addCriterion("assignedDate <>", value, "assigneddate");
            return (Criteria) this;
        }

        public Criteria andAssigneddateGreaterThan(Date value) {
            addCriterion("assignedDate >", value, "assigneddate");
            return (Criteria) this;
        }

        public Criteria andAssigneddateGreaterThanOrEqualTo(Date value) {
            addCriterion("assignedDate >=", value, "assigneddate");
            return (Criteria) this;
        }

        public Criteria andAssigneddateLessThan(Date value) {
            addCriterion("assignedDate <", value, "assigneddate");
            return (Criteria) this;
        }

        public Criteria andAssigneddateLessThanOrEqualTo(Date value) {
            addCriterion("assignedDate <=", value, "assigneddate");
            return (Criteria) this;
        }

        public Criteria andAssigneddateIn(List<Date> values) {
            addCriterion("assignedDate in", values, "assigneddate");
            return (Criteria) this;
        }

        public Criteria andAssigneddateNotIn(List<Date> values) {
            addCriterion("assignedDate not in", values, "assigneddate");
            return (Criteria) this;
        }

        public Criteria andAssigneddateBetween(Date value1, Date value2) {
            addCriterion("assignedDate between", value1, value2, "assigneddate");
            return (Criteria) this;
        }

        public Criteria andAssigneddateNotBetween(Date value1, Date value2) {
            addCriterion("assignedDate not between", value1, value2, "assigneddate");
            return (Criteria) this;
        }

        public Criteria andFinishedbyIsNull() {
            addCriterion("finishedBy is null");
            return (Criteria) this;
        }

        public Criteria andFinishedbyIsNotNull() {
            addCriterion("finishedBy is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedbyEqualTo(String value) {
            addCriterion("finishedBy =", value, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinishedbyNotEqualTo(String value) {
            addCriterion("finishedBy <>", value, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinishedbyGreaterThan(String value) {
            addCriterion("finishedBy >", value, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinishedbyGreaterThanOrEqualTo(String value) {
            addCriterion("finishedBy >=", value, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinishedbyLessThan(String value) {
            addCriterion("finishedBy <", value, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinishedbyLessThanOrEqualTo(String value) {
            addCriterion("finishedBy <=", value, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinishedbyLike(String value) {
            addCriterion("finishedBy like", value, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinishedbyNotLike(String value) {
            addCriterion("finishedBy not like", value, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinishedbyIn(List<String> values) {
            addCriterion("finishedBy in", values, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinishedbyNotIn(List<String> values) {
            addCriterion("finishedBy not in", values, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinishedbyBetween(String value1, String value2) {
            addCriterion("finishedBy between", value1, value2, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinishedbyNotBetween(String value1, String value2) {
            addCriterion("finishedBy not between", value1, value2, "finishedby");
            return (Criteria) this;
        }

        public Criteria andFinisheddateIsNull() {
            addCriterion("finishedDate is null");
            return (Criteria) this;
        }

        public Criteria andFinisheddateIsNotNull() {
            addCriterion("finishedDate is not null");
            return (Criteria) this;
        }

        public Criteria andFinisheddateEqualTo(Date value) {
            addCriterion("finishedDate =", value, "finisheddate");
            return (Criteria) this;
        }

        public Criteria andFinisheddateNotEqualTo(Date value) {
            addCriterion("finishedDate <>", value, "finisheddate");
            return (Criteria) this;
        }

        public Criteria andFinisheddateGreaterThan(Date value) {
            addCriterion("finishedDate >", value, "finisheddate");
            return (Criteria) this;
        }

        public Criteria andFinisheddateGreaterThanOrEqualTo(Date value) {
            addCriterion("finishedDate >=", value, "finisheddate");
            return (Criteria) this;
        }

        public Criteria andFinisheddateLessThan(Date value) {
            addCriterion("finishedDate <", value, "finisheddate");
            return (Criteria) this;
        }

        public Criteria andFinisheddateLessThanOrEqualTo(Date value) {
            addCriterion("finishedDate <=", value, "finisheddate");
            return (Criteria) this;
        }

        public Criteria andFinisheddateIn(List<Date> values) {
            addCriterion("finishedDate in", values, "finisheddate");
            return (Criteria) this;
        }

        public Criteria andFinisheddateNotIn(List<Date> values) {
            addCriterion("finishedDate not in", values, "finisheddate");
            return (Criteria) this;
        }

        public Criteria andFinisheddateBetween(Date value1, Date value2) {
            addCriterion("finishedDate between", value1, value2, "finisheddate");
            return (Criteria) this;
        }

        public Criteria andFinisheddateNotBetween(Date value1, Date value2) {
            addCriterion("finishedDate not between", value1, value2, "finisheddate");
            return (Criteria) this;
        }

        public Criteria andClosedbyIsNull() {
            addCriterion("closedBy is null");
            return (Criteria) this;
        }

        public Criteria andClosedbyIsNotNull() {
            addCriterion("closedBy is not null");
            return (Criteria) this;
        }

        public Criteria andClosedbyEqualTo(String value) {
            addCriterion("closedBy =", value, "closedby");
            return (Criteria) this;
        }

        public Criteria andClosedbyNotEqualTo(String value) {
            addCriterion("closedBy <>", value, "closedby");
            return (Criteria) this;
        }

        public Criteria andClosedbyGreaterThan(String value) {
            addCriterion("closedBy >", value, "closedby");
            return (Criteria) this;
        }

        public Criteria andClosedbyGreaterThanOrEqualTo(String value) {
            addCriterion("closedBy >=", value, "closedby");
            return (Criteria) this;
        }

        public Criteria andClosedbyLessThan(String value) {
            addCriterion("closedBy <", value, "closedby");
            return (Criteria) this;
        }

        public Criteria andClosedbyLessThanOrEqualTo(String value) {
            addCriterion("closedBy <=", value, "closedby");
            return (Criteria) this;
        }

        public Criteria andClosedbyLike(String value) {
            addCriterion("closedBy like", value, "closedby");
            return (Criteria) this;
        }

        public Criteria andClosedbyNotLike(String value) {
            addCriterion("closedBy not like", value, "closedby");
            return (Criteria) this;
        }

        public Criteria andClosedbyIn(List<String> values) {
            addCriterion("closedBy in", values, "closedby");
            return (Criteria) this;
        }

        public Criteria andClosedbyNotIn(List<String> values) {
            addCriterion("closedBy not in", values, "closedby");
            return (Criteria) this;
        }

        public Criteria andClosedbyBetween(String value1, String value2) {
            addCriterion("closedBy between", value1, value2, "closedby");
            return (Criteria) this;
        }

        public Criteria andClosedbyNotBetween(String value1, String value2) {
            addCriterion("closedBy not between", value1, value2, "closedby");
            return (Criteria) this;
        }

        public Criteria andCloseddateIsNull() {
            addCriterion("closedDate is null");
            return (Criteria) this;
        }

        public Criteria andCloseddateIsNotNull() {
            addCriterion("closedDate is not null");
            return (Criteria) this;
        }

        public Criteria andCloseddateEqualTo(Date value) {
            addCriterion("closedDate =", value, "closeddate");
            return (Criteria) this;
        }

        public Criteria andCloseddateNotEqualTo(Date value) {
            addCriterion("closedDate <>", value, "closeddate");
            return (Criteria) this;
        }

        public Criteria andCloseddateGreaterThan(Date value) {
            addCriterion("closedDate >", value, "closeddate");
            return (Criteria) this;
        }

        public Criteria andCloseddateGreaterThanOrEqualTo(Date value) {
            addCriterion("closedDate >=", value, "closeddate");
            return (Criteria) this;
        }

        public Criteria andCloseddateLessThan(Date value) {
            addCriterion("closedDate <", value, "closeddate");
            return (Criteria) this;
        }

        public Criteria andCloseddateLessThanOrEqualTo(Date value) {
            addCriterion("closedDate <=", value, "closeddate");
            return (Criteria) this;
        }

        public Criteria andCloseddateIn(List<Date> values) {
            addCriterion("closedDate in", values, "closeddate");
            return (Criteria) this;
        }

        public Criteria andCloseddateNotIn(List<Date> values) {
            addCriterion("closedDate not in", values, "closeddate");
            return (Criteria) this;
        }

        public Criteria andCloseddateBetween(Date value1, Date value2) {
            addCriterion("closedDate between", value1, value2, "closeddate");
            return (Criteria) this;
        }

        public Criteria andCloseddateNotBetween(Date value1, Date value2) {
            addCriterion("closedDate not between", value1, value2, "closeddate");
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