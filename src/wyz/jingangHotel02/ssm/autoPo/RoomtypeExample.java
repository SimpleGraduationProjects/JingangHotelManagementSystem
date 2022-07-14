package wyz.jingangHotel02.ssm.autoPo;

import java.util.ArrayList;
import java.util.List;

public class RoomtypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public RoomtypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
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

        public Criteria andRoomtypeidIsNull() {
            addCriterion("roomTypeID is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidIsNotNull() {
            addCriterion("roomTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidEqualTo(Integer value) {
            addCriterion("roomTypeID =", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidNotEqualTo(Integer value) {
            addCriterion("roomTypeID <>", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidGreaterThan(Integer value) {
            addCriterion("roomTypeID >", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomTypeID >=", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidLessThan(Integer value) {
            addCriterion("roomTypeID <", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("roomTypeID <=", value, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidIn(List<Integer> values) {
            addCriterion("roomTypeID in", values, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidNotIn(List<Integer> values) {
            addCriterion("roomTypeID not in", values, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidBetween(Integer value1, Integer value2) {
            addCriterion("roomTypeID between", value1, value2, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("roomTypeID not between", value1, value2, "roomtypeid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNull() {
            addCriterion("roomType is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNotNull() {
            addCriterion("roomType is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeEqualTo(String value) {
            addCriterion("roomType =", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotEqualTo(String value) {
            addCriterion("roomType <>", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThan(String value) {
            addCriterion("roomType >", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThanOrEqualTo(String value) {
            addCriterion("roomType >=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThan(String value) {
            addCriterion("roomType <", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThanOrEqualTo(String value) {
            addCriterion("roomType <=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLike(String value) {
            addCriterion("roomType like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotLike(String value) {
            addCriterion("roomType not like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIn(List<String> values) {
            addCriterion("roomType in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotIn(List<String> values) {
            addCriterion("roomType not in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeBetween(String value1, String value2) {
            addCriterion("roomType between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotBetween(String value1, String value2) {
            addCriterion("roomType not between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andNumofbedsIsNull() {
            addCriterion("numOfBeds is null");
            return (Criteria) this;
        }

        public Criteria andNumofbedsIsNotNull() {
            addCriterion("numOfBeds is not null");
            return (Criteria) this;
        }

        public Criteria andNumofbedsEqualTo(Integer value) {
            addCriterion("numOfBeds =", value, "numofbeds");
            return (Criteria) this;
        }

        public Criteria andNumofbedsNotEqualTo(Integer value) {
            addCriterion("numOfBeds <>", value, "numofbeds");
            return (Criteria) this;
        }

        public Criteria andNumofbedsGreaterThan(Integer value) {
            addCriterion("numOfBeds >", value, "numofbeds");
            return (Criteria) this;
        }

        public Criteria andNumofbedsGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfBeds >=", value, "numofbeds");
            return (Criteria) this;
        }

        public Criteria andNumofbedsLessThan(Integer value) {
            addCriterion("numOfBeds <", value, "numofbeds");
            return (Criteria) this;
        }

        public Criteria andNumofbedsLessThanOrEqualTo(Integer value) {
            addCriterion("numOfBeds <=", value, "numofbeds");
            return (Criteria) this;
        }

        public Criteria andNumofbedsIn(List<Integer> values) {
            addCriterion("numOfBeds in", values, "numofbeds");
            return (Criteria) this;
        }

        public Criteria andNumofbedsNotIn(List<Integer> values) {
            addCriterion("numOfBeds not in", values, "numofbeds");
            return (Criteria) this;
        }

        public Criteria andNumofbedsBetween(Integer value1, Integer value2) {
            addCriterion("numOfBeds between", value1, value2, "numofbeds");
            return (Criteria) this;
        }

        public Criteria andNumofbedsNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfBeds not between", value1, value2, "numofbeds");
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

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table roomtype
     *
     * @mbggenerated do_not_delete_during_merge Sun May 20 16:42:24 GMT+08:00 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table roomtype
     *
     * @mbggenerated Sun May 20 16:42:24 GMT+08:00 2018
     */
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