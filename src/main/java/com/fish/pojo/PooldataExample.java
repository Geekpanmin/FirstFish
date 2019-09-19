package com.fish.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PooldataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PooldataExample() {
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andPoolIdIsNull() {
            addCriterion("pool_id is null");
            return (Criteria) this;
        }

        public Criteria andPoolIdIsNotNull() {
            addCriterion("pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoolIdEqualTo(Integer value) {
            addCriterion("pool_id =", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotEqualTo(Integer value) {
            addCriterion("pool_id <>", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdGreaterThan(Integer value) {
            addCriterion("pool_id >", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pool_id >=", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdLessThan(Integer value) {
            addCriterion("pool_id <", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("pool_id <=", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdIn(List<Integer> values) {
            addCriterion("pool_id in", values, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotIn(List<Integer> values) {
            addCriterion("pool_id not in", values, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdBetween(Integer value1, Integer value2) {
            addCriterion("pool_id between", value1, value2, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pool_id not between", value1, value2, "poolId");
            return (Criteria) this;
        }

        public Criteria andNoNIsNull() {
            addCriterion("no_n is null");
            return (Criteria) this;
        }

        public Criteria andNoNIsNotNull() {
            addCriterion("no_n is not null");
            return (Criteria) this;
        }

        public Criteria andNoNEqualTo(Float value) {
            addCriterion("no_n =", value, "noN");
            return (Criteria) this;
        }

        public Criteria andNoNNotEqualTo(Float value) {
            addCriterion("no_n <>", value, "noN");
            return (Criteria) this;
        }

        public Criteria andNoNGreaterThan(Float value) {
            addCriterion("no_n >", value, "noN");
            return (Criteria) this;
        }

        public Criteria andNoNGreaterThanOrEqualTo(Float value) {
            addCriterion("no_n >=", value, "noN");
            return (Criteria) this;
        }

        public Criteria andNoNLessThan(Float value) {
            addCriterion("no_n <", value, "noN");
            return (Criteria) this;
        }

        public Criteria andNoNLessThanOrEqualTo(Float value) {
            addCriterion("no_n <=", value, "noN");
            return (Criteria) this;
        }

        public Criteria andNoNIn(List<Float> values) {
            addCriterion("no_n in", values, "noN");
            return (Criteria) this;
        }

        public Criteria andNoNNotIn(List<Float> values) {
            addCriterion("no_n not in", values, "noN");
            return (Criteria) this;
        }

        public Criteria andNoNBetween(Float value1, Float value2) {
            addCriterion("no_n between", value1, value2, "noN");
            return (Criteria) this;
        }

        public Criteria andNoNNotBetween(Float value1, Float value2) {
            addCriterion("no_n not between", value1, value2, "noN");
            return (Criteria) this;
        }

        public Criteria andNitrareNIsNull() {
            addCriterion("nitrare_n is null");
            return (Criteria) this;
        }

        public Criteria andNitrareNIsNotNull() {
            addCriterion("nitrare_n is not null");
            return (Criteria) this;
        }

        public Criteria andNitrareNEqualTo(Float value) {
            addCriterion("nitrare_n =", value, "nitrareN");
            return (Criteria) this;
        }

        public Criteria andNitrareNNotEqualTo(Float value) {
            addCriterion("nitrare_n <>", value, "nitrareN");
            return (Criteria) this;
        }

        public Criteria andNitrareNGreaterThan(Float value) {
            addCriterion("nitrare_n >", value, "nitrareN");
            return (Criteria) this;
        }

        public Criteria andNitrareNGreaterThanOrEqualTo(Float value) {
            addCriterion("nitrare_n >=", value, "nitrareN");
            return (Criteria) this;
        }

        public Criteria andNitrareNLessThan(Float value) {
            addCriterion("nitrare_n <", value, "nitrareN");
            return (Criteria) this;
        }

        public Criteria andNitrareNLessThanOrEqualTo(Float value) {
            addCriterion("nitrare_n <=", value, "nitrareN");
            return (Criteria) this;
        }

        public Criteria andNitrareNIn(List<Float> values) {
            addCriterion("nitrare_n in", values, "nitrareN");
            return (Criteria) this;
        }

        public Criteria andNitrareNNotIn(List<Float> values) {
            addCriterion("nitrare_n not in", values, "nitrareN");
            return (Criteria) this;
        }

        public Criteria andNitrareNBetween(Float value1, Float value2) {
            addCriterion("nitrare_n between", value1, value2, "nitrareN");
            return (Criteria) this;
        }

        public Criteria andNitrareNNotBetween(Float value1, Float value2) {
            addCriterion("nitrare_n not between", value1, value2, "nitrareN");
            return (Criteria) this;
        }

        public Criteria andPhIsNull() {
            addCriterion("ph is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("ph is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(Float value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(Float value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(Float value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(Float value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(Float value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(Float value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<Float> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<Float> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(Float value1, Float value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(Float value1, Float value2) {
            addCriterion("ph not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andOxygenIsNull() {
            addCriterion("oxygen is null");
            return (Criteria) this;
        }

        public Criteria andOxygenIsNotNull() {
            addCriterion("oxygen is not null");
            return (Criteria) this;
        }

        public Criteria andOxygenEqualTo(Float value) {
            addCriterion("oxygen =", value, "oxygen");
            return (Criteria) this;
        }

        public Criteria andOxygenNotEqualTo(Float value) {
            addCriterion("oxygen <>", value, "oxygen");
            return (Criteria) this;
        }

        public Criteria andOxygenGreaterThan(Float value) {
            addCriterion("oxygen >", value, "oxygen");
            return (Criteria) this;
        }

        public Criteria andOxygenGreaterThanOrEqualTo(Float value) {
            addCriterion("oxygen >=", value, "oxygen");
            return (Criteria) this;
        }

        public Criteria andOxygenLessThan(Float value) {
            addCriterion("oxygen <", value, "oxygen");
            return (Criteria) this;
        }

        public Criteria andOxygenLessThanOrEqualTo(Float value) {
            addCriterion("oxygen <=", value, "oxygen");
            return (Criteria) this;
        }

        public Criteria andOxygenIn(List<Float> values) {
            addCriterion("oxygen in", values, "oxygen");
            return (Criteria) this;
        }

        public Criteria andOxygenNotIn(List<Float> values) {
            addCriterion("oxygen not in", values, "oxygen");
            return (Criteria) this;
        }

        public Criteria andOxygenBetween(Float value1, Float value2) {
            addCriterion("oxygen between", value1, value2, "oxygen");
            return (Criteria) this;
        }

        public Criteria andOxygenNotBetween(Float value1, Float value2) {
            addCriterion("oxygen not between", value1, value2, "oxygen");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureIsNull() {
            addCriterion("water_temperature is null");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureIsNotNull() {
            addCriterion("water_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureEqualTo(Float value) {
            addCriterion("water_temperature =", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureNotEqualTo(Float value) {
            addCriterion("water_temperature <>", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureGreaterThan(Float value) {
            addCriterion("water_temperature >", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("water_temperature >=", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureLessThan(Float value) {
            addCriterion("water_temperature <", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureLessThanOrEqualTo(Float value) {
            addCriterion("water_temperature <=", value, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureIn(List<Float> values) {
            addCriterion("water_temperature in", values, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureNotIn(List<Float> values) {
            addCriterion("water_temperature not in", values, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureBetween(Float value1, Float value2) {
            addCriterion("water_temperature between", value1, value2, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWaterTemperatureNotBetween(Float value1, Float value2) {
            addCriterion("water_temperature not between", value1, value2, "waterTemperature");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureIsNull() {
            addCriterion("weather_temperature is null");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureIsNotNull() {
            addCriterion("weather_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureEqualTo(Float value) {
            addCriterion("weather_temperature =", value, "weatherTemperature");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureNotEqualTo(Float value) {
            addCriterion("weather_temperature <>", value, "weatherTemperature");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureGreaterThan(Float value) {
            addCriterion("weather_temperature >", value, "weatherTemperature");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("weather_temperature >=", value, "weatherTemperature");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureLessThan(Float value) {
            addCriterion("weather_temperature <", value, "weatherTemperature");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureLessThanOrEqualTo(Float value) {
            addCriterion("weather_temperature <=", value, "weatherTemperature");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureIn(List<Float> values) {
            addCriterion("weather_temperature in", values, "weatherTemperature");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureNotIn(List<Float> values) {
            addCriterion("weather_temperature not in", values, "weatherTemperature");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureBetween(Float value1, Float value2) {
            addCriterion("weather_temperature between", value1, value2, "weatherTemperature");
            return (Criteria) this;
        }

        public Criteria andWeatherTemperatureNotBetween(Float value1, Float value2) {
            addCriterion("weather_temperature not between", value1, value2, "weatherTemperature");
            return (Criteria) this;
        }

        public Criteria andTotalNIsNull() {
            addCriterion("total_n is null");
            return (Criteria) this;
        }

        public Criteria andTotalNIsNotNull() {
            addCriterion("total_n is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNEqualTo(Float value) {
            addCriterion("total_n =", value, "totalN");
            return (Criteria) this;
        }

        public Criteria andTotalNNotEqualTo(Float value) {
            addCriterion("total_n <>", value, "totalN");
            return (Criteria) this;
        }

        public Criteria andTotalNGreaterThan(Float value) {
            addCriterion("total_n >", value, "totalN");
            return (Criteria) this;
        }

        public Criteria andTotalNGreaterThanOrEqualTo(Float value) {
            addCriterion("total_n >=", value, "totalN");
            return (Criteria) this;
        }

        public Criteria andTotalNLessThan(Float value) {
            addCriterion("total_n <", value, "totalN");
            return (Criteria) this;
        }

        public Criteria andTotalNLessThanOrEqualTo(Float value) {
            addCriterion("total_n <=", value, "totalN");
            return (Criteria) this;
        }

        public Criteria andTotalNIn(List<Float> values) {
            addCriterion("total_n in", values, "totalN");
            return (Criteria) this;
        }

        public Criteria andTotalNNotIn(List<Float> values) {
            addCriterion("total_n not in", values, "totalN");
            return (Criteria) this;
        }

        public Criteria andTotalNBetween(Float value1, Float value2) {
            addCriterion("total_n between", value1, value2, "totalN");
            return (Criteria) this;
        }

        public Criteria andTotalNNotBetween(Float value1, Float value2) {
            addCriterion("total_n not between", value1, value2, "totalN");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNull() {
            addCriterion("date_time is null");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNotNull() {
            addCriterion("date_time is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("date_time =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_time <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("date_time >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_time >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(Date value) {
            addCriterionForJDBCDate("date_time <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_time <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("date_time in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_time not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_time between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_time not between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIsNull() {
            addCriterion("time_slot is null");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIsNotNull() {
            addCriterion("time_slot is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSlotEqualTo(Integer value) {
            addCriterion("time_slot =", value, "timeSlot");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNotEqualTo(Integer value) {
            addCriterion("time_slot <>", value, "timeSlot");
            return (Criteria) this;
        }

        public Criteria andTimeSlotGreaterThan(Integer value) {
            addCriterion("time_slot >", value, "timeSlot");
            return (Criteria) this;
        }

        public Criteria andTimeSlotGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_slot >=", value, "timeSlot");
            return (Criteria) this;
        }

        public Criteria andTimeSlotLessThan(Integer value) {
            addCriterion("time_slot <", value, "timeSlot");
            return (Criteria) this;
        }

        public Criteria andTimeSlotLessThanOrEqualTo(Integer value) {
            addCriterion("time_slot <=", value, "timeSlot");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIn(List<Integer> values) {
            addCriterion("time_slot in", values, "timeSlot");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNotIn(List<Integer> values) {
            addCriterion("time_slot not in", values, "timeSlot");
            return (Criteria) this;
        }

        public Criteria andTimeSlotBetween(Integer value1, Integer value2) {
            addCriterion("time_slot between", value1, value2, "timeSlot");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNotBetween(Integer value1, Integer value2) {
            addCriterion("time_slot not between", value1, value2, "timeSlot");
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