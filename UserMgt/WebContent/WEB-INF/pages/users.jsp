<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

    <link rel="stylesheet" href="ressources/css/users.css"/>
</head>
<body>



<h1>bonjour </h1>



<h1>Liste des personnes</h1>

<div id="conteneur">




<c:forEach items = "${users }" var = "user">



    <div class="block_produit">

        <div class="prix"><label>${ user.age}</label></div>
  <div class="prix2"><label>${user.nom }</label></div>
       

            <img src="${user.urlImage }" id="axe"/>

     

        <div class="description"> ${user.prenom}</div>

    </div>

</c:forEach>
</div>




















</body>
</html>