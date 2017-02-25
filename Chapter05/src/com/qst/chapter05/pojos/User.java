package com.qst.chapter05.pojos;

import java.io.Serializable;

/**
 * Created by Ray on 2017/2/25.
 */
public class User implements Serializable {
    private Integer id;
    private String userName;
    private String userPwd;
    private Integer role;

    public User(){}

    public User(String userName, String userPwd, Integer role) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
