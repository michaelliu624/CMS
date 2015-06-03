package com.springmvc.cms.mapper;

import com.springmvc.cms.model.StudentApartment;
import com.springmvc.cms.model.StudentBody;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-06-02 13:27
 */

@Repository( value = "selectStudentBodyMapper")
public interface SelectStudentBodyMapper {

    @Select(value = "${sql}")
    @Results(value = { @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "height", column = "height"),
            @Result(property = "weight", column = "weight"),
            @Result(property = "sight_left", column = "sight_left"),
            @Result(property = "sight_right", column = "sight_right"),
            @Result(property = "evaluate", column = "evaluate")

    })
    List<StudentBody> operateReturnBeans(@Param(value = "sql") String sql);
}
