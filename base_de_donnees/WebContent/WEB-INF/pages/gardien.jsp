<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" 
href="ressources/css/gardien.css"
/>
<meta charset="UTF-8">
<title>gardien</title>
</head>
<body>


<h1>Les gardiens</h1>


<table>

<c:forEach items="${ gardiens }" var="garde">

	<tr>

		<td>${ garde.nom }</td>

		<td>${ garde.prenom }</td>

		<td>${ garde.numero }</td>

		<td>${ garde.age }</td>

		<td><img src="${ garde.urlimage }"/></td>

	</tr>

</c:forEach>

</table>








</body>
</html>