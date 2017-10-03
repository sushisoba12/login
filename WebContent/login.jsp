<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
<form action="LoginAction">
<input type="text" name="username"/>
<input type="password" name ="password"/>
<input type="submit" value="ログイン"/>
</form>
<!--
<s:form action="LoginAction"/>
<s:textfield name="username"/>
<s:password name ="password"/>
<s:submit value="ログイン"/>
<s:form/>
 -->
</body>
</html>