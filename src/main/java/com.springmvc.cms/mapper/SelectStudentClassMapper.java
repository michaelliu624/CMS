package com.springmvc.cms.mapper;

import com.springmvc.cms.model.AllSubject;
import com.springmvc.cms.model.StudentBody;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-06-02 16:55
 */

@Repository( value = "selectStudentClassMapper")
public interface SelectStudentClassMapper {

    @Select(value = "${sql}")
    @Results(value = { @Result(id = true, property = "id", column = "id"),
            @Result(property = "class_name", column = "class_name"),
            @Result(property = "class_teacher_id", column = "class_teacher_id"),
            @Result(property = "class_teacher_name", column = "class_teacher_name"),
            @Result(property = "class_student_id", column = "class_student_id"),
            @Result(property = "score_ordinary", column = "score_ordinary"),
            @Result(property = "score_exam", column = "score_exam"),
            @Result(property = "score_final", column = "score_final"),
            @Result(property = "class_score", column = "class_score"),
            @Result(property = "class_time", column = "class_time")

    })
    List<AllSubject> operateReturnBeans(@Param(value = "sql") String sql);
    @Insert(value = "${insert}")
    void operateInsertBeans(@Param(value = "insert") String insert);

    @Update(value = "${update}")
    void operateUpdateBeans(@Param(value = "update") String update);

    @Delete(value = "${delete}")
    void operateDeleteBeans(@Param(value = "delete") String delete);

}
