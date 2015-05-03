<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 2015/4/30 0030
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
普通用户可访问<a href="<%=request.getContextPath()%>/user/getUserInfo" target="_blank">用户信息页面</a>
<br/>
<br/>
管理员可访问<a href="<%=request.getContextPath()%>/user/listUser" target="_blank">用户列表页面</a>
<br/>
<br/>
页面测试<a href="<%=request.getContextPath()%>/user/welcome" target="_blank">测试页面</a>
<br/>
<br/>
<a href="<%=request.getContextPath()%>/rest/logout" target="_blank">Logout</a>
