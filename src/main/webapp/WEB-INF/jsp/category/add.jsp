<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category list</title>
</head>
<body>
<h1>Categorys</h1>
<a href="/blackCat">Strona Główna</a><br>
<div>
    <form method="post" action="/categories">
        <label>Nazwa Category</label>
        <input type="text" name="name" />
        <input type="submit">
    </form>
</div>

</body>
</html>