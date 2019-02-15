<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href="ressources/css/users.css" >
<title>Insert title here</title>
</head>
<body>



	<h1>Utilisateurs</h1>
	
	
	
	<a href = "AjouterServlet">AJOUTER UTILISATEUR</a>
	
	
	
	
	<div id="conteneur">




<c:forEach items = "${Users1 }" var = "user">



    <div class="block_produit">

        <div class="prix"> Prenom :<label>${ user.prenom}</label></div>
  <div class="prix2"> Nom: <label>${user.nom }</label></div>
       

      
     <a href="users_info?id=${user.id }">

                    <img src="${user.photo }">

                    </a>

        <div class="description">  Adresse :${user.adresse}</div>
 <div class="description">  Numero :${user.numero}</div>

   <div class="description"> Email :${user.email}</div>
   
   
    </div>

</c:forEach>
</div>
<div>



</div>



</body>
</html>