package com.springmvc.cms.model;

/**
 * @Author Michael Liu
 * @Date 2015-06-03 10:40
 */

public class TeacherPermission {

    private String id;
    private String name;
    private String permission;
    private String role;

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getPermission(){
        return permission;
    }

    public String getRole(){
        return role;
    }

    public void setId(String id){
        this.id = id ;
    }

    public void setName(String name){
        this.name = name ;
    }

    public void setPermission(String permission){
        this.permission = permission ;
    }

    public void setRole(String role){
        this.role = role ;
    }


}
