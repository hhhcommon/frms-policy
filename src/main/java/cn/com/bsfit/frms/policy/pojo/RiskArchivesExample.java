package cn.com.bsfit.frms.policy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiskArchivesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskArchivesExample() {
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

        public Criteria andArchivesIdIsNull() {
            addCriterion("ARCHIVES_ID is null");
            return (Criteria) this;
        }

        public Criteria andArchivesIdIsNotNull() {
            addCriterion("ARCHIVES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesIdEqualTo(Long value) {
            addCriterion("ARCHIVES_ID =", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotEqualTo(Long value) {
            addCriterion("ARCHIVES_ID <>", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdGreaterThan(Long value) {
            addCriterion("ARCHIVES_ID >", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ARCHIVES_ID >=", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdLessThan(Long value) {
            addCriterion("ARCHIVES_ID <", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdLessThanOrEqualTo(Long value) {
            addCriterion("ARCHIVES_ID <=", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdIn(List<Long> values) {
            addCriterion("ARCHIVES_ID in", values, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotIn(List<Long> values) {
            addCriterion("ARCHIVES_ID not in", values, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdBetween(Long value1, Long value2) {
            addCriterion("ARCHIVES_ID between", value1, value2, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotBetween(Long value1, Long value2) {
            addCriterion("ARCHIVES_ID not between", value1, value2, "archivesId");
            return (Criteria) this;
        }

        public Criteria andAcctIdIsNull() {
            addCriterion("ACCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAcctIdIsNotNull() {
            addCriterion("ACCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAcctIdEqualTo(String value) {
            addCriterion("ACCT_ID =", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotEqualTo(String value) {
            addCriterion("ACCT_ID <>", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdGreaterThan(String value) {
            addCriterion("ACCT_ID >", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_ID >=", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLessThan(String value) {
            addCriterion("ACCT_ID <", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLessThanOrEqualTo(String value) {
            addCriterion("ACCT_ID <=", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLike(String value) {
            addCriterion("ACCT_ID like", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotLike(String value) {
            addCriterion("ACCT_ID not like", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdIn(List<String> values) {
            addCriterion("ACCT_ID in", values, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotIn(List<String> values) {
            addCriterion("ACCT_ID not in", values, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdBetween(String value1, String value2) {
            addCriterion("ACCT_ID between", value1, value2, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotBetween(String value1, String value2) {
            addCriterion("ACCT_ID not between", value1, value2, "acctId");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNull() {
            addCriterion("RISK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNotNull() {
            addCriterion("RISK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelEqualTo(Short value) {
            addCriterion("RISK_LEVEL =", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotEqualTo(Short value) {
            addCriterion("RISK_LEVEL <>", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThan(Short value) {
            addCriterion("RISK_LEVEL >", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("RISK_LEVEL >=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThan(Short value) {
            addCriterion("RISK_LEVEL <", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThanOrEqualTo(Short value) {
            addCriterion("RISK_LEVEL <=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIn(List<Short> values) {
            addCriterion("RISK_LEVEL in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotIn(List<Short> values) {
            addCriterion("RISK_LEVEL not in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelBetween(Short value1, Short value2) {
            addCriterion("RISK_LEVEL between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotBetween(Short value1, Short value2) {
            addCriterion("RISK_LEVEL not between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Long value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Long value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Long value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Long value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Long value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Long> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Long> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Long value1, Long value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Long value1, Long value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andBizCodeIsNull() {
            addCriterion("BIZ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBizCodeIsNotNull() {
            addCriterion("BIZ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBizCodeEqualTo(String value) {
            addCriterion("BIZ_CODE =", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeNotEqualTo(String value) {
            addCriterion("BIZ_CODE <>", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeGreaterThan(String value) {
            addCriterion("BIZ_CODE >", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_CODE >=", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeLessThan(String value) {
            addCriterion("BIZ_CODE <", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeLessThanOrEqualTo(String value) {
            addCriterion("BIZ_CODE <=", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeLike(String value) {
            addCriterion("BIZ_CODE like", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeNotLike(String value) {
            addCriterion("BIZ_CODE not like", value, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeIn(List<String> values) {
            addCriterion("BIZ_CODE in", values, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeNotIn(List<String> values) {
            addCriterion("BIZ_CODE not in", values, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeBetween(String value1, String value2) {
            addCriterion("BIZ_CODE between", value1, value2, "bizCode");
            return (Criteria) this;
        }

        public Criteria andBizCodeNotBetween(String value1, String value2) {
            addCriterion("BIZ_CODE not between", value1, value2, "bizCode");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNull() {
            addCriterion("TRANS_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("TRANS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(String value) {
            addCriterion("TRANS_ID =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(String value) {
            addCriterion("TRANS_ID <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(String value) {
            addCriterion("TRANS_ID >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_ID >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(String value) {
            addCriterion("TRANS_ID <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(String value) {
            addCriterion("TRANS_ID <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLike(String value) {
            addCriterion("TRANS_ID like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotLike(String value) {
            addCriterion("TRANS_ID not like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<String> values) {
            addCriterion("TRANS_ID in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<String> values) {
            addCriterion("TRANS_ID not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(String value1, String value2) {
            addCriterion("TRANS_ID between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(String value1, String value2) {
            addCriterion("TRANS_ID not between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransVolIsNull() {
            addCriterion("TRANS_VOL is null");
            return (Criteria) this;
        }

        public Criteria andTransVolIsNotNull() {
            addCriterion("TRANS_VOL is not null");
            return (Criteria) this;
        }

        public Criteria andTransVolEqualTo(BigDecimal value) {
            addCriterion("TRANS_VOL =", value, "transVol");
            return (Criteria) this;
        }

        public Criteria andTransVolNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_VOL <>", value, "transVol");
            return (Criteria) this;
        }

        public Criteria andTransVolGreaterThan(BigDecimal value) {
            addCriterion("TRANS_VOL >", value, "transVol");
            return (Criteria) this;
        }

        public Criteria andTransVolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_VOL >=", value, "transVol");
            return (Criteria) this;
        }

        public Criteria andTransVolLessThan(BigDecimal value) {
            addCriterion("TRANS_VOL <", value, "transVol");
            return (Criteria) this;
        }

        public Criteria andTransVolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_VOL <=", value, "transVol");
            return (Criteria) this;
        }

        public Criteria andTransVolIn(List<BigDecimal> values) {
            addCriterion("TRANS_VOL in", values, "transVol");
            return (Criteria) this;
        }

        public Criteria andTransVolNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_VOL not in", values, "transVol");
            return (Criteria) this;
        }

        public Criteria andTransVolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_VOL between", value1, value2, "transVol");
            return (Criteria) this;
        }

        public Criteria andTransVolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_VOL not between", value1, value2, "transVol");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andBizCategoryIsNull() {
            addCriterion("BIZ_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andBizCategoryIsNotNull() {
            addCriterion("BIZ_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andBizCategoryEqualTo(String value) {
            addCriterion("BIZ_CATEGORY =", value, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andBizCategoryNotEqualTo(String value) {
            addCriterion("BIZ_CATEGORY <>", value, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andBizCategoryGreaterThan(String value) {
            addCriterion("BIZ_CATEGORY >", value, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andBizCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_CATEGORY >=", value, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andBizCategoryLessThan(String value) {
            addCriterion("BIZ_CATEGORY <", value, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andBizCategoryLessThanOrEqualTo(String value) {
            addCriterion("BIZ_CATEGORY <=", value, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andBizCategoryLike(String value) {
            addCriterion("BIZ_CATEGORY like", value, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andBizCategoryNotLike(String value) {
            addCriterion("BIZ_CATEGORY not like", value, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andBizCategoryIn(List<String> values) {
            addCriterion("BIZ_CATEGORY in", values, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andBizCategoryNotIn(List<String> values) {
            addCriterion("BIZ_CATEGORY not in", values, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andBizCategoryBetween(String value1, String value2) {
            addCriterion("BIZ_CATEGORY between", value1, value2, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andBizCategoryNotBetween(String value1, String value2) {
            addCriterion("BIZ_CATEGORY not between", value1, value2, "bizCategory");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNull() {
            addCriterion("CHECK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNotNull() {
            addCriterion("CHECK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckIdEqualTo(Long value) {
            addCriterion("CHECK_ID =", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotEqualTo(Long value) {
            addCriterion("CHECK_ID <>", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThan(Long value) {
            addCriterion("CHECK_ID >", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHECK_ID >=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThan(Long value) {
            addCriterion("CHECK_ID <", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThanOrEqualTo(Long value) {
            addCriterion("CHECK_ID <=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdIn(List<Long> values) {
            addCriterion("CHECK_ID in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotIn(List<Long> values) {
            addCriterion("CHECK_ID not in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdBetween(Long value1, Long value2) {
            addCriterion("CHECK_ID between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotBetween(Long value1, Long value2) {
            addCriterion("CHECK_ID not between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andDealWayIsNull() {
            addCriterion("DEAL_WAY is null");
            return (Criteria) this;
        }

        public Criteria andDealWayIsNotNull() {
            addCriterion("DEAL_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andDealWayEqualTo(Short value) {
            addCriterion("DEAL_WAY =", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayNotEqualTo(Short value) {
            addCriterion("DEAL_WAY <>", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayGreaterThan(Short value) {
            addCriterion("DEAL_WAY >", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayGreaterThanOrEqualTo(Short value) {
            addCriterion("DEAL_WAY >=", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayLessThan(Short value) {
            addCriterion("DEAL_WAY <", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayLessThanOrEqualTo(Short value) {
            addCriterion("DEAL_WAY <=", value, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayIn(List<Short> values) {
            addCriterion("DEAL_WAY in", values, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayNotIn(List<Short> values) {
            addCriterion("DEAL_WAY not in", values, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayBetween(Short value1, Short value2) {
            addCriterion("DEAL_WAY between", value1, value2, "dealWay");
            return (Criteria) this;
        }

        public Criteria andDealWayNotBetween(Short value1, Short value2) {
            addCriterion("DEAL_WAY not between", value1, value2, "dealWay");
            return (Criteria) this;
        }

        public Criteria andControlStatusIsNull() {
            addCriterion("CONTROL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andControlStatusIsNotNull() {
            addCriterion("CONTROL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andControlStatusEqualTo(Short value) {
            addCriterion("CONTROL_STATUS =", value, "controlStatus");
            return (Criteria) this;
        }

        public Criteria andControlStatusNotEqualTo(Short value) {
            addCriterion("CONTROL_STATUS <>", value, "controlStatus");
            return (Criteria) this;
        }

        public Criteria andControlStatusGreaterThan(Short value) {
            addCriterion("CONTROL_STATUS >", value, "controlStatus");
            return (Criteria) this;
        }

        public Criteria andControlStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("CONTROL_STATUS >=", value, "controlStatus");
            return (Criteria) this;
        }

        public Criteria andControlStatusLessThan(Short value) {
            addCriterion("CONTROL_STATUS <", value, "controlStatus");
            return (Criteria) this;
        }

        public Criteria andControlStatusLessThanOrEqualTo(Short value) {
            addCriterion("CONTROL_STATUS <=", value, "controlStatus");
            return (Criteria) this;
        }

        public Criteria andControlStatusIn(List<Short> values) {
            addCriterion("CONTROL_STATUS in", values, "controlStatus");
            return (Criteria) this;
        }

        public Criteria andControlStatusNotIn(List<Short> values) {
            addCriterion("CONTROL_STATUS not in", values, "controlStatus");
            return (Criteria) this;
        }

        public Criteria andControlStatusBetween(Short value1, Short value2) {
            addCriterion("CONTROL_STATUS between", value1, value2, "controlStatus");
            return (Criteria) this;
        }

        public Criteria andControlStatusNotBetween(Short value1, Short value2) {
            addCriterion("CONTROL_STATUS not between", value1, value2, "controlStatus");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Short value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Short value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Short value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Short value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Short value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Short> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Short> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Short value1, Short value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Short value1, Short value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Short value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Short value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Short value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Short value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Short value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Short> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Short> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Short value1, Short value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Short value1, Short value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("BANK is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("BANK is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("BANK =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("BANK <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("BANK >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("BANK >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("BANK <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("BANK <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("BANK like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("BANK not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("BANK in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("BANK not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("BANK between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("BANK not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andOidPartnerIsNull() {
            addCriterion("OID_PARTNER is null");
            return (Criteria) this;
        }

        public Criteria andOidPartnerIsNotNull() {
            addCriterion("OID_PARTNER is not null");
            return (Criteria) this;
        }

        public Criteria andOidPartnerEqualTo(String value) {
            addCriterion("OID_PARTNER =", value, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andOidPartnerNotEqualTo(String value) {
            addCriterion("OID_PARTNER <>", value, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andOidPartnerGreaterThan(String value) {
            addCriterion("OID_PARTNER >", value, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andOidPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("OID_PARTNER >=", value, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andOidPartnerLessThan(String value) {
            addCriterion("OID_PARTNER <", value, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andOidPartnerLessThanOrEqualTo(String value) {
            addCriterion("OID_PARTNER <=", value, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andOidPartnerLike(String value) {
            addCriterion("OID_PARTNER like", value, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andOidPartnerNotLike(String value) {
            addCriterion("OID_PARTNER not like", value, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andOidPartnerIn(List<String> values) {
            addCriterion("OID_PARTNER in", values, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andOidPartnerNotIn(List<String> values) {
            addCriterion("OID_PARTNER not in", values, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andOidPartnerBetween(String value1, String value2) {
            addCriterion("OID_PARTNER between", value1, value2, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andOidPartnerNotBetween(String value1, String value2) {
            addCriterion("OID_PARTNER not between", value1, value2, "oidPartner");
            return (Criteria) this;
        }

        public Criteria andUserLoginIsNull() {
            addCriterion("USER_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIsNotNull() {
            addCriterion("USER_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginEqualTo(String value) {
            addCriterion("USER_LOGIN =", value, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginNotEqualTo(String value) {
            addCriterion("USER_LOGIN <>", value, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginGreaterThan(String value) {
            addCriterion("USER_LOGIN >", value, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN >=", value, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginLessThan(String value) {
            addCriterion("USER_LOGIN <", value, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginLessThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN <=", value, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginLike(String value) {
            addCriterion("USER_LOGIN like", value, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginNotLike(String value) {
            addCriterion("USER_LOGIN not like", value, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginIn(List<String> values) {
            addCriterion("USER_LOGIN in", values, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginNotIn(List<String> values) {
            addCriterion("USER_LOGIN not in", values, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginBetween(String value1, String value2) {
            addCriterion("USER_LOGIN between", value1, value2, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginNotBetween(String value1, String value2) {
            addCriterion("USER_LOGIN not between", value1, value2, "userLogin");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNull() {
            addCriterion("USERS_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("USERS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(Integer value) {
            addCriterion("USERS_ID =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(Integer value) {
            addCriterion("USERS_ID <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(Integer value) {
            addCriterion("USERS_ID >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERS_ID >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(Integer value) {
            addCriterion("USERS_ID <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(Integer value) {
            addCriterion("USERS_ID <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<Integer> values) {
            addCriterion("USERS_ID in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<Integer> values) {
            addCriterion("USERS_ID not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(Integer value1, Integer value2) {
            addCriterion("USERS_ID between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USERS_ID not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNull() {
            addCriterion("VERIFY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNotNull() {
            addCriterion("VERIFY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeEqualTo(String value) {
            addCriterion("VERIFY_CODE =", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotEqualTo(String value) {
            addCriterion("VERIFY_CODE <>", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThan(String value) {
            addCriterion("VERIFY_CODE >", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_CODE >=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThan(String value) {
            addCriterion("VERIFY_CODE <", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_CODE <=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLike(String value) {
            addCriterion("VERIFY_CODE like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotLike(String value) {
            addCriterion("VERIFY_CODE not like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIn(List<String> values) {
            addCriterion("VERIFY_CODE in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotIn(List<String> values) {
            addCriterion("VERIFY_CODE not in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeBetween(String value1, String value2) {
            addCriterion("VERIFY_CODE between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotBetween(String value1, String value2) {
            addCriterion("VERIFY_CODE not between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeIsNull() {
            addCriterion("NOTIFY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeIsNotNull() {
            addCriterion("NOTIFY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeEqualTo(String value) {
            addCriterion("NOTIFY_CODE =", value, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeNotEqualTo(String value) {
            addCriterion("NOTIFY_CODE <>", value, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeGreaterThan(String value) {
            addCriterion("NOTIFY_CODE >", value, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_CODE >=", value, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeLessThan(String value) {
            addCriterion("NOTIFY_CODE <", value, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_CODE <=", value, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeLike(String value) {
            addCriterion("NOTIFY_CODE like", value, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeNotLike(String value) {
            addCriterion("NOTIFY_CODE not like", value, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeIn(List<String> values) {
            addCriterion("NOTIFY_CODE in", values, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeNotIn(List<String> values) {
            addCriterion("NOTIFY_CODE not in", values, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeBetween(String value1, String value2) {
            addCriterion("NOTIFY_CODE between", value1, value2, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andNotifyCodeNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_CODE not between", value1, value2, "notifyCode");
            return (Criteria) this;
        }

        public Criteria andControlScodeIsNull() {
            addCriterion("CONTROL_SCODE is null");
            return (Criteria) this;
        }

        public Criteria andControlScodeIsNotNull() {
            addCriterion("CONTROL_SCODE is not null");
            return (Criteria) this;
        }

        public Criteria andControlScodeEqualTo(String value) {
            addCriterion("CONTROL_SCODE =", value, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlScodeNotEqualTo(String value) {
            addCriterion("CONTROL_SCODE <>", value, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlScodeGreaterThan(String value) {
            addCriterion("CONTROL_SCODE >", value, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlScodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTROL_SCODE >=", value, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlScodeLessThan(String value) {
            addCriterion("CONTROL_SCODE <", value, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlScodeLessThanOrEqualTo(String value) {
            addCriterion("CONTROL_SCODE <=", value, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlScodeLike(String value) {
            addCriterion("CONTROL_SCODE like", value, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlScodeNotLike(String value) {
            addCriterion("CONTROL_SCODE not like", value, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlScodeIn(List<String> values) {
            addCriterion("CONTROL_SCODE in", values, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlScodeNotIn(List<String> values) {
            addCriterion("CONTROL_SCODE not in", values, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlScodeBetween(String value1, String value2) {
            addCriterion("CONTROL_SCODE between", value1, value2, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlScodeNotBetween(String value1, String value2) {
            addCriterion("CONTROL_SCODE not between", value1, value2, "controlScode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeIsNull() {
            addCriterion("CONTROL_FCODE is null");
            return (Criteria) this;
        }

        public Criteria andControlFcodeIsNotNull() {
            addCriterion("CONTROL_FCODE is not null");
            return (Criteria) this;
        }

        public Criteria andControlFcodeEqualTo(String value) {
            addCriterion("CONTROL_FCODE =", value, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeNotEqualTo(String value) {
            addCriterion("CONTROL_FCODE <>", value, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeGreaterThan(String value) {
            addCriterion("CONTROL_FCODE >", value, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTROL_FCODE >=", value, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeLessThan(String value) {
            addCriterion("CONTROL_FCODE <", value, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeLessThanOrEqualTo(String value) {
            addCriterion("CONTROL_FCODE <=", value, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeLike(String value) {
            addCriterion("CONTROL_FCODE like", value, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeNotLike(String value) {
            addCriterion("CONTROL_FCODE not like", value, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeIn(List<String> values) {
            addCriterion("CONTROL_FCODE in", values, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeNotIn(List<String> values) {
            addCriterion("CONTROL_FCODE not in", values, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeBetween(String value1, String value2) {
            addCriterion("CONTROL_FCODE between", value1, value2, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andControlFcodeNotBetween(String value1, String value2) {
            addCriterion("CONTROL_FCODE not between", value1, value2, "controlFcode");
            return (Criteria) this;
        }

        public Criteria andMachineIdIsNull() {
            addCriterion("MACHINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMachineIdIsNotNull() {
            addCriterion("MACHINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMachineIdEqualTo(String value) {
            addCriterion("MACHINE_ID =", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotEqualTo(String value) {
            addCriterion("MACHINE_ID <>", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThan(String value) {
            addCriterion("MACHINE_ID >", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThanOrEqualTo(String value) {
            addCriterion("MACHINE_ID >=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThan(String value) {
            addCriterion("MACHINE_ID <", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThanOrEqualTo(String value) {
            addCriterion("MACHINE_ID <=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLike(String value) {
            addCriterion("MACHINE_ID like", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotLike(String value) {
            addCriterion("MACHINE_ID not like", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdIn(List<String> values) {
            addCriterion("MACHINE_ID in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotIn(List<String> values) {
            addCriterion("MACHINE_ID not in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdBetween(String value1, String value2) {
            addCriterion("MACHINE_ID between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotBetween(String value1, String value2) {
            addCriterion("MACHINE_ID not between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andIsAmlIsNull() {
            addCriterion("IS_AML is null");
            return (Criteria) this;
        }

        public Criteria andIsAmlIsNotNull() {
            addCriterion("IS_AML is not null");
            return (Criteria) this;
        }

        public Criteria andIsAmlEqualTo(Short value) {
            addCriterion("IS_AML =", value, "isAml");
            return (Criteria) this;
        }

        public Criteria andIsAmlNotEqualTo(Short value) {
            addCriterion("IS_AML <>", value, "isAml");
            return (Criteria) this;
        }

        public Criteria andIsAmlGreaterThan(Short value) {
            addCriterion("IS_AML >", value, "isAml");
            return (Criteria) this;
        }

        public Criteria andIsAmlGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_AML >=", value, "isAml");
            return (Criteria) this;
        }

        public Criteria andIsAmlLessThan(Short value) {
            addCriterion("IS_AML <", value, "isAml");
            return (Criteria) this;
        }

        public Criteria andIsAmlLessThanOrEqualTo(Short value) {
            addCriterion("IS_AML <=", value, "isAml");
            return (Criteria) this;
        }

        public Criteria andIsAmlIn(List<Short> values) {
            addCriterion("IS_AML in", values, "isAml");
            return (Criteria) this;
        }

        public Criteria andIsAmlNotIn(List<Short> values) {
            addCriterion("IS_AML not in", values, "isAml");
            return (Criteria) this;
        }

        public Criteria andIsAmlBetween(Short value1, Short value2) {
            addCriterion("IS_AML between", value1, value2, "isAml");
            return (Criteria) this;
        }

        public Criteria andIsAmlNotBetween(Short value1, Short value2) {
            addCriterion("IS_AML not between", value1, value2, "isAml");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNull() {
            addCriterion("OPER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNotNull() {
            addCriterion("OPER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperTimeEqualTo(Date value) {
            addCriterion("OPER_TIME =", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotEqualTo(Date value) {
            addCriterion("OPER_TIME <>", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThan(Date value) {
            addCriterion("OPER_TIME >", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPER_TIME >=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThan(Date value) {
            addCriterion("OPER_TIME <", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPER_TIME <=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeIn(List<Date> values) {
            addCriterion("OPER_TIME in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotIn(List<Date> values) {
            addCriterion("OPER_TIME not in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeBetween(Date value1, Date value2) {
            addCriterion("OPER_TIME between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPER_TIME not between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andTransIpIsNull() {
            addCriterion("TRANS_IP is null");
            return (Criteria) this;
        }

        public Criteria andTransIpIsNotNull() {
            addCriterion("TRANS_IP is not null");
            return (Criteria) this;
        }

        public Criteria andTransIpEqualTo(String value) {
            addCriterion("TRANS_IP =", value, "transIp");
            return (Criteria) this;
        }

        public Criteria andTransIpNotEqualTo(String value) {
            addCriterion("TRANS_IP <>", value, "transIp");
            return (Criteria) this;
        }

        public Criteria andTransIpGreaterThan(String value) {
            addCriterion("TRANS_IP >", value, "transIp");
            return (Criteria) this;
        }

        public Criteria andTransIpGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_IP >=", value, "transIp");
            return (Criteria) this;
        }

        public Criteria andTransIpLessThan(String value) {
            addCriterion("TRANS_IP <", value, "transIp");
            return (Criteria) this;
        }

        public Criteria andTransIpLessThanOrEqualTo(String value) {
            addCriterion("TRANS_IP <=", value, "transIp");
            return (Criteria) this;
        }

        public Criteria andTransIpLike(String value) {
            addCriterion("TRANS_IP like", value, "transIp");
            return (Criteria) this;
        }

        public Criteria andTransIpNotLike(String value) {
            addCriterion("TRANS_IP not like", value, "transIp");
            return (Criteria) this;
        }

        public Criteria andTransIpIn(List<String> values) {
            addCriterion("TRANS_IP in", values, "transIp");
            return (Criteria) this;
        }

        public Criteria andTransIpNotIn(List<String> values) {
            addCriterion("TRANS_IP not in", values, "transIp");
            return (Criteria) this;
        }

        public Criteria andTransIpBetween(String value1, String value2) {
            addCriterion("TRANS_IP between", value1, value2, "transIp");
            return (Criteria) this;
        }

        public Criteria andTransIpNotBetween(String value1, String value2) {
            addCriterion("TRANS_IP not between", value1, value2, "transIp");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNull() {
            addCriterion("TRADE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNotNull() {
            addCriterion("TRADE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusEqualTo(String value) {
            addCriterion("TRADE_STATUS =", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotEqualTo(String value) {
            addCriterion("TRADE_STATUS <>", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThan(String value) {
            addCriterion("TRADE_STATUS >", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_STATUS >=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThan(String value) {
            addCriterion("TRADE_STATUS <", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThanOrEqualTo(String value) {
            addCriterion("TRADE_STATUS <=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLike(String value) {
            addCriterion("TRADE_STATUS like", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotLike(String value) {
            addCriterion("TRADE_STATUS not like", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIn(List<String> values) {
            addCriterion("TRADE_STATUS in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotIn(List<String> values) {
            addCriterion("TRADE_STATUS not in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusBetween(String value1, String value2) {
            addCriterion("TRADE_STATUS between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotBetween(String value1, String value2) {
            addCriterion("TRADE_STATUS not between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionIsNull() {
            addCriterion("MOBILE_ATTRIBUTION is null");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionIsNotNull() {
            addCriterion("MOBILE_ATTRIBUTION is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionEqualTo(String value) {
            addCriterion("MOBILE_ATTRIBUTION =", value, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionNotEqualTo(String value) {
            addCriterion("MOBILE_ATTRIBUTION <>", value, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionGreaterThan(String value) {
            addCriterion("MOBILE_ATTRIBUTION >", value, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_ATTRIBUTION >=", value, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionLessThan(String value) {
            addCriterion("MOBILE_ATTRIBUTION <", value, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_ATTRIBUTION <=", value, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionLike(String value) {
            addCriterion("MOBILE_ATTRIBUTION like", value, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionNotLike(String value) {
            addCriterion("MOBILE_ATTRIBUTION not like", value, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionIn(List<String> values) {
            addCriterion("MOBILE_ATTRIBUTION in", values, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionNotIn(List<String> values) {
            addCriterion("MOBILE_ATTRIBUTION not in", values, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionBetween(String value1, String value2) {
            addCriterion("MOBILE_ATTRIBUTION between", value1, value2, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileAttributionNotBetween(String value1, String value2) {
            addCriterion("MOBILE_ATTRIBUTION not between", value1, value2, "mobileAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionIsNull() {
            addCriterion("IP_ATTRIBUTION is null");
            return (Criteria) this;
        }

        public Criteria andIpAttributionIsNotNull() {
            addCriterion("IP_ATTRIBUTION is not null");
            return (Criteria) this;
        }

        public Criteria andIpAttributionEqualTo(String value) {
            addCriterion("IP_ATTRIBUTION =", value, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionNotEqualTo(String value) {
            addCriterion("IP_ATTRIBUTION <>", value, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionGreaterThan(String value) {
            addCriterion("IP_ATTRIBUTION >", value, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ATTRIBUTION >=", value, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionLessThan(String value) {
            addCriterion("IP_ATTRIBUTION <", value, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionLessThanOrEqualTo(String value) {
            addCriterion("IP_ATTRIBUTION <=", value, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionLike(String value) {
            addCriterion("IP_ATTRIBUTION like", value, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionNotLike(String value) {
            addCriterion("IP_ATTRIBUTION not like", value, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionIn(List<String> values) {
            addCriterion("IP_ATTRIBUTION in", values, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionNotIn(List<String> values) {
            addCriterion("IP_ATTRIBUTION not in", values, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionBetween(String value1, String value2) {
            addCriterion("IP_ATTRIBUTION between", value1, value2, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andIpAttributionNotBetween(String value1, String value2) {
            addCriterion("IP_ATTRIBUTION not between", value1, value2, "ipAttribution");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("MAC is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("MAC is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("MAC =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("MAC <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("MAC >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("MAC >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("MAC <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("MAC <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("MAC like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("MAC not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("MAC in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("MAC not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("MAC between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("MAC not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIsNull() {
            addCriterion("DEVICE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIsNotNull() {
            addCriterion("DEVICE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumEqualTo(String value) {
            addCriterion("DEVICE_NUM =", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotEqualTo(String value) {
            addCriterion("DEVICE_NUM <>", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumGreaterThan(String value) {
            addCriterion("DEVICE_NUM >", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUM >=", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumLessThan(String value) {
            addCriterion("DEVICE_NUM <", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUM <=", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumLike(String value) {
            addCriterion("DEVICE_NUM like", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotLike(String value) {
            addCriterion("DEVICE_NUM not like", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIn(List<String> values) {
            addCriterion("DEVICE_NUM in", values, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotIn(List<String> values) {
            addCriterion("DEVICE_NUM not in", values, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumBetween(String value1, String value2) {
            addCriterion("DEVICE_NUM between", value1, value2, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotBetween(String value1, String value2) {
            addCriterion("DEVICE_NUM not between", value1, value2, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdIsNull() {
            addCriterion("MER_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdIsNotNull() {
            addCriterion("MER_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdEqualTo(String value) {
            addCriterion("MER_ORDER_ID =", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdNotEqualTo(String value) {
            addCriterion("MER_ORDER_ID <>", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdGreaterThan(String value) {
            addCriterion("MER_ORDER_ID >", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("MER_ORDER_ID >=", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdLessThan(String value) {
            addCriterion("MER_ORDER_ID <", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdLessThanOrEqualTo(String value) {
            addCriterion("MER_ORDER_ID <=", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdLike(String value) {
            addCriterion("MER_ORDER_ID like", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdNotLike(String value) {
            addCriterion("MER_ORDER_ID not like", value, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdIn(List<String> values) {
            addCriterion("MER_ORDER_ID in", values, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdNotIn(List<String> values) {
            addCriterion("MER_ORDER_ID not in", values, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdBetween(String value1, String value2) {
            addCriterion("MER_ORDER_ID between", value1, value2, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andMerOrderIdNotBetween(String value1, String value2) {
            addCriterion("MER_ORDER_ID not between", value1, value2, "merOrderId");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumIsNull() {
            addCriterion("DEPT_REQUEST_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumIsNotNull() {
            addCriterion("DEPT_REQUEST_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumEqualTo(String value) {
            addCriterion("DEPT_REQUEST_NUM =", value, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumNotEqualTo(String value) {
            addCriterion("DEPT_REQUEST_NUM <>", value, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumGreaterThan(String value) {
            addCriterion("DEPT_REQUEST_NUM >", value, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_REQUEST_NUM >=", value, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumLessThan(String value) {
            addCriterion("DEPT_REQUEST_NUM <", value, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumLessThanOrEqualTo(String value) {
            addCriterion("DEPT_REQUEST_NUM <=", value, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumLike(String value) {
            addCriterion("DEPT_REQUEST_NUM like", value, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumNotLike(String value) {
            addCriterion("DEPT_REQUEST_NUM not like", value, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumIn(List<String> values) {
            addCriterion("DEPT_REQUEST_NUM in", values, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumNotIn(List<String> values) {
            addCriterion("DEPT_REQUEST_NUM not in", values, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumBetween(String value1, String value2) {
            addCriterion("DEPT_REQUEST_NUM between", value1, value2, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andDeptRequestNumNotBetween(String value1, String value2) {
            addCriterion("DEPT_REQUEST_NUM not between", value1, value2, "deptRequestNum");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("REFUND_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("REFUND_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(Integer value) {
            addCriterion("REFUND_AMOUNT =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(Integer value) {
            addCriterion("REFUND_AMOUNT <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(Integer value) {
            addCriterion("REFUND_AMOUNT >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("REFUND_AMOUNT >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(Integer value) {
            addCriterion("REFUND_AMOUNT <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(Integer value) {
            addCriterion("REFUND_AMOUNT <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<Integer> values) {
            addCriterion("REFUND_AMOUNT in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<Integer> values) {
            addCriterion("REFUND_AMOUNT not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(Integer value1, Integer value2) {
            addCriterion("REFUND_AMOUNT between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("REFUND_AMOUNT not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundNumIsNull() {
            addCriterion("REFUND_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRefundNumIsNotNull() {
            addCriterion("REFUND_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRefundNumEqualTo(Integer value) {
            addCriterion("REFUND_NUM =", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumNotEqualTo(Integer value) {
            addCriterion("REFUND_NUM <>", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumGreaterThan(Integer value) {
            addCriterion("REFUND_NUM >", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("REFUND_NUM >=", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumLessThan(Integer value) {
            addCriterion("REFUND_NUM <", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumLessThanOrEqualTo(Integer value) {
            addCriterion("REFUND_NUM <=", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumIn(List<Integer> values) {
            addCriterion("REFUND_NUM in", values, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumNotIn(List<Integer> values) {
            addCriterion("REFUND_NUM not in", values, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumBetween(Integer value1, Integer value2) {
            addCriterion("REFUND_NUM between", value1, value2, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumNotBetween(Integer value1, Integer value2) {
            addCriterion("REFUND_NUM not between", value1, value2, "refundNum");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andRuleIdsIsNull() {
            addCriterion("RULE_IDS is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdsIsNotNull() {
            addCriterion("RULE_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdsEqualTo(String value) {
            addCriterion("RULE_IDS =", value, "ruleIds");
            return (Criteria) this;
        }

        public Criteria andRuleIdsNotEqualTo(String value) {
            addCriterion("RULE_IDS <>", value, "ruleIds");
            return (Criteria) this;
        }

        public Criteria andRuleIdsGreaterThan(String value) {
            addCriterion("RULE_IDS >", value, "ruleIds");
            return (Criteria) this;
        }

        public Criteria andRuleIdsGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_IDS >=", value, "ruleIds");
            return (Criteria) this;
        }

        public Criteria andRuleIdsLessThan(String value) {
            addCriterion("RULE_IDS <", value, "ruleIds");
            return (Criteria) this;
        }

        public Criteria andRuleIdsLessThanOrEqualTo(String value) {
            addCriterion("RULE_IDS <=", value, "ruleIds");
            return (Criteria) this;
        }

        public Criteria andRuleIdsLike(String value) {
            addCriterion("RULE_IDS like", value, "ruleIds");
            return (Criteria) this;
        }

        public Criteria andRuleIdsNotLike(String value) {
            addCriterion("RULE_IDS not like", value, "ruleIds");
            return (Criteria) this;
        }

        public Criteria andRuleIdsIn(List<String> values) {
            addCriterion("RULE_IDS in", values, "ruleIds");
            return (Criteria) this;
        }

        public Criteria andRuleIdsNotIn(List<String> values) {
            addCriterion("RULE_IDS not in", values, "ruleIds");
            return (Criteria) this;
        }

        public Criteria andRuleIdsBetween(String value1, String value2) {
            addCriterion("RULE_IDS between", value1, value2, "ruleIds");
            return (Criteria) this;
        }

        public Criteria andRuleIdsNotBetween(String value1, String value2) {
            addCriterion("RULE_IDS not between", value1, value2, "ruleIds");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andAcctIdLikeInsensitive(String value) {
            addCriterion("upper(ACCT_ID) like", value.toUpperCase(), "acctId");
            return this;
        }

        public Criteria andCommentsLikeInsensitive(String value) {
            addCriterion("upper(COMMENTS) like", value.toUpperCase(), "comments");
            return this;
        }

        public Criteria andBizCodeLikeInsensitive(String value) {
            addCriterion("upper(BIZ_CODE) like", value.toUpperCase(), "bizCode");
            return this;
        }

        public Criteria andTransIdLikeInsensitive(String value) {
            addCriterion("upper(TRANS_ID) like", value.toUpperCase(), "transId");
            return this;
        }

        public Criteria andUuidLikeInsensitive(String value) {
            addCriterion("upper(UUID) like", value.toUpperCase(), "uuid");
            return this;
        }

        public Criteria andBizCategoryLikeInsensitive(String value) {
            addCriterion("upper(BIZ_CATEGORY) like", value.toUpperCase(), "bizCategory");
            return this;
        }

        public Criteria andBankLikeInsensitive(String value) {
            addCriterion("upper(BANK) like", value.toUpperCase(), "bank");
            return this;
        }

        public Criteria andOidPartnerLikeInsensitive(String value) {
            addCriterion("upper(OID_PARTNER) like", value.toUpperCase(), "oidPartner");
            return this;
        }

        public Criteria andUserLoginLikeInsensitive(String value) {
            addCriterion("upper(USER_LOGIN) like", value.toUpperCase(), "userLogin");
            return this;
        }

        public Criteria andVerifyCodeLikeInsensitive(String value) {
            addCriterion("upper(VERIFY_CODE) like", value.toUpperCase(), "verifyCode");
            return this;
        }

        public Criteria andNotifyCodeLikeInsensitive(String value) {
            addCriterion("upper(NOTIFY_CODE) like", value.toUpperCase(), "notifyCode");
            return this;
        }

        public Criteria andControlScodeLikeInsensitive(String value) {
            addCriterion("upper(CONTROL_SCODE) like", value.toUpperCase(), "controlScode");
            return this;
        }

        public Criteria andControlFcodeLikeInsensitive(String value) {
            addCriterion("upper(CONTROL_FCODE) like", value.toUpperCase(), "controlFcode");
            return this;
        }

        public Criteria andMachineIdLikeInsensitive(String value) {
            addCriterion("upper(MACHINE_ID) like", value.toUpperCase(), "machineId");
            return this;
        }

        public Criteria andDeptIdLikeInsensitive(String value) {
            addCriterion("upper(DEPT_ID) like", value.toUpperCase(), "deptId");
            return this;
        }

        public Criteria andOperatorLikeInsensitive(String value) {
            addCriterion("upper(OPERATOR) like", value.toUpperCase(), "operator");
            return this;
        }

        public Criteria andTransIpLikeInsensitive(String value) {
            addCriterion("upper(TRANS_IP) like", value.toUpperCase(), "transIp");
            return this;
        }

        public Criteria andTradeStatusLikeInsensitive(String value) {
            addCriterion("upper(TRADE_STATUS) like", value.toUpperCase(), "tradeStatus");
            return this;
        }

        public Criteria andCurrencyLikeInsensitive(String value) {
            addCriterion("upper(CURRENCY) like", value.toUpperCase(), "currency");
            return this;
        }

        public Criteria andMobileAttributionLikeInsensitive(String value) {
            addCriterion("upper(MOBILE_ATTRIBUTION) like", value.toUpperCase(), "mobileAttribution");
            return this;
        }

        public Criteria andIpAttributionLikeInsensitive(String value) {
            addCriterion("upper(IP_ATTRIBUTION) like", value.toUpperCase(), "ipAttribution");
            return this;
        }

        public Criteria andMacLikeInsensitive(String value) {
            addCriterion("upper(MAC) like", value.toUpperCase(), "mac");
            return this;
        }

        public Criteria andDeviceNumLikeInsensitive(String value) {
            addCriterion("upper(DEVICE_NUM) like", value.toUpperCase(), "deviceNum");
            return this;
        }

        public Criteria andMerOrderIdLikeInsensitive(String value) {
            addCriterion("upper(MER_ORDER_ID) like", value.toUpperCase(), "merOrderId");
            return this;
        }

        public Criteria andDeptRequestNumLikeInsensitive(String value) {
            addCriterion("upper(DEPT_REQUEST_NUM) like", value.toUpperCase(), "deptRequestNum");
            return this;
        }

        public Criteria andProductIdLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_ID) like", value.toUpperCase(), "productId");
            return this;
        }

        public Criteria andRuleIdsLikeInsensitive(String value) {
            addCriterion("upper(RULE_IDS) like", value.toUpperCase(), "ruleIds");
            return this;
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