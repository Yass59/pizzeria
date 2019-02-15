<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href="ressources/css/users-info.css" >
<title>Insert title here</title>
</head>
<body>
<div id="conteneur">		

		<div id="intitule">

				<p>${ pizza.nom }</p>

			

		</div>

		<div id="photo">				

				<img src= ${ users.photo }>	

		</div>		

		<div id="infos">								

				<a href="Pizza">Retour</a>

				<p>Description : ${ pizza.description }</p>					
  <div>
  
				<p>Prix : $ {pizza.prix} </p>
  
  </div>
  
  
  <div>
 
  
  </div>
  
		</div>				

	</div>				


</body>
</html>