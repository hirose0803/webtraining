<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Arrays"%>
 <%	String[] oss=request.getParameterValues("os");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<% if(oss.length==0){ %>
<p>選択なし</p>
<%} %>
<% for(int i=0;i<oss.length;i++){ %>
<%=oss[i]%>
<%if(i<oss.length-1){ %>
,
<%} %>
<%} %>
</body>
</html>