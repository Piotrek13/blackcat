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
<div style="overflow: hidden;">
    <div style="float: right">
        <form>
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
        <label>Categories:</label><br/>
        <input type="text" ><br/>
        <label>Auctions:</label><br/>
        <input type="text" ><br/>
        <label>Bidding:</label><br/>
        <input type="text" ><br/>
        <label>Shopping:</label><br/>
        <input type="text" ><br/>
        <label>TransactionRatings:</label><br/>
        <input type="text" ><br/>
    </form>
</div>
</body>
</html>
