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
                <h3 class="page-title" id="index-page-title">个人课表</h3>

                <ul class="page-breadcrumb breadcrumb">
                    <li>
                        <i class="fa fa-home"></i>
                        <a href="<%=path%>/user/welcome_student">
                            首页
                        </a>
                        <i class="fa fa-angle-right"></i>
                        <a href="javascript:;">
                            个人课表
                        </a>
                    </li>
                </ul>
                <!-- END PAGE TITLE & BREADCRUMB-->
            </div>
        </div>
        <!-- END PAGE HEADER-->

        <!-- BEGIN DASHBOARD STATS -->
        <c:forEach items="${result}" var="item">
            <c:if test="${item.class_time =='周一12'}">
                <c:set var="Mon12" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周一34'}">
                <c:set var="Mon34" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周一56'}">
                <c:set var="Mon56" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周一78'}">
                <c:set var="Mon78" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周一910'}">
                <c:set var="Mon910" value="${item.class_name}" />
            </c:if>

            <c:if test="${item.class_time =='周二12'}">
                <c:set var="Tue12" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周二34'}">
                <c:set var="Tue34" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周二56'}">
                <c:set var="Tue56" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周二78'}">
                <c:set var="Tue78" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周二910'}">
                <c:set var="Tue910" value="${item.class_name}" />
            </c:if>

            <c:if test="${item.class_time =='周三12'}">
                <c:set var="Wed12" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周三34'}">
                <c:set var="Wed34" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周三56'}">
                <c:set var="Wed56" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周三78'}">
                <c:set var="Wed78" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周三910'}">
                <c:set var="Wed910" value="${item.class_name}" />
            </c:if>

            <c:if test="${item.class_time =='周四12'}">
                <c:set var="Thu12" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周四34'}">
                <c:set var="Thu34" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周四56'}">
                <c:set var="Thu56" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周四78'}">
                <c:set var="Thu78" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周四910'}">
                <c:set var="Thu910" value="${item.class_name}" />
            </c:if>

            <c:if test="${item.class_time =='周五12'}">
                <c:set var="Fri12" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周五34'}">
                <c:set var="Fri34" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周五56'}">
                <c:set var="Fri56" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周五78'}">
                <c:set var="Fri78" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周五910'}">
                <c:set var="Fri910" value="${item.class_name}" />
            </c:if>

            <c:if test="${item.class_time =='周六12'}">
                <c:set var="Sat12" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周六34'}">
                <c:set var="Sat34" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周六56'}">
                <c:set var="Sat56" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周六78'}">
                <c:set var="Sat78" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周六910'}">
                <c:set var="Sat910" value="${item.class_name}" />
            </c:if>

            <c:if test="${item.class_time =='周日12'}">
                <c:set var="Sun12" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周日34'}">
                <c:set var="Sun34" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周日67'}">
                <c:set var="Sun56" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周日78'}">
                <c:set var="Sun78" value="${item.class_name}" />
            </c:if>
            <c:if test="${item.class_time =='周日910'}">
                <c:set var="Sun910" value="${item.class_name}" />
            </c:if>
        </c:forEach>
        <table id="travel" >
            <thead>
            <tr>
                <th scope="col" rowspan="2">时间</th>
                <th scope="col" colspan="7">日期</th>
            </tr>

            <tr>
                <th scope="col">星期一</th>
                <th scope="col">星期二</th>
                <th scope="col">星期三</th>
                <th scope="col">星期四</th>
                <th scope="col">星期五</th>
                <th scope="col">星期六</th>
                <th scope="col">星期日</th>

            </tr>
            </thead>


            <tbody>
            <tr>
                <th scope="row">一、二节(8:00-9:45)</th>
                <td>${Mon12}</td>
                <td>${Tue12}</td>
                <td>${Wed12}</td>
                <td>${Thu12}</td>
                <td>${Fri12}</td>
                <td>${Sat12}</td>
                <td>${Sun12}</td>

            </tr>

            <tr>
                <th scope="row">三、四节(10:00-11:45)</th>
                <td>${Mon34}</td>
                <td>${Tue34}</td>
                <td>${Wed34}</td>
                <td>${Thu34}</td>
                <td>${Fri34}</td>
                <td>${Sat34}</td>
                <td>${Sun34}</td>
            </tr>

            <tr>
                <th scope="row">五、六节(14:00-15:45)</th>
                <td>${Mon56}</td>
                <td>${Tue56}</td>
                <td>${Wed56}</td>
                <td>${Thu56}</td>
                <td>${Fri56}</td>
                <td>${Sat56}</td>
                <td>${Sun56}</td>
            </tr>

            <tr>
                <th scope="row">七、八节(16:00-17:45)</th>
                <td>${Mon78}</td>
                <td>${Tue78}</td>
                <td>${Wed78}</td>
                <td>${Thu78}</td>
                <td>${Fri78}</td>
                <td>${Sat78}</td>
                <td>${Sun78}</td>
            </tr>

            <tr>
                <th scope="row">九、十节(18:00-19:45)</th>
                <td>${Mon910}</td>
                <td>${Tue910}</td>
                <td>${Wed910}</td>
                <td>${Thu910}</td>
                <td>${Fri910}</td>
                <td>${Sat910}</td>
                <td>${Sun910}</td>
            </tr>

            </tbody>
        </table>

        <!-- END PORTLET-->
    </div>
    </div>


</body>
</html>
