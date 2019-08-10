<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>transactionRating List</title>
</head>
<body>
<a href="/blackCat">Strona Główna</a><br>
<a href="/transactionRating/add">transactionRating</a>

<c:forEach items="${transactionRatings}" var="transactionRating">
    <div>
        <a href="/transactionRating/${transactionRating.id}/Delate">Usuń TransactionRating</a>
            ${TransactionRating.name}
            ${TransactionRating.id}
    </div>
</c:forEach>

</body>
</html>
