package com.springmvc.cms.mapper;

import com.springmvc.cms.model.Student;
import com.springmvc.cms.model.StudentLogin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-05-30 16:23
 */

@Repository( value = "studentLoginMapper")
public interface StudentLoginMapper {
    @Select(value = "${sql}")
    @Results(value = { @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "id_number", column = "id_number"),
            @Result(property = "passwd", column = "passwd"),
            @Result(property = "role", column = "role"),
            @Result(property = "permission", column = "permission")

    })
    List<StudentLogin> operateReturnBeans(@Param(value = "sql") String sql);
}
