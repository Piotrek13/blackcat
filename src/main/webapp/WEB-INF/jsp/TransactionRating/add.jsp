<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TransactionRating list</title>
</head>
<body>
<h1>TransactionRating</h1>
<a href="/blackCat">Strona Główna</a><br>

<div>
    <form method="post" action="/transactionRatings">
        <label>OcenaSprzedającego</label>
        <input type="number" name="ocenaSprzedającego" /><br/>
        <label>KomentarzSprzedającego</label>
        <input type="text" name="komentarzSprzedającego"/><br/>
        <label>OcenaKupującego</label>
        <input type="number" name="ocenaKupującego" /><br/>
        <label>KomentarzKupującego</label>
        <input type="text" name="komentarzKupującego" /><br/>
        <input type="submit">
    </form>
</div>

</body>
</html>
