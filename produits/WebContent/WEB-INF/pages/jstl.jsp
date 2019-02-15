<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>JSTL</h1>



	<c:set var="nom" value="James" />



	<c:out value="bonjourJSTL" />

	<br />

	<c:out value=" bonjour ${ nom }" />




	<br /> ${"texte avec el"}


	<c:if test="true">

		<h1>titre dans c if</h1>


	</c:if>



	<c:forEach begin="1" end="10" step="1">

		<p>boucle</p>

	</c:forEach>


	<c:forEach var="i" begin="1" end="10" step="1">
		<c:if test="${i % 2 == 0 }">
			<c:out value="${ i }" />
		</c:if>

	</c:forEach>



	<c:choose>
		<c:when test="${5>7 }">
			<p>5 est superieur a 7</p>


		</c:when>

		<c:when test="${7>5 }">
			<p>7 est superieur a 5</p>


		</c:when>

		<c:when test="${5 == 5 }">

			<p>5 est egal a 5</p>
		</c:when>

		<c:otherwise>
			<p>tout est faux</p>

		</c:otherwise>


	</c:choose>




	<p>addition de 12 et 14 = ${12+14 }</p>

	<p>soustraction de 12 et 14 = ${12-14 }</p>

	<p>multiplication de 12 et 14 = ${12*14 }</p>

	<p>division de 12 et 14 = ${12/14 }</p>

	<p>modulo de 12 et 14 = ${12%14 }</p>



	<p>12 < 14 ? => ${12 <14 }</p>

	<p>12 < 14 ? => ${12 > 14 }</p>

	<p>12 < 14 ? => ${12 + 14 }</p>

	<ul>
		<c:forEach items="${ villes}" var="ville">
			<li><c:out value="${ville }"></c:out></li>
		</c:forEach>


	</ul>


































</body>
</html>