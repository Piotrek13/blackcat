<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shopping list</title>
</head>
<body>
<h1>Shoppings</h1>
<a href="/blackCat">Strona Główna</a><br>

<div>
    <form method="post" action="/auctions">
        <label>Licytacja</label>
        <input type="text" name="licytacja" /><br/>
        <label>Kup</label>
        <input type="number" name="kup"/><br/>
        <label>KupTeraz</label>
        <input type="number" name="kupTeraz" /><br/>
        <label>Koszyk</label>
        <input type="date" name="koszyk" /><br/>
        <input type="submit">
    </form>
</div>

</body>
</html>
