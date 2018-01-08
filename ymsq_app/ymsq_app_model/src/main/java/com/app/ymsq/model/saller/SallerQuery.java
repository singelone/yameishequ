package com.app.ymsq.model.saller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SallerQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public SallerQuery() {
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

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
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

        public Criteria andSellerTypeIsNull() {
            addCriterion("seller_type is null");
            return (Criteria) this;
        }

        public Criteria andSellerTypeIsNotNull() {
            addCriterion("seller_type is not null");
            return (Criteria) this;
        }

        public Criteria andSellerTypeEqualTo(Byte value) {
            addCriterion("seller_type =", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotEqualTo(Byte value) {
            addCriterion("seller_type <>", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeGreaterThan(Byte value) {
            addCriterion("seller_type >", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("seller_type >=", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeLessThan(Byte value) {
            addCriterion("seller_type <", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeLessThanOrEqualTo(Byte value) {
            addCriterion("seller_type <=", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeIn(List<Byte> values) {
            addCriterion("seller_type in", values, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotIn(List<Byte> values) {
            addCriterion("seller_type not in", values, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeBetween(Byte value1, Byte value2) {
            addCriterion("seller_type between", value1, value2, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("seller_type not between", value1, value2, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceIsNull() {
            addCriterion("seller_province is null");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceIsNotNull() {
            addCriterion("seller_province is not null");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceEqualTo(String value) {
            addCriterion("seller_province =", value, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceNotEqualTo(String value) {
            addCriterion("seller_province <>", value, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceGreaterThan(String value) {
            addCriterion("seller_province >", value, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("seller_province >=", value, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceLessThan(String value) {
            addCriterion("seller_province <", value, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceLessThanOrEqualTo(String value) {
            addCriterion("seller_province <=", value, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceLike(String value) {
            addCriterion("seller_province like", value, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceNotLike(String value) {
            addCriterion("seller_province not like", value, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceIn(List<String> values) {
            addCriterion("seller_province in", values, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceNotIn(List<String> values) {
            addCriterion("seller_province not in", values, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceBetween(String value1, String value2) {
            addCriterion("seller_province between", value1, value2, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerProvinceNotBetween(String value1, String value2) {
            addCriterion("seller_province not between", value1, value2, "sellerProvince");
            return (Criteria) this;
        }

        public Criteria andSellerCityIsNull() {
            addCriterion("seller_city is null");
            return (Criteria) this;
        }

        public Criteria andSellerCityIsNotNull() {
            addCriterion("seller_city is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCityEqualTo(String value) {
            addCriterion("seller_city =", value, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerCityNotEqualTo(String value) {
            addCriterion("seller_city <>", value, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerCityGreaterThan(String value) {
            addCriterion("seller_city >", value, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerCityGreaterThanOrEqualTo(String value) {
            addCriterion("seller_city >=", value, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerCityLessThan(String value) {
            addCriterion("seller_city <", value, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerCityLessThanOrEqualTo(String value) {
            addCriterion("seller_city <=", value, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerCityLike(String value) {
            addCriterion("seller_city like", value, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerCityNotLike(String value) {
            addCriterion("seller_city not like", value, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerCityIn(List<String> values) {
            addCriterion("seller_city in", values, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerCityNotIn(List<String> values) {
            addCriterion("seller_city not in", values, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerCityBetween(String value1, String value2) {
            addCriterion("seller_city between", value1, value2, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerCityNotBetween(String value1, String value2) {
            addCriterion("seller_city not between", value1, value2, "sellerCity");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIsNull() {
            addCriterion("seller_area is null");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIsNotNull() {
            addCriterion("seller_area is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAreaEqualTo(String value) {
            addCriterion("seller_area =", value, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerAreaNotEqualTo(String value) {
            addCriterion("seller_area <>", value, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerAreaGreaterThan(String value) {
            addCriterion("seller_area >", value, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerAreaGreaterThanOrEqualTo(String value) {
            addCriterion("seller_area >=", value, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerAreaLessThan(String value) {
            addCriterion("seller_area <", value, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerAreaLessThanOrEqualTo(String value) {
            addCriterion("seller_area <=", value, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerAreaLike(String value) {
            addCriterion("seller_area like", value, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerAreaNotLike(String value) {
            addCriterion("seller_area not like", value, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerAreaIn(List<String> values) {
            addCriterion("seller_area in", values, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerAreaNotIn(List<String> values) {
            addCriterion("seller_area not in", values, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerAreaBetween(String value1, String value2) {
            addCriterion("seller_area between", value1, value2, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerAreaNotBetween(String value1, String value2) {
            addCriterion("seller_area not between", value1, value2, "sellerArea");
            return (Criteria) this;
        }

        public Criteria andSellerStreetIsNull() {
            addCriterion("seller_street is null");
            return (Criteria) this;
        }

        public Criteria andSellerStreetIsNotNull() {
            addCriterion("seller_street is not null");
            return (Criteria) this;
        }

        public Criteria andSellerStreetEqualTo(String value) {
            addCriterion("seller_street =", value, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerStreetNotEqualTo(String value) {
            addCriterion("seller_street <>", value, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerStreetGreaterThan(String value) {
            addCriterion("seller_street >", value, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerStreetGreaterThanOrEqualTo(String value) {
            addCriterion("seller_street >=", value, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerStreetLessThan(String value) {
            addCriterion("seller_street <", value, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerStreetLessThanOrEqualTo(String value) {
            addCriterion("seller_street <=", value, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerStreetLike(String value) {
            addCriterion("seller_street like", value, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerStreetNotLike(String value) {
            addCriterion("seller_street not like", value, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerStreetIn(List<String> values) {
            addCriterion("seller_street in", values, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerStreetNotIn(List<String> values) {
            addCriterion("seller_street not in", values, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerStreetBetween(String value1, String value2) {
            addCriterion("seller_street between", value1, value2, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerStreetNotBetween(String value1, String value2) {
            addCriterion("seller_street not between", value1, value2, "sellerStreet");
            return (Criteria) this;
        }

        public Criteria andSellerVillageIsNull() {
            addCriterion("seller_village is null");
            return (Criteria) this;
        }

        public Criteria andSellerVillageIsNotNull() {
            addCriterion("seller_village is not null");
            return (Criteria) this;
        }

        public Criteria andSellerVillageEqualTo(String value) {
            addCriterion("seller_village =", value, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerVillageNotEqualTo(String value) {
            addCriterion("seller_village <>", value, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerVillageGreaterThan(String value) {
            addCriterion("seller_village >", value, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerVillageGreaterThanOrEqualTo(String value) {
            addCriterion("seller_village >=", value, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerVillageLessThan(String value) {
            addCriterion("seller_village <", value, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerVillageLessThanOrEqualTo(String value) {
            addCriterion("seller_village <=", value, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerVillageLike(String value) {
            addCriterion("seller_village like", value, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerVillageNotLike(String value) {
            addCriterion("seller_village not like", value, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerVillageIn(List<String> values) {
            addCriterion("seller_village in", values, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerVillageNotIn(List<String> values) {
            addCriterion("seller_village not in", values, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerVillageBetween(String value1, String value2) {
            addCriterion("seller_village between", value1, value2, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerVillageNotBetween(String value1, String value2) {
            addCriterion("seller_village not between", value1, value2, "sellerVillage");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIsNull() {
            addCriterion("seller_address is null");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIsNotNull() {
            addCriterion("seller_address is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAddressEqualTo(String value) {
            addCriterion("seller_address =", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotEqualTo(String value) {
            addCriterion("seller_address <>", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressGreaterThan(String value) {
            addCriterion("seller_address >", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("seller_address >=", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLessThan(String value) {
            addCriterion("seller_address <", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLessThanOrEqualTo(String value) {
            addCriterion("seller_address <=", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLike(String value) {
            addCriterion("seller_address like", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotLike(String value) {
            addCriterion("seller_address not like", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIn(List<String> values) {
            addCriterion("seller_address in", values, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotIn(List<String> values) {
            addCriterion("seller_address not in", values, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressBetween(String value1, String value2) {
            addCriterion("seller_address between", value1, value2, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotBetween(String value1, String value2) {
            addCriterion("seller_address not between", value1, value2, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneIsNull() {
            addCriterion("seller_phone is null");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneIsNotNull() {
            addCriterion("seller_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneEqualTo(String value) {
            addCriterion("seller_phone =", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotEqualTo(String value) {
            addCriterion("seller_phone <>", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneGreaterThan(String value) {
            addCriterion("seller_phone >", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("seller_phone >=", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLessThan(String value) {
            addCriterion("seller_phone <", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLessThanOrEqualTo(String value) {
            addCriterion("seller_phone <=", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLike(String value) {
            addCriterion("seller_phone like", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotLike(String value) {
            addCriterion("seller_phone not like", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneIn(List<String> values) {
            addCriterion("seller_phone in", values, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotIn(List<String> values) {
            addCriterion("seller_phone not in", values, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneBetween(String value1, String value2) {
            addCriterion("seller_phone between", value1, value2, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotBetween(String value1, String value2) {
            addCriterion("seller_phone not between", value1, value2, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNull() {
            addCriterion("person_phone is null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNotNull() {
            addCriterion("person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneEqualTo(String value) {
            addCriterion("person_phone =", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotEqualTo(String value) {
            addCriterion("person_phone <>", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThan(String value) {
            addCriterion("person_phone >", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("person_phone >=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThan(String value) {
            addCriterion("person_phone <", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("person_phone <=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLike(String value) {
            addCriterion("person_phone like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotLike(String value) {
            addCriterion("person_phone not like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIn(List<String> values) {
            addCriterion("person_phone in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotIn(List<String> values) {
            addCriterion("person_phone not in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneBetween(String value1, String value2) {
            addCriterion("person_phone between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("person_phone not between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonEmailIsNull() {
            addCriterion("person_email is null");
            return (Criteria) this;
        }

        public Criteria andPersonEmailIsNotNull() {
            addCriterion("person_email is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEmailEqualTo(String value) {
            addCriterion("person_email =", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailNotEqualTo(String value) {
            addCriterion("person_email <>", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailGreaterThan(String value) {
            addCriterion("person_email >", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailGreaterThanOrEqualTo(String value) {
            addCriterion("person_email >=", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailLessThan(String value) {
            addCriterion("person_email <", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailLessThanOrEqualTo(String value) {
            addCriterion("person_email <=", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailLike(String value) {
            addCriterion("person_email like", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailNotLike(String value) {
            addCriterion("person_email not like", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailIn(List<String> values) {
            addCriterion("person_email in", values, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailNotIn(List<String> values) {
            addCriterion("person_email not in", values, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailBetween(String value1, String value2) {
            addCriterion("person_email between", value1, value2, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailNotBetween(String value1, String value2) {
            addCriterion("person_email not between", value1, value2, "personEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceIsNull() {
            addCriterion("seller_licence is null");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceIsNotNull() {
            addCriterion("seller_licence is not null");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceEqualTo(String value) {
            addCriterion("seller_licence =", value, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceNotEqualTo(String value) {
            addCriterion("seller_licence <>", value, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceGreaterThan(String value) {
            addCriterion("seller_licence >", value, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("seller_licence >=", value, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceLessThan(String value) {
            addCriterion("seller_licence <", value, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceLessThanOrEqualTo(String value) {
            addCriterion("seller_licence <=", value, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceLike(String value) {
            addCriterion("seller_licence like", value, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceNotLike(String value) {
            addCriterion("seller_licence not like", value, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceIn(List<String> values) {
            addCriterion("seller_licence in", values, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceNotIn(List<String> values) {
            addCriterion("seller_licence not in", values, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceBetween(String value1, String value2) {
            addCriterion("seller_licence between", value1, value2, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceNotBetween(String value1, String value2) {
            addCriterion("seller_licence not between", value1, value2, "sellerLicence");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateIsNull() {
            addCriterion("seller_licenceDate is null");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateIsNotNull() {
            addCriterion("seller_licenceDate is not null");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateEqualTo(Date value) {
            addCriterion("seller_licenceDate =", value, "sellerLicencedate");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateNotEqualTo(Date value) {
            addCriterion("seller_licenceDate <>", value, "sellerLicencedate");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateGreaterThan(Date value) {
            addCriterion("seller_licenceDate >", value, "sellerLicencedate");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateGreaterThanOrEqualTo(Date value) {
            addCriterion("seller_licenceDate >=", value, "sellerLicencedate");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateLessThan(Date value) {
            addCriterion("seller_licenceDate <", value, "sellerLicencedate");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateLessThanOrEqualTo(Date value) {
            addCriterion("seller_licenceDate <=", value, "sellerLicencedate");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateIn(List<Date> values) {
            addCriterion("seller_licenceDate in", values, "sellerLicencedate");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateNotIn(List<Date> values) {
            addCriterion("seller_licenceDate not in", values, "sellerLicencedate");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateBetween(Date value1, Date value2) {
            addCriterion("seller_licenceDate between", value1, value2, "sellerLicencedate");
            return (Criteria) this;
        }

        public Criteria andSellerLicencedateNotBetween(Date value1, Date value2) {
            addCriterion("seller_licenceDate not between", value1, value2, "sellerLicencedate");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineIsNull() {
            addCriterion("seller_licence_deadLine is null");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineIsNotNull() {
            addCriterion("seller_licence_deadLine is not null");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineEqualTo(Date value) {
            addCriterion("seller_licence_deadLine =", value, "sellerLicenceDeadline");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineNotEqualTo(Date value) {
            addCriterion("seller_licence_deadLine <>", value, "sellerLicenceDeadline");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineGreaterThan(Date value) {
            addCriterion("seller_licence_deadLine >", value, "sellerLicenceDeadline");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("seller_licence_deadLine >=", value, "sellerLicenceDeadline");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineLessThan(Date value) {
            addCriterion("seller_licence_deadLine <", value, "sellerLicenceDeadline");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("seller_licence_deadLine <=", value, "sellerLicenceDeadline");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineIn(List<Date> values) {
            addCriterion("seller_licence_deadLine in", values, "sellerLicenceDeadline");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineNotIn(List<Date> values) {
            addCriterion("seller_licence_deadLine not in", values, "sellerLicenceDeadline");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineBetween(Date value1, Date value2) {
            addCriterion("seller_licence_deadLine between", value1, value2, "sellerLicenceDeadline");
            return (Criteria) this;
        }

        public Criteria andSellerLicenceDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("seller_licence_deadLine not between", value1, value2, "sellerLicenceDeadline");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoIsNull() {
            addCriterion("seller_licence_photo is null");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoIsNotNull() {
            addCriterion("seller_licence_photo is not null");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoEqualTo(String value) {
            addCriterion("seller_licence_photo =", value, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoNotEqualTo(String value) {
            addCriterion("seller_licence_photo <>", value, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoGreaterThan(String value) {
            addCriterion("seller_licence_photo >", value, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("seller_licence_photo >=", value, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoLessThan(String value) {
            addCriterion("seller_licence_photo <", value, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoLessThanOrEqualTo(String value) {
            addCriterion("seller_licence_photo <=", value, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoLike(String value) {
            addCriterion("seller_licence_photo like", value, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoNotLike(String value) {
            addCriterion("seller_licence_photo not like", value, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoIn(List<String> values) {
            addCriterion("seller_licence_photo in", values, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoNotIn(List<String> values) {
            addCriterion("seller_licence_photo not in", values, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoBetween(String value1, String value2) {
            addCriterion("seller_licence_photo between", value1, value2, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andSellerLicencePhotoNotBetween(String value1, String value2) {
            addCriterion("seller_licence_photo not between", value1, value2, "sellerLicencePhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoIsNull() {
            addCriterion("personIdcard_photo is null");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoIsNotNull() {
            addCriterion("personIdcard_photo is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoEqualTo(String value) {
            addCriterion("personIdcard_photo =", value, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoNotEqualTo(String value) {
            addCriterion("personIdcard_photo <>", value, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoGreaterThan(String value) {
            addCriterion("personIdcard_photo >", value, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("personIdcard_photo >=", value, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoLessThan(String value) {
            addCriterion("personIdcard_photo <", value, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoLessThanOrEqualTo(String value) {
            addCriterion("personIdcard_photo <=", value, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoLike(String value) {
            addCriterion("personIdcard_photo like", value, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoNotLike(String value) {
            addCriterion("personIdcard_photo not like", value, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoIn(List<String> values) {
            addCriterion("personIdcard_photo in", values, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoNotIn(List<String> values) {
            addCriterion("personIdcard_photo not in", values, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoBetween(String value1, String value2) {
            addCriterion("personIdcard_photo between", value1, value2, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andPersonidcardPhotoNotBetween(String value1, String value2) {
            addCriterion("personIdcard_photo not between", value1, value2, "personidcardPhoto");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeIsNull() {
            addCriterion("seller_commit_time is null");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeIsNotNull() {
            addCriterion("seller_commit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeEqualTo(Date value) {
            addCriterion("seller_commit_time =", value, "sellerCommitTime");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeNotEqualTo(Date value) {
            addCriterion("seller_commit_time <>", value, "sellerCommitTime");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeGreaterThan(Date value) {
            addCriterion("seller_commit_time >", value, "sellerCommitTime");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("seller_commit_time >=", value, "sellerCommitTime");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeLessThan(Date value) {
            addCriterion("seller_commit_time <", value, "sellerCommitTime");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeLessThanOrEqualTo(Date value) {
            addCriterion("seller_commit_time <=", value, "sellerCommitTime");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeIn(List<Date> values) {
            addCriterion("seller_commit_time in", values, "sellerCommitTime");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeNotIn(List<Date> values) {
            addCriterion("seller_commit_time not in", values, "sellerCommitTime");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeBetween(Date value1, Date value2) {
            addCriterion("seller_commit_time between", value1, value2, "sellerCommitTime");
            return (Criteria) this;
        }

        public Criteria andSellerCommitTimeNotBetween(Date value1, Date value2) {
            addCriterion("seller_commit_time not between", value1, value2, "sellerCommitTime");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeIsNull() {
            addCriterion("seller_pass_time is null");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeIsNotNull() {
            addCriterion("seller_pass_time is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeEqualTo(Date value) {
            addCriterion("seller_pass_time =", value, "sellerPassTime");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeNotEqualTo(Date value) {
            addCriterion("seller_pass_time <>", value, "sellerPassTime");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeGreaterThan(Date value) {
            addCriterion("seller_pass_time >", value, "sellerPassTime");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("seller_pass_time >=", value, "sellerPassTime");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeLessThan(Date value) {
            addCriterion("seller_pass_time <", value, "sellerPassTime");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeLessThanOrEqualTo(Date value) {
            addCriterion("seller_pass_time <=", value, "sellerPassTime");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeIn(List<Date> values) {
            addCriterion("seller_pass_time in", values, "sellerPassTime");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeNotIn(List<Date> values) {
            addCriterion("seller_pass_time not in", values, "sellerPassTime");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeBetween(Date value1, Date value2) {
            addCriterion("seller_pass_time between", value1, value2, "sellerPassTime");
            return (Criteria) this;
        }

        public Criteria andSellerPassTimeNotBetween(Date value1, Date value2) {
            addCriterion("seller_pass_time not between", value1, value2, "sellerPassTime");
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andDelDateIsNull() {
            addCriterion("del_date is null");
            return (Criteria) this;
        }

        public Criteria andDelDateIsNotNull() {
            addCriterion("del_date is not null");
            return (Criteria) this;
        }

        public Criteria andDelDateEqualTo(Date value) {
            addCriterion("del_date =", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateNotEqualTo(Date value) {
            addCriterion("del_date <>", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateGreaterThan(Date value) {
            addCriterion("del_date >", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("del_date >=", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateLessThan(Date value) {
            addCriterion("del_date <", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateLessThanOrEqualTo(Date value) {
            addCriterion("del_date <=", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateIn(List<Date> values) {
            addCriterion("del_date in", values, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateNotIn(List<Date> values) {
            addCriterion("del_date not in", values, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateBetween(Date value1, Date value2) {
            addCriterion("del_date between", value1, value2, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateNotBetween(Date value1, Date value2) {
            addCriterion("del_date not between", value1, value2, "delDate");
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

        public Criteria andAddOperatorIdEqualTo(Integer value) {
            addCriterion("add_operator_id =", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdNotEqualTo(Integer value) {
            addCriterion("add_operator_id <>", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdGreaterThan(Integer value) {
            addCriterion("add_operator_id >", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_operator_id >=", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdLessThan(Integer value) {
            addCriterion("add_operator_id <", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("add_operator_id <=", value, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdIn(List<Integer> values) {
            addCriterion("add_operator_id in", values, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdNotIn(List<Integer> values) {
            addCriterion("add_operator_id not in", values, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("add_operator_id between", value1, value2, "addOperatorId");
            return (Criteria) this;
        }

        public Criteria andAddOperatorIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andModiOperatorIdEqualTo(Integer value) {
            addCriterion("modi_operator_id =", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdNotEqualTo(Integer value) {
            addCriterion("modi_operator_id <>", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdGreaterThan(Integer value) {
            addCriterion("modi_operator_id >", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("modi_operator_id >=", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdLessThan(Integer value) {
            addCriterion("modi_operator_id <", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("modi_operator_id <=", value, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdIn(List<Integer> values) {
            addCriterion("modi_operator_id in", values, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdNotIn(List<Integer> values) {
            addCriterion("modi_operator_id not in", values, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("modi_operator_id between", value1, value2, "modiOperatorId");
            return (Criteria) this;
        }

        public Criteria andModiOperatorIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andDelOperatorIdEqualTo(Integer value) {
            addCriterion("del_operator_id =", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdNotEqualTo(Integer value) {
            addCriterion("del_operator_id <>", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdGreaterThan(Integer value) {
            addCriterion("del_operator_id >", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_operator_id >=", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdLessThan(Integer value) {
            addCriterion("del_operator_id <", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("del_operator_id <=", value, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdIn(List<Integer> values) {
            addCriterion("del_operator_id in", values, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdNotIn(List<Integer> values) {
            addCriterion("del_operator_id not in", values, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("del_operator_id between", value1, value2, "delOperatorId");
            return (Criteria) this;
        }

        public Criteria andDelOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("del_operator_id not between", value1, value2, "delOperatorId");
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