package com.springmvc.cms.model;

/**
 * @Author Michael Liu
 * @Date 2015-06-02 16:46
 */
public class AllSubject {

    private String id ;
    private String class_name ;
    private String class_teacher_id ;
    private String class_teacher_name ;
    private String class_student_id ;
    private String score_ordinary ;
    private String score_exam ;
    private String score_final ;
    private String class_score ;
    private String class_time ;

    public String getId(){
        return id ;
    }
    public String getClass_name(){
        return class_name ;
    }
    public String getClass_teacher_id(){
        return class_teacher_id ;
    }
    public String getClass_teacher_name(){
        return class_teacher_name ;
    }
    public String getClass_student_id(){
        return class_student_id ;
    }
    public String getScore_ordinary(){
        return score_ordinary ;
    }
    public String getScore_exam(){
        return score_exam ;
    }
    public String getScore_final(){
        return score_final ;
    }
    public String getClass_score(){
        return class_score ;
    }
    public String getClass_time(){
        return class_time ;
    }

    public void setId(String id){
        this.id = id ;
    }
    public void setClass_name(String class_name){
        this.class_name = class_name ;
    }
    public void setClass_teacher_id(String class_teacher_id){
        this.class_teacher_id = class_teacher_id ;
    }
    public void setClass_teacher_name(String class_teacher_name){
        this.class_teacher_name = class_teacher_name ;
    }
    public void setClass_student_id(String class_student_id){
        this.class_student_id = class_student_id ;
    }
    public void setScore_ordinary(String score_ordinary){
        this.score_ordinary = score_ordinary ;
    }
    public void setScore_exam(String score_exam){
        this.score_exam = score_exam ;
    }
    public void setScore_final(String score_final){
        this.score_final = score_final ;
    }
    public void setClass_score(String class_score){
        this.class_score = class_score ;
    }
    public void setClass_time(String class_time){
        this.class_time = class_time ;
    }



}
