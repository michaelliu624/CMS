package com.springmvc.cms.model;

/**
 * @Author Michael Liu
 * @Date 2015-06-02 12:56
 */
public class StudentBody {

    private String id; //学号
    private String name; //姓名
    private String sex; //性别
    private String height; //身高
    private String weight; //体重
    private String sight_left; //左眼视力
    private String sight_right; //右眼视力
    private String evaluate; //整体评价



    public String getId(){
        return id ;
    }

    public String getName(){
        return name ;
    }

    public String getSex(){
        return sex ;
    }

    public String getHeight(){
        return height ;
    }

    public String getWeight(){
        return weight ;
    }

    public String getSight_left(){
        return sight_left ;
    }

    public String getSight_right(){
        return sight_right ;
    }

    public String getEvaluate(){
        return evaluate ;
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

    public void setHeight(String height){
        this.height = height ;
    }

    public void setWeight(String weight){
        this.weight = weight ;
    }

    public void setSight_left(String sight_left){
        this.sight_left = sight_left ;
    }

    public void setSight_right(String sight_right){
        this.sight_right = sight_right ;
    }

    public void setEvaluate(String evaluate){
        this.evaluate = evaluate ;
    }


}
