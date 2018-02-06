package com.cloud.oauth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="xk_merchant")
public class XkMerchant {


  private Long id;

  private String loginName;

  private String loginPassword;
  private String tradePassword;
  private String merchantKey;
  private String merchantName;
  private String idCardNo;
  private String mobilePhone;
  private String email;
  private String contactQq;
  private Long accountStatus;
  private Double accountBalance;
  private Double lockBalance;
  private java.sql.Timestamp regeditDates;
  private String regeditIpAddress;
  private String regeditIpArea;
  private java.sql.Timestamp thisLoginDates;
  private String thisLoginIpAddress;
  private java.sql.Timestamp lastLoginDates;
  private String lastLoginIpAddress;
  private String cryptoguardQuestion;
  private String cryptoguardAnswer;
  private String bankAccount;
  private String bankAccountInfo;
  private String bankName;
  private Long accountLevel;
  private Long parentMerchantId;
  private Long maxLimit;
  private String realName;
  private String contract;
  private Long errortimes;
  private java.sql.Timestamp errordates;
  private String idimageA;
  private String idimageB;
  private String idimageC;
  private String idimageD;
  private String recommendedCode;
  private String recommendeder;
  private String upLevelId;
  private String merchantLevel;
  private String accountType;
  private String imgflag;

  @Id
  public Long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Column(name="LoginName")
  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  @Column(name="LoginPassword")
  public String getLoginPassword() {
    return loginPassword;
  }

  public void setLoginPassword(String loginPassword) {
    this.loginPassword = loginPassword;
  }


  public String getTradePassword() {
    return tradePassword;
  }

  public void setTradePassword(String tradePassword) {
    this.tradePassword = tradePassword;
  }


  public String getMerchantKey() {
    return merchantKey;
  }

  public void setMerchantKey(String merchantKey) {
    this.merchantKey = merchantKey;
  }


  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public String getIdCardNo() {
    return idCardNo;
  }

  public void setIdCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
  }


  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getContactQq() {
    return contactQq;
  }

  public void setContactQq(String contactQq) {
    this.contactQq = contactQq;
  }


  public long getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(long accountStatus) {
    this.accountStatus = accountStatus;
  }


  public Double getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(Double accountBalance) {
    this.accountBalance = accountBalance;
  }


  public Double getLockBalance() {
    return lockBalance;
  }

  public void setLockBalance(Double lockBalance) {
    this.lockBalance = lockBalance;
  }


  public java.sql.Timestamp getRegeditDates() {
    return regeditDates;
  }

  public void setRegeditDates(java.sql.Timestamp regeditDates) {
    this.regeditDates = regeditDates;
  }


  public String getRegeditIpAddress() {
    return regeditIpAddress;
  }

  public void setRegeditIpAddress(String regeditIpAddress) {
    this.regeditIpAddress = regeditIpAddress;
  }


  public String getRegeditIpArea() {
    return regeditIpArea;
  }

  public void setRegeditIpArea(String regeditIpArea) {
    this.regeditIpArea = regeditIpArea;
  }


  public java.sql.Timestamp getThisLoginDates() {
    return thisLoginDates;
  }

  public void setThisLoginDates(java.sql.Timestamp thisLoginDates) {
    this.thisLoginDates = thisLoginDates;
  }


  public String getThisLoginIpAddress() {
    return thisLoginIpAddress;
  }

  public void setThisLoginIpAddress(String thisLoginIpAddress) {
    this.thisLoginIpAddress = thisLoginIpAddress;
  }


  public java.sql.Timestamp getLastLoginDates() {
    return lastLoginDates;
  }

  public void setLastLoginDates(java.sql.Timestamp lastLoginDates) {
    this.lastLoginDates = lastLoginDates;
  }


  public String getLastLoginIpAddress() {
    return lastLoginIpAddress;
  }

  public void setLastLoginIpAddress(String lastLoginIpAddress) {
    this.lastLoginIpAddress = lastLoginIpAddress;
  }


  public String getCryptoguardQuestion() {
    return cryptoguardQuestion;
  }

  public void setCryptoguardQuestion(String cryptoguardQuestion) {
    this.cryptoguardQuestion = cryptoguardQuestion;
  }


  public String getCryptoguardAnswer() {
    return cryptoguardAnswer;
  }

  public void setCryptoguardAnswer(String cryptoguardAnswer) {
    this.cryptoguardAnswer = cryptoguardAnswer;
  }


  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }


  public String getBankAccountInfo() {
    return bankAccountInfo;
  }

  public void setBankAccountInfo(String bankAccountInfo) {
    this.bankAccountInfo = bankAccountInfo;
  }


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public Long getAccountLevel() {
    return accountLevel;
  }

  public void setAccountLevel(Long accountLevel) {
    this.accountLevel = accountLevel;
  }


  public Long getParentMerchantId() {
    return parentMerchantId;
  }

  public void setParentMerchantId(Long parentMerchantId) {
    this.parentMerchantId = parentMerchantId;
  }


  public Long getMaxLimit() {
    return maxLimit;
  }

  public void setMaxLimit(Long maxLimit) {
    this.maxLimit = maxLimit;
  }


  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }


  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }


  public long getErrortimes() {
    return errortimes;
  }

  public void setErrortimes(long errortimes) {
    this.errortimes = errortimes;
  }


  public java.sql.Timestamp getErrordates() {
    return errordates;
  }

  public void setErrordates(java.sql.Timestamp errordates) {
    this.errordates = errordates;
  }


  public String getIdimageA() {
    return idimageA;
  }

  public void setIdimageA(String idimageA) {
    this.idimageA = idimageA;
  }


  public String getIdimageB() {
    return idimageB;
  }

  public void setIdimageB(String idimageB) {
    this.idimageB = idimageB;
  }


  public String getIdimageC() {
    return idimageC;
  }

  public void setIdimageC(String idimageC) {
    this.idimageC = idimageC;
  }


  public String getIdimageD() {
    return idimageD;
  }

  public void setIdimageD(String idimageD) {
    this.idimageD = idimageD;
  }


  public String getRecommendedCode() {
    return recommendedCode;
  }

  public void setRecommendedCode(String recommendedCode) {
    this.recommendedCode = recommendedCode;
  }


  public String getRecommendeder() {
    return recommendeder;
  }

  public void setRecommendeder(String recommendeder) {
    this.recommendeder = recommendeder;
  }


  public String getUpLevelId() {
    return upLevelId;
  }

  public void setUpLevelId(String upLevelId) {
    this.upLevelId = upLevelId;
  }


  public String getMerchantLevel() {
    return merchantLevel;
  }

  public void setMerchantLevel(String merchantLevel) {
    this.merchantLevel = merchantLevel;
  }


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public String getImgflag() {
    return imgflag;
  }

  public void setImgflag(String imgflag) {
    this.imgflag = imgflag;
  }

}
