<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String food=request.getParameter("food");
	if(food.equals("sushi")){
		food="やっぱ寿司ですよね！";
	}else if(food.equals("ramen")){
		food="バリエーション豊富だし、ラーメン最高！";
	}else if(food.equals("yakiniku")){
		food="やっぱ肉ですよね！";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reaction</title>
</head>
<body>
<%=food %>
</body>
</html>