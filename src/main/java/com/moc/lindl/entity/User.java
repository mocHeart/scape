package com.moc.lindl.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 个人简介
     */
    private String profile;

    /**
     * 头像地址
     */
    private String avatar;


    /**
     * 密码
     */
    private String password;

    /**
     * 是否在线
     */
    private String isOnline;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 上次登录时间
     */
    private Date lastLoginTime;

}