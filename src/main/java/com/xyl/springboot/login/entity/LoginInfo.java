package com.xyl.springboot.login.entity;

import java.io.Serializable;

/**
 * 账号密码表(LoginInfo)实体类
 *
 * @author makejava
 * @since 2020-11-20 08:59:09
 */
public class LoginInfo implements Serializable {
    private static final long serialVersionUID = 151409869643681860L;
    /**
    * 账号
    */
    private String id;
    /**
    * 昵称
    */
    private String name;
    /**
    * 密码
    */
    private String password;
    /**
    * 备用
    */
    private String spare1;
    /**
    * 备用
    */
    private String spare2;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", spare1='" + spare1 + '\'' +
                ", spare2='" + spare2 + '\'' +
                '}';
    }
}