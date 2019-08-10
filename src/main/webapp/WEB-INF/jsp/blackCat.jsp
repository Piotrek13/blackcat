<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>BlackCat</title>
    <style>
        body {
            background-color: orchid;
        }

        .articleContainer {
            background-color: white;
            padding: 15px;
        }
    </style>
</head>
<body>
<h1>BlackCat</h1>
<a href="/categories/add">Dodaj Kategorie</a>
<p><a href="/auctions/add">Dodaj Aukcje</a></p>
<p><a href="/biddings/add">Licytacje</a></p>
<p><a href="/shoppings/add">Shoppings</a></p>
<p><a href="/transactionRating/add">transactionRating</a></p>
<div style="overflow: hidden;">
    <div style="float: right">
        <form>

            <p><a href="/users/add">Dodaj Usera</a></p>
            <label>Login:</label><br/>
            <input type="text" ><br/>
            <label>Password:</label><br/>
            <input type="text" ><br/>
        </form>
    </div>
</div>


<div>
    <form>
        <label></label><br/>
        <input type="text" name="Czego szukasz ?"><br/><br/>
    </form>
</div>

<div>
    <form>
        <label>Kategorie:</label><br/>
        <input type="text" ><br/>
        <label>Aukcje:</label><br/>
        <input type="text" ><br/>
        <label>Licytacje:</label><br/>
        <input type="text" ><br/>
        <label>Shopping:</label><br/>
        <input type="text" ><br/>
        <label>TransactionRatings:</label><br/>
        <input type="text" ><br/>
    </form>
</div>
</body>
</html>
