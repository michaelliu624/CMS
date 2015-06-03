package com.springmvc.cms.service;

import com.springmvc.cms.model.TeacherPermission;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-06-03 10:59
 */
public interface SelectTeacherService {

    List<TeacherPermission> find(String id);
}
