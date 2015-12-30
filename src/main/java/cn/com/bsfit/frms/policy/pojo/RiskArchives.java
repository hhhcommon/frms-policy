package cn.com.bsfit.frms.policy.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RiskArchives implements Serializable {
    private Long archivesId;

    private String acctId;

    private Short riskLevel;

    private Short status;

    private Long score;

    private String comments;

    private Date createTime;

    private Date updateTime;

    private String bizCode;

    private String transId;

    private BigDecimal transVol;

    private String uuid;

    private String bizCategory;

    private Long checkId;

    private Short dealWay;

    private Short controlStatus;

    private Short source;

    private Short checkStatus;

    private String bank;

    private String oidPartner;

    private String userLogin;

    private Integer usersId;

    private String verifyCode;

    private String notifyCode;

    private String controlScode;

    private String controlFcode;

    private String machineId;

    private Short isAml;

    private String deptId;

    private String operator;

    private Date operTime;

    private String transIp;

    private String tradeStatus;

    private String currency;

    private String mobileAttribution;

    private String ipAttribution;

    private String mac;

    private String deviceNum;

    private String merOrderId;

    private String deptRequestNum;

    private Integer refundAmount;

    private Integer refundNum;

    private String productId;

    private String ruleIds;

    private static final long serialVersionUID = 1L;

    public Long getArchivesId() {
        return archivesId;
    }

    public void setArchivesId(Long archivesId) {
        this.archivesId = archivesId;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId == null ? null : acctId.trim();
    }

    public Short getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Short riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public BigDecimal getTransVol() {
        return transVol;
    }

    public void setTransVol(BigDecimal transVol) {
        this.transVol = transVol;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getBizCategory() {
        return bizCategory;
    }

    public void setBizCategory(String bizCategory) {
        this.bizCategory = bizCategory == null ? null : bizCategory.trim();
    }

    public Long getCheckId() {
        return checkId;
    }

    public void setCheckId(Long checkId) {
        this.checkId = checkId;
    }

    public Short getDealWay() {
        return dealWay;
    }

    public void setDealWay(Short dealWay) {
        this.dealWay = dealWay;
    }

    public Short getControlStatus() {
        return controlStatus;
    }

    public void setControlStatus(Short controlStatus) {
        this.controlStatus = controlStatus;
    }

    public Short getSource() {
        return source;
    }

    public void setSource(Short source) {
        this.source = source;
    }

    public Short getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getOidPartner() {
        return oidPartner;
    }

    public void setOidPartner(String oidPartner) {
        this.oidPartner = oidPartner == null ? null : oidPartner.trim();
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin == null ? null : userLogin.trim();
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
    }

    public String getNotifyCode() {
        return notifyCode;
    }

    public void setNotifyCode(String notifyCode) {
        this.notifyCode = notifyCode == null ? null : notifyCode.trim();
    }

    public String getControlScode() {
        return controlScode;
    }

    public void setControlScode(String controlScode) {
        this.controlScode = controlScode == null ? null : controlScode.trim();
    }

    public String getControlFcode() {
        return controlFcode;
    }

    public void setControlFcode(String controlFcode) {
        this.controlFcode = controlFcode == null ? null : controlFcode.trim();
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId == null ? null : machineId.trim();
    }

    public Short getIsAml() {
        return isAml;
    }

    public void setIsAml(Short isAml) {
        this.isAml = isAml;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    public String getTransIp() {
        return transIp;
    }

    public void setTransIp(String transIp) {
        this.transIp = transIp == null ? null : transIp.trim();
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getMobileAttribution() {
        return mobileAttribution;
    }

    public void setMobileAttribution(String mobileAttribution) {
        this.mobileAttribution = mobileAttribution == null ? null : mobileAttribution.trim();
    }

    public String getIpAttribution() {
        return ipAttribution;
    }

    public void setIpAttribution(String ipAttribution) {
        this.ipAttribution = ipAttribution == null ? null : ipAttribution.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId == null ? null : merOrderId.trim();
    }

    public String getDeptRequestNum() {
        return deptRequestNum;
    }

    public void setDeptRequestNum(String deptRequestNum) {
        this.deptRequestNum = deptRequestNum == null ? null : deptRequestNum.trim();
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(Integer refundNum) {
        this.refundNum = refundNum;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds == null ? null : ruleIds.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RiskArchives other = (RiskArchives) that;
        return (this.getArchivesId() == null ? other.getArchivesId() == null : this.getArchivesId().equals(other.getArchivesId()))
            && (this.getAcctId() == null ? other.getAcctId() == null : this.getAcctId().equals(other.getAcctId()))
            && (this.getRiskLevel() == null ? other.getRiskLevel() == null : this.getRiskLevel().equals(other.getRiskLevel()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getBizCode() == null ? other.getBizCode() == null : this.getBizCode().equals(other.getBizCode()))
            && (this.getTransId() == null ? other.getTransId() == null : this.getTransId().equals(other.getTransId()))
            && (this.getTransVol() == null ? other.getTransVol() == null : this.getTransVol().equals(other.getTransVol()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getBizCategory() == null ? other.getBizCategory() == null : this.getBizCategory().equals(other.getBizCategory()))
            && (this.getCheckId() == null ? other.getCheckId() == null : this.getCheckId().equals(other.getCheckId()))
            && (this.getDealWay() == null ? other.getDealWay() == null : this.getDealWay().equals(other.getDealWay()))
            && (this.getControlStatus() == null ? other.getControlStatus() == null : this.getControlStatus().equals(other.getControlStatus()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getCheckStatus() == null ? other.getCheckStatus() == null : this.getCheckStatus().equals(other.getCheckStatus()))
            && (this.getBank() == null ? other.getBank() == null : this.getBank().equals(other.getBank()))
            && (this.getOidPartner() == null ? other.getOidPartner() == null : this.getOidPartner().equals(other.getOidPartner()))
            && (this.getUserLogin() == null ? other.getUserLogin() == null : this.getUserLogin().equals(other.getUserLogin()))
            && (this.getUsersId() == null ? other.getUsersId() == null : this.getUsersId().equals(other.getUsersId()))
            && (this.getVerifyCode() == null ? other.getVerifyCode() == null : this.getVerifyCode().equals(other.getVerifyCode()))
            && (this.getNotifyCode() == null ? other.getNotifyCode() == null : this.getNotifyCode().equals(other.getNotifyCode()))
            && (this.getControlScode() == null ? other.getControlScode() == null : this.getControlScode().equals(other.getControlScode()))
            && (this.getControlFcode() == null ? other.getControlFcode() == null : this.getControlFcode().equals(other.getControlFcode()))
            && (this.getMachineId() == null ? other.getMachineId() == null : this.getMachineId().equals(other.getMachineId()))
            && (this.getIsAml() == null ? other.getIsAml() == null : this.getIsAml().equals(other.getIsAml()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getOperTime() == null ? other.getOperTime() == null : this.getOperTime().equals(other.getOperTime()))
            && (this.getTransIp() == null ? other.getTransIp() == null : this.getTransIp().equals(other.getTransIp()))
            && (this.getTradeStatus() == null ? other.getTradeStatus() == null : this.getTradeStatus().equals(other.getTradeStatus()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getMobileAttribution() == null ? other.getMobileAttribution() == null : this.getMobileAttribution().equals(other.getMobileAttribution()))
            && (this.getIpAttribution() == null ? other.getIpAttribution() == null : this.getIpAttribution().equals(other.getIpAttribution()))
            && (this.getMac() == null ? other.getMac() == null : this.getMac().equals(other.getMac()))
            && (this.getDeviceNum() == null ? other.getDeviceNum() == null : this.getDeviceNum().equals(other.getDeviceNum()))
            && (this.getMerOrderId() == null ? other.getMerOrderId() == null : this.getMerOrderId().equals(other.getMerOrderId()))
            && (this.getDeptRequestNum() == null ? other.getDeptRequestNum() == null : this.getDeptRequestNum().equals(other.getDeptRequestNum()))
            && (this.getRefundAmount() == null ? other.getRefundAmount() == null : this.getRefundAmount().equals(other.getRefundAmount()))
            && (this.getRefundNum() == null ? other.getRefundNum() == null : this.getRefundNum().equals(other.getRefundNum()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getRuleIds() == null ? other.getRuleIds() == null : this.getRuleIds().equals(other.getRuleIds()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArchivesId() == null) ? 0 : getArchivesId().hashCode());
        result = prime * result + ((getAcctId() == null) ? 0 : getAcctId().hashCode());
        result = prime * result + ((getRiskLevel() == null) ? 0 : getRiskLevel().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getBizCode() == null) ? 0 : getBizCode().hashCode());
        result = prime * result + ((getTransId() == null) ? 0 : getTransId().hashCode());
        result = prime * result + ((getTransVol() == null) ? 0 : getTransVol().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getBizCategory() == null) ? 0 : getBizCategory().hashCode());
        result = prime * result + ((getCheckId() == null) ? 0 : getCheckId().hashCode());
        result = prime * result + ((getDealWay() == null) ? 0 : getDealWay().hashCode());
        result = prime * result + ((getControlStatus() == null) ? 0 : getControlStatus().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getCheckStatus() == null) ? 0 : getCheckStatus().hashCode());
        result = prime * result + ((getBank() == null) ? 0 : getBank().hashCode());
        result = prime * result + ((getOidPartner() == null) ? 0 : getOidPartner().hashCode());
        result = prime * result + ((getUserLogin() == null) ? 0 : getUserLogin().hashCode());
        result = prime * result + ((getUsersId() == null) ? 0 : getUsersId().hashCode());
        result = prime * result + ((getVerifyCode() == null) ? 0 : getVerifyCode().hashCode());
        result = prime * result + ((getNotifyCode() == null) ? 0 : getNotifyCode().hashCode());
        result = prime * result + ((getControlScode() == null) ? 0 : getControlScode().hashCode());
        result = prime * result + ((getControlFcode() == null) ? 0 : getControlFcode().hashCode());
        result = prime * result + ((getMachineId() == null) ? 0 : getMachineId().hashCode());
        result = prime * result + ((getIsAml() == null) ? 0 : getIsAml().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getOperTime() == null) ? 0 : getOperTime().hashCode());
        result = prime * result + ((getTransIp() == null) ? 0 : getTransIp().hashCode());
        result = prime * result + ((getTradeStatus() == null) ? 0 : getTradeStatus().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getMobileAttribution() == null) ? 0 : getMobileAttribution().hashCode());
        result = prime * result + ((getIpAttribution() == null) ? 0 : getIpAttribution().hashCode());
        result = prime * result + ((getMac() == null) ? 0 : getMac().hashCode());
        result = prime * result + ((getDeviceNum() == null) ? 0 : getDeviceNum().hashCode());
        result = prime * result + ((getMerOrderId() == null) ? 0 : getMerOrderId().hashCode());
        result = prime * result + ((getDeptRequestNum() == null) ? 0 : getDeptRequestNum().hashCode());
        result = prime * result + ((getRefundAmount() == null) ? 0 : getRefundAmount().hashCode());
        result = prime * result + ((getRefundNum() == null) ? 0 : getRefundNum().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getRuleIds() == null) ? 0 : getRuleIds().hashCode());
        return result;
    }
}