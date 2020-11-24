package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserformExample() {
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

        public Criteria andFzidIsNull() {
            addCriterion("fzid is null");
            return (Criteria) this;
        }

        public Criteria andFzidIsNotNull() {
            addCriterion("fzid is not null");
            return (Criteria) this;
        }

        public Criteria andFzidEqualTo(Long value) {
            addCriterion("fzid =", value, "fzid");
            return (Criteria) this;
        }

        public Criteria andFzidNotEqualTo(Long value) {
            addCriterion("fzid <>", value, "fzid");
            return (Criteria) this;
        }

        public Criteria andFzidGreaterThan(Long value) {
            addCriterion("fzid >", value, "fzid");
            return (Criteria) this;
        }

        public Criteria andFzidGreaterThanOrEqualTo(Long value) {
            addCriterion("fzid >=", value, "fzid");
            return (Criteria) this;
        }

        public Criteria andFzidLessThan(Long value) {
            addCriterion("fzid <", value, "fzid");
            return (Criteria) this;
        }

        public Criteria andFzidLessThanOrEqualTo(Long value) {
            addCriterion("fzid <=", value, "fzid");
            return (Criteria) this;
        }

        public Criteria andFzidIn(List<Long> values) {
            addCriterion("fzid in", values, "fzid");
            return (Criteria) this;
        }

        public Criteria andFzidNotIn(List<Long> values) {
            addCriterion("fzid not in", values, "fzid");
            return (Criteria) this;
        }

        public Criteria andFzidBetween(Long value1, Long value2) {
            addCriterion("fzid between", value1, value2, "fzid");
            return (Criteria) this;
        }

        public Criteria andFzidNotBetween(Long value1, Long value2) {
            addCriterion("fzid not between", value1, value2, "fzid");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Long value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Long value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Long value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Long value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Long value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Long value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Long> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Long> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Long value1, Long value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Long value1, Long value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFuserIdIsNull() {
            addCriterion("fuser_id is null");
            return (Criteria) this;
        }

        public Criteria andFuserIdIsNotNull() {
            addCriterion("fuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andFuserIdEqualTo(Integer value) {
            addCriterion("fuser_id =", value, "fuserId");
            return (Criteria) this;
        }

        public Criteria andFuserIdNotEqualTo(Integer value) {
            addCriterion("fuser_id <>", value, "fuserId");
            return (Criteria) this;
        }

        public Criteria andFuserIdGreaterThan(Integer value) {
            addCriterion("fuser_id >", value, "fuserId");
            return (Criteria) this;
        }

        public Criteria andFuserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuser_id >=", value, "fuserId");
            return (Criteria) this;
        }

        public Criteria andFuserIdLessThan(Integer value) {
            addCriterion("fuser_id <", value, "fuserId");
            return (Criteria) this;
        }

        public Criteria andFuserIdLessThanOrEqualTo(Integer value) {
            addCriterion("fuser_id <=", value, "fuserId");
            return (Criteria) this;
        }

        public Criteria andFuserIdIn(List<Integer> values) {
            addCriterion("fuser_id in", values, "fuserId");
            return (Criteria) this;
        }

        public Criteria andFuserIdNotIn(List<Integer> values) {
            addCriterion("fuser_id not in", values, "fuserId");
            return (Criteria) this;
        }

        public Criteria andFuserIdBetween(Integer value1, Integer value2) {
            addCriterion("fuser_id between", value1, value2, "fuserId");
            return (Criteria) this;
        }

        public Criteria andFuserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fuser_id not between", value1, value2, "fuserId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdIsNull() {
            addCriterion("fassignedTo_id is null");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdIsNotNull() {
            addCriterion("fassignedTo_id is not null");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdEqualTo(String value) {
            addCriterion("fassignedTo_id =", value, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdNotEqualTo(String value) {
            addCriterion("fassignedTo_id <>", value, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdGreaterThan(String value) {
            addCriterion("fassignedTo_id >", value, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdGreaterThanOrEqualTo(String value) {
            addCriterion("fassignedTo_id >=", value, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdLessThan(String value) {
            addCriterion("fassignedTo_id <", value, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdLessThanOrEqualTo(String value) {
            addCriterion("fassignedTo_id <=", value, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdLike(String value) {
            addCriterion("fassignedTo_id like", value, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdNotLike(String value) {
            addCriterion("fassignedTo_id not like", value, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdIn(List<String> values) {
            addCriterion("fassignedTo_id in", values, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdNotIn(List<String> values) {
            addCriterion("fassignedTo_id not in", values, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdBetween(String value1, String value2) {
            addCriterion("fassignedTo_id between", value1, value2, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFassignedtoIdNotBetween(String value1, String value2) {
            addCriterion("fassignedTo_id not between", value1, value2, "fassignedtoId");
            return (Criteria) this;
        }

        public Criteria andFtitleIsNull() {
            addCriterion("ftitle is null");
            return (Criteria) this;
        }

        public Criteria andFtitleIsNotNull() {
            addCriterion("ftitle is not null");
            return (Criteria) this;
        }

        public Criteria andFtitleEqualTo(String value) {
            addCriterion("ftitle =", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotEqualTo(String value) {
            addCriterion("ftitle <>", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThan(String value) {
            addCriterion("ftitle >", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ftitle >=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThan(String value) {
            addCriterion("ftitle <", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThanOrEqualTo(String value) {
            addCriterion("ftitle <=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLike(String value) {
            addCriterion("ftitle like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotLike(String value) {
            addCriterion("ftitle not like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleIn(List<String> values) {
            addCriterion("ftitle in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotIn(List<String> values) {
            addCriterion("ftitle not in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleBetween(String value1, String value2) {
            addCriterion("ftitle between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotBetween(String value1, String value2) {
            addCriterion("ftitle not between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNull() {
            addCriterion("ftype is null");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNotNull() {
            addCriterion("ftype is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeEqualTo(String value) {
            addCriterion("ftype =", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotEqualTo(String value) {
            addCriterion("ftype <>", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThan(String value) {
            addCriterion("ftype >", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ftype >=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThan(String value) {
            addCriterion("ftype <", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThanOrEqualTo(String value) {
            addCriterion("ftype <=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLike(String value) {
            addCriterion("ftype like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotLike(String value) {
            addCriterion("ftype not like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeIn(List<String> values) {
            addCriterion("ftype in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotIn(List<String> values) {
            addCriterion("ftype not in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeBetween(String value1, String value2) {
            addCriterion("ftype between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotBetween(String value1, String value2) {
            addCriterion("ftype not between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFusertypeIsNull() {
            addCriterion("fusertype is null");
            return (Criteria) this;
        }

        public Criteria andFusertypeIsNotNull() {
            addCriterion("fusertype is not null");
            return (Criteria) this;
        }

        public Criteria andFusertypeEqualTo(String value) {
            addCriterion("fusertype =", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeNotEqualTo(String value) {
            addCriterion("fusertype <>", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeGreaterThan(String value) {
            addCriterion("fusertype >", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeGreaterThanOrEqualTo(String value) {
            addCriterion("fusertype >=", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeLessThan(String value) {
            addCriterion("fusertype <", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeLessThanOrEqualTo(String value) {
            addCriterion("fusertype <=", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeLike(String value) {
            addCriterion("fusertype like", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeNotLike(String value) {
            addCriterion("fusertype not like", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeIn(List<String> values) {
            addCriterion("fusertype in", values, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeNotIn(List<String> values) {
            addCriterion("fusertype not in", values, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeBetween(String value1, String value2) {
            addCriterion("fusertype between", value1, value2, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeNotBetween(String value1, String value2) {
            addCriterion("fusertype not between", value1, value2, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdIsNull() {
            addCriterion("fcompany_id is null");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdIsNotNull() {
            addCriterion("fcompany_id is not null");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdEqualTo(Integer value) {
            addCriterion("fcompany_id =", value, "fcompanyId");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdNotEqualTo(Integer value) {
            addCriterion("fcompany_id <>", value, "fcompanyId");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdGreaterThan(Integer value) {
            addCriterion("fcompany_id >", value, "fcompanyId");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fcompany_id >=", value, "fcompanyId");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdLessThan(Integer value) {
            addCriterion("fcompany_id <", value, "fcompanyId");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("fcompany_id <=", value, "fcompanyId");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdIn(List<Integer> values) {
            addCriterion("fcompany_id in", values, "fcompanyId");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdNotIn(List<Integer> values) {
            addCriterion("fcompany_id not in", values, "fcompanyId");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("fcompany_id between", value1, value2, "fcompanyId");
            return (Criteria) this;
        }

        public Criteria andFcompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fcompany_id not between", value1, value2, "fcompanyId");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeIsNull() {
            addCriterion("fcreatetime is null");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeIsNotNull() {
            addCriterion("fcreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeEqualTo(Date value) {
            addCriterion("fcreatetime =", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeNotEqualTo(Date value) {
            addCriterion("fcreatetime <>", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeGreaterThan(Date value) {
            addCriterion("fcreatetime >", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fcreatetime >=", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeLessThan(Date value) {
            addCriterion("fcreatetime <", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("fcreatetime <=", value, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeIn(List<Date> values) {
            addCriterion("fcreatetime in", values, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeNotIn(List<Date> values) {
            addCriterion("fcreatetime not in", values, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeBetween(Date value1, Date value2) {
            addCriterion("fcreatetime between", value1, value2, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("fcreatetime not between", value1, value2, "fcreatetime");
            return (Criteria) this;
        }

        public Criteria andFversionIdIsNull() {
            addCriterion("fversion_id is null");
            return (Criteria) this;
        }

        public Criteria andFversionIdIsNotNull() {
            addCriterion("fversion_id is not null");
            return (Criteria) this;
        }

        public Criteria andFversionIdEqualTo(Integer value) {
            addCriterion("fversion_id =", value, "fversionId");
            return (Criteria) this;
        }

        public Criteria andFversionIdNotEqualTo(Integer value) {
            addCriterion("fversion_id <>", value, "fversionId");
            return (Criteria) this;
        }

        public Criteria andFversionIdGreaterThan(Integer value) {
            addCriterion("fversion_id >", value, "fversionId");
            return (Criteria) this;
        }

        public Criteria andFversionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fversion_id >=", value, "fversionId");
            return (Criteria) this;
        }

        public Criteria andFversionIdLessThan(Integer value) {
            addCriterion("fversion_id <", value, "fversionId");
            return (Criteria) this;
        }

        public Criteria andFversionIdLessThanOrEqualTo(Integer value) {
            addCriterion("fversion_id <=", value, "fversionId");
            return (Criteria) this;
        }

        public Criteria andFversionIdIn(List<Integer> values) {
            addCriterion("fversion_id in", values, "fversionId");
            return (Criteria) this;
        }

        public Criteria andFversionIdNotIn(List<Integer> values) {
            addCriterion("fversion_id not in", values, "fversionId");
            return (Criteria) this;
        }

        public Criteria andFversionIdBetween(Integer value1, Integer value2) {
            addCriterion("fversion_id between", value1, value2, "fversionId");
            return (Criteria) this;
        }

        public Criteria andFversionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fversion_id not between", value1, value2, "fversionId");
            return (Criteria) this;
        }

        public Criteria andFaccessoryIsNull() {
            addCriterion("faccessory is null");
            return (Criteria) this;
        }

        public Criteria andFaccessoryIsNotNull() {
            addCriterion("faccessory is not null");
            return (Criteria) this;
        }

        public Criteria andFaccessoryEqualTo(String value) {
            addCriterion("faccessory =", value, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFaccessoryNotEqualTo(String value) {
            addCriterion("faccessory <>", value, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFaccessoryGreaterThan(String value) {
            addCriterion("faccessory >", value, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFaccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("faccessory >=", value, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFaccessoryLessThan(String value) {
            addCriterion("faccessory <", value, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFaccessoryLessThanOrEqualTo(String value) {
            addCriterion("faccessory <=", value, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFaccessoryLike(String value) {
            addCriterion("faccessory like", value, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFaccessoryNotLike(String value) {
            addCriterion("faccessory not like", value, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFaccessoryIn(List<String> values) {
            addCriterion("faccessory in", values, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFaccessoryNotIn(List<String> values) {
            addCriterion("faccessory not in", values, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFaccessoryBetween(String value1, String value2) {
            addCriterion("faccessory between", value1, value2, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFaccessoryNotBetween(String value1, String value2) {
            addCriterion("faccessory not between", value1, value2, "faccessory");
            return (Criteria) this;
        }

        public Criteria andFpriorityIsNull() {
            addCriterion("fpriority is null");
            return (Criteria) this;
        }

        public Criteria andFpriorityIsNotNull() {
            addCriterion("fpriority is not null");
            return (Criteria) this;
        }

        public Criteria andFpriorityEqualTo(String value) {
            addCriterion("fpriority =", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityNotEqualTo(String value) {
            addCriterion("fpriority <>", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityGreaterThan(String value) {
            addCriterion("fpriority >", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityGreaterThanOrEqualTo(String value) {
            addCriterion("fpriority >=", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityLessThan(String value) {
            addCriterion("fpriority <", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityLessThanOrEqualTo(String value) {
            addCriterion("fpriority <=", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityLike(String value) {
            addCriterion("fpriority like", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityNotLike(String value) {
            addCriterion("fpriority not like", value, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityIn(List<String> values) {
            addCriterion("fpriority in", values, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityNotIn(List<String> values) {
            addCriterion("fpriority not in", values, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityBetween(String value1, String value2) {
            addCriterion("fpriority between", value1, value2, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFpriorityNotBetween(String value1, String value2) {
            addCriterion("fpriority not between", value1, value2, "fpriority");
            return (Criteria) this;
        }

        public Criteria andFcontactnameIsNull() {
            addCriterion("fcontactname is null");
            return (Criteria) this;
        }

        public Criteria andFcontactnameIsNotNull() {
            addCriterion("fcontactname is not null");
            return (Criteria) this;
        }

        public Criteria andFcontactnameEqualTo(String value) {
            addCriterion("fcontactname =", value, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFcontactnameNotEqualTo(String value) {
            addCriterion("fcontactname <>", value, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFcontactnameGreaterThan(String value) {
            addCriterion("fcontactname >", value, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFcontactnameGreaterThanOrEqualTo(String value) {
            addCriterion("fcontactname >=", value, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFcontactnameLessThan(String value) {
            addCriterion("fcontactname <", value, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFcontactnameLessThanOrEqualTo(String value) {
            addCriterion("fcontactname <=", value, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFcontactnameLike(String value) {
            addCriterion("fcontactname like", value, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFcontactnameNotLike(String value) {
            addCriterion("fcontactname not like", value, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFcontactnameIn(List<String> values) {
            addCriterion("fcontactname in", values, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFcontactnameNotIn(List<String> values) {
            addCriterion("fcontactname not in", values, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFcontactnameBetween(String value1, String value2) {
            addCriterion("fcontactname between", value1, value2, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFcontactnameNotBetween(String value1, String value2) {
            addCriterion("fcontactname not between", value1, value2, "fcontactname");
            return (Criteria) this;
        }

        public Criteria andFmobileIsNull() {
            addCriterion("fmobile is null");
            return (Criteria) this;
        }

        public Criteria andFmobileIsNotNull() {
            addCriterion("fmobile is not null");
            return (Criteria) this;
        }

        public Criteria andFmobileEqualTo(String value) {
            addCriterion("fmobile =", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileNotEqualTo(String value) {
            addCriterion("fmobile <>", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileGreaterThan(String value) {
            addCriterion("fmobile >", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileGreaterThanOrEqualTo(String value) {
            addCriterion("fmobile >=", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileLessThan(String value) {
            addCriterion("fmobile <", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileLessThanOrEqualTo(String value) {
            addCriterion("fmobile <=", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileLike(String value) {
            addCriterion("fmobile like", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileNotLike(String value) {
            addCriterion("fmobile not like", value, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileIn(List<String> values) {
            addCriterion("fmobile in", values, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileNotIn(List<String> values) {
            addCriterion("fmobile not in", values, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileBetween(String value1, String value2) {
            addCriterion("fmobile between", value1, value2, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFmobileNotBetween(String value1, String value2) {
            addCriterion("fmobile not between", value1, value2, "fmobile");
            return (Criteria) this;
        }

        public Criteria andFemailIsNull() {
            addCriterion("femail is null");
            return (Criteria) this;
        }

        public Criteria andFemailIsNotNull() {
            addCriterion("femail is not null");
            return (Criteria) this;
        }

        public Criteria andFemailEqualTo(String value) {
            addCriterion("femail =", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotEqualTo(String value) {
            addCriterion("femail <>", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailGreaterThan(String value) {
            addCriterion("femail >", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailGreaterThanOrEqualTo(String value) {
            addCriterion("femail >=", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailLessThan(String value) {
            addCriterion("femail <", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailLessThanOrEqualTo(String value) {
            addCriterion("femail <=", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailLike(String value) {
            addCriterion("femail like", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotLike(String value) {
            addCriterion("femail not like", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailIn(List<String> values) {
            addCriterion("femail in", values, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotIn(List<String> values) {
            addCriterion("femail not in", values, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailBetween(String value1, String value2) {
            addCriterion("femail between", value1, value2, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotBetween(String value1, String value2) {
            addCriterion("femail not between", value1, value2, "femail");
            return (Criteria) this;
        }

        public Criteria andFstatusIsNull() {
            addCriterion("fstatus is null");
            return (Criteria) this;
        }

        public Criteria andFstatusIsNotNull() {
            addCriterion("fstatus is not null");
            return (Criteria) this;
        }

        public Criteria andFstatusEqualTo(String value) {
            addCriterion("fstatus =", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusNotEqualTo(String value) {
            addCriterion("fstatus <>", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusGreaterThan(String value) {
            addCriterion("fstatus >", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusGreaterThanOrEqualTo(String value) {
            addCriterion("fstatus >=", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusLessThan(String value) {
            addCriterion("fstatus <", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusLessThanOrEqualTo(String value) {
            addCriterion("fstatus <=", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusLike(String value) {
            addCriterion("fstatus like", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusNotLike(String value) {
            addCriterion("fstatus not like", value, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusIn(List<String> values) {
            addCriterion("fstatus in", values, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusNotIn(List<String> values) {
            addCriterion("fstatus not in", values, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusBetween(String value1, String value2) {
            addCriterion("fstatus between", value1, value2, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFstatusNotBetween(String value1, String value2) {
            addCriterion("fstatus not between", value1, value2, "fstatus");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateIsNull() {
            addCriterion("ffinishedDate is null");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateIsNotNull() {
            addCriterion("ffinishedDate is not null");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateEqualTo(Date value) {
            addCriterion("ffinishedDate =", value, "ffinisheddate");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateNotEqualTo(Date value) {
            addCriterion("ffinishedDate <>", value, "ffinisheddate");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateGreaterThan(Date value) {
            addCriterion("ffinishedDate >", value, "ffinisheddate");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ffinishedDate >=", value, "ffinisheddate");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateLessThan(Date value) {
            addCriterion("ffinishedDate <", value, "ffinisheddate");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateLessThanOrEqualTo(Date value) {
            addCriterion("ffinishedDate <=", value, "ffinisheddate");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateIn(List<Date> values) {
            addCriterion("ffinishedDate in", values, "ffinisheddate");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateNotIn(List<Date> values) {
            addCriterion("ffinishedDate not in", values, "ffinisheddate");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateBetween(Date value1, Date value2) {
            addCriterion("ffinishedDate between", value1, value2, "ffinisheddate");
            return (Criteria) this;
        }

        public Criteria andFfinisheddateNotBetween(Date value1, Date value2) {
            addCriterion("ffinishedDate not between", value1, value2, "ffinisheddate");
            return (Criteria) this;
        }

        public Criteria andFviewsIsNull() {
            addCriterion("fviews is null");
            return (Criteria) this;
        }

        public Criteria andFviewsIsNotNull() {
            addCriterion("fviews is not null");
            return (Criteria) this;
        }

        public Criteria andFviewsEqualTo(Integer value) {
            addCriterion("fviews =", value, "fviews");
            return (Criteria) this;
        }

        public Criteria andFviewsNotEqualTo(Integer value) {
            addCriterion("fviews <>", value, "fviews");
            return (Criteria) this;
        }

        public Criteria andFviewsGreaterThan(Integer value) {
            addCriterion("fviews >", value, "fviews");
            return (Criteria) this;
        }

        public Criteria andFviewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("fviews >=", value, "fviews");
            return (Criteria) this;
        }

        public Criteria andFviewsLessThan(Integer value) {
            addCriterion("fviews <", value, "fviews");
            return (Criteria) this;
        }

        public Criteria andFviewsLessThanOrEqualTo(Integer value) {
            addCriterion("fviews <=", value, "fviews");
            return (Criteria) this;
        }

        public Criteria andFviewsIn(List<Integer> values) {
            addCriterion("fviews in", values, "fviews");
            return (Criteria) this;
        }

        public Criteria andFviewsNotIn(List<Integer> values) {
            addCriterion("fviews not in", values, "fviews");
            return (Criteria) this;
        }

        public Criteria andFviewsBetween(Integer value1, Integer value2) {
            addCriterion("fviews between", value1, value2, "fviews");
            return (Criteria) this;
        }

        public Criteria andFviewsNotBetween(Integer value1, Integer value2) {
            addCriterion("fviews not between", value1, value2, "fviews");
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