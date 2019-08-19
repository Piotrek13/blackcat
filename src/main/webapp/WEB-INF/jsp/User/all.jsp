<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<a href="/blackCat">Strona Główna</a><br>
<a href="/users/add">Dodaj Usera</a>

<c:forEach items="${users}" var="User">
    <div>
        <a href="/User/${User.id}/Delate">Usuń User</a>
            ${User.login}
            ${User.id}
    </div>
</c:forEach>

</body>
</html>
