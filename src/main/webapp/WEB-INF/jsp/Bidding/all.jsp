<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bidding List</title>
</head>
<body>
<a href="/blackCat">Strona Główna</a><br>
<a href="/biddings/add">Licytacje</a>

<c:forEach items="${biddings}" var="Auction">
    <div>
        <a href="/Bidding/${Bidding.id}/Delate">Usuń Bidding</a>
            ${Bidding.name}
            ${Bidding.id}
    </div>
</c:forEach>

</body>
</html>
