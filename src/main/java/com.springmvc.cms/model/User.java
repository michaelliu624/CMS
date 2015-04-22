package com.springmvc.cms.model;

/**
 * 用户表 测试
 * @Author Michael Liu
 * @Date 2015-04-22 19:39
 */
public class User {
    private String id;
    private String name;
    //private String nickname;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
/*    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }*/

}
