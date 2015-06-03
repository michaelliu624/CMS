<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 2015/6/3 0003
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%--
<div class="row">
    <div class="col-md-12">
        <!-- BEGIN PAGE TITLE & BREADCRUMB-->
        <h3 style="position:absolute; left:50px; top:0px; " class="page-title" id="index-page-title">Ajax+JQuery 测试，查看学生所有的课程${currUser}</h3>
    </div>
</div>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" media="screen" href="assets/css/css-table.css" />
    <script type="text/javascript" src="assets/scripts/jquery-1.2.6.min.js"></script>
    <script type="text/javascript" src="assets/scripts//style-table.js"></script>
</head>
<body>
<div class="row" id="pages">
    <div class="col-md-12">
        <div class="row">
            <div class="col-md-12">
                <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                <h3 class="page-title" id="index-page-title">我的学生</h3>

                <ul class="page-breadcrumb breadcrumb">
                    <li>
                        <i class="fa fa-home"></i>
                        <a href="<%=path%>/user/welcome_student">
                            首页
                        </a>
                        <i class="fa fa-angle-right"></i>
                        <a href="javascript:;">
                            我的学生
                        </a>
                    </li>
                </ul>
                <!-- END PAGE TITLE & BREADCRUMB-->
            </div>
        </div>
        <!-- END PAGE HEADER-->

        <!-- BEGIN DASHBOARD STATS -->
        <table id="travel" >
            <thead>
            <tr>
                <th scope="col" rowspan="2">学生学号</th>
                <%--<th scope="col" colspan="4">学分统计</th>--%>
            </tr>

            <tr>
                <th scope="col">课程名称</th>
                <th scope="col">课程ID</th>
                <th scope="col">教师名称</th>
                <th scope="col">教师ID</th>
                <th scope="col">上课时间</th>

            </tr>
            </thead>

            <c:forEach items="${result}" var="item">
                <tbody>
                <tr>
                    <th scope="row">${item.class_student_id }</th>
                    <td>${item.class_name }</td>
                    <td>${item.id }</td>
                    <td>${item.class_teacher_name }</td>
                    <td>${item.class_teacher_id }</td>
                    <td>${item.class_time }</td>
                </tr>

                </tbody>
            </c:forEach>
        </table>

        <!-- END PORTLET-->
    </div>
</div>


</body>
</html>