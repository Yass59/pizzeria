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


<h1>Liste des Produits</h1>

	<div id="conteneur">

		<c:forEach items="${ utilisateur }" var="utilisateur" varStatus="status">

			<div class="block_produit">

				<div class="prix">

					<label>${ utilisateur.prenom }</label>

				</div>

				<a href="UtilisateurInfoServlet?i=${ status.index }" >

					<img src="${ utilisateur.urlImage }" />

				</a>

				<div class="description">${ utilisateur.age }</div>

			</div>

			</c:forEach>

	</div>

















</body>
</html>