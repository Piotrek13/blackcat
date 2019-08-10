<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adres List</title>
</head>
<body>
<a href="/blackCat">Strona Główna</a><br>
<div>
    <form method="post" action="/users">
        <label>Województwo</label>
        <input type="text" name="województwo" /><br/>
        <label>Miasto</label>
        <input type="text" name="miasto"/><br/>
        <label>Ulica</label>
        <input type="text" name="ulica" /><br/>
        <label>NrDomu</label>
        <input type="number" name="nrDomu" /><br/>
        <label>KodPocztowy</label>
        <input type="number" name="kodPocztowy" /><br/>
        <input type="submit">
    </form>
</div>
</body>
</html>
