<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bidding list</title>
</head>
<body>
<h1>Bidding</h1>
<a href="/blackCat">Strona Główna</a><br>

<div>
    <form method="post" action="/biddings">
        <label>Aukcja</label>
        <input type="text" name="aukcja" /><br/>
        <label>User</label>
        <input type="text" name="user"/><br/>
        <label>Kwota</label>
        <input type="text" name="kwota" /><br/>
        <input type="search">
    </form>
</div>

</body>
</html>
