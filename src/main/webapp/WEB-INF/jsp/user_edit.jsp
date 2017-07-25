<%--
  Created by IntelliJ IDEA.
  User: cghsir
  Date: 2017/7/25
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>用户信息 - 修改</title>
</head>
<body>
<h2>修改用户信息页234234面</h2><br/>
<a href="${pageContext.request.contextPath }/user/">返回用户列表</a>

<form:form action="${pageContext.request.contextPath }/admin/doEdit"
           commandName="user" method="post">
    id:<form:input path="id" value="${user.id}" />

    用户名：<form:input path="name" value="${user.name}" />
    <form:errors path="name" cssClass="error" />
    <br />
    密码：<form:input path="password" value="${user.password}" />
    <form:errors path="password" cssClass="error" />
    <br />
    <form:button name="button">提交</form:button>
</form:form>
</body>
</html>
