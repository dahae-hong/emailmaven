<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/sendemail" method="post">
보내는 이메일 주소:<input type="text" name="email"><br>
제목:<input type="text" name="subject"><br>
내용:<input type="text" name="content"><br>
<input type="submit" value="메일보내기"><br>
</form>
</body>
</html>