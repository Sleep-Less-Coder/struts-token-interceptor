<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Update User Request Page</title>
</head>
<body>
	<s:if test="hasActionErrors()">
		<s:actionerror />
	</s:if>

	<s:form action="UpdateUser">
		<s:textfield name="name" label="User Name"></s:textfield>
		<s:textfield name="address" label="Address"></s:textfield>
		<s:submit name="submit" value="Update"/>
		<s:token/>
	</s:form>
</body>
</html>