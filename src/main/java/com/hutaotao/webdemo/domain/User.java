package com.hutaotao.webdemo.domain;

/**
 * @description:
 * @author:
 * @time: 2019/12/27 17:36
 **/

public class User {

    private int Id;
    private String userName;
    private String cellphone;
    private String password;
    private String email;
    private boolean adminFlag;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdminFlag() {
        return adminFlag;
    }

    public void setAdminFlag(boolean adminFlag) {
        this.adminFlag = adminFlag;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", cellPhone='" + cellphone + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", adminFlag=" + adminFlag +
                '}';
    }
}
