<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 2015/4/30 0030
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>


<%--普通用户可访问<a href="<%=request.getContextPath()%>/user/getUserInfo" target="_blank">用户信息页面</a>
<br/>
<br/>
管理员可访问<a href="<%=request.getContextPath()%>/user/listUser" target="_blank">用户列表页面</a>
<br/>
<br/>
页面测试<a href="<%=request.getContextPath()%>/user/welcome" target="_blank">测试页面</a>
<br/>
<br/>
<a href="<%=request.getContextPath()%>/rest/logout" target="_blank">Logout</a>--%>

<%--＜jsp:forward page="<%=request.getContextPath()%>/user/getUserInfo" /＞--%>

<%--<shiro:hasAnyRoles name="admin">

    <a href="javascript:;">admin:manage1 拥有此权限</a>

</shiro:hasAnyRoles>--%>
<shiro:hasPermission name="admin:manage">
    <a href="<%=request.getContextPath()%>/user/welcome_admin"></a>
</shiro:hasPermission>

<shiro:hasPermission name="student:see">
    <a href="<%=request.getContextPath()%>/user/welcome_student"></a>
</shiro:hasPermission>

<shiro:hasPermission name="teacher:insert">
    <a href="<%=request.getContextPath()%>/user/welcome_teacher"></a>
</shiro:hasPermission>

<script language="JavaScript">
    var comment = document.getElementsByTagName('a')[0];
    if (document.all) {
        // For IE
        comment.click();
    }else if (document.createEvent) {
        //FOR DOM2
        var ev = document.createEvent('MouseEvents');
        ev.initEvent('click', false, true);
        comment.dispatchEvent(ev);
    }
</script>