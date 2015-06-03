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
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
    <script>
        function newPage(act){
            var url = act;
            var data = {type:1};
            $.ajax({
                type : "get",
                async : false,  //同步请求
                url : url,
                data : data,
                timeout:1000,
                success:function(dates){
                    //alert(dates);
                    $("#pages").html(dates);//要刷新的div
                },
                error: function() {
                     alert("失败，请稍后再试！");
                }
            });
        };
    </script>
    <base href="<%=basePath%>">
    <meta charset="utf-8" />
    <title>CMS</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />
    <meta name="MobileOptimized" content="320">

    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
    <!-- END GLOBAL MANDATORY STYLES -->

    <!-- BEGIN THEME STYLES -->
    <link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/style.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/plugins.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/pages/tasks.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color" />
    <link href="assets/css/custom.css" rel="stylesheet" type="text/css" />
    <!-- END THEME STYLES -->

    <link rel="shortcut icon" href="app/img/favicon.ico" />
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="page-header-fixed">
<!-- BEGIN HEADER -->
<div class="header navbar navbar-inverse navbar-fixed-top">
    <!-- BEGIN TOP NAVIGATION BAR -->
    <div class="header-inner">
        <!-- BEGIN LOGO -->
        <a class="navbar-brand" href="javascript:;">
            <img src="assets/img/logo.png" alt="logo" class="img-responsive" />
        </a>
        <!-- END LOGO -->
        <!-- BEGIN RESPONSIVE MENU TOGGLER -->
        <a href="javascript:;" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <img
                    src="assets/img/menu-toggler.png" alt="" />
        </a>
        <!-- END RESPONSIVE MENU TOGGLER -->
        <!-- BEGIN TOP NAVIGATION MENU -->
        <ul class="nav navbar-nav pull-right">
            <li class="dropdown user">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                    <img alt="" src="assets/img/avatar1_small.jpg"/>
                    <span class="username"> ${teacher_name} </span>
                    <i class="fa fa-angle-down"></i>
                </a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="javascript:;" id="trigger_fullscreen">
                            <i class="fa fa-move"></i> 全屏
                        </a>
                    </li>
                    <%--<li>
                        <a href="extra_lock.html">
                            <i class="fa fa-lock"></i> 锁屏
                        </a>
                    </li>--%>
                    <li>
                        <a href="rest/logout">
                            <i class="fa fa-key"></i> 退出
                        </a>
                    </li>
                </ul>
            </li>
            <!-- END USER LOGIN DROPDOWN -->
        </ul>
        <!-- END TOP NAVIGATION MENU -->
    </div>
    <!-- END TOP NAVIGATION BAR -->
</div>
<!-- END HEADER -->
<div class="clearfix"></div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
    <!-- BEGIN SIDEBAR -->
    <div class="page-sidebar-wrapper">
        <div class="page-sidebar navbar-collapse collapse">
            <!-- BEGIN SIDEBAR MENU -->
            <ul class="page-sidebar-menu" id="page-sidebar-menu">
                <li class="sidebar-toggler-wrapper">
                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                    <div class="sidebar-toggler hidden-phone"></div>
                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                </li>

                <li class="start active">
                    <a href="javascript:;" id="btn-dashboard">
                        <i class="fa fa-home"></i><span class="title"> 首页 </span><span
                            class="selected"> </span>
                    </a>
                    <ul class="sub-menu">

                        <li>
                            <shiro:hasPermission name="teacher:cyuyan">
                                <a href="javascript:;" onclick="newPage('<%=path%>/cyuyan/myclass?id=${currUser}')" ;>
                                    我的课程(C语言)
                                </a>
                            </shiro:hasPermission>
                        </li>
                        <li>
                            <shiro:hasPermission name="teacher:cyuyan">
                                <a href="javascript:;" onclick="newPage('<%=path%>/cyuyan/mystudent?class_teacher_id=${currUser}')" ;>
                                    我的学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:cyuyan">
                                <a href="<%=request.getContextPath()%>/cyuyan/insertstudent">
                                    添加学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:cyuyan">
                                <a href="<%=request.getContextPath()%>/cyuyan/updatestudent">
                                    修改学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:cyuyan">
                                <a href="<%=request.getContextPath()%>/cyuyan/dropstudent">
                                    删除学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:cyuyan">
                                <a href="<%=request.getContextPath()%>/cyuyan/selectscore">
                                    查看成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <%--<li>
                            <shiro:hasPermission name="teacher:cyuyan">
                                <a href="<%=request.getContextPath()%>/cyuyan/insertsscore">
                                    添加成绩
                                </a>
                            </shiro:hasPermission>
                        </li>--%>

                        <li>
                            <shiro:hasPermission name="teacher:cyuyan">
                                <a href="<%=request.getContextPath()%>/cyuyan/updatescore">
                                    修改成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                       <%-- <li>
                            <shiro:hasPermission name="teacher:cyuyan">
                                <a href="<%=request.getContextPath()%>/cyuyan/dropscore">
                                    删除成绩
                                </a>
                            </shiro:hasPermission>
                        </li>--%>



                        <li>
                            <shiro:hasPermission name="teacher:tiyu">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的课程(大学体育)
                                </a>
                            </shiro:hasPermission>
                        </li>
                        <li>
                            <shiro:hasPermission name="teacher:tiyu">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:tiyu">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:tiyu">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:tiyu">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    查看成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:tiyu">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:tiyu">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dangdaixiaoshuo">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的课程(当代小说)
                                </a>
                            </shiro:hasPermission>
                        </li>
                        <li>
                            <shiro:hasPermission name="teacher:dangdaixiaoshuo">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dangdaixiaoshuo">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dangdaixiaoshuo">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dangdaixiaoshuo">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    查看成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dangdaixiaoshuo">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dangdaixiaoshuo">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dianlufenxi">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的课程(电路分析)
                                </a>
                            </shiro:hasPermission>
                        </li>
                        <li>
                            <shiro:hasPermission name="teacher:dianlufenxi">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dianlufenxi">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dianlufenxi">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dianlufenxi">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    查看成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dianlufenxi">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:dianlufenxi">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改成绩
                                </a>
                            </shiro:hasPermission>
                        </li>


                        <li>
                            <shiro:hasPermission name="teacher:english">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的课程(大学英语)
                                </a>
                            </shiro:hasPermission>
                        </li>
                        <li>
                            <shiro:hasPermission name="teacher:english">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:english">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:english">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:english">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    查看成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:english">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:english">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改成绩
                                </a>
                            </shiro:hasPermission>
                        </li>


                        <li>
                            <shiro:hasPermission name="teacher:music">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的课程(基本乐理）
                                </a>
                            </shiro:hasPermission>
                        </li>
                        <li>
                            <shiro:hasPermission name="teacher:music">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:music">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:music">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:music">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    查看成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:music">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:music">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改成绩
                                </a>
                            </shiro:hasPermission>
                        </li>


                        <li>
                            <shiro:hasPermission name="teacher:math">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的课程(高等数学)
                                </a>
                            </shiro:hasPermission>
                        </li>
                        <li>
                            <shiro:hasPermission name="teacher:math">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:math">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:math">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:math">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    查看成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:math">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:math">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改成绩
                                </a>
                            </shiro:hasPermission>
                        </li>


                        <li>
                            <shiro:hasPermission name="teacher:pe">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的课程(大学体育)
                                </a>
                            </shiro:hasPermission>
                        </li>
                        <li>
                            <shiro:hasPermission name="teacher:pe">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:pe">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:pe">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:pe">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    查看成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:pe">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:pe">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改成绩
                                </a>
                            </shiro:hasPermission>
                        </li>


                        <li>
                            <shiro:hasPermission name="teacher:tongyuan">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的课程(通信原理)
                                </a>
                            </shiro:hasPermission>
                        </li>
                        <li>
                            <shiro:hasPermission name="teacher:tongyuan">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:tongyuan">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:tongyuan">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:tongyuan">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    查看成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:tongyuan">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:tongyuan">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改成绩
                                </a>
                            </shiro:hasPermission>
                        </li>


                        <li>
                            <shiro:hasPermission name="teacher:xingshizhengce">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的课程(形势与政策)
                                </a>
                            </shiro:hasPermission>
                        </li>
                        <li>
                            <shiro:hasPermission name="teacher:xingshizhengce">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    我的学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:xingshizhengce">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:xingshizhengce">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改学生
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:xingshizhengce">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    查看成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:xingshizhengce">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    添加成绩
                                </a>
                            </shiro:hasPermission>
                        </li>

                        <li>
                            <shiro:hasPermission name="teacher:xingshizhengce">
                                <a href="<%=request.getContextPath()%>/user/welcome_admin">
                                    修改成绩
                                </a>
                            </shiro:hasPermission>
                        </li>


                    </ul>
                </li>

                <shiro:hasPermission name="admin:manage">
                <li class="">
                    <a href="javascript:;">
                        <i class="fa fa-gears"></i><span class="title"> 系统管理 </span><span
                            class="arrow "> </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="javascript:;">
                                用户管理
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                角色管理
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                权限管理
                            </a>
                        </li>
                    </ul>
                </li>
                </shiro:hasPermission>

                <shiro:hasPermission name="teacher:tongxin11_1">
                    <li class="">
                        <a href="javascript:;">
                            <i class="fa fa-gears"></i><span class="title"> 查看班级学生信息 </span><span
                                class="arrow "> </span>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a href="javascript:;">
                                    我的学生
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                    学生成绩情况
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                    学生身体情况
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                    学生学分情况
                                </a>
                            </li>
                        </ul>
                    </li>
                </shiro:hasPermission>

                <shiro:hasPermission name="teacher:tongxin11_1">
                <li class="">
                    <a href="javascript:;">
                        <i class="fa fa-gears"></i><span class="title"> 学院学生信息 </span><span
                            class="arrow "> </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="javascript:;">
                                学院学生信息
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                学生成绩情况
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                学生身体情况
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                学生学分情况
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                添加学生信息
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                修改学生信息
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                删除学生信息
                            </a>
                        </li>
                    </ul>
                </li>
            </shiro:hasPermission>

                <shiro:hasPermission name="teacher:apartm3">
                    <li class="">
                        <a href="javascript:;">
                            <i class="fa fa-gears"></i><span class="title"> 公寓学生信息 </span><span
                                class="arrow "> </span>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a href="javascript:;">
                                    公寓整体情况
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                    添加学生信息
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                    修改学生信息
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                    删除学生信息
                                </a>
                            </li>
                        </ul>
                    </li>
                </shiro:hasPermission>


                <shiro:hasPermission name="teacher:xiaoyi">
                    <li class="">
                        <a href="javascript:;">
                            <i class="fa fa-gears"></i><span class="title"> 学生身体 </span><span
                                class="arrow "> </span>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a href="javascript:;">
                                    学生整体情况
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                    添加学生信息
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                    修改学生信息
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                    删除学生信息
                                </a>
                            </li>
                        </ul>
                    </li>
                </shiro:hasPermission>


                <li class="">
                    <a href="javascript:;">
                        <i class="fa fa-user"></i><span class="title"> 个人中心 </span><span
                            class="arrow "> </span>
                    </a>
                    <ul class="sub-menu">
                        <li>
                            <a href="javascript:;">
                                信息修改
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                密码修改
                            </a>
                        </li>

                    </ul>
                </li>

            </ul>
            <!-- END SIDEBAR MENU -->
        </div>
    </div>
    <!-- END SIDEBAR -->
    <!-- BEGIN CONTENT -->
    <div class="page-content-wrapper">
        <div class="page-content">
            <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
            <div class="modal fade" id="portlet-config" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                            <h4 class="modal-title">Modal title</h4>
                        </div>
                        <div class="modal-body">
                            Widget settings form goes here
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn blue">
                                Save changes
                            </button>
                            <button type="button" class="btn default" data-dismiss="modal">
                                Close
                            </button>
                        </div>
                    </div>
                    <!-- /.modal-content -->
                </div>
                <!-- /.modal-dialog -->
            </div>
            <!-- /.modal -->
            <!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
            <!-- BEGIN STYLE CUSTOMIZER -->
            <div class="theme-panel hidden-xs hidden-sm">
                <div class="toggler"></div>
                <div class="toggler-close"></div>
                <div class="theme-options">
                    <div class="theme-option theme-colors clearfix">
                        <span> 主题颜色 </span>
                        <ul>
                            <li class="color-black current color-default" data-style="default"></li>
                            <li class="color-blue" data-style="blue"></li>
                            <li class="color-brown" data-style="brown"></li>
                            <li class="color-purple" data-style="purple"></li>
                            <li class="color-grey" data-style="grey"></li>
                            <li class="color-white color-light" data-style="light"></li>
                        </ul>
                    </div>
                    <div class="theme-option">
                        <span> 布局 </span>
                        <select class="layout-option form-control input-small">
                            <option value="fluid">顺序</option>
                            <option value="boxed">盒状</option>
                        </select>
                    </div>
                    <div class="theme-option">
                        <span> 标题 </span>
                        <select class="header-option form-control input-small">
                            <option value="fixed">固定</option>
                            <option value="default">默认</option>
                        </select>
                    </div>
                    <div class="theme-option">
                        <span> 工具栏 </span>
                        <select class="sidebar-option form-control input-small">
                            <option value="fixed">固定</option>
                            <option value="default">默认</option>
                        </select>
                    </div>
                    <div class="theme-option">
                        <span> 工具栏位置 </span>
                        <select class="sidebar-pos-option form-control input-small">
                            <option value="left">左边</option>
                            <option value="right">右边</option>
                        </select>
                    </div>
                    <div class="theme-option">
                        <span> 页脚 </span>
                        <select class="footer-option form-control input-small">
                            <option value="fixed">固定</option>
                            <option value="default">默认</option>
                        </select>
                    </div>
                </div>
            </div>
            <!-- END STYLE CUSTOMIZER -->

            <!-- BEGIN PAGE HEADER-->
            <div class="row" id="pages">
                <div class="col-md-12">
                    <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                    <h3 style="position:absolute; left:50px; top:0px; " class="page-title" id="index-page-title">欢迎登录NCUT校园管理系统，${teacher_name}</h3>
                    <img src="/assets/img/ncut-bg.jpg" width="800px"; height="450"; style="position:relative; left:0px; top:50px; ">
                    <%--<a style="position:absolute; left:100px; top:500px; font-size:18px;" href="<%=path%>/user/indexpage">查看菜单</a>--%>
                   <%-- <ul class="page-breadcrumb breadcrumb">
                        <li>
                            <i class="fa fa-home"></i>
                            <a href="<%=path%>/user/indexpage">
                                首页
                            </a>
                            <i class="fa fa-angle-right"></i>
                        </li>
                        <li>
                            <a href="<%=path%>/user/indexpage">
                                菜单
                            </a>
                        </li>
                    </ul>--%>
                    <!-- END PAGE TITLE & BREADCRUMB-->
                </div>
            </div>
            <!-- END PAGE HEADER-->

            <!-- BEGIN DASHBOARD STATS -->
            <div id="main-content"></div>

            <!-- END PORTLET-->
        </div>
    </div>
    <!-- END CONTENT -->
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<div class="footer">
    <div class="footer-inner">
        2015 &copy; NCUT校园管理系统 By Michael.L
    </div>
    <div class="footer-tools">
        <span class="go-top"><i class="fa fa-angle-up"></i></span>
    </div>
</div>
<!--[if lt IE 9]>
<script src="assets/plugins/respond.min.js"></script>
<script src="assets/plugins/excanvas.min.js"></script>
<![endif]-->
<script src="assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>

<script src="assets/plugins/jquery-validation/dist/jquery.validate.min.js" type="text/javascript"></script>
<script type="text/javascript" src="assets/plugins/select2/select2.min.js"></script>

<script src="assets/scripts/app.js" type="text/javascript"></script>
<script type="text/javascript" src="app/js/index.js"></script>

<!-- <script data-main="app/js/main" src="app/lib/requirejs/require.js"></script> -->
</body>
</html>