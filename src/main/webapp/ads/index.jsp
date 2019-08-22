<%--
  Created by IntelliJ IDEA.
  User: alicia
  Date: 2019-08-22
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Ads, Ads, Ads"/>
    </jsp:include>

</head>
<body>
<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>Title: ${ad.title}</h2>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
