<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<h1>Users</h1>
<a href="/blackCat">Strona Główna</a><br>

<div>
    <form method="post" action="/users">
        <label>Login</label>
        <input type="text" name="login" /><br/>
        <label>Hasło</label>
        <input type="password" name="password" /><br/>
        <label>Adres</label>
        <input type="text" name="adres" /><br/>
        <input type="submit">

    </form>
</div>
</body>
</html>
