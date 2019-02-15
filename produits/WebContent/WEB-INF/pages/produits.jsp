<%@page import="fr.roudane.accueil.beans.Produits"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Voir les produits</title>

    <link rel="stylesheet" href="ressources/css/produits.css"/>

</head>


<body>

<h1>Liste des produits</h1>

<div id="conteneur">

<%

Produits[] produits = (Produits[]) request.getAttribute("produits");



for(int i = 0 ; i < produits.length; i++){

%>

    <div class="block_produit">

        <div class="prix"><label><%= produits[i].getPrix() %>&euro;</label></div>

        <a href="<%= produits[i].getLien() %>">

            <img src="<%= produits[i].getImages() %>" id="axe"/>

        </a>

        <div class="description"><%= produits[i].getNom() %></div>

    </div>

<%} %>

</div>


</body>
</html>