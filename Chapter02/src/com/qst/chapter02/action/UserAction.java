package com.qst.chapter02.action;

/**
 * Created by Ray on 2017/2/20.
 */
public class UserAction {
    private String userName;
    private String address;
    private String telephone;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String execute() throws Exception{
        if(userName.length() > 0 && address.equals("青岛")){
            return "success";
        }
        else {
            return "error";
        }
    }
}
