package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andTzidIsNull() {
            addCriterion("tzid is null");
            return (Criteria) this;
        }

        public Criteria andTzidIsNotNull() {
            addCriterion("tzid is not null");
            return (Criteria) this;
        }

        public Criteria andTzidEqualTo(Long value) {
            addCriterion("tzid =", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidNotEqualTo(Long value) {
            addCriterion("tzid <>", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidGreaterThan(Long value) {
            addCriterion("tzid >", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidGreaterThanOrEqualTo(Long value) {
            addCriterion("tzid >=", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidLessThan(Long value) {
            addCriterion("tzid <", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidLessThanOrEqualTo(Long value) {
            addCriterion("tzid <=", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidIn(List<Long> values) {
            addCriterion("tzid in", values, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidNotIn(List<Long> values) {
            addCriterion("tzid not in", values, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidBetween(Long value1, Long value2) {
            addCriterion("tzid between", value1, value2, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidNotBetween(Long value1, Long value2) {
            addCriterion("tzid not between", value1, value2, "tzid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Long value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Long value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Long value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Long value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Long value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Long value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Long> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Long> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Long value1, Long value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Long value1, Long value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTfromidIsNull() {
            addCriterion("tfromid is null");
            return (Criteria) this;
        }

        public Criteria andTfromidIsNotNull() {
            addCriterion("tfromid is not null");
            return (Criteria) this;
        }

        public Criteria andTfromidEqualTo(Long value) {
            addCriterion("tfromid =", value, "tfromid");
            return (Criteria) this;
        }

        public Criteria andTfromidNotEqualTo(Long value) {
            addCriterion("tfromid <>", value, "tfromid");
            return (Criteria) this;
        }

        public Criteria andTfromidGreaterThan(Long value) {
            addCriterion("tfromid >", value, "tfromid");
            return (Criteria) this;
        }

        public Criteria andTfromidGreaterThanOrEqualTo(Long value) {
            addCriterion("tfromid >=", value, "tfromid");
            return (Criteria) this;
        }

        public Criteria andTfromidLessThan(Long value) {
            addCriterion("tfromid <", value, "tfromid");
            return (Criteria) this;
        }

        public Criteria andTfromidLessThanOrEqualTo(Long value) {
            addCriterion("tfromid <=", value, "tfromid");
            return (Criteria) this;
        }

        public Criteria andTfromidIn(List<Long> values) {
            addCriterion("tfromid in", values, "tfromid");
            return (Criteria) this;
        }

        public Criteria andTfromidNotIn(List<Long> values) {
            addCriterion("tfromid not in", values, "tfromid");
            return (Criteria) this;
        }

        public Criteria andTfromidBetween(Long value1, Long value2) {
            addCriterion("tfromid between", value1, value2, "tfromid");
            return (Criteria) this;
        }

        public Criteria andTfromidNotBetween(Long value1, Long value2) {
            addCriterion("tfromid not between", value1, value2, "tfromid");
            return (Criteria) this;
        }

        public Criteria andTmoduleIsNull() {
            addCriterion("tmodule is null");
            return (Criteria) this;
        }

        public Criteria andTmoduleIsNotNull() {
            addCriterion("tmodule is not null");
            return (Criteria) this;
        }

        public Criteria andTmoduleEqualTo(String value) {
            addCriterion("tmodule =", value, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTmoduleNotEqualTo(String value) {
            addCriterion("tmodule <>", value, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTmoduleGreaterThan(String value) {
            addCriterion("tmodule >", value, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTmoduleGreaterThanOrEqualTo(String value) {
            addCriterion("tmodule >=", value, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTmoduleLessThan(String value) {
            addCriterion("tmodule <", value, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTmoduleLessThanOrEqualTo(String value) {
            addCriterion("tmodule <=", value, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTmoduleLike(String value) {
            addCriterion("tmodule like", value, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTmoduleNotLike(String value) {
            addCriterion("tmodule not like", value, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTmoduleIn(List<String> values) {
            addCriterion("tmodule in", values, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTmoduleNotIn(List<String> values) {
            addCriterion("tmodule not in", values, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTmoduleBetween(String value1, String value2) {
            addCriterion("tmodule between", value1, value2, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTmoduleNotBetween(String value1, String value2) {
            addCriterion("tmodule not between", value1, value2, "tmodule");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNull() {
            addCriterion("ttype is null");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNotNull() {
            addCriterion("ttype is not null");
            return (Criteria) this;
        }

        public Criteria andTtypeEqualTo(String value) {
            addCriterion("ttype =", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotEqualTo(String value) {
            addCriterion("ttype <>", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThan(String value) {
            addCriterion("ttype >", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ttype >=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThan(String value) {
            addCriterion("ttype <", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThanOrEqualTo(String value) {
            addCriterion("ttype <=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLike(String value) {
            addCriterion("ttype like", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotLike(String value) {
            addCriterion("ttype not like", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeIn(List<String> values) {
            addCriterion("ttype in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotIn(List<String> values) {
            addCriterion("ttype not in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeBetween(String value1, String value2) {
            addCriterion("ttype between", value1, value2, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotBetween(String value1, String value2) {
            addCriterion("ttype not between", value1, value2, "ttype");
            return (Criteria) this;
        }

        public Criteria andTprirityIsNull() {
            addCriterion("tpririty is null");
            return (Criteria) this;
        }

        public Criteria andTprirityIsNotNull() {
            addCriterion("tpririty is not null");
            return (Criteria) this;
        }

        public Criteria andTprirityEqualTo(String value) {
            addCriterion("tpririty =", value, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTprirityNotEqualTo(String value) {
            addCriterion("tpririty <>", value, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTprirityGreaterThan(String value) {
            addCriterion("tpririty >", value, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTprirityGreaterThanOrEqualTo(String value) {
            addCriterion("tpririty >=", value, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTprirityLessThan(String value) {
            addCriterion("tpririty <", value, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTprirityLessThanOrEqualTo(String value) {
            addCriterion("tpririty <=", value, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTprirityLike(String value) {
            addCriterion("tpririty like", value, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTprirityNotLike(String value) {
            addCriterion("tpririty not like", value, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTprirityIn(List<String> values) {
            addCriterion("tpririty in", values, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTprirityNotIn(List<String> values) {
            addCriterion("tpririty not in", values, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTprirityBetween(String value1, String value2) {
            addCriterion("tpririty between", value1, value2, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTprirityNotBetween(String value1, String value2) {
            addCriterion("tpririty not between", value1, value2, "tpririty");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdIsNull() {
            addCriterion("tuserBy_id is null");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdIsNotNull() {
            addCriterion("tuserBy_id is not null");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdEqualTo(Integer value) {
            addCriterion("tuserBy_id =", value, "tuserbyId");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdNotEqualTo(Integer value) {
            addCriterion("tuserBy_id <>", value, "tuserbyId");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdGreaterThan(Integer value) {
            addCriterion("tuserBy_id >", value, "tuserbyId");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuserBy_id >=", value, "tuserbyId");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdLessThan(Integer value) {
            addCriterion("tuserBy_id <", value, "tuserbyId");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdLessThanOrEqualTo(Integer value) {
            addCriterion("tuserBy_id <=", value, "tuserbyId");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdIn(List<Integer> values) {
            addCriterion("tuserBy_id in", values, "tuserbyId");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdNotIn(List<Integer> values) {
            addCriterion("tuserBy_id not in", values, "tuserbyId");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdBetween(Integer value1, Integer value2) {
            addCriterion("tuserBy_id between", value1, value2, "tuserbyId");
            return (Criteria) this;
        }

        public Criteria andTuserbyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tuserBy_id not between", value1, value2, "tuserbyId");
            return (Criteria) this;
        }

        public Criteria andTcreatedateIsNull() {
            addCriterion("tcreateDate is null");
            return (Criteria) this;
        }

        public Criteria andTcreatedateIsNotNull() {
            addCriterion("tcreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andTcreatedateEqualTo(Date value) {
            addCriterion("tcreateDate =", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateNotEqualTo(Date value) {
            addCriterion("tcreateDate <>", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateGreaterThan(Date value) {
            addCriterion("tcreateDate >", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("tcreateDate >=", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateLessThan(Date value) {
            addCriterion("tcreateDate <", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateLessThanOrEqualTo(Date value) {
            addCriterion("tcreateDate <=", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateIn(List<Date> values) {
            addCriterion("tcreateDate in", values, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateNotIn(List<Date> values) {
            addCriterion("tcreateDate not in", values, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateBetween(Date value1, Date value2) {
            addCriterion("tcreateDate between", value1, value2, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateNotBetween(Date value1, Date value2) {
            addCriterion("tcreateDate not between", value1, value2, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTestimateIsNull() {
            addCriterion("testimate is null");
            return (Criteria) this;
        }

        public Criteria andTestimateIsNotNull() {
            addCriterion("testimate is not null");
            return (Criteria) this;
        }

        public Criteria andTestimateEqualTo(Float value) {
            addCriterion("testimate =", value, "testimate");
            return (Criteria) this;
        }

        public Criteria andTestimateNotEqualTo(Float value) {
            addCriterion("testimate <>", value, "testimate");
            return (Criteria) this;
        }

        public Criteria andTestimateGreaterThan(Float value) {
            addCriterion("testimate >", value, "testimate");
            return (Criteria) this;
        }

        public Criteria andTestimateGreaterThanOrEqualTo(Float value) {
            addCriterion("testimate >=", value, "testimate");
            return (Criteria) this;
        }

        public Criteria andTestimateLessThan(Float value) {
            addCriterion("testimate <", value, "testimate");
            return (Criteria) this;
        }

        public Criteria andTestimateLessThanOrEqualTo(Float value) {
            addCriterion("testimate <=", value, "testimate");
            return (Criteria) this;
        }

        public Criteria andTestimateIn(List<Float> values) {
            addCriterion("testimate in", values, "testimate");
            return (Criteria) this;
        }

        public Criteria andTestimateNotIn(List<Float> values) {
            addCriterion("testimate not in", values, "testimate");
            return (Criteria) this;
        }

        public Criteria andTestimateBetween(Float value1, Float value2) {
            addCriterion("testimate between", value1, value2, "testimate");
            return (Criteria) this;
        }

        public Criteria andTestimateNotBetween(Float value1, Float value2) {
            addCriterion("testimate not between", value1, value2, "testimate");
            return (Criteria) this;
        }

        public Criteria andTconsumedIsNull() {
            addCriterion("tconsumed is null");
            return (Criteria) this;
        }

        public Criteria andTconsumedIsNotNull() {
            addCriterion("tconsumed is not null");
            return (Criteria) this;
        }

        public Criteria andTconsumedEqualTo(Float value) {
            addCriterion("tconsumed =", value, "tconsumed");
            return (Criteria) this;
        }

        public Criteria andTconsumedNotEqualTo(Float value) {
            addCriterion("tconsumed <>", value, "tconsumed");
            return (Criteria) this;
        }

        public Criteria andTconsumedGreaterThan(Float value) {
            addCriterion("tconsumed >", value, "tconsumed");
            return (Criteria) this;
        }

        public Criteria andTconsumedGreaterThanOrEqualTo(Float value) {
            addCriterion("tconsumed >=", value, "tconsumed");
            return (Criteria) this;
        }

        public Criteria andTconsumedLessThan(Float value) {
            addCriterion("tconsumed <", value, "tconsumed");
            return (Criteria) this;
        }

        public Criteria andTconsumedLessThanOrEqualTo(Float value) {
            addCriterion("tconsumed <=", value, "tconsumed");
            return (Criteria) this;
        }

        public Criteria andTconsumedIn(List<Float> values) {
            addCriterion("tconsumed in", values, "tconsumed");
            return (Criteria) this;
        }

        public Criteria andTconsumedNotIn(List<Float> values) {
            addCriterion("tconsumed not in", values, "tconsumed");
            return (Criteria) this;
        }

        public Criteria andTconsumedBetween(Float value1, Float value2) {
            addCriterion("tconsumed between", value1, value2, "tconsumed");
            return (Criteria) this;
        }

        public Criteria andTconsumedNotBetween(Float value1, Float value2) {
            addCriterion("tconsumed not between", value1, value2, "tconsumed");
            return (Criteria) this;
        }

        public Criteria andTleftIsNull() {
            addCriterion("tleft is null");
            return (Criteria) this;
        }

        public Criteria andTleftIsNotNull() {
            addCriterion("tleft is not null");
            return (Criteria) this;
        }

        public Criteria andTleftEqualTo(Float value) {
            addCriterion("tleft =", value, "tleft");
            return (Criteria) this;
        }

        public Criteria andTleftNotEqualTo(Float value) {
            addCriterion("tleft <>", value, "tleft");
            return (Criteria) this;
        }

        public Criteria andTleftGreaterThan(Float value) {
            addCriterion("tleft >", value, "tleft");
            return (Criteria) this;
        }

        public Criteria andTleftGreaterThanOrEqualTo(Float value) {
            addCriterion("tleft >=", value, "tleft");
            return (Criteria) this;
        }

        public Criteria andTleftLessThan(Float value) {
            addCriterion("tleft <", value, "tleft");
            return (Criteria) this;
        }

        public Criteria andTleftLessThanOrEqualTo(Float value) {
            addCriterion("tleft <=", value, "tleft");
            return (Criteria) this;
        }

        public Criteria andTleftIn(List<Float> values) {
            addCriterion("tleft in", values, "tleft");
            return (Criteria) this;
        }

        public Criteria andTleftNotIn(List<Float> values) {
            addCriterion("tleft not in", values, "tleft");
            return (Criteria) this;
        }

        public Criteria andTleftBetween(Float value1, Float value2) {
            addCriterion("tleft between", value1, value2, "tleft");
            return (Criteria) this;
        }

        public Criteria andTleftNotBetween(Float value1, Float value2) {
            addCriterion("tleft not between", value1, value2, "tleft");
            return (Criteria) this;
        }

        public Criteria andTdeadlineIsNull() {
            addCriterion("tdeadline is null");
            return (Criteria) this;
        }

        public Criteria andTdeadlineIsNotNull() {
            addCriterion("tdeadline is not null");
            return (Criteria) this;
        }

        public Criteria andTdeadlineEqualTo(Date value) {
            addCriterion("tdeadline =", value, "tdeadline");
            return (Criteria) this;
        }

        public Criteria andTdeadlineNotEqualTo(Date value) {
            addCriterion("tdeadline <>", value, "tdeadline");
            return (Criteria) this;
        }

        public Criteria andTdeadlineGreaterThan(Date value) {
            addCriterion("tdeadline >", value, "tdeadline");
            return (Criteria) this;
        }

        public Criteria andTdeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("tdeadline >=", value, "tdeadline");
            return (Criteria) this;
        }

        public Criteria andTdeadlineLessThan(Date value) {
            addCriterion("tdeadline <", value, "tdeadline");
            return (Criteria) this;
        }

        public Criteria andTdeadlineLessThanOrEqualTo(Date value) {
            addCriterion("tdeadline <=", value, "tdeadline");
            return (Criteria) this;
        }

        public Criteria andTdeadlineIn(List<Date> values) {
            addCriterion("tdeadline in", values, "tdeadline");
            return (Criteria) this;
        }

        public Criteria andTdeadlineNotIn(List<Date> values) {
            addCriterion("tdeadline not in", values, "tdeadline");
            return (Criteria) this;
        }

        public Criteria andTdeadlineBetween(Date value1, Date value2) {
            addCriterion("tdeadline between", value1, value2, "tdeadline");
            return (Criteria) this;
        }

        public Criteria andTdeadlineNotBetween(Date value1, Date value2) {
            addCriterion("tdeadline not between", value1, value2, "tdeadline");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdIsNull() {
            addCriterion("tassignedTo_id is null");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdIsNotNull() {
            addCriterion("tassignedTo_id is not null");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdEqualTo(Integer value) {
            addCriterion("tassignedTo_id =", value, "tassignedtoId");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdNotEqualTo(Integer value) {
            addCriterion("tassignedTo_id <>", value, "tassignedtoId");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdGreaterThan(Integer value) {
            addCriterion("tassignedTo_id >", value, "tassignedtoId");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tassignedTo_id >=", value, "tassignedtoId");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdLessThan(Integer value) {
            addCriterion("tassignedTo_id <", value, "tassignedtoId");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdLessThanOrEqualTo(Integer value) {
            addCriterion("tassignedTo_id <=", value, "tassignedtoId");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdIn(List<Integer> values) {
            addCriterion("tassignedTo_id in", values, "tassignedtoId");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdNotIn(List<Integer> values) {
            addCriterion("tassignedTo_id not in", values, "tassignedtoId");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdBetween(Integer value1, Integer value2) {
            addCriterion("tassignedTo_id between", value1, value2, "tassignedtoId");
            return (Criteria) this;
        }

        public Criteria andTassignedtoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tassignedTo_id not between", value1, value2, "tassignedtoId");
            return (Criteria) this;
        }

        public Criteria andTeststartedIsNull() {
            addCriterion("testStarted is null");
            return (Criteria) this;
        }

        public Criteria andTeststartedIsNotNull() {
            addCriterion("testStarted is not null");
            return (Criteria) this;
        }

        public Criteria andTeststartedEqualTo(Date value) {
            addCriterion("testStarted =", value, "teststarted");
            return (Criteria) this;
        }

        public Criteria andTeststartedNotEqualTo(Date value) {
            addCriterion("testStarted <>", value, "teststarted");
            return (Criteria) this;
        }

        public Criteria andTeststartedGreaterThan(Date value) {
            addCriterion("testStarted >", value, "teststarted");
            return (Criteria) this;
        }

        public Criteria andTeststartedGreaterThanOrEqualTo(Date value) {
            addCriterion("testStarted >=", value, "teststarted");
            return (Criteria) this;
        }

        public Criteria andTeststartedLessThan(Date value) {
            addCriterion("testStarted <", value, "teststarted");
            return (Criteria) this;
        }

        public Criteria andTeststartedLessThanOrEqualTo(Date value) {
            addCriterion("testStarted <=", value, "teststarted");
            return (Criteria) this;
        }

        public Criteria andTeststartedIn(List<Date> values) {
            addCriterion("testStarted in", values, "teststarted");
            return (Criteria) this;
        }

        public Criteria andTeststartedNotIn(List<Date> values) {
            addCriterion("testStarted not in", values, "teststarted");
            return (Criteria) this;
        }

        public Criteria andTeststartedBetween(Date value1, Date value2) {
            addCriterion("testStarted between", value1, value2, "teststarted");
            return (Criteria) this;
        }

        public Criteria andTeststartedNotBetween(Date value1, Date value2) {
            addCriterion("testStarted not between", value1, value2, "teststarted");
            return (Criteria) this;
        }

        public Criteria andTrealstartedIsNull() {
            addCriterion("trealStarted is null");
            return (Criteria) this;
        }

        public Criteria andTrealstartedIsNotNull() {
            addCriterion("trealStarted is not null");
            return (Criteria) this;
        }

        public Criteria andTrealstartedEqualTo(Date value) {
            addCriterion("trealStarted =", value, "trealstarted");
            return (Criteria) this;
        }

        public Criteria andTrealstartedNotEqualTo(Date value) {
            addCriterion("trealStarted <>", value, "trealstarted");
            return (Criteria) this;
        }

        public Criteria andTrealstartedGreaterThan(Date value) {
            addCriterion("trealStarted >", value, "trealstarted");
            return (Criteria) this;
        }

        public Criteria andTrealstartedGreaterThanOrEqualTo(Date value) {
            addCriterion("trealStarted >=", value, "trealstarted");
            return (Criteria) this;
        }

        public Criteria andTrealstartedLessThan(Date value) {
            addCriterion("trealStarted <", value, "trealstarted");
            return (Criteria) this;
        }

        public Criteria andTrealstartedLessThanOrEqualTo(Date value) {
            addCriterion("trealStarted <=", value, "trealstarted");
            return (Criteria) this;
        }

        public Criteria andTrealstartedIn(List<Date> values) {
            addCriterion("trealStarted in", values, "trealstarted");
            return (Criteria) this;
        }

        public Criteria andTrealstartedNotIn(List<Date> values) {
            addCriterion("trealStarted not in", values, "trealstarted");
            return (Criteria) this;
        }

        public Criteria andTrealstartedBetween(Date value1, Date value2) {
            addCriterion("trealStarted between", value1, value2, "trealstarted");
            return (Criteria) this;
        }

        public Criteria andTrealstartedNotBetween(Date value1, Date value2) {
            addCriterion("trealStarted not between", value1, value2, "trealstarted");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateIsNull() {
            addCriterion("tfinishedDate is null");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateIsNotNull() {
            addCriterion("tfinishedDate is not null");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateEqualTo(Date value) {
            addCriterion("tfinishedDate =", value, "tfinisheddate");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateNotEqualTo(Date value) {
            addCriterion("tfinishedDate <>", value, "tfinisheddate");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateGreaterThan(Date value) {
            addCriterion("tfinishedDate >", value, "tfinisheddate");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateGreaterThanOrEqualTo(Date value) {
            addCriterion("tfinishedDate >=", value, "tfinisheddate");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateLessThan(Date value) {
            addCriterion("tfinishedDate <", value, "tfinisheddate");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateLessThanOrEqualTo(Date value) {
            addCriterion("tfinishedDate <=", value, "tfinisheddate");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateIn(List<Date> values) {
            addCriterion("tfinishedDate in", values, "tfinisheddate");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateNotIn(List<Date> values) {
            addCriterion("tfinishedDate not in", values, "tfinisheddate");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateBetween(Date value1, Date value2) {
            addCriterion("tfinishedDate between", value1, value2, "tfinisheddate");
            return (Criteria) this;
        }

        public Criteria andTfinisheddateNotBetween(Date value1, Date value2) {
            addCriterion("tfinishedDate not between", value1, value2, "tfinisheddate");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdIsNull() {
            addCriterion("tclosedBy_id is null");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdIsNotNull() {
            addCriterion("tclosedBy_id is not null");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdEqualTo(Integer value) {
            addCriterion("tclosedBy_id =", value, "tclosedbyId");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdNotEqualTo(Integer value) {
            addCriterion("tclosedBy_id <>", value, "tclosedbyId");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdGreaterThan(Integer value) {
            addCriterion("tclosedBy_id >", value, "tclosedbyId");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tclosedBy_id >=", value, "tclosedbyId");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdLessThan(Integer value) {
            addCriterion("tclosedBy_id <", value, "tclosedbyId");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdLessThanOrEqualTo(Integer value) {
            addCriterion("tclosedBy_id <=", value, "tclosedbyId");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdIn(List<Integer> values) {
            addCriterion("tclosedBy_id in", values, "tclosedbyId");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdNotIn(List<Integer> values) {
            addCriterion("tclosedBy_id not in", values, "tclosedbyId");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdBetween(Integer value1, Integer value2) {
            addCriterion("tclosedBy_id between", value1, value2, "tclosedbyId");
            return (Criteria) this;
        }

        public Criteria andTclosedbyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tclosedBy_id not between", value1, value2, "tclosedbyId");
            return (Criteria) this;
        }

        public Criteria andTcloseddateIsNull() {
            addCriterion("tclosedDate is null");
            return (Criteria) this;
        }

        public Criteria andTcloseddateIsNotNull() {
            addCriterion("tclosedDate is not null");
            return (Criteria) this;
        }

        public Criteria andTcloseddateEqualTo(Date value) {
            addCriterion("tclosedDate =", value, "tcloseddate");
            return (Criteria) this;
        }

        public Criteria andTcloseddateNotEqualTo(Date value) {
            addCriterion("tclosedDate <>", value, "tcloseddate");
            return (Criteria) this;
        }

        public Criteria andTcloseddateGreaterThan(Date value) {
            addCriterion("tclosedDate >", value, "tcloseddate");
            return (Criteria) this;
        }

        public Criteria andTcloseddateGreaterThanOrEqualTo(Date value) {
            addCriterion("tclosedDate >=", value, "tcloseddate");
            return (Criteria) this;
        }

        public Criteria andTcloseddateLessThan(Date value) {
            addCriterion("tclosedDate <", value, "tcloseddate");
            return (Criteria) this;
        }

        public Criteria andTcloseddateLessThanOrEqualTo(Date value) {
            addCriterion("tclosedDate <=", value, "tcloseddate");
            return (Criteria) this;
        }

        public Criteria andTcloseddateIn(List<Date> values) {
            addCriterion("tclosedDate in", values, "tcloseddate");
            return (Criteria) this;
        }

        public Criteria andTcloseddateNotIn(List<Date> values) {
            addCriterion("tclosedDate not in", values, "tcloseddate");
            return (Criteria) this;
        }

        public Criteria andTcloseddateBetween(Date value1, Date value2) {
            addCriterion("tclosedDate between", value1, value2, "tcloseddate");
            return (Criteria) this;
        }

        public Criteria andTcloseddateNotBetween(Date value1, Date value2) {
            addCriterion("tclosedDate not between", value1, value2, "tcloseddate");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonIsNull() {
            addCriterion("tclosedReason is null");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonIsNotNull() {
            addCriterion("tclosedReason is not null");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonEqualTo(String value) {
            addCriterion("tclosedReason =", value, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonNotEqualTo(String value) {
            addCriterion("tclosedReason <>", value, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonGreaterThan(String value) {
            addCriterion("tclosedReason >", value, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonGreaterThanOrEqualTo(String value) {
            addCriterion("tclosedReason >=", value, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonLessThan(String value) {
            addCriterion("tclosedReason <", value, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonLessThanOrEqualTo(String value) {
            addCriterion("tclosedReason <=", value, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonLike(String value) {
            addCriterion("tclosedReason like", value, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonNotLike(String value) {
            addCriterion("tclosedReason not like", value, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonIn(List<String> values) {
            addCriterion("tclosedReason in", values, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonNotIn(List<String> values) {
            addCriterion("tclosedReason not in", values, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonBetween(String value1, String value2) {
            addCriterion("tclosedReason between", value1, value2, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTclosedreasonNotBetween(String value1, String value2) {
            addCriterion("tclosedReason not between", value1, value2, "tclosedreason");
            return (Criteria) this;
        }

        public Criteria andTstatusIsNull() {
            addCriterion("tstatus is null");
            return (Criteria) this;
        }

        public Criteria andTstatusIsNotNull() {
            addCriterion("tstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTstatusEqualTo(String value) {
            addCriterion("tstatus =", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotEqualTo(String value) {
            addCriterion("tstatus <>", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusGreaterThan(String value) {
            addCriterion("tstatus >", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tstatus >=", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusLessThan(String value) {
            addCriterion("tstatus <", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusLessThanOrEqualTo(String value) {
            addCriterion("tstatus <=", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusLike(String value) {
            addCriterion("tstatus like", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotLike(String value) {
            addCriterion("tstatus not like", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusIn(List<String> values) {
            addCriterion("tstatus in", values, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotIn(List<String> values) {
            addCriterion("tstatus not in", values, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusBetween(String value1, String value2) {
            addCriterion("tstatus between", value1, value2, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotBetween(String value1, String value2) {
            addCriterion("tstatus not between", value1, value2, "tstatus");
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