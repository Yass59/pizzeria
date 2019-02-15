<%@ page language="java" contentType="text/html; charset=ISO-8859-3"
    pageEncoding="ISO-8859-3"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-3">
<title>Insert title here</title>
<link rel="stylesheet"
href="ressources/css/produit/produits.css"
/>
</head>
<body>

<h1>Liste des Produits</h1>
	<div id="conteneur">
		<c:forEach items="${ produits }" var="produit" 
						varStatus="status">
			<div class="block_produit">
				<div class="prix">
					<label>${ produit.prix }</label>
				</div>
				<a href="produit-infos?i=${ status.index }" >
					<img src="${ produit.lienImage }" />
				</a>
				<div class="description">${ produit.nom }</div>
			</div>
			</c:forEach>
	</div>

</body>
</html>