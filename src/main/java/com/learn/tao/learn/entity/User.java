package com.learn.tao.learn.entity;


public class User {

    private Long id;
    private String userName;


    private Long auth;
    private String password;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp lastLogin;

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuth(Long auth) {
        this.auth = auth;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Long getId() {
        return id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public java.sql.Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.createTime = createTime;
    }


    public java.sql.Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(java.sql.Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

}
