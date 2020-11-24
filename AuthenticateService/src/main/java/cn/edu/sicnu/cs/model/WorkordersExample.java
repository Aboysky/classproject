package cn.edu.sicnu.cs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkordersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkordersExample() {
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

        public Criteria andWzidIsNull() {
            addCriterion("wzid is null");
            return (Criteria) this;
        }

        public Criteria andWzidIsNotNull() {
            addCriterion("wzid is not null");
            return (Criteria) this;
        }

        public Criteria andWzidEqualTo(Long value) {
            addCriterion("wzid =", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidNotEqualTo(Long value) {
            addCriterion("wzid <>", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidGreaterThan(Long value) {
            addCriterion("wzid >", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidGreaterThanOrEqualTo(Long value) {
            addCriterion("wzid >=", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidLessThan(Long value) {
            addCriterion("wzid <", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidLessThanOrEqualTo(Long value) {
            addCriterion("wzid <=", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidIn(List<Long> values) {
            addCriterion("wzid in", values, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidNotIn(List<Long> values) {
            addCriterion("wzid not in", values, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidBetween(Long value1, Long value2) {
            addCriterion("wzid between", value1, value2, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidNotBetween(Long value1, Long value2) {
            addCriterion("wzid not between", value1, value2, "wzid");
            return (Criteria) this;
        }

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Long value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Long value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Long value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Long value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Long value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Long value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Long> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Long> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Long value1, Long value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Long value1, Long value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWuserformIdIsNull() {
            addCriterion("wuserform_id is null");
            return (Criteria) this;
        }

        public Criteria andWuserformIdIsNotNull() {
            addCriterion("wuserform_id is not null");
            return (Criteria) this;
        }

        public Criteria andWuserformIdEqualTo(Long value) {
            addCriterion("wuserform_id =", value, "wuserformId");
            return (Criteria) this;
        }

        public Criteria andWuserformIdNotEqualTo(Long value) {
            addCriterion("wuserform_id <>", value, "wuserformId");
            return (Criteria) this;
        }

        public Criteria andWuserformIdGreaterThan(Long value) {
            addCriterion("wuserform_id >", value, "wuserformId");
            return (Criteria) this;
        }

        public Criteria andWuserformIdGreaterThanOrEqualTo(Long value) {
            addCriterion("wuserform_id >=", value, "wuserformId");
            return (Criteria) this;
        }

        public Criteria andWuserformIdLessThan(Long value) {
            addCriterion("wuserform_id <", value, "wuserformId");
            return (Criteria) this;
        }

        public Criteria andWuserformIdLessThanOrEqualTo(Long value) {
            addCriterion("wuserform_id <=", value, "wuserformId");
            return (Criteria) this;
        }

        public Criteria andWuserformIdIn(List<Long> values) {
            addCriterion("wuserform_id in", values, "wuserformId");
            return (Criteria) this;
        }

        public Criteria andWuserformIdNotIn(List<Long> values) {
            addCriterion("wuserform_id not in", values, "wuserformId");
            return (Criteria) this;
        }

        public Criteria andWuserformIdBetween(Long value1, Long value2) {
            addCriterion("wuserform_id between", value1, value2, "wuserformId");
            return (Criteria) this;
        }

        public Criteria andWuserformIdNotBetween(Long value1, Long value2) {
            addCriterion("wuserform_id not between", value1, value2, "wuserformId");
            return (Criteria) this;
        }

        public Criteria andWnameIsNull() {
            addCriterion("wname is null");
            return (Criteria) this;
        }

        public Criteria andWnameIsNotNull() {
            addCriterion("wname is not null");
            return (Criteria) this;
        }

        public Criteria andWnameEqualTo(String value) {
            addCriterion("wname =", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameNotEqualTo(String value) {
            addCriterion("wname <>", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameGreaterThan(String value) {
            addCriterion("wname >", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameGreaterThanOrEqualTo(String value) {
            addCriterion("wname >=", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameLessThan(String value) {
            addCriterion("wname <", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameLessThanOrEqualTo(String value) {
            addCriterion("wname <=", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameLike(String value) {
            addCriterion("wname like", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameNotLike(String value) {
            addCriterion("wname not like", value, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameIn(List<String> values) {
            addCriterion("wname in", values, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameNotIn(List<String> values) {
            addCriterion("wname not in", values, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameBetween(String value1, String value2) {
            addCriterion("wname between", value1, value2, "wname");
            return (Criteria) this;
        }

        public Criteria andWnameNotBetween(String value1, String value2) {
            addCriterion("wname not between", value1, value2, "wname");
            return (Criteria) this;
        }

        public Criteria andWordertoIsNull() {
            addCriterion("worderto is null");
            return (Criteria) this;
        }

        public Criteria andWordertoIsNotNull() {
            addCriterion("worderto is not null");
            return (Criteria) this;
        }

        public Criteria andWordertoEqualTo(String value) {
            addCriterion("worderto =", value, "worderto");
            return (Criteria) this;
        }

        public Criteria andWordertoNotEqualTo(String value) {
            addCriterion("worderto <>", value, "worderto");
            return (Criteria) this;
        }

        public Criteria andWordertoGreaterThan(String value) {
            addCriterion("worderto >", value, "worderto");
            return (Criteria) this;
        }

        public Criteria andWordertoGreaterThanOrEqualTo(String value) {
            addCriterion("worderto >=", value, "worderto");
            return (Criteria) this;
        }

        public Criteria andWordertoLessThan(String value) {
            addCriterion("worderto <", value, "worderto");
            return (Criteria) this;
        }

        public Criteria andWordertoLessThanOrEqualTo(String value) {
            addCriterion("worderto <=", value, "worderto");
            return (Criteria) this;
        }

        public Criteria andWordertoLike(String value) {
            addCriterion("worderto like", value, "worderto");
            return (Criteria) this;
        }

        public Criteria andWordertoNotLike(String value) {
            addCriterion("worderto not like", value, "worderto");
            return (Criteria) this;
        }

        public Criteria andWordertoIn(List<String> values) {
            addCriterion("worderto in", values, "worderto");
            return (Criteria) this;
        }

        public Criteria andWordertoNotIn(List<String> values) {
            addCriterion("worderto not in", values, "worderto");
            return (Criteria) this;
        }

        public Criteria andWordertoBetween(String value1, String value2) {
            addCriterion("worderto between", value1, value2, "worderto");
            return (Criteria) this;
        }

        public Criteria andWordertoNotBetween(String value1, String value2) {
            addCriterion("worderto not between", value1, value2, "worderto");
            return (Criteria) this;
        }

        public Criteria andWtypeIsNull() {
            addCriterion("wtype is null");
            return (Criteria) this;
        }

        public Criteria andWtypeIsNotNull() {
            addCriterion("wtype is not null");
            return (Criteria) this;
        }

        public Criteria andWtypeEqualTo(String value) {
            addCriterion("wtype =", value, "wtype");
            return (Criteria) this;
        }

        public Criteria andWtypeNotEqualTo(String value) {
            addCriterion("wtype <>", value, "wtype");
            return (Criteria) this;
        }

        public Criteria andWtypeGreaterThan(String value) {
            addCriterion("wtype >", value, "wtype");
            return (Criteria) this;
        }

        public Criteria andWtypeGreaterThanOrEqualTo(String value) {
            addCriterion("wtype >=", value, "wtype");
            return (Criteria) this;
        }

        public Criteria andWtypeLessThan(String value) {
            addCriterion("wtype <", value, "wtype");
            return (Criteria) this;
        }

        public Criteria andWtypeLessThanOrEqualTo(String value) {
            addCriterion("wtype <=", value, "wtype");
            return (Criteria) this;
        }

        public Criteria andWtypeLike(String value) {
            addCriterion("wtype like", value, "wtype");
            return (Criteria) this;
        }

        public Criteria andWtypeNotLike(String value) {
            addCriterion("wtype not like", value, "wtype");
            return (Criteria) this;
        }

        public Criteria andWtypeIn(List<String> values) {
            addCriterion("wtype in", values, "wtype");
            return (Criteria) this;
        }

        public Criteria andWtypeNotIn(List<String> values) {
            addCriterion("wtype not in", values, "wtype");
            return (Criteria) this;
        }

        public Criteria andWtypeBetween(String value1, String value2) {
            addCriterion("wtype between", value1, value2, "wtype");
            return (Criteria) this;
        }

        public Criteria andWtypeNotBetween(String value1, String value2) {
            addCriterion("wtype not between", value1, value2, "wtype");
            return (Criteria) this;
        }

        public Criteria andWrepeatIsNull() {
            addCriterion("wrepeat is null");
            return (Criteria) this;
        }

        public Criteria andWrepeatIsNotNull() {
            addCriterion("wrepeat is not null");
            return (Criteria) this;
        }

        public Criteria andWrepeatEqualTo(String value) {
            addCriterion("wrepeat =", value, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWrepeatNotEqualTo(String value) {
            addCriterion("wrepeat <>", value, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWrepeatGreaterThan(String value) {
            addCriterion("wrepeat >", value, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWrepeatGreaterThanOrEqualTo(String value) {
            addCriterion("wrepeat >=", value, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWrepeatLessThan(String value) {
            addCriterion("wrepeat <", value, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWrepeatLessThanOrEqualTo(String value) {
            addCriterion("wrepeat <=", value, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWrepeatLike(String value) {
            addCriterion("wrepeat like", value, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWrepeatNotLike(String value) {
            addCriterion("wrepeat not like", value, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWrepeatIn(List<String> values) {
            addCriterion("wrepeat in", values, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWrepeatNotIn(List<String> values) {
            addCriterion("wrepeat not in", values, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWrepeatBetween(String value1, String value2) {
            addCriterion("wrepeat between", value1, value2, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWrepeatNotBetween(String value1, String value2) {
            addCriterion("wrepeat not between", value1, value2, "wrepeat");
            return (Criteria) this;
        }

        public Criteria andWuserIdIsNull() {
            addCriterion("wuser_id is null");
            return (Criteria) this;
        }

        public Criteria andWuserIdIsNotNull() {
            addCriterion("wuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andWuserIdEqualTo(Integer value) {
            addCriterion("wuser_id =", value, "wuserId");
            return (Criteria) this;
        }

        public Criteria andWuserIdNotEqualTo(Integer value) {
            addCriterion("wuser_id <>", value, "wuserId");
            return (Criteria) this;
        }

        public Criteria andWuserIdGreaterThan(Integer value) {
            addCriterion("wuser_id >", value, "wuserId");
            return (Criteria) this;
        }

        public Criteria andWuserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wuser_id >=", value, "wuserId");
            return (Criteria) this;
        }

        public Criteria andWuserIdLessThan(Integer value) {
            addCriterion("wuser_id <", value, "wuserId");
            return (Criteria) this;
        }

        public Criteria andWuserIdLessThanOrEqualTo(Integer value) {
            addCriterion("wuser_id <=", value, "wuserId");
            return (Criteria) this;
        }

        public Criteria andWuserIdIn(List<Integer> values) {
            addCriterion("wuser_id in", values, "wuserId");
            return (Criteria) this;
        }

        public Criteria andWuserIdNotIn(List<Integer> values) {
            addCriterion("wuser_id not in", values, "wuserId");
            return (Criteria) this;
        }

        public Criteria andWuserIdBetween(Integer value1, Integer value2) {
            addCriterion("wuser_id between", value1, value2, "wuserId");
            return (Criteria) this;
        }

        public Criteria andWuserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wuser_id not between", value1, value2, "wuserId");
            return (Criteria) this;
        }

        public Criteria andWcreattimeIsNull() {
            addCriterion("wcreattime is null");
            return (Criteria) this;
        }

        public Criteria andWcreattimeIsNotNull() {
            addCriterion("wcreattime is not null");
            return (Criteria) this;
        }

        public Criteria andWcreattimeEqualTo(Date value) {
            addCriterion("wcreattime =", value, "wcreattime");
            return (Criteria) this;
        }

        public Criteria andWcreattimeNotEqualTo(Date value) {
            addCriterion("wcreattime <>", value, "wcreattime");
            return (Criteria) this;
        }

        public Criteria andWcreattimeGreaterThan(Date value) {
            addCriterion("wcreattime >", value, "wcreattime");
            return (Criteria) this;
        }

        public Criteria andWcreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("wcreattime >=", value, "wcreattime");
            return (Criteria) this;
        }

        public Criteria andWcreattimeLessThan(Date value) {
            addCriterion("wcreattime <", value, "wcreattime");
            return (Criteria) this;
        }

        public Criteria andWcreattimeLessThanOrEqualTo(Date value) {
            addCriterion("wcreattime <=", value, "wcreattime");
            return (Criteria) this;
        }

        public Criteria andWcreattimeIn(List<Date> values) {
            addCriterion("wcreattime in", values, "wcreattime");
            return (Criteria) this;
        }

        public Criteria andWcreattimeNotIn(List<Date> values) {
            addCriterion("wcreattime not in", values, "wcreattime");
            return (Criteria) this;
        }

        public Criteria andWcreattimeBetween(Date value1, Date value2) {
            addCriterion("wcreattime between", value1, value2, "wcreattime");
            return (Criteria) this;
        }

        public Criteria andWcreattimeNotBetween(Date value1, Date value2) {
            addCriterion("wcreattime not between", value1, value2, "wcreattime");
            return (Criteria) this;
        }

        public Criteria andWaccessoryIsNull() {
            addCriterion("waccessory is null");
            return (Criteria) this;
        }

        public Criteria andWaccessoryIsNotNull() {
            addCriterion("waccessory is not null");
            return (Criteria) this;
        }

        public Criteria andWaccessoryEqualTo(String value) {
            addCriterion("waccessory =", value, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWaccessoryNotEqualTo(String value) {
            addCriterion("waccessory <>", value, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWaccessoryGreaterThan(String value) {
            addCriterion("waccessory >", value, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWaccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("waccessory >=", value, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWaccessoryLessThan(String value) {
            addCriterion("waccessory <", value, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWaccessoryLessThanOrEqualTo(String value) {
            addCriterion("waccessory <=", value, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWaccessoryLike(String value) {
            addCriterion("waccessory like", value, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWaccessoryNotLike(String value) {
            addCriterion("waccessory not like", value, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWaccessoryIn(List<String> values) {
            addCriterion("waccessory in", values, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWaccessoryNotIn(List<String> values) {
            addCriterion("waccessory not in", values, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWaccessoryBetween(String value1, String value2) {
            addCriterion("waccessory between", value1, value2, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWaccessoryNotBetween(String value1, String value2) {
            addCriterion("waccessory not between", value1, value2, "waccessory");
            return (Criteria) this;
        }

        public Criteria andWosIsNull() {
            addCriterion("wos is null");
            return (Criteria) this;
        }

        public Criteria andWosIsNotNull() {
            addCriterion("wos is not null");
            return (Criteria) this;
        }

        public Criteria andWosEqualTo(String value) {
            addCriterion("wos =", value, "wos");
            return (Criteria) this;
        }

        public Criteria andWosNotEqualTo(String value) {
            addCriterion("wos <>", value, "wos");
            return (Criteria) this;
        }

        public Criteria andWosGreaterThan(String value) {
            addCriterion("wos >", value, "wos");
            return (Criteria) this;
        }

        public Criteria andWosGreaterThanOrEqualTo(String value) {
            addCriterion("wos >=", value, "wos");
            return (Criteria) this;
        }

        public Criteria andWosLessThan(String value) {
            addCriterion("wos <", value, "wos");
            return (Criteria) this;
        }

        public Criteria andWosLessThanOrEqualTo(String value) {
            addCriterion("wos <=", value, "wos");
            return (Criteria) this;
        }

        public Criteria andWosLike(String value) {
            addCriterion("wos like", value, "wos");
            return (Criteria) this;
        }

        public Criteria andWosNotLike(String value) {
            addCriterion("wos not like", value, "wos");
            return (Criteria) this;
        }

        public Criteria andWosIn(List<String> values) {
            addCriterion("wos in", values, "wos");
            return (Criteria) this;
        }

        public Criteria andWosNotIn(List<String> values) {
            addCriterion("wos not in", values, "wos");
            return (Criteria) this;
        }

        public Criteria andWosBetween(String value1, String value2) {
            addCriterion("wos between", value1, value2, "wos");
            return (Criteria) this;
        }

        public Criteria andWosNotBetween(String value1, String value2) {
            addCriterion("wos not between", value1, value2, "wos");
            return (Criteria) this;
        }

        public Criteria andWdbIsNull() {
            addCriterion("wdb is null");
            return (Criteria) this;
        }

        public Criteria andWdbIsNotNull() {
            addCriterion("wdb is not null");
            return (Criteria) this;
        }

        public Criteria andWdbEqualTo(String value) {
            addCriterion("wdb =", value, "wdb");
            return (Criteria) this;
        }

        public Criteria andWdbNotEqualTo(String value) {
            addCriterion("wdb <>", value, "wdb");
            return (Criteria) this;
        }

        public Criteria andWdbGreaterThan(String value) {
            addCriterion("wdb >", value, "wdb");
            return (Criteria) this;
        }

        public Criteria andWdbGreaterThanOrEqualTo(String value) {
            addCriterion("wdb >=", value, "wdb");
            return (Criteria) this;
        }

        public Criteria andWdbLessThan(String value) {
            addCriterion("wdb <", value, "wdb");
            return (Criteria) this;
        }

        public Criteria andWdbLessThanOrEqualTo(String value) {
            addCriterion("wdb <=", value, "wdb");
            return (Criteria) this;
        }

        public Criteria andWdbLike(String value) {
            addCriterion("wdb like", value, "wdb");
            return (Criteria) this;
        }

        public Criteria andWdbNotLike(String value) {
            addCriterion("wdb not like", value, "wdb");
            return (Criteria) this;
        }

        public Criteria andWdbIn(List<String> values) {
            addCriterion("wdb in", values, "wdb");
            return (Criteria) this;
        }

        public Criteria andWdbNotIn(List<String> values) {
            addCriterion("wdb not in", values, "wdb");
            return (Criteria) this;
        }

        public Criteria andWdbBetween(String value1, String value2) {
            addCriterion("wdb between", value1, value2, "wdb");
            return (Criteria) this;
        }

        public Criteria andWdbNotBetween(String value1, String value2) {
            addCriterion("wdb not between", value1, value2, "wdb");
            return (Criteria) this;
        }

        public Criteria andWjdkIsNull() {
            addCriterion("wjdk is null");
            return (Criteria) this;
        }

        public Criteria andWjdkIsNotNull() {
            addCriterion("wjdk is not null");
            return (Criteria) this;
        }

        public Criteria andWjdkEqualTo(String value) {
            addCriterion("wjdk =", value, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWjdkNotEqualTo(String value) {
            addCriterion("wjdk <>", value, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWjdkGreaterThan(String value) {
            addCriterion("wjdk >", value, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWjdkGreaterThanOrEqualTo(String value) {
            addCriterion("wjdk >=", value, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWjdkLessThan(String value) {
            addCriterion("wjdk <", value, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWjdkLessThanOrEqualTo(String value) {
            addCriterion("wjdk <=", value, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWjdkLike(String value) {
            addCriterion("wjdk like", value, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWjdkNotLike(String value) {
            addCriterion("wjdk not like", value, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWjdkIn(List<String> values) {
            addCriterion("wjdk in", values, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWjdkNotIn(List<String> values) {
            addCriterion("wjdk not in", values, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWjdkBetween(String value1, String value2) {
            addCriterion("wjdk between", value1, value2, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWjdkNotBetween(String value1, String value2) {
            addCriterion("wjdk not between", value1, value2, "wjdk");
            return (Criteria) this;
        }

        public Criteria andWpriorityIsNull() {
            addCriterion("wpriority is null");
            return (Criteria) this;
        }

        public Criteria andWpriorityIsNotNull() {
            addCriterion("wpriority is not null");
            return (Criteria) this;
        }

        public Criteria andWpriorityEqualTo(String value) {
            addCriterion("wpriority =", value, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWpriorityNotEqualTo(String value) {
            addCriterion("wpriority <>", value, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWpriorityGreaterThan(String value) {
            addCriterion("wpriority >", value, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWpriorityGreaterThanOrEqualTo(String value) {
            addCriterion("wpriority >=", value, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWpriorityLessThan(String value) {
            addCriterion("wpriority <", value, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWpriorityLessThanOrEqualTo(String value) {
            addCriterion("wpriority <=", value, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWpriorityLike(String value) {
            addCriterion("wpriority like", value, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWpriorityNotLike(String value) {
            addCriterion("wpriority not like", value, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWpriorityIn(List<String> values) {
            addCriterion("wpriority in", values, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWpriorityNotIn(List<String> values) {
            addCriterion("wpriority not in", values, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWpriorityBetween(String value1, String value2) {
            addCriterion("wpriority between", value1, value2, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWpriorityNotBetween(String value1, String value2) {
            addCriterion("wpriority not between", value1, value2, "wpriority");
            return (Criteria) this;
        }

        public Criteria andWstatusIsNull() {
            addCriterion("wstatus is null");
            return (Criteria) this;
        }

        public Criteria andWstatusIsNotNull() {
            addCriterion("wstatus is not null");
            return (Criteria) this;
        }

        public Criteria andWstatusEqualTo(String value) {
            addCriterion("wstatus =", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusNotEqualTo(String value) {
            addCriterion("wstatus <>", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusGreaterThan(String value) {
            addCriterion("wstatus >", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusGreaterThanOrEqualTo(String value) {
            addCriterion("wstatus >=", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusLessThan(String value) {
            addCriterion("wstatus <", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusLessThanOrEqualTo(String value) {
            addCriterion("wstatus <=", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusLike(String value) {
            addCriterion("wstatus like", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusNotLike(String value) {
            addCriterion("wstatus not like", value, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusIn(List<String> values) {
            addCriterion("wstatus in", values, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusNotIn(List<String> values) {
            addCriterion("wstatus not in", values, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusBetween(String value1, String value2) {
            addCriterion("wstatus between", value1, value2, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWstatusNotBetween(String value1, String value2) {
            addCriterion("wstatus not between", value1, value2, "wstatus");
            return (Criteria) this;
        }

        public Criteria andWmemoIsNull() {
            addCriterion("wmemo is null");
            return (Criteria) this;
        }

        public Criteria andWmemoIsNotNull() {
            addCriterion("wmemo is not null");
            return (Criteria) this;
        }

        public Criteria andWmemoEqualTo(String value) {
            addCriterion("wmemo =", value, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWmemoNotEqualTo(String value) {
            addCriterion("wmemo <>", value, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWmemoGreaterThan(String value) {
            addCriterion("wmemo >", value, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWmemoGreaterThanOrEqualTo(String value) {
            addCriterion("wmemo >=", value, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWmemoLessThan(String value) {
            addCriterion("wmemo <", value, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWmemoLessThanOrEqualTo(String value) {
            addCriterion("wmemo <=", value, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWmemoLike(String value) {
            addCriterion("wmemo like", value, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWmemoNotLike(String value) {
            addCriterion("wmemo not like", value, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWmemoIn(List<String> values) {
            addCriterion("wmemo in", values, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWmemoNotIn(List<String> values) {
            addCriterion("wmemo not in", values, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWmemoBetween(String value1, String value2) {
            addCriterion("wmemo between", value1, value2, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWmemoNotBetween(String value1, String value2) {
            addCriterion("wmemo not between", value1, value2, "wmemo");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdIsNull() {
            addCriterion("wprincipal_id is null");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdIsNotNull() {
            addCriterion("wprincipal_id is not null");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdEqualTo(Integer value) {
            addCriterion("wprincipal_id =", value, "wprincipalId");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdNotEqualTo(Integer value) {
            addCriterion("wprincipal_id <>", value, "wprincipalId");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdGreaterThan(Integer value) {
            addCriterion("wprincipal_id >", value, "wprincipalId");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wprincipal_id >=", value, "wprincipalId");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdLessThan(Integer value) {
            addCriterion("wprincipal_id <", value, "wprincipalId");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdLessThanOrEqualTo(Integer value) {
            addCriterion("wprincipal_id <=", value, "wprincipalId");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdIn(List<Integer> values) {
            addCriterion("wprincipal_id in", values, "wprincipalId");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdNotIn(List<Integer> values) {
            addCriterion("wprincipal_id not in", values, "wprincipalId");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdBetween(Integer value1, Integer value2) {
            addCriterion("wprincipal_id between", value1, value2, "wprincipalId");
            return (Criteria) this;
        }

        public Criteria andWprincipalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wprincipal_id not between", value1, value2, "wprincipalId");
            return (Criteria) this;
        }

        public Criteria andWddlIsNull() {
            addCriterion("wddl is null");
            return (Criteria) this;
        }

        public Criteria andWddlIsNotNull() {
            addCriterion("wddl is not null");
            return (Criteria) this;
        }

        public Criteria andWddlEqualTo(Date value) {
            addCriterion("wddl =", value, "wddl");
            return (Criteria) this;
        }

        public Criteria andWddlNotEqualTo(Date value) {
            addCriterion("wddl <>", value, "wddl");
            return (Criteria) this;
        }

        public Criteria andWddlGreaterThan(Date value) {
            addCriterion("wddl >", value, "wddl");
            return (Criteria) this;
        }

        public Criteria andWddlGreaterThanOrEqualTo(Date value) {
            addCriterion("wddl >=", value, "wddl");
            return (Criteria) this;
        }

        public Criteria andWddlLessThan(Date value) {
            addCriterion("wddl <", value, "wddl");
            return (Criteria) this;
        }

        public Criteria andWddlLessThanOrEqualTo(Date value) {
            addCriterion("wddl <=", value, "wddl");
            return (Criteria) this;
        }

        public Criteria andWddlIn(List<Date> values) {
            addCriterion("wddl in", values, "wddl");
            return (Criteria) this;
        }

        public Criteria andWddlNotIn(List<Date> values) {
            addCriterion("wddl not in", values, "wddl");
            return (Criteria) this;
        }

        public Criteria andWddlBetween(Date value1, Date value2) {
            addCriterion("wddl between", value1, value2, "wddl");
            return (Criteria) this;
        }

        public Criteria andWddlNotBetween(Date value1, Date value2) {
            addCriterion("wddl not between", value1, value2, "wddl");
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