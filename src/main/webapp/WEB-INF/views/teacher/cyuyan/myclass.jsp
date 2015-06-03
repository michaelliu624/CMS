<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 2015/4/30 0030
  Time: 16:10
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
                <h3 class="page-title" id="index-page-title">我的课程(C语言)</h3>

                <ul class="page-breadcrumb breadcrumb">
                    <li>
                        <i class="fa fa-home"></i>
                        <a href="<%=path%>/user/welcome_teacher">
                            首页
                        </a>
                        <i class="fa fa-angle-right"></i>
                        <a href="javascript:;">
                            我的课程(C语言)
                        </a>
                    </li>
                </ul>
                <!-- END PAGE TITLE & BREADCRUMB-->
            </div>
        </div>
        <!-- END PAGE HEADER-->

        <!-- BEGIN DASHBOARD STATS -->
        <div class="row">
            <div class="col-md-12">
                <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                C语言介绍
                <!-- END PAGE TITLE & BREADCRUMB-->
            </div>
        </div>

        <!-- END PORTLET-->
    </div>
    </div>


</body>
</html>
