<%--
  Created by IntelliJ IDEA.
  User: jeongminsu
  Date: 4/28/24
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String[] seats = request.getParameterValues("seat");

    for(String seat:seats){
%>
        <%= seat%> <br>
<%
    }
%>


</body>
</html>
