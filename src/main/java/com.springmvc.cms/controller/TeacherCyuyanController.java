package com.springmvc.cms.controller;

import com.springmvc.cms.model.AllSubject;
import com.springmvc.cms.model.Student;
import com.springmvc.cms.service.SelectStudentService;
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

   /* @RequestMapping(value = "/insertstudent")
    public ModelAndView insertstudent(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String id = request.getParameter("id");
        Map<String,Object> map = new HashMap<String, Object>();

        List<Student> result = this.teacherService.insertStudent(id);
        map.put("result",result) ;
        return new ModelAndView("teacher/cyuyan/insertstudent",map);
    }

    @RequestMapping(value = "/updatestudent")
    public ModelAndView updatestudent(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String id = request.getParameter("id");
        Map<String,Object> map = new HashMap<String, Object>();

        List<Student> result = this.teacherService.updateStudent(id);
        map.put("result",result) ;
        return new ModelAndView("teacher/cyuyan/updatestudent",map);
    }

    @RequestMapping(value = "/dropstudent")
    public ModelAndView dropstudent(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String id = request.getParameter("id");
        Map<String,Object> map = new HashMap<String, Object>();

        List<Student> result = this.teacherService.dropStudent(id);
        map.put("result",result) ;
        return new ModelAndView("teacher/cyuyan/dropstudent",map);
    }

    @RequestMapping(value = "/selectscore")
    public ModelAndView selectscore(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String id = request.getParameter("id");
        Map<String,Object> map = new HashMap<String, Object>();

        List<Student> result = this.teacherService.selectAllStudent(id);
        map.put("result",result) ;
        return new ModelAndView("teacher/cyuyan/selectscore",map);
    }


    @RequestMapping(value = "/updatescore")
    public ModelAndView updatescore(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String id = request.getParameter("id");
        Map<String,Object> map = new HashMap<String, Object>();

        List<Student> result = this.teacherService.updateScore(id);
        map.put("result",result) ;
        return new ModelAndView("teacher/cyuyan/updatescore",map);
    }
*/

}
