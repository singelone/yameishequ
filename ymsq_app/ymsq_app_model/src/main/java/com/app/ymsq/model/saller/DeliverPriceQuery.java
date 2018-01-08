package com.app.ymsq.model.saller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliverPriceQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public DeliverPriceQuery() {
        oredCriteria = new ArrayList<Criteria>();
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

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSellerNoIsNull() {
            addCriterion("seller_no is null");
            return (Criteria) this;
        }

        public Criteria andSellerNoIsNotNull() {
            addCriterion("seller_no is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNoEqualTo(String value) {
            addCriterion("seller_no =", value, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andSellerNoNotEqualTo(String value) {
            addCriterion("seller_no <>", value, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andSellerNoGreaterThan(String value) {
            addCriterion("seller_no >", value, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andSellerNoGreaterThanOrEqualTo(String value) {
            addCriterion("seller_no >=", value, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andSellerNoLessThan(String value) {
            addCriterion("seller_no <", value, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andSellerNoLessThanOrEqualTo(String value) {
            addCriterion("seller_no <=", value, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andSellerNoLike(String value) {
            addCriterion("seller_no like", value, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andSellerNoNotLike(String value) {
            addCriterion("seller_no not like", value, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andSellerNoIn(List<String> values) {
            addCriterion("seller_no in", values, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andSellerNoNotIn(List<String> values) {
            addCriterion("seller_no not in", values, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andSellerNoBetween(String value1, String value2) {
            addCriterion("seller_no between", value1, value2, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andSellerNoNotBetween(String value1, String value2) {
            addCriterion("seller_no not between", value1, value2, "sellerNo");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andContainerNoIsNull() {
            addCriterion("container_no is null");
            return (Criteria) this;
        }

        public Criteria andContainerNoIsNotNull() {
            addCriterion("container_no is not null");
            return (Criteria) this;
        }

        public Criteria andContainerNoEqualTo(String value) {
            addCriterion("container_no =", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotEqualTo(String value) {
            addCriterion("container_no <>", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThan(String value) {
            addCriterion("container_no >", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThanOrEqualTo(String value) {
            addCriterion("container_no >=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThan(String value) {
            addCriterion("container_no <", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThanOrEqualTo(String value) {
            addCriterion("container_no <=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLike(String value) {
            addCriterion("container_no like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotLike(String value) {
            addCriterion("container_no not like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoIn(List<String> values) {
            addCriterion("container_no in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotIn(List<String> values) {
            addCriterion("container_no not in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoBetween(String value1, String value2) {
            addCriterion("container_no between", value1, value2, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotBetween(String value1, String value2) {
            addCriterion("container_no not between", value1, value2, "containerNo");
            return (Criteria) this;
        }

        public Criteria andAddressRangeIsNull() {
            addCriterion("address_range is null");
            return (Criteria) this;
        }

        public Criteria andAddressRangeIsNotNull() {
            addCriterion("address_range is not null");
            return (Criteria) this;
        }

        public Criteria andAddressRangeEqualTo(String value) {
            addCriterion("address_range =", value, "addressRange");
            return (Criteria) this;
        }

        public Criteria andAddressRangeNotEqualTo(String value) {
            addCriterion("address_range <>", value, "addressRange");
            return (Criteria) this;
        }

        public Criteria andAddressRangeGreaterThan(String value) {
            addCriterion("address_range >", value, "addressRange");
            return (Criteria) this;
        }

        public Criteria andAddressRangeGreaterThanOrEqualTo(String value) {
            addCriterion("address_range >=", value, "addressRange");
            return (Criteria) this;
        }

        public Criteria andAddressRangeLessThan(String value) {
            addCriterion("address_range <", value, "addressRange");
            return (Criteria) this;
        }

        public Criteria andAddressRangeLessThanOrEqualTo(String value) {
            addCriterion("address_range <=", value, "addressRange");
            return (Criteria) this;
        }

        public Criteria andAddressRangeLike(String value) {
            addCriterion("address_range like", value, "addressRange");
            return (Criteria) this;
        }

        public Criteria andAddressRangeNotLike(String value) {
            addCriterion("address_range not like", value, "addressRange");
            return (Criteria) this;
        }

        public Criteria andAddressRangeIn(List<String> values) {
            addCriterion("address_range in", values, "addressRange");
            return (Criteria) this;
        }

        public Criteria andAddressRangeNotIn(List<String> values) {
            addCriterion("address_range not in", values, "addressRange");
            return (Criteria) this;
        }

        public Criteria andAddressRangeBetween(String value1, String value2) {
            addCriterion("address_range between", value1, value2, "addressRange");
            return (Criteria) this;
        }

        public Criteria andAddressRangeNotBetween(String value1, String value2) {
            addCriterion("address_range not between", value1, value2, "addressRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeIsNull() {
            addCriterion("weight_range is null");
            return (Criteria) this;
        }

        public Criteria andWeightRangeIsNotNull() {
            addCriterion("weight_range is not null");
            return (Criteria) this;
        }

        public Criteria andWeightRangeEqualTo(String value) {
            addCriterion("weight_range =", value, "weightRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeNotEqualTo(String value) {
            addCriterion("weight_range <>", value, "weightRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeGreaterThan(String value) {
            addCriterion("weight_range >", value, "weightRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeGreaterThanOrEqualTo(String value) {
            addCriterion("weight_range >=", value, "weightRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeLessThan(String value) {
            addCriterion("weight_range <", value, "weightRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeLessThanOrEqualTo(String value) {
            addCriterion("weight_range <=", value, "weightRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeLike(String value) {
            addCriterion("weight_range like", value, "weightRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeNotLike(String value) {
            addCriterion("weight_range not like", value, "weightRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeIn(List<String> values) {
            addCriterion("weight_range in", values, "weightRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeNotIn(List<String> values) {
            addCriterion("weight_range not in", values, "weightRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeBetween(String value1, String value2) {
            addCriterion("weight_range between", value1, value2, "weightRange");
            return (Criteria) this;
        }

        public Criteria andWeightRangeNotBetween(String value1, String value2) {
            addCriterion("weight_range not between", value1, value2, "weightRange");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeIsNull() {
            addCriterion("del_time is null");
            return (Criteria) this;
        }

        public Criteria andDelTimeIsNotNull() {
            addCriterion("del_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelTimeEqualTo(Date value) {
            addCriterion("del_time =", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotEqualTo(Date value) {
            addCriterion("del_time <>", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThan(Date value) {
            addCriterion("del_time >", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("del_time >=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThan(Date value) {
            addCriterion("del_time <", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThanOrEqualTo(Date value) {
            addCriterion("del_time <=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeIn(List<Date> values) {
            addCriterion("del_time in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotIn(List<Date> values) {
            addCriterion("del_time not in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeBetween(Date value1, Date value2) {
            addCriterion("del_time between", value1, value2, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotBetween(Date value1, Date value2) {
            addCriterion("del_time not between", value1, value2, "delTime");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdIsNull() {
            addCriterion("add_operator_id is null");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdIsNotNull() {
            addCriterion("add_operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdEqualTo(Long value) {
            addCriterion("add_operator_id =", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdNotEqualTo(Long value) {
            addCriterion("add_operator_id <>", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdGreaterThan(Long value) {
            addCriterion("add_operator_id >", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("add_operator_id >=", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdLessThan(Long value) {
            addCriterion("add_operator_id <", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("add_operator_id <=", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdIn(List<Long> values) {
            addCriterion("add_operator_id in", values, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdNotIn(List<Long> values) {
            addCriterion("add_operator_id not in", values, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdBetween(Long value1, Long value2) {
            addCriterion("add_operator_id between", value1, value2, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("add_operator_id not between", value1, value2, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdIsNull() {
            addCriterion("modi_operator_id is null");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdIsNotNull() {
            addCriterion("modi_operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdEqualTo(Long value) {
            addCriterion("modi_operator_id =", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdNotEqualTo(Long value) {
            addCriterion("modi_operator_id <>", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdGreaterThan(Long value) {
            addCriterion("modi_operator_id >", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("modi_operator_id >=", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdLessThan(Long value) {
            addCriterion("modi_operator_id <", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("modi_operator_id <=", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdIn(List<Long> values) {
            addCriterion("modi_operator_id in", values, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdNotIn(List<Long> values) {
            addCriterion("modi_operator_id not in", values, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdBetween(Long value1, Long value2) {
            addCriterion("modi_operator_id between", value1, value2, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("modi_operator_id not between", value1, value2, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdIsNull() {
            addCriterion("del_operator_id is null");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdIsNotNull() {
            addCriterion("del_operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdEqualTo(Long value) {
            addCriterion("del_operator_id =", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdNotEqualTo(Long value) {
            addCriterion("del_operator_id <>", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdGreaterThan(Long value) {
            addCriterion("del_operator_id >", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("del_operator_id >=", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdLessThan(Long value) {
            addCriterion("del_operator_id <", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("del_operator_id <=", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdIn(List<Long> values) {
            addCriterion("del_operator_id in", values, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdNotIn(List<Long> values) {
            addCriterion("del_operator_id not in", values, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdBetween(Long value1, Long value2) {
            addCriterion("del_operator_id between", value1, value2, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("del_operator_id not between", value1, value2, "delOperatorId");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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