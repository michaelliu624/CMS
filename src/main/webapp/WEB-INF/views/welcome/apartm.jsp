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
                <h3 class="page-title" id="index-page-title">宿舍信息</h3>

                <ul class="page-breadcrumb breadcrumb">
                    <li>
                        <i class="fa fa-home"></i>
                        <a href="<%=path%>/user/welcome_student">
                            首页
                        </a>
                        <i class="fa fa-angle-right"></i>
                        <a href="javascript:;">
                            宿舍信息
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
                <th scope="col" colspan="1">宿舍信息</th>
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
                    <th scope="row">公寓</th>
                    <td>${item.apartment }</td>
                </tr>
                <tr>
                    <th scope="row">宿舍号</th>
                    <td>${item.door_num } </td>
                </tr>
                <tr>
                    <th scope="row">宿舍人数</th>
                    <td>${item.person_num } 人</td>
                </tr>
                <tr>
                    <th scope="row">床位号</th>
                    <td>${item.bed_num }</td>
                </tr>
                <tr>
                    <th scope="row">宿舍评价</th>
                    <td>${item.evaluate }</td>
                </tr>
                <tr>
                    <th scope="row">不良记录</th>
                    <td>${item.bad_record }</td>
                </tr>

                </tbody>
            </c:forEach>
        </table>

        <!-- END PORTLET-->
    </div>
</div>


</body>
</html>