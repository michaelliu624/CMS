package com.springmvc.cms.mapper;

import com.springmvc.cms.model.Student;
import com.springmvc.cms.model.StudentApartment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-06-02 13:07
 */

@Repository( value = "selectStudentApartmentMapper")
public interface SelectStudentApartmentMapper {

    @Select(value = "${sql}")
    @Results(value = { @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "apartment", column = "apartment"),
            @Result(property = "door_num", column = "door_num"),
            @Result(property = "person_num", column = "person_num"),
            @Result(property = "bed_num", column = "bed_num"),
            @Result(property = "evaluate", column = "evaluate"),
            @Result(property = "bad_record", column = "bad_record")

    })
    List<StudentApartment> operateReturnBeans(@Param(value = "sql") String sql);
}
