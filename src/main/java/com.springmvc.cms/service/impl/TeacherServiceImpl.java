package com.springmvc.cms.service.impl;

import com.springmvc.cms.mapper.SelectStudentClassMapper;
import com.springmvc.cms.model.AllSubject;
import com.springmvc.cms.service.TeacherService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-06-03 14:43
 */

@Repository(value = "teacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService{


    @Resource(name = "selectStudentClassMapper")
    private SelectStudentClassMapper selectStudentClassMapper;

    @Override
    public List<AllSubject> selectAllStudent(String id,String table) {
        String select_student_sql = "select * from "+ table +" where class_teacher_id ='"+id+"'";
        return this.selectStudentClassMapper.operateReturnBeans(select_student_sql) ;
    }

    @Override
    public void insertStudent(String id, String table, String class_name, String class_teacher_id, String class_teacher_name, String class_student_id,String class_time) {
        String insert_student_sql="insert into "+ table +"(id,class_name,class_teacher_id,class_teacher_name,class_student_id,class_time) values ('"+id+"','"+class_name+"','"+class_teacher_id+"','"+class_teacher_name+"','"+class_student_id+"','"+class_time+"')";
        this.selectStudentClassMapper.operateInsertBeans(insert_student_sql) ;
    }

    @Override
    public void updateStudent(String id, String table, String class_name, String class_teacher_id, String class_teacher_name, String class_student_id) {

        StringBuilder stringBuilder = new StringBuilder();
        if(id != null){
            stringBuilder.append(" id='"+id+"' ") ;
        }else if(class_name != null){
            stringBuilder.append(" class_name='"+class_name+"' ") ;
        }else if(class_teacher_id != null){
            stringBuilder.append(" class_teacher_id='"+class_teacher_id+"' ") ;
        }else if(class_teacher_name != null){
            stringBuilder.append(" class_teacher_name='"+class_teacher_name+"' ") ;
        }
        String update_student_sql="update "+table+" set "+stringBuilder.toString()+" where class_student_id='"+class_student_id+"'";
        this.selectStudentClassMapper.operateInsertBeans(update_student_sql) ;

    }

    @Override
    public void dropStudent(String class_student_id, String table) {
        String drop_student_sql="delete from '"+table+"' where class_student_id='"+class_student_id+"'";
        this.selectStudentClassMapper.operateInsertBeans(drop_student_sql) ;
    }

    @Override
    public void updateScore(String class_student_id, String table,String score_ordinary,String score_exam,String score_final,String class_score) {
        StringBuilder stringBuilder = new StringBuilder();
        if(score_ordinary != null){
            stringBuilder.append(" score_ordinary='"+score_ordinary+"' ") ;
        }else if(score_exam != null){
            stringBuilder.append(" score_exam='"+score_exam+"' ") ;
        }else if(score_final != null){
            stringBuilder.append(" score_final='"+score_final+"' ") ;
        }else if(class_score != null){
            stringBuilder.append(" class_score='"+class_score+"' ") ;
        }
        String update_score_sql="update "+table+" set "+stringBuilder.toString()+" where class_student_id='"+class_student_id+"'";
        this.selectStudentClassMapper.operateInsertBeans(update_score_sql) ;
    }

}
