package com.leaf.model;

import java.io.Serializable;

/**
 * sys_user
 */
public class SysUser implements Serializable {
    /**
     * ç”¨æˆ·id
     */
    public static final String ID = "id";

    /**
     * ç”¨æˆ·id
     */
    private String id;

    /**
     * ç”¨æˆ·å��
     */
    public static final String USERNAME = "userName";

    /**
     * ç”¨æˆ·å��
     */
    private String userName;

    /**
     * å¯†ç �
     */
    public static final String PASSWORD = "password";

    /**
     * å¯†ç �
     */
    private String password;

    /**
     * å§“å��
     */
    public static final String REALNAME = "realName";

    /**
     * å§“å��
     */
    private String realName;

    /**
     * éƒ¨é—¨
     */
    public static final String DEPARTMENT = "department";

    /**
     * éƒ¨é—¨
     */
    private String department;

    /**
     * éƒ¨é—¨code
     */
    public static final String DEPARTMENTCODE = "departmentCode";

    /**
     * éƒ¨é—¨code
     */
    private String departmentCode;

    /**
     * æ‰‹æœº
     */
    public static final String TELEPHONE = "telephone";

    /**
     * æ‰‹æœº
     */
    private String telephone;

    /**
     * åŠžå…¬å®¤ç”µè¯�
     */
    public static final String OFFICETEL = "officeTel";

    /**
     * åŠžå…¬å®¤ç”µè¯�
     */
    private String officeTel;

    /**
     * æ‰€
     */
    public static final String STATION = "station";

    /**
     * æ‰€
     */
    private String station;

    /**
     * æ‰€code
     */
    public static final String STATIONCODE = "stationCode";

    /**
     * æ‰€code
     */
    private String stationCode;

    /**
     * çŠ¶æ€�
     */
    public static final String STATUS = "status";

    /**
     * çŠ¶æ€�
     */
    private Integer status;

    /**
     * å¤‡æ³¨
     */
    public static final String REMARK = "remark";

    /**
     * å¤‡æ³¨
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     *         ç”¨æˆ·id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *         ç”¨æˆ·id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return userName
     *         ç”¨æˆ·å��
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     *         ç”¨æˆ·å��
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return password
     *         å¯†ç �
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *         å¯†ç �
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return realName
     *         å§“å��
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     *         å§“å��
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * @return department
     *         éƒ¨é—¨
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     *         éƒ¨é—¨
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * @return departmentCode
     *         éƒ¨é—¨code
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * @param departmentCode
     *         éƒ¨é—¨code
     */
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }

    /**
     * @return telephone
     *         æ‰‹æœº
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     *         æ‰‹æœº
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * @return officeTel
     *         åŠžå…¬å®¤ç”µè¯�
     */
    public String getOfficeTel() {
        return officeTel;
    }

    /**
     * @param officeTel
     *         åŠžå…¬å®¤ç”µè¯�
     */
    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel == null ? null : officeTel.trim();
    }

    /**
     * @return station
     *         æ‰€
     */
    public String getStation() {
        return station;
    }

    /**
     * @param station
     *         æ‰€
     */
    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    /**
     * @return stationCode
     *         æ‰€code
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * @param stationCode
     *         æ‰€code
     */
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode == null ? null : stationCode.trim();
    }

    /**
     * @return status
     *         çŠ¶æ€�
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     *         çŠ¶æ€�
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return remark
     *         å¤‡æ³¨
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     *         å¤‡æ³¨
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}