<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category List</title>
</head>
<body>
<a href="/blackCat">Strona Główna</a><br>
<a href="/categories/add">Dodaj Kategorie</a>


<c:forEach items="${categories}" var="Category">
    <div>
        <a href="/Category/${Category.id}/Delate">Usuń Kategorie</a>
        ${Category.name}
        ${Category.id}

    </div>
</c:forEach>
<p><a href="/categories">Kategorie</a><br/></p>
</body>
</html>
