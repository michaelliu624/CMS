package com.springmvc.cms.model;

/**
 * @Author Michael Liu
 * @Date 2015-05-27 16:44
 */
public class Student {

    private String id; //学号
    private String name; //姓名
    private String sex; //性别
    private String others; //其他
    private String academy; //学院
    private String major; //专业
    private String classes; //班级


    public String getId(){
        return id ;
    }

    public String getName(){
        return name ;
    }

    public String getSex(){
        return sex ;
    }

    public String getOthers(){
        return others ;
    }

    public String getAcademy(){
        return academy ;
    }

    public String getMajor(){
        return major ;
    }

    public String getClasses(){
        return classes ;
    }

    public void setId(String id){
        this.id = id ;
    }

    public void setName(String name){
        this.name = name ;
    }

    public void setSex(String sex){
        this.sex = sex ;
    }

    public void setOthers(String others){
        this.others = others ;
    }

    public void setAcademy(String academy){
        this.academy = academy ;
    }

    public void setMajor(String major){
        this.major = major ;
    }

    public void setClasses(String classes){
        this.classes = classes ;
    }

}
