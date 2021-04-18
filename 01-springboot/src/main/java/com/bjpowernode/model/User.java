package com.bjpowernode.model;

/**
 * ClassName:User
 * Package:com.bjpowernode.model
 * Description:<br/>
 *
 * @date:2021/4/14 16:10
 * @author:dingzhengzheng
 */

public class User {
    private  String  name;
    private  String id;
    private Integer phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
