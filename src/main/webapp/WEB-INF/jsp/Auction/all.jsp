<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Auction List</title>
</head>
<body>
<a href="/blackCat">Strona Główna</a><br>
<a href="/auctions/add">Dodaj Aukcje</a>

<c:forEach items="${auctions}" var="Auction">
    <div>
        <a href="/Auction/${Auction.id}/Delate">Usuń Auction</a>
            ${Auction.name}
            ${Auction.id}
    </div>
</c:forEach>

</body>
</html>
