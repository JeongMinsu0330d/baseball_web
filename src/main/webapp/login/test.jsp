<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2024-06-02
  Time: 오후 2:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String userId = (String)request.getAttribute("userId");
    String password = (String)request.getParameter("password");
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <%= userId%>
    <%= password%>

</body>
</html>
