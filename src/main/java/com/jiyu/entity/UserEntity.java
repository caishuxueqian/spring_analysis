package com.jiyu.entity;

public class UserEntity {
    private String userName;
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public UserEntity(String userName, Integer userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public UserEntity() {
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
