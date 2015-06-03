package com.springmvc.cms.model;

import java.sql.Date;
import java.text.SimpleDateFormat;

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
    private Date birthday; //生日
    private Date this_regis_time; //本学期注册时间
    private Date enrollment_time; //入学时间


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

    public String getBirthday(){
        String birth = new SimpleDateFormat("yyyy年MM月dd日").format(birthday) ;
        return birth ;
    }

    public String getThis_regis_time(){
        String regis_time = new SimpleDateFormat("yyyy年MM月dd日").format(this_regis_time) ;
        return regis_time ;
    }

    public String getEnrollment_time(){
        String enrollment = new SimpleDateFormat("yyyy年MM月dd日").format(enrollment_time) ;
        return enrollment ;
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

    public void setBirthday(Date birthday){
        this.birthday = birthday ;
    }

    public void setThis_regis_time(Date this_regis_time){
        this.this_regis_time = this_regis_time ;
    }

    public void setEnrollment_time(Date enrollment_time){
        this.enrollment_time = enrollment_time ;
    }

}
