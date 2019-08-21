<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter =0; %>
<% counter += 1;%>
<html>
<%@ include file="/partials/header.jsp"%>
<body>
<jsp:include page="partials/navbar.jsp" />
<h1>The current count is <%= counter %>.</h1>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>


<%@ include file="/partials/scripts.jsp" %>
</body>
</html>
