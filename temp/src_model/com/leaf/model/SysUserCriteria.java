package com.leaf.model;

import java.io.Serializable;
import java.util.List;

public class SysUserCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String id;

    protected String idMin;

    protected String idMax;

    protected List<String> idList;

    protected String userName;

    protected String userNameMin;

    protected String userNameMax;

    protected List<String> userNameList;

    protected String password;

    protected String passwordMin;

    protected String passwordMax;

    protected List<String> passwordList;

    protected String realName;

    protected String realNameMin;

    protected String realNameMax;

    protected List<String> realNameList;

    protected String department;

    protected String departmentMin;

    protected String departmentMax;

    protected List<String> departmentList;

    protected String departmentCode;

    protected String departmentCodeMin;

    protected String departmentCodeMax;

    protected List<String> departmentCodeList;

    protected String telephone;

    protected String telephoneMin;

    protected String telephoneMax;

    protected List<String> telephoneList;

    protected String officeTel;

    protected String officeTelMin;

    protected String officeTelMax;

    protected List<String> officeTelList;

    protected String station;

    protected String stationMin;

    protected String stationMax;

    protected List<String> stationList;

    protected String stationCode;

    protected String stationCodeMin;

    protected String stationCodeMax;

    protected List<String> stationCodeList;

    protected Integer status;

    protected Integer statusMin;

    protected Integer statusMax;

    protected List<Integer> statusList;

    protected String remark;

    protected String remarkMin;

    protected String remarkMax;

    protected List<String> remarkList;

    private static final long serialVersionUID = 1L;

    public SysUserCriteria() {
         
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getId() {
        return id;
    }

    public void setIdMin(String idMin) {
        this.idMin = idMin == null ? null : idMin.trim();
    }

    public String getIdMin() {
        return idMin;
    }

    public void setIdMax(String idMax) {
        this.idMax = idMax == null ? null : idMax.trim();
    }

    public String getIdMax() {
        return idMax;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserNameMin(String userNameMin) {
        this.userNameMin = userNameMin == null ? null : userNameMin.trim();
    }

    public String getUserNameMin() {
        return userNameMin;
    }

    public void setUserNameMax(String userNameMax) {
        this.userNameMax = userNameMax == null ? null : userNameMax.trim();
    }

    public String getUserNameMax() {
        return userNameMax;
    }

    public void setUserNameList(List<String> userNameList) {
        this.userNameList = userNameList;
    }

    public List<String> getUserNameList() {
        return userNameList;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPasswordMin(String passwordMin) {
        this.passwordMin = passwordMin == null ? null : passwordMin.trim();
    }

    public String getPasswordMin() {
        return passwordMin;
    }

    public void setPasswordMax(String passwordMax) {
        this.passwordMax = passwordMax == null ? null : passwordMax.trim();
    }

    public String getPasswordMax() {
        return passwordMax;
    }

    public void setPasswordList(List<String> passwordList) {
        this.passwordList = passwordList;
    }

    public List<String> getPasswordList() {
        return passwordList;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealNameMin(String realNameMin) {
        this.realNameMin = realNameMin == null ? null : realNameMin.trim();
    }

    public String getRealNameMin() {
        return realNameMin;
    }

    public void setRealNameMax(String realNameMax) {
        this.realNameMax = realNameMax == null ? null : realNameMax.trim();
    }

    public String getRealNameMax() {
        return realNameMax;
    }

    public void setRealNameList(List<String> realNameList) {
        this.realNameList = realNameList;
    }

    public List<String> getRealNameList() {
        return realNameList;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartmentMin(String departmentMin) {
        this.departmentMin = departmentMin == null ? null : departmentMin.trim();
    }

    public String getDepartmentMin() {
        return departmentMin;
    }

    public void setDepartmentMax(String departmentMax) {
        this.departmentMax = departmentMax == null ? null : departmentMax.trim();
    }

    public String getDepartmentMax() {
        return departmentMax;
    }

    public void setDepartmentList(List<String> departmentList) {
        this.departmentList = departmentList;
    }

    public List<String> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCodeMin(String departmentCodeMin) {
        this.departmentCodeMin = departmentCodeMin == null ? null : departmentCodeMin.trim();
    }

    public String getDepartmentCodeMin() {
        return departmentCodeMin;
    }

    public void setDepartmentCodeMax(String departmentCodeMax) {
        this.departmentCodeMax = departmentCodeMax == null ? null : departmentCodeMax.trim();
    }

    public String getDepartmentCodeMax() {
        return departmentCodeMax;
    }

    public void setDepartmentCodeList(List<String> departmentCodeList) {
        this.departmentCodeList = departmentCodeList;
    }

    public List<String> getDepartmentCodeList() {
        return departmentCodeList;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephoneMin(String telephoneMin) {
        this.telephoneMin = telephoneMin == null ? null : telephoneMin.trim();
    }

    public String getTelephoneMin() {
        return telephoneMin;
    }

    public void setTelephoneMax(String telephoneMax) {
        this.telephoneMax = telephoneMax == null ? null : telephoneMax.trim();
    }

    public String getTelephoneMax() {
        return telephoneMax;
    }

    public void setTelephoneList(List<String> telephoneList) {
        this.telephoneList = telephoneList;
    }

    public List<String> getTelephoneList() {
        return telephoneList;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel == null ? null : officeTel.trim();
    }

    public String getOfficeTel() {
        return officeTel;
    }

    public void setOfficeTelMin(String officeTelMin) {
        this.officeTelMin = officeTelMin == null ? null : officeTelMin.trim();
    }

    public String getOfficeTelMin() {
        return officeTelMin;
    }

    public void setOfficeTelMax(String officeTelMax) {
        this.officeTelMax = officeTelMax == null ? null : officeTelMax.trim();
    }

    public String getOfficeTelMax() {
        return officeTelMax;
    }

    public void setOfficeTelList(List<String> officeTelList) {
        this.officeTelList = officeTelList;
    }

    public List<String> getOfficeTelList() {
        return officeTelList;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    public String getStation() {
        return station;
    }

    public void setStationMin(String stationMin) {
        this.stationMin = stationMin == null ? null : stationMin.trim();
    }

    public String getStationMin() {
        return stationMin;
    }

    public void setStationMax(String stationMax) {
        this.stationMax = stationMax == null ? null : stationMax.trim();
    }

    public String getStationMax() {
        return stationMax;
    }

    public void setStationList(List<String> stationList) {
        this.stationList = stationList;
    }

    public List<String> getStationList() {
        return stationList;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode == null ? null : stationCode.trim();
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCodeMin(String stationCodeMin) {
        this.stationCodeMin = stationCodeMin == null ? null : stationCodeMin.trim();
    }

    public String getStationCodeMin() {
        return stationCodeMin;
    }

    public void setStationCodeMax(String stationCodeMax) {
        this.stationCodeMax = stationCodeMax == null ? null : stationCodeMax.trim();
    }

    public String getStationCodeMax() {
        return stationCodeMax;
    }

    public void setStationCodeList(List<String> stationCodeList) {
        this.stationCodeList = stationCodeList;
    }

    public List<String> getStationCodeList() {
        return stationCodeList;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatusMin(Integer statusMin) {
        this.statusMin = statusMin;
    }

    public Integer getStatusMin() {
        return statusMin;
    }

    public void setStatusMax(Integer statusMax) {
        this.statusMax = statusMax;
    }

    public Integer getStatusMax() {
        return statusMax;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
    }

    public List<Integer> getStatusList() {
        return statusList;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemarkMin(String remarkMin) {
        this.remarkMin = remarkMin == null ? null : remarkMin.trim();
    }

    public String getRemarkMin() {
        return remarkMin;
    }

    public void setRemarkMax(String remarkMax) {
        this.remarkMax = remarkMax == null ? null : remarkMax.trim();
    }

    public String getRemarkMax() {
        return remarkMax;
    }

    public void setRemarkList(List<String> remarkList) {
        this.remarkList = remarkList;
    }

    public List<String> getRemarkList() {
        return remarkList;
    }
}