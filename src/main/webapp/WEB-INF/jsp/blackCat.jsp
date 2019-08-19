<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>BlackCat</title>
    <style>
        body {
            background: url(https://esossl-a.akamaihd.net/assets/img/cms/media/9938e9d37c97c9bab4a29dece80d7aa7_royal-alinor-capital-of-the-high-elves_wallpaper-1920x1080.jpg)
            no-repeat center center fixed;
            background-size: 100vw;
            align-items: center;
        }
        .articleContainer {
            background-color: white;
            padding: 15px;
        }
    </style>
</head>
<body>
<h1>BlackCat</h1>
<c:if test="${login != null}">
<h2>Obecnie zalogowany: ${login} <a href="/users/logout">Wyloguj</a></h2>
</c:if>

<div>
    <a href="/categories/add">Dodaj Kategorie</a>
</div>

<div>
    <a href="/auctions/add">Dodaj Aukcje</a>
</div>

<div>
    <a href="/transactionRating/add">transactionRating</a>
</div>

<div>
    <a href="/categories">Kategorie</a>
</div>

<div style="overflow: hidden;">
    <div style="float: right">
        <a href="/users/add">Załóż konto</a><br/>
        <c:if test="${login == null}">
        <form method="post" action="/users/login">
            <label>Login:</label><br/>
            <input type="text" name="login"><br/>
            <label>Password:</label><br/>
            <input type="password" name="password"><br/>
            <input type="submit" value="Zaloguj">
        </form>
        </c:if>
    </div>
</div>

<div>
    <label>Search:</label>
    <input type="text" name="search"><input type="submit"><br>
</div>

<c:forEach items="${auctions}" var="Auction">
    <div>
        <a href="/auctions/${Auction.id}">${Auction.name}</a>
            ${Auction.kwotaObecna}
    </div>
</c:forEach>

</body>
</html>
