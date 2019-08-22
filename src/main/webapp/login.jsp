<%--
  Created by IntelliJ IDEA.
  User: alicia
  Date: 2019-08-21
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equalsIgnoreCase("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<%@ include file="/partials/header.jsp"%>
<body>
<div class="container">
<form action="/login.jsp" method="POST">
    <h1><label for="username">Username:</label></h1>
    <input type="text" name="username" id="username">
    <h1><label for="password">Password:</label></h1>
    <input type="password" name="password" id="password">
    <button class="btn waves-effect waves-light" type="submit" name="action">Submit<i class="material-icons right">send</i>
    </button>
</form>
</div>

<%@ include file="/partials/scripts.jsp" %>
</body>
</html>
