package com.supervise.medicare.pojo;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户资料
 */
@Entity
@Table(name = "user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -3267918083809259248L;

    /**
     * id
     */
    @Column(name = "id")
    @Id
    private Long id;

    /**
     *
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 第三方用户编号，用来同步第三方用户信息
     */
    @Column(name = "external_user_id")
    private String externalUserId;

    /**
     *
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 出生日期
     */
    @Column(name = "birth")
    private Date birth;

    /**
     * 性别
     */
    @Column(name = "gender")
    private Integer gender;

    /**
     * 身份证号码
     */
    @Column(name = "idcard")
    private String idcard;

    /**
     *
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 密码
     */
    @Column(name = "password")
    @JsonIgnore
    private String password;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
