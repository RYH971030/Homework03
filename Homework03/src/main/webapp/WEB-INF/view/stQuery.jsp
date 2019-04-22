<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.*"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   --%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>stQuety</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>姓名</th>
            <th>年龄</th>
            <th>学分</th>
        </tr>
        <c:forEach items="${listStudent}" var="st">
            <tr>
                <!-- <td><img src=images/${book.image} height="60"></td> -->
                <td>${st.name}</td>
                <td>${st.age}</td>
                <td>${st.credit}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>