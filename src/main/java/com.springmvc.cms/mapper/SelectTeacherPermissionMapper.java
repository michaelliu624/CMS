package com.springmvc.cms.mapper;

import com.springmvc.cms.model.Student;
import com.springmvc.cms.model.TeacherPermission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-06-03 10:57
 */

@Repository( value = "selectTeacherPermissionMapper")
public interface SelectTeacherPermissionMapper {

    @Select(value = "${sql}")
    @Results(value = { @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "permission", column = "permission"),
            @Result(property = "role", column = "role")
    })
    List<TeacherPermission> operateReturnBeans(@Param(value = "sql") String sql);
}
