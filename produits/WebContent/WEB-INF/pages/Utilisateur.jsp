<%@page import="fr.roudane.accueil.beans.Utilisateur"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="ressources/css/produits.css"/>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Liste des personnes</h1>

<div id="conteneur">

<%

Utilisateur[] utilisateur = (Utilisateur[]) request.getAttribute("utilisateur");



for(int i = 0 ; i < utilisateur.length; i++){

%>

    <div class="block_produit">

        <div class="prix"><label><%= utilisateur[i].getNom() %> </label></div>
  <div class="prix2"><label><%= utilisateur[i].getPrenom() %></label></div>
       

            <img src="<%= utilisateur[i].getUrlImage()%>" id="axe"/>

     

        <div class="description"><%= utilisateur[i].getAge() %></div>

    </div>

<%} %>

</div>















</body>
</html>