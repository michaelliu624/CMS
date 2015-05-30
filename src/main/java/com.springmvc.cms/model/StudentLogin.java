package com.springmvc.cms.model;

/**
 * @Author Michael Liu
 * @Date 2015-05-30 16:21
 */
public class StudentLogin {

    private String id; //学号
    private String name; //姓名
    private String id_number; //班级
    private String passwd; //班级


    public String getId(){
        return id ;
    }

    public String getName(){
        return name ;
    }

    public String getId_number(){
        return id_number ;
    }

    public String getPasswd(){
        return passwd ;
    }

    public void setId(String id){
        this.id = id ;
    }

    public void setName(String name){
        this.name = name ;
    }

    public void setId_number(String id_number){
        this.id_number = id_number ;
    }

    public void setPasswd(String passwd){
        this.passwd = passwd ;
    }
}
