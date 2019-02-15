<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>ARRAYLIST</h1>

<% ArrayList <String> villes =

(ArrayList<String>) request.getAttribute("villes"); %>


<p> Taille du tableau   <%= villes.size()%>


</p>
<ul>

<li> <% for(int i = 0 ; i < villes.size(); i++){ 
	
	out.print(villes.get(i) + "<br/>" + "<li>");
}

%>
</li>
</ul>

<%
if (villes.isEmpty())
{%>

<p> Le tableau est vide </p>



<%
}else{
%>

<p> le tableau à du contenu</p>

<% }%>

<h2> EL</h2>

<p> Tableau : Villes: ${villes } </p>

<p> 
<ul>

<li> ${villes[0] } </li>
<li> ${villes[1] } </li>
<li> ${villes[2] } </li>
<li> ${villes[3] } </li>
<li> ${villes[4] } </li>
<li> ${villes[5] } </li>

</ul>
</p>




















</body>
</html>