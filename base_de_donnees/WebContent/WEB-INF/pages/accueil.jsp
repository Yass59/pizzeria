<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>accueil</title>
</head>
<body>

<h1> Les base de données</h1>

<br>

<p>welcome to the database</p>

<ul>

<c:forEach items="${villes }" var="villes">

<h1>${villes }</h1>

</c:forEach>

</ul>

</body>
</html>