package com.cloud.oauth.model;

import javax.persistence.*;

@Entity
@Table(name="xk_merchantlog")
public class XkMerchantlog {

  private Long id;
  private String loginName;
  private Long merchantId;
  private Long logType;
  private String logDetail;
  private String logIpAddress;
  private java.sql.Timestamp logDates;
  private String fileUrl;
  private Long result;

  @Id
  @Column(name="id")
  @GeneratedValue(strategy= GenerationType.AUTO)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name="LoginName")
  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  @Column(name="MerchantId")
  public Long getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(Long merchantId) {
    this.merchantId = merchantId;
  }

  @Column(name="LogType")
  public Long getLogType() {
    return logType;
  }

  public void setLogType(Long logType) {
    this.logType = logType;
  }

  @Column(name="LogDetail")
  public String getLogDetail() {
    return logDetail;
  }

  public void setLogDetail(String logDetail) {
    this.logDetail = logDetail;
  }

  @Column(name="LogIpAddress")
  public String getLogIpAddress() {
    return logIpAddress;
  }

  public void setLogIpAddress(String logIpAddress) {
    this.logIpAddress = logIpAddress;
  }

  @Column(name="LogDates")
  public java.sql.Timestamp getLogDates() {
    return logDates;
  }

  public void setLogDates(java.sql.Timestamp logDates) {
    this.logDates = logDates;
  }

  @Column(name="FileUrl")
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  @Column(name="Result")
  public Long getResult() {
    return result;
  }

  public void setResult(Long result) {
    this.result = result;
  }

}
