<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Auction list</title>
</head>
<body>
<h1>Auctions</h1>
<a href="/blackCat">Strona Główna</a><br>

<div>
    <form method="post" action="/auctions">
        <label>Nazwa Auction</label>
        <input type="text" name="name"/><br/>
        <label>Kategoria</label>
        <select name="categoryId">
            <c:forEach var="category" items="${categories}">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select><br/>
        <label>Promowana</label>
        <input type="checkbox" name="promowane"/><br/>
        <label>KwotaMin</label>
        <input type="text" name="kwotaMin"/><br/>
        <label>DataWystawienia</label>
        <input type="date" name="dataWystawienia"/><br/>
        <label>DataZakończenia</label>
        <input type="date" name="dataZakończenia"/><br/>
        <label> Opis</label>
        <textarea name="opis" rows="6" cols="36"></textarea><br/>
        <input type="submit">
    </form>

</div>
<div>
    <img src="https://i.pinimg.com/originals/49/52/67/4952670d3e78c749096d6d1f2536b324.jpg">
</div>
</body>
</html>
