package com.hua.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/26.
 */
public class User {
    private Integer id;
    private String name;
    private String pwd;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date date_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_time() {
        return date_time;
    }

    public void setDate_time(Date date_time) {
        this.date_time = date_time;
    }

    public String getPwd() {

        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
