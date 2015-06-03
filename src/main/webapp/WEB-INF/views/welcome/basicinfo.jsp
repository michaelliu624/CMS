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
    <script type="text/javascript" src="assets/scripts/style-table.js"></script>

</head>
<body>
<div class="row" id="pages">
    <div class="col-md-12">
        <div class="row">
            <div class="col-md-12">
                <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                <h3 class="page-title" id="index-page-title">基本信息</h3>

                <ul class="page-breadcrumb breadcrumb">
                    <li>
                        <i class="fa fa-home"></i>
                        <a href="<%=path%>/user/welcome_student">
                            首页
                        </a>
                        <i class="fa fa-angle-right"></i>
                        <a href="javascript:;">
                            基本信息
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
                <th scope="col" rowspan="1">项目</th>
                <th scope="col" colspan="1">个人信息</th>
            </tr>

            </thead>

            <c:forEach items="${result}" var="item">
                <tbody>
                <tr>
                    <th scope="row">学号</th>
                    <td>${item.id }</td>
                </tr>
                <tr>
                    <th scope="row">姓名</th>
                    <td>${item.name }</td>
                </tr>
                <tr>
                    <th scope="row">性别</th>
                    <td>${item.sex }</td>
                </tr>
                <tr>
                    <th scope="row">学院</th>
                    <td>${item.academy }</td>
                </tr>
                <tr>
                    <th scope="row">专业</th>
                    <td>${item.major } </td>
                </tr>
                <tr>
                    <th scope="row">班级</th>
                    <td>${item.classes }</td>
                </tr>
                <tr>
                    <th scope="row">生日</th>
                    <td>${item.birthday }</td>
                </tr>
                <tr>
                    <th scope="row">入学时间</th>
                    <td>${item.enrollment_time }</td>
                </tr>
                <tr>
                    <th scope="row">本学期注册时间</th>
                    <td>${item.this_regis_time }</td>
                </tr>

                </tbody>
            </c:forEach>
        </table>

        <!-- END PORTLET-->
    </div>
</div>


</body>
</html>

