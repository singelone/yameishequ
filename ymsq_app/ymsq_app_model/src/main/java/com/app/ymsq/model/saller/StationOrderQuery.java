package com.app.ymsq.model.saller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StationOrderQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public StationOrderQuery() {
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andStorageNoIsNull() {
            addCriterion("storage_no is null");
            return (Criteria) this;
        }

        public Criteria andStorageNoIsNotNull() {
            addCriterion("storage_no is not null");
            return (Criteria) this;
        }

        public Criteria andStorageNoEqualTo(String value) {
            addCriterion("storage_no =", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotEqualTo(String value) {
            addCriterion("storage_no <>", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoGreaterThan(String value) {
            addCriterion("storage_no >", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoGreaterThanOrEqualTo(String value) {
            addCriterion("storage_no >=", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLessThan(String value) {
            addCriterion("storage_no <", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLessThanOrEqualTo(String value) {
            addCriterion("storage_no <=", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLike(String value) {
            addCriterion("storage_no like", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotLike(String value) {
            addCriterion("storage_no not like", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoIn(List<String> values) {
            addCriterion("storage_no in", values, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotIn(List<String> values) {
            addCriterion("storage_no not in", values, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoBetween(String value1, String value2) {
            addCriterion("storage_no between", value1, value2, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotBetween(String value1, String value2) {
            addCriterion("storage_no not between", value1, value2, "storageNo");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeIsNull() {
            addCriterion("receive_bespeak_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeIsNotNull() {
            addCriterion("receive_bespeak_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeEqualTo(Date value) {
            addCriterion("receive_bespeak_time =", value, "receiveBespeakTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeNotEqualTo(Date value) {
            addCriterion("receive_bespeak_time <>", value, "receiveBespeakTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeGreaterThan(Date value) {
            addCriterion("receive_bespeak_time >", value, "receiveBespeakTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_bespeak_time >=", value, "receiveBespeakTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeLessThan(Date value) {
            addCriterion("receive_bespeak_time <", value, "receiveBespeakTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_bespeak_time <=", value, "receiveBespeakTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeIn(List<Date> values) {
            addCriterion("receive_bespeak_time in", values, "receiveBespeakTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeNotIn(List<Date> values) {
            addCriterion("receive_bespeak_time not in", values, "receiveBespeakTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeBetween(Date value1, Date value2) {
            addCriterion("receive_bespeak_time between", value1, value2, "receiveBespeakTime");
            return (Criteria) this;
        }

        public Criteria andReceiveBespeakTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_bespeak_time not between", value1, value2, "receiveBespeakTime");
            return (Criteria) this;
        }

        public Criteria andReceivePriceIsNull() {
            addCriterion("receive_price is null");
            return (Criteria) this;
        }

        public Criteria andReceivePriceIsNotNull() {
            addCriterion("receive_price is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePriceEqualTo(BigDecimal value) {
            addCriterion("receive_price =", value, "receivePrice");
            return (Criteria) this;
        }

        public Criteria andReceivePriceNotEqualTo(BigDecimal value) {
            addCriterion("receive_price <>", value, "receivePrice");
            return (Criteria) this;
        }

        public Criteria andReceivePriceGreaterThan(BigDecimal value) {
            addCriterion("receive_price >", value, "receivePrice");
            return (Criteria) this;
        }

        public Criteria andReceivePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receive_price >=", value, "receivePrice");
            return (Criteria) this;
        }

        public Criteria andReceivePriceLessThan(BigDecimal value) {
            addCriterion("receive_price <", value, "receivePrice");
            return (Criteria) this;
        }

        public Criteria andReceivePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receive_price <=", value, "receivePrice");
            return (Criteria) this;
        }

        public Criteria andReceivePriceIn(List<BigDecimal> values) {
            addCriterion("receive_price in", values, "receivePrice");
            return (Criteria) this;
        }

        public Criteria andReceivePriceNotIn(List<BigDecimal> values) {
            addCriterion("receive_price not in", values, "receivePrice");
            return (Criteria) this;
        }

        public Criteria andReceivePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receive_price between", value1, value2, "receivePrice");
            return (Criteria) this;
        }

        public Criteria andReceivePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receive_price not between", value1, value2, "receivePrice");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andRangeIsNull() {
            addCriterion("range is null");
            return (Criteria) this;
        }

        public Criteria andRangeIsNotNull() {
            addCriterion("range is not null");
            return (Criteria) this;
        }

        public Criteria andRangeEqualTo(String value) {
            addCriterion("range =", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotEqualTo(String value) {
            addCriterion("range <>", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThan(String value) {
            addCriterion("range >", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThanOrEqualTo(String value) {
            addCriterion("range >=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThan(String value) {
            addCriterion("range <", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThanOrEqualTo(String value) {
            addCriterion("range <=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLike(String value) {
            addCriterion("range like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotLike(String value) {
            addCriterion("range not like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeIn(List<String> values) {
            addCriterion("range in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotIn(List<String> values) {
            addCriterion("range not in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeBetween(String value1, String value2) {
            addCriterion("range between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotBetween(String value1, String value2) {
            addCriterion("range not between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeIsNull() {
            addCriterion("send_bespeak_time is null");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeIsNotNull() {
            addCriterion("send_bespeak_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeEqualTo(Date value) {
            addCriterion("send_bespeak_time =", value, "sendBespeakTime");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeNotEqualTo(Date value) {
            addCriterion("send_bespeak_time <>", value, "sendBespeakTime");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeGreaterThan(Date value) {
            addCriterion("send_bespeak_time >", value, "sendBespeakTime");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_bespeak_time >=", value, "sendBespeakTime");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeLessThan(Date value) {
            addCriterion("send_bespeak_time <", value, "sendBespeakTime");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_bespeak_time <=", value, "sendBespeakTime");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeIn(List<Date> values) {
            addCriterion("send_bespeak_time in", values, "sendBespeakTime");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeNotIn(List<Date> values) {
            addCriterion("send_bespeak_time not in", values, "sendBespeakTime");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeBetween(Date value1, Date value2) {
            addCriterion("send_bespeak_time between", value1, value2, "sendBespeakTime");
            return (Criteria) this;
        }

        public Criteria andSendBespeakTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_bespeak_time not between", value1, value2, "sendBespeakTime");
            return (Criteria) this;
        }

        public Criteria andSendPriceIsNull() {
            addCriterion("send_price is null");
            return (Criteria) this;
        }

        public Criteria andSendPriceIsNotNull() {
            addCriterion("send_price is not null");
            return (Criteria) this;
        }

        public Criteria andSendPriceEqualTo(BigDecimal value) {
            addCriterion("send_price =", value, "sendPrice");
            return (Criteria) this;
        }

        public Criteria andSendPriceNotEqualTo(BigDecimal value) {
            addCriterion("send_price <>", value, "sendPrice");
            return (Criteria) this;
        }

        public Criteria andSendPriceGreaterThan(BigDecimal value) {
            addCriterion("send_price >", value, "sendPrice");
            return (Criteria) this;
        }

        public Criteria andSendPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("send_price >=", value, "sendPrice");
            return (Criteria) this;
        }

        public Criteria andSendPriceLessThan(BigDecimal value) {
            addCriterion("send_price <", value, "sendPrice");
            return (Criteria) this;
        }

        public Criteria andSendPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("send_price <=", value, "sendPrice");
            return (Criteria) this;
        }

        public Criteria andSendPriceIn(List<BigDecimal> values) {
            addCriterion("send_price in", values, "sendPrice");
            return (Criteria) this;
        }

        public Criteria andSendPriceNotIn(List<BigDecimal> values) {
            addCriterion("send_price not in", values, "sendPrice");
            return (Criteria) this;
        }

        public Criteria andSendPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_price between", value1, value2, "sendPrice");
            return (Criteria) this;
        }

        public Criteria andSendPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("send_price not between", value1, value2, "sendPrice");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNull() {
            addCriterion("emp_no is null");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNotNull() {
            addCriterion("emp_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNoEqualTo(String value) {
            addCriterion("emp_no =", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotEqualTo(String value) {
            addCriterion("emp_no <>", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThan(String value) {
            addCriterion("emp_no >", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThanOrEqualTo(String value) {
            addCriterion("emp_no >=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThan(String value) {
            addCriterion("emp_no <", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThanOrEqualTo(String value) {
            addCriterion("emp_no <=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLike(String value) {
            addCriterion("emp_no like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotLike(String value) {
            addCriterion("emp_no not like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIn(List<String> values) {
            addCriterion("emp_no in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotIn(List<String> values) {
            addCriterion("emp_no not in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoBetween(String value1, String value2) {
            addCriterion("emp_no between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotBetween(String value1, String value2) {
            addCriterion("emp_no not between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoIsNull() {
            addCriterion("sales_user_no is null");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoIsNotNull() {
            addCriterion("sales_user_no is not null");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoEqualTo(String value) {
            addCriterion("sales_user_no =", value, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoNotEqualTo(String value) {
            addCriterion("sales_user_no <>", value, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoGreaterThan(String value) {
            addCriterion("sales_user_no >", value, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("sales_user_no >=", value, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoLessThan(String value) {
            addCriterion("sales_user_no <", value, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoLessThanOrEqualTo(String value) {
            addCriterion("sales_user_no <=", value, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoLike(String value) {
            addCriterion("sales_user_no like", value, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoNotLike(String value) {
            addCriterion("sales_user_no not like", value, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoIn(List<String> values) {
            addCriterion("sales_user_no in", values, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoNotIn(List<String> values) {
            addCriterion("sales_user_no not in", values, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoBetween(String value1, String value2) {
            addCriterion("sales_user_no between", value1, value2, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andSalesUserNoNotBetween(String value1, String value2) {
            addCriterion("sales_user_no not between", value1, value2, "salesUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoIsNull() {
            addCriterion("ceheck_user_no is null");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoIsNotNull() {
            addCriterion("ceheck_user_no is not null");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoEqualTo(String value) {
            addCriterion("ceheck_user_no =", value, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoNotEqualTo(String value) {
            addCriterion("ceheck_user_no <>", value, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoGreaterThan(String value) {
            addCriterion("ceheck_user_no >", value, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("ceheck_user_no >=", value, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoLessThan(String value) {
            addCriterion("ceheck_user_no <", value, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoLessThanOrEqualTo(String value) {
            addCriterion("ceheck_user_no <=", value, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoLike(String value) {
            addCriterion("ceheck_user_no like", value, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoNotLike(String value) {
            addCriterion("ceheck_user_no not like", value, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoIn(List<String> values) {
            addCriterion("ceheck_user_no in", values, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoNotIn(List<String> values) {
            addCriterion("ceheck_user_no not in", values, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoBetween(String value1, String value2) {
            addCriterion("ceheck_user_no between", value1, value2, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andCeheckUserNoNotBetween(String value1, String value2) {
            addCriterion("ceheck_user_no not between", value1, value2, "ceheckUserNo");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeIsNull() {
            addCriterion("order_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeIsNotNull() {
            addCriterion("order_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeEqualTo(Date value) {
            addCriterion("order_submit_time =", value, "orderSubmitTime");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeNotEqualTo(Date value) {
            addCriterion("order_submit_time <>", value, "orderSubmitTime");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeGreaterThan(Date value) {
            addCriterion("order_submit_time >", value, "orderSubmitTime");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_submit_time >=", value, "orderSubmitTime");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeLessThan(Date value) {
            addCriterion("order_submit_time <", value, "orderSubmitTime");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_submit_time <=", value, "orderSubmitTime");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeIn(List<Date> values) {
            addCriterion("order_submit_time in", values, "orderSubmitTime");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeNotIn(List<Date> values) {
            addCriterion("order_submit_time not in", values, "orderSubmitTime");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("order_submit_time between", value1, value2, "orderSubmitTime");
            return (Criteria) this;
        }

        public Criteria andOrderSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_submit_time not between", value1, value2, "orderSubmitTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeIsNull() {
            addCriterion("order_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeIsNotNull() {
            addCriterion("order_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeEqualTo(Date value) {
            addCriterion("order_finish_time =", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeNotEqualTo(Date value) {
            addCriterion("order_finish_time <>", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeGreaterThan(Date value) {
            addCriterion("order_finish_time >", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_finish_time >=", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeLessThan(Date value) {
            addCriterion("order_finish_time <", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_finish_time <=", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeIn(List<Date> values) {
            addCriterion("order_finish_time in", values, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeNotIn(List<Date> values) {
            addCriterion("order_finish_time not in", values, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeBetween(Date value1, Date value2) {
            addCriterion("order_finish_time between", value1, value2, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_finish_time not between", value1, value2, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeIsNull() {
            addCriterion("user_receive_time is null");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeIsNotNull() {
            addCriterion("user_receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeEqualTo(Date value) {
            addCriterion("user_receive_time =", value, "userReceiveTime");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeNotEqualTo(Date value) {
            addCriterion("user_receive_time <>", value, "userReceiveTime");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeGreaterThan(Date value) {
            addCriterion("user_receive_time >", value, "userReceiveTime");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_receive_time >=", value, "userReceiveTime");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeLessThan(Date value) {
            addCriterion("user_receive_time <", value, "userReceiveTime");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_receive_time <=", value, "userReceiveTime");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeIn(List<Date> values) {
            addCriterion("user_receive_time in", values, "userReceiveTime");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeNotIn(List<Date> values) {
            addCriterion("user_receive_time not in", values, "userReceiveTime");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("user_receive_time between", value1, value2, "userReceiveTime");
            return (Criteria) this;
        }

        public Criteria andUserReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_receive_time not between", value1, value2, "userReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeIsNull() {
            addCriterion("station_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeIsNotNull() {
            addCriterion("station_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeEqualTo(Date value) {
            addCriterion("station_finish_time =", value, "stationFinishTime");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeNotEqualTo(Date value) {
            addCriterion("station_finish_time <>", value, "stationFinishTime");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeGreaterThan(Date value) {
            addCriterion("station_finish_time >", value, "stationFinishTime");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("station_finish_time >=", value, "stationFinishTime");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeLessThan(Date value) {
            addCriterion("station_finish_time <", value, "stationFinishTime");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("station_finish_time <=", value, "stationFinishTime");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeIn(List<Date> values) {
            addCriterion("station_finish_time in", values, "stationFinishTime");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeNotIn(List<Date> values) {
            addCriterion("station_finish_time not in", values, "stationFinishTime");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeBetween(Date value1, Date value2) {
            addCriterion("station_finish_time between", value1, value2, "stationFinishTime");
            return (Criteria) this;
        }

        public Criteria andStationFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("station_finish_time not between", value1, value2, "stationFinishTime");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeIsNull() {
            addCriterion("station_receive_time is null");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeIsNotNull() {
            addCriterion("station_receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeEqualTo(Date value) {
            addCriterion("station_receive_time =", value, "stationReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeNotEqualTo(Date value) {
            addCriterion("station_receive_time <>", value, "stationReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeGreaterThan(Date value) {
            addCriterion("station_receive_time >", value, "stationReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("station_receive_time >=", value, "stationReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeLessThan(Date value) {
            addCriterion("station_receive_time <", value, "stationReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("station_receive_time <=", value, "stationReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeIn(List<Date> values) {
            addCriterion("station_receive_time in", values, "stationReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeNotIn(List<Date> values) {
            addCriterion("station_receive_time not in", values, "stationReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("station_receive_time between", value1, value2, "stationReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStationReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("station_receive_time not between", value1, value2, "stationReceiveTime");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeIsNull() {
            addCriterion("user_confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeIsNotNull() {
            addCriterion("user_confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeEqualTo(Date value) {
            addCriterion("user_confirm_time =", value, "userConfirmTime");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeNotEqualTo(Date value) {
            addCriterion("user_confirm_time <>", value, "userConfirmTime");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeGreaterThan(Date value) {
            addCriterion("user_confirm_time >", value, "userConfirmTime");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_confirm_time >=", value, "userConfirmTime");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeLessThan(Date value) {
            addCriterion("user_confirm_time <", value, "userConfirmTime");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_confirm_time <=", value, "userConfirmTime");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeIn(List<Date> values) {
            addCriterion("user_confirm_time in", values, "userConfirmTime");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeNotIn(List<Date> values) {
            addCriterion("user_confirm_time not in", values, "userConfirmTime");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("user_confirm_time between", value1, value2, "userConfirmTime");
            return (Criteria) this;
        }

        public Criteria andUserConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_confirm_time not between", value1, value2, "userConfirmTime");
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