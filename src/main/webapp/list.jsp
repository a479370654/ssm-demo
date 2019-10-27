<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <table border="1" cellspacing="0" cellpadding="5" width="60%">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>时间</td>
            <td>工资</td>
        </tr>
        <c:forEach items="${list}" var="list">
            <tr>
                <td>${list.eid}</td>
                <td>${list.ename}</td>
                <td>${list.esex}</td>
                <td>${list.estartime}</td>
                <td>${list.epay}</td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>
