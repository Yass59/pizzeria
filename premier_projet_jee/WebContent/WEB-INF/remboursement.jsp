<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Remboursement</h1>

<%

String nom = 

(String) request.getAttribute("nom");



String prenom = 

(String) request.getAttribute("prenom");



double somme = 

(double) request.getAttribute("somme");



String date = 

(String) request.getAttribute("dateRemboursement");

%>

<p>Nom: <%= nom %></p>

<p>Pr�nom: <%= prenom %></p>

<p>Somme: <%out.println(somme); %></p>

<p>Date: <%= date %></p>

</body>
</html>