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

	<h1>bonjour</h1>



	<c:forEach var="i" begin="1" end="${nombre }" step="1">



		<c:choose>
			<c:when test="${i % 7 == 0 }">
				<c:out value="#"></c:out>


			</c:when>
			<c:when test="${i % 3 == 0 && i % 4 == 0 }">
				<c:out value="*"></c:out>
			</c:when>

			<c:otherwise>

				<c:out value="${i }"> </c:out>



			</c:otherwise>


		</c:choose>


	</c:forEach>




</body>
</html>