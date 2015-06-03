package com.springmvc.cms.controller;

import com.springmvc.cms.model.AllSubject;
import com.springmvc.cms.model.Student;
import com.springmvc.cms.model.StudentLogin;
import com.springmvc.cms.service.SelectStudentService;
import com.springmvc.cms.service.StudentLoginService;
import com.springmvc.cms.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 处理教职工各功能跳转
 * @Author Michael Liu
 * @Date 2015-06-03 13:24
 */

@Controller
@RequestMapping("/cyuyan")
public class TeacherCyuyanController {

    @Resource(name = "teacherService")
    private TeacherService teacherService;

    @Resource(name = "studentLoginService")
    private StudentLoginService studentLoginService;

    @RequestMapping(value = "/myclass")
    public ModelAndView myclass(HttpServletRequest request,HttpServletResponse response) throws Exception{

        //String id = request.getParameter("id");

        return new ModelAndView("teacher/cyuyan/myclass");
    }


    @RequestMapping(value = "/mystudent")
    public ModelAndView mystudent(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String class_teacher_id = request.getParameter("class_teacher_id");
        String table = "class_cyuyan";
        Map<String,Object> map = new HashMap<String, Object>();

        List<AllSubject> result = this.teacherService.selectAllStudent(class_teacher_id, table);
        map.put("result",result) ;
        return new ModelAndView("teacher/cyuyan/mystudent",map);
    }



    @RequestMapping(value = "/insertstudent")
    public ModelAndView insertstudent(HttpServletRequest request,HttpServletResponse response) throws Exception{

        //String id = request.getParameter("id");
        Map<String,Object> map = new HashMap<String, Object>();

        List<StudentLogin> result = this.studentLoginService.getStudentAll();
        map.put("result",result) ;
        return new ModelAndView("teacher/cyuyan/insertstudent",map);
    }

    @RequestMapping(value = "/insertsuccess")
    public ModelAndView insertsuccess(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String id = "1001";
        Map<String,String> map = new HashMap<String, String>();
        String table = "class_cyuyan";
        String class_name = "C语言";
        String class_teacher_id = "100001";
        String class_teacher_name = "刘老师";
        String class_student_id = request.getParameter("student_id");
        String class_time= "周一78";

        teacherService.insertStudent(id,table,class_name,class_teacher_id,class_teacher_name,class_student_id,class_time);
        map.put("student","添加新学生"+class_student_id+"成功！") ;
        return new ModelAndView("teacher/cyuyan/insertstudent",map);
    }

    @RequestMapping(value = "/updatestudent")
    public ModelAndView updatestudent(HttpServletRequest request,HttpServletResponse response) throws Exception{

        //String id = request.getParameter("id");
        String class_teacher_id = request.getParameter("class_teacher_id");
        String table = "class_cyuyan";
        Map<String,Object> map = new HashMap<String, Object>();

        List<AllSubject> result = this.teacherService.selectAllStudent(class_teacher_id, table);
        map.put("result",result) ;


        return new ModelAndView("teacher/cyuyan/updatestudent",map);
    }

    @RequestMapping(value = "/updatesuccess")
    public ModelAndView updatesuccess(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String student_id = request.getParameter("student_id");
        String table = "class_cyuyan";
        String id = request.getParameter("id");
        String class_name = request.getParameter("class_name");
        String class_teacher_id = request.getParameter("class_teacher_id");
        String class_teacher_name = request.getParameter("class_teacher_name");
        Map<String,Object> map = new HashMap<String, Object>();

        teacherService.updateStudent(id,table,class_name,class_teacher_id,class_teacher_name,student_id);
        map.put("student","添加新学生"+student_id+"成功！") ;

        return new ModelAndView("teacher/cyuyan/updatestudent",map);
    }

    @RequestMapping(value = "/dropstudent")
    public ModelAndView dropstudent(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String class_teacher_id = request.getParameter("class_teacher_id");
        String table = "class_cyuyan";
        Map<String,Object> map = new HashMap<String, Object>();

        List<AllSubject> result = this.teacherService.selectAllStudent(class_teacher_id, table);
        map.put("result",result) ;

        return new ModelAndView("teacher/cyuyan/dropstudent",map);
    }

    @RequestMapping(value = "/dropsuccess")
    public ModelAndView dropsuccess(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String student_id = request.getParameter("student_id");
        String table = "class_cyuyan";
        Map<String,Object> map = new HashMap<String, Object>();
        teacherService.dropStudent(student_id, table);
        map.put("student","删除学生"+student_id+"成功！") ;

        return new ModelAndView("teacher/cyuyan/dropstudent",map);
    }

    @RequestMapping(value = "/selectscore")
    public ModelAndView selectscore(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String class_teacher_id = request.getParameter("class_teacher_id");
        String table = "class_cyuyan";
        Map<String,Object> map = new HashMap<String, Object>();

        List<AllSubject> result = this.teacherService.selectAllStudent(class_teacher_id, table);
        map.put("result",result) ;
        return new ModelAndView("teacher/cyuyan/selectscore",map);
    }


    @RequestMapping(value = "/updatescore")
    public ModelAndView updatescore(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String class_teacher_id = request.getParameter("class_teacher_id");
        String table = "class_cyuyan";
        Map<String,Object> map = new HashMap<String, Object>();

        List<AllSubject> result = this.teacherService.selectAllStudent(class_teacher_id, table);
        map.put("result",result) ;
        return new ModelAndView("teacher/cyuyan/updatescore",map);
    }


    @RequestMapping(value = "/updatescoresuccess")
    public ModelAndView updatescoresuccess(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String student_id = request.getParameter("student_id");
        String table = "class_cyuyan";
        String score_ordinary = request.getParameter("score_ordinary");
        String score_exam = request.getParameter("score_exam");
        String score_final = request.getParameter("score_final");
        String class_score = request.getParameter("class_score");
        Map<String,Object> map = new HashMap<String, Object>();

        teacherService.updateScore(student_id, table, score_ordinary, score_exam, score_final, class_score);
        map.put("student","添加新学生"+student_id+"成功！") ;

        return new ModelAndView("teacher/cyuyan/updatestudent",map);
    }

}
