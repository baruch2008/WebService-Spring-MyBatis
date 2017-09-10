<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to BookStor</title>
</head>
<body>
<center>This is a book store. It provides the management for the self-owned books. Through the system the user can list all the books, edit the book info, add a new book or delete a book that does not exist. </center>
<!--Now time is--> <%-- =new java.util.Date()--%>
<br>
<!--a href="<%--request.getRequestDispatcher("/WEB-INF/pages/index.html").forward(request, response); --%>">index.html</a-->
<a href="indexForwardServlet">Go into BookStor</a>
</body>
</html>