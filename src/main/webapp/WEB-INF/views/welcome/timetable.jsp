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
<div class="row">
    <div class="col-md-12">
        <!-- BEGIN PAGE TITLE & BREADCRUMB-->
        <h3 style="position:absolute; left:50px; top:0px; " class="page-title" id="index-page-title">Ajax+JQuery 测试，查看学生的课程表${currUser}</h3>
        <%--<img src="/assets/img/ncut-bg.jpg" width="800px"; height="450"; style="position:relative; left:0px; top:50px; ">--%>

        <%--<a style="position:absolute; left:100px; top:500px; font-size:18px;" href="<%=path%>/user/indexpage">测试</a>--%>
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