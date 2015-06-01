package com.springmvc.cms.model;

/**
 * @Author Michael Liu
 * @Date 2015-05-30 16:21
 * 处理登录用户model 不光有学生 还有教师管理员等角色
 */
public class StudentLogin {

    private String id; //学号
    private String name; //姓名
    private String id_number; //身份证号
    private String passwd; //密码
    private String role; //班级
    private String permission; //权限



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

    public String getRole(){
        return role ;
    }

    public String getPermisson(){
        return permission ;
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

    public void setRole(String role){
        this.role = role ;
    }

    public void setPermisson(String permission){
        this.permission = permission ;
    }
}
