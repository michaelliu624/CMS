package com.springmvc.cms.mapper;

import com.springmvc.cms.model.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-05-30 11:58
 */

@Repository( value = "selectStudentMapper")
public interface SelectStudentMapper {

    @Select(value = "${sql}")
    @Results(value = { @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "others", column = "others"),
            @Result(property = "major", column = "major"),
            @Result(property = "classes", column = "classes"),
            @Result(property = "academy", column = "academy") })
    List<Student> operateReturnBeans(@Param(value = "sql") String sql);
}
