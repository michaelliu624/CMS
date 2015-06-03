package com.springmvc.cms.model;

/**
 * @Author Michael Liu
 * @Date 2015-06-02 12:55
 */
public class StudentApartment {

    private String id ;
    private String name ;
    private String apartment ;
    private String door_num ;
    private String person_num ;
    private String bed_num ;
    private String evaluate ;
    private String bad_record ;

    public String getId(){
        return id ;
    }

    public String getName(){
        return name ;
    }

    public String getApartment(){
        return apartment ;
    }

    public String getDoor_num(){
        return door_num ;
    }

    public String getPerson_num(){
        return person_num ;
    }

    public String getBed_num(){
        return bed_num ;
    }

    public String getEvaluate(){
        return evaluate ;
    }

    public String getBad_record(){
        return bad_record ;
    }



    public void setId(String id){
        this.id = id ;
    }

    public void setName(String name){
        this.name = name ;
    }

    public void setApartment(String apartment){
        this.apartment = apartment ;
    }

    public void setDoor_num(String door_num){
        this.door_num = door_num ;
    }

    public void setperson_num(String person_num){
        this.person_num = person_num ;
    }

    public void setBed_num(String bed_num){
        this.bed_num = bed_num ;
    }

    public void setEvaluate(String evaluate){
        this.evaluate = evaluate ;
    }

    public void setBad_record(String bad_record){
        this.bad_record = bad_record ;
    }

}
