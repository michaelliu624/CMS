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
                <h3 class="page-title" id="index-page-title">添加学生(C语言)</h3>

                <ul class="page-breadcrumb breadcrumb">
                    <li>
                        <i class="fa fa-home"></i>
                        <a href="<%=path%>/user/welcome_teacher">
                            首页
                        </a>
                        <i class="fa fa-angle-right"></i>
                        <a href="javascript:;">
                            添加学生
                        </a>
                    </li>
                </ul>
                <!-- END PAGE TITLE & BREADCRUMB-->
            </div>
        </div>
        <!-- END PAGE HEADER-->

        <!-- BEGIN DASHBOARD STATS -->

        <!-- END PORTLET-->
    </div>
</div>

<p align="center"><b>添加学生</b><br></p>
<center>
    <div align="left">
        <table height="60" border="0" align="left">
            <tr>
                <td>
                    <form name="channelform" action="<%=basePath%>/cyuyan/insertsuccess" onsubmit="return validate_channel_info(this);" method="post">

                        <select  name="student_id">
                            <option value="none">选择学生</option>
                            <c:forEach items="${result}" var="item">
                                <option value="${item.id}">${item.name} ${item.id}</option>
                            </c:forEach>
                        </select>
                        <br />
                        <%--名字:
                        <input type="text" name="" /><br />
                        ID:
                        <input type="text" name="channelid" /><br />--%>

                        <input type="submit" value="提交">
                    </form>
                <td>${student}</td>
                </td>
            </tr>
        </table>


        <script type="text/javascript">
            function validate_channel_info(channelform)
            {
                if(channelform.channelname.value=="")
                {
                    alert("请输入正确的名字");
                    return false;
                }
                else if(!isNumber(channelform.channelid.value))
                {
                    alert("请输入合法ID");
                    return false;
                }
                return true;
            }

            function isNumber(str)          // 判断是否为非负整数
            {
                var rx = /^[0-9]+$/;
                return rx.test(str);
            }

        </script>
    </div>
</center>

</body>
</html>

