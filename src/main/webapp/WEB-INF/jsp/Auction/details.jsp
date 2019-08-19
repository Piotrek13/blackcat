<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
</head>
<body>
<a href="/blackCat">Strona Główna</a><br>
<div>
    <h1> name: ${auction.name}</h1>
    <p> opis: ${auction.opis}</p>
    <p> kwotaMin: ${auction.kwotaMin}</p>
    <p> kwotaObecna: ${auction.kwotaObecna}</p>
    <p> dataWystawienia: ${auction.dataWystawienia}</p>
    <p> dataZakończenia: ${auction.dataZakończenia}</p>
    <p> ilośćOdwiedzin: ${auction.ilośćOdwiedzin}</p>

    <div>
        <form action="/auction/${auction.id}/bid" method="post">
            <input type="number" name="price">
            <label>Licytuj</label>
            <input type="submit">
        </form>
    </div>

</div>
</body>
</html>
