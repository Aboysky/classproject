package cn.edu.sicnu.sc.softwareproduction.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        public Criteria andRootIsNull() {
            addCriterion("root is null");
            return (Criteria) this;
        }

        public Criteria andRootIsNotNull() {
            addCriterion("root is not null");
            return (Criteria) this;
        }

        public Criteria andRootEqualTo(Integer value) {
            addCriterion("root =", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotEqualTo(Integer value) {
            addCriterion("root <>", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootGreaterThan(Integer value) {
            addCriterion("root >", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootGreaterThanOrEqualTo(Integer value) {
            addCriterion("root >=", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootLessThan(Integer value) {
            addCriterion("root <", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootLessThanOrEqualTo(Integer value) {
            addCriterion("root <=", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootIn(List<Integer> values) {
            addCriterion("root in", values, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotIn(List<Integer> values) {
            addCriterion("root not in", values, "root");
            return (Criteria) this;
        }

        public Criteria andRootBetween(Integer value1, Integer value2) {
            addCriterion("root between", value1, value2, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotBetween(Integer value1, Integer value2) {
            addCriterion("root not between", value1, value2, "root");
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

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andLimitedIsNull() {
            addCriterion("limited is null");
            return (Criteria) this;
        }

        public Criteria andLimitedIsNotNull() {
            addCriterion("limited is not null");
            return (Criteria) this;
        }

        public Criteria andLimitedEqualTo(String value) {
            addCriterion("limited =", value, "limited");
            return (Criteria) this;
        }

        public Criteria andLimitedNotEqualTo(String value) {
            addCriterion("limited <>", value, "limited");
            return (Criteria) this;
        }

        public Criteria andLimitedGreaterThan(String value) {
            addCriterion("limited >", value, "limited");
            return (Criteria) this;
        }

        public Criteria andLimitedGreaterThanOrEqualTo(String value) {
            addCriterion("limited >=", value, "limited");
            return (Criteria) this;
        }

        public Criteria andLimitedLessThan(String value) {
            addCriterion("limited <", value, "limited");
            return (Criteria) this;
        }

        public Criteria andLimitedLessThanOrEqualTo(String value) {
            addCriterion("limited <=", value, "limited");
            return (Criteria) this;
        }

        public Criteria andLimitedLike(String value) {
            addCriterion("limited like", value, "limited");
            return (Criteria) this;
        }

        public Criteria andLimitedNotLike(String value) {
            addCriterion("limited not like", value, "limited");
            return (Criteria) this;
        }

        public Criteria andLimitedIn(List<String> values) {
            addCriterion("limited in", values, "limited");
            return (Criteria) this;
        }

        public Criteria andLimitedNotIn(List<String> values) {
            addCriterion("limited not in", values, "limited");
            return (Criteria) this;
        }

        public Criteria andLimitedBetween(String value1, String value2) {
            addCriterion("limited between", value1, value2, "limited");
            return (Criteria) this;
        }

        public Criteria andLimitedNotBetween(String value1, String value2) {
            addCriterion("limited not between", value1, value2, "limited");
            return (Criteria) this;
        }

        public Criteria andJoinIsNull() {
            addCriterion("join is null");
            return (Criteria) this;
        }

        public Criteria andJoinIsNotNull() {
            addCriterion("join is not null");
            return (Criteria) this;
        }

        public Criteria andJoinEqualTo(Date value) {
            addCriterionForJDBCDate("join =", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinNotEqualTo(Date value) {
            addCriterionForJDBCDate("join <>", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinGreaterThan(Date value) {
            addCriterionForJDBCDate("join >", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("join >=", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinLessThan(Date value) {
            addCriterionForJDBCDate("join <", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("join <=", value, "join");
            return (Criteria) this;
        }

        public Criteria andJoinIn(List<Date> values) {
            addCriterionForJDBCDate("join in", values, "join");
            return (Criteria) this;
        }

        public Criteria andJoinNotIn(List<Date> values) {
            addCriterionForJDBCDate("join not in", values, "join");
            return (Criteria) this;
        }

        public Criteria andJoinBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("join between", value1, value2, "join");
            return (Criteria) this;
        }

        public Criteria andJoinNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("join not between", value1, value2, "join");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Short value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Short value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Short value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Short value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Short value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Short> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Short> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Short value1, Short value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Short value1, Short value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andHoursIsNull() {
            addCriterion("hours is null");
            return (Criteria) this;
        }

        public Criteria andHoursIsNotNull() {
            addCriterion("hours is not null");
            return (Criteria) this;
        }

        public Criteria andHoursEqualTo(Float value) {
            addCriterion("hours =", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotEqualTo(Float value) {
            addCriterion("hours <>", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThan(Float value) {
            addCriterion("hours >", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThanOrEqualTo(Float value) {
            addCriterion("hours >=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThan(Float value) {
            addCriterion("hours <", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThanOrEqualTo(Float value) {
            addCriterion("hours <=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursIn(List<Float> values) {
            addCriterion("hours in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotIn(List<Float> values) {
            addCriterion("hours not in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursBetween(Float value1, Float value2) {
            addCriterion("hours between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotBetween(Float value1, Float value2) {
            addCriterion("hours not between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andEstimateIsNull() {
            addCriterion("estimate is null");
            return (Criteria) this;
        }

        public Criteria andEstimateIsNotNull() {
            addCriterion("estimate is not null");
            return (Criteria) this;
        }

        public Criteria andEstimateEqualTo(BigDecimal value) {
            addCriterion("estimate =", value, "estimate");
            return (Criteria) this;
        }

        public Criteria andEstimateNotEqualTo(BigDecimal value) {
            addCriterion("estimate <>", value, "estimate");
            return (Criteria) this;
        }

        public Criteria andEstimateGreaterThan(BigDecimal value) {
            addCriterion("estimate >", value, "estimate");
            return (Criteria) this;
        }

        public Criteria andEstimateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("estimate >=", value, "estimate");
            return (Criteria) this;
        }

        public Criteria andEstimateLessThan(BigDecimal value) {
            addCriterion("estimate <", value, "estimate");
            return (Criteria) this;
        }

        public Criteria andEstimateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("estimate <=", value, "estimate");
            return (Criteria) this;
        }

        public Criteria andEstimateIn(List<BigDecimal> values) {
            addCriterion("estimate in", values, "estimate");
            return (Criteria) this;
        }

        public Criteria andEstimateNotIn(List<BigDecimal> values) {
            addCriterion("estimate not in", values, "estimate");
            return (Criteria) this;
        }

        public Criteria andEstimateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimate between", value1, value2, "estimate");
            return (Criteria) this;
        }

        public Criteria andEstimateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimate not between", value1, value2, "estimate");
            return (Criteria) this;
        }

        public Criteria andConsumedIsNull() {
            addCriterion("consumed is null");
            return (Criteria) this;
        }

        public Criteria andConsumedIsNotNull() {
            addCriterion("consumed is not null");
            return (Criteria) this;
        }

        public Criteria andConsumedEqualTo(BigDecimal value) {
            addCriterion("consumed =", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedNotEqualTo(BigDecimal value) {
            addCriterion("consumed <>", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedGreaterThan(BigDecimal value) {
            addCriterion("consumed >", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consumed >=", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedLessThan(BigDecimal value) {
            addCriterion("consumed <", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consumed <=", value, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedIn(List<BigDecimal> values) {
            addCriterion("consumed in", values, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedNotIn(List<BigDecimal> values) {
            addCriterion("consumed not in", values, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consumed between", value1, value2, "consumed");
            return (Criteria) this;
        }

        public Criteria andConsumedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consumed not between", value1, value2, "consumed");
            return (Criteria) this;
        }

        public Criteria andLeftIsNull() {
            addCriterion("left is null");
            return (Criteria) this;
        }

        public Criteria andLeftIsNotNull() {
            addCriterion("left is not null");
            return (Criteria) this;
        }

        public Criteria andLeftEqualTo(BigDecimal value) {
            addCriterion("left =", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftNotEqualTo(BigDecimal value) {
            addCriterion("left <>", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftGreaterThan(BigDecimal value) {
            addCriterion("left >", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("left >=", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftLessThan(BigDecimal value) {
            addCriterion("left <", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftLessThanOrEqualTo(BigDecimal value) {
            addCriterion("left <=", value, "left");
            return (Criteria) this;
        }

        public Criteria andLeftIn(List<BigDecimal> values) {
            addCriterion("left in", values, "left");
            return (Criteria) this;
        }

        public Criteria andLeftNotIn(List<BigDecimal> values) {
            addCriterion("left not in", values, "left");
            return (Criteria) this;
        }

        public Criteria andLeftBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("left between", value1, value2, "left");
            return (Criteria) this;
        }

        public Criteria andLeftNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("left not between", value1, value2, "left");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Byte value) {
            addCriterion("order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Byte value) {
            addCriterion("order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Byte value) {
            addCriterion("order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Byte value) {
            addCriterion("order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Byte value) {
            addCriterion("order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Byte> values) {
            addCriterion("order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Byte> values) {
            addCriterion("order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Byte value1, Byte value2) {
            addCriterion("order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("order not between", value1, value2, "order");
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