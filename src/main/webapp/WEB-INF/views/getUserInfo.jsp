<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 2015/4/29 0029
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" pageEncoding="UTF-8"%>
当前登录的用户为${currUser}
<br/>
<br/>
<a href="<%=request.getContextPath()%>/rest/logout" target="_blank">Logout</a>
