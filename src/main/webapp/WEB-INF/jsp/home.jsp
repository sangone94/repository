<%--
  Created by IntelliJ IDEA.
  User: ws
  Date: 2022/05/14
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form name="frm" action="/search">
    id : <input type="text" name="test_id" />
    hello java  <c:out value="${test_id}" />   <c:out value="${test_etc}" />
        <input type="submit" value="submit" />
    </form>
</body>
</html>
