package com.springmvc.cms.service.impl;

import com.springmvc.cms.mapper.SelectTeacherPermissionMapper;
import com.springmvc.cms.mapper.StudentLoginMapper;
import com.springmvc.cms.model.TeacherPermission;
import com.springmvc.cms.service.SelectTeacherService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-06-03 11:03
 */

@Repository(value = "selectTeacherService")
@Transactional
public class TeacherPermissionImpl implements SelectTeacherService {

    @Resource(name = "selectTeacherPermissionMapper")
    private SelectTeacherPermissionMapper selectTeacherPermissionMapper;

    @Override
    public List<TeacherPermission> find(String id) {
        String select_teacher_passwd_sql = "select * from teacher_permission where id='"+id+"'";
        return this.selectTeacherPermissionMapper.operateReturnBeans(select_teacher_passwd_sql) ;
    }
}
