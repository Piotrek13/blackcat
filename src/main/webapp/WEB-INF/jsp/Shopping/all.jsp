<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shopping List</title>
</head>
<body>
<a href="/blackCat">Strona Główna</a><br>
<a href="/shoppings/add">Shoppings</a>

<c:forEach items="${shoppings}" var="Shopping">
    <div>
        <a href="/Shopping/${Shopping.id}/Delate">Usuń Shopping</a>
            ${Shopping.name}
            ${Shopping.id}
    </div>
</c:forEach>
</body>
</html>
