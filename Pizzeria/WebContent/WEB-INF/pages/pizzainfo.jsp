<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href="ressources/css/users-info.css" >
<title>Insert title here</title>
</head>
<body>




<h1>INFO DE LA PIZZA</h1>




<div id="conteneur">		

		<div id="intitule">

				<p>${ pizza.libelle }</p>

			

		</div>

		<div id="photo">				

				<img src= ${ pizza.photo }>	

		</div>		

		<a href="Pizza">Retour</a>

				<p>Description : ${ pizza.description }</p>					
  <div>
  <div>
				<p>Prix : ${pizza.prix}</p>
  				

  

  
  </div>
  
  
  <div>
  
 <a href="Supprimer?id=${users.id }">supprimer</a>
 <a href="modifier?id=${users.id }">MODIFIER</a>
  
  </div>
  
		</div>				

	</div>				
























</body>
</html>