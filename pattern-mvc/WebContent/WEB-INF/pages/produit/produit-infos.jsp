<%@ page language="java" contentType="text/html; charset=ISO-8859-3"
	pageEncoding="ISO-8859-3"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-3">
<title>Infos produit</title>
</head>
<body>
	<h1>Infos du produit</h1>

	<div>

		<h2>Nom: ${ produit.nom }</h2>

		<img src="${ produit.lienImage }" />

		<h2>prix: ${ produit.prix }</h2>

		<h2>

			<a href="${ produit.lienSiteOff }">Lien du site du produit</a>

		</h2>

	</div>
</body>
</html>