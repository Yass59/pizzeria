<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href="ressources/css/ajout.css" >
<title>Insert title here</title>
</head>
<body>
<h1>AJOUT D'UTILISATEURS</h1>
<div> <img id ="images" alt="users" src="https://images.golos.io/DQmdFbpFT9zH3jhH1KWj1qjXyR5qaNkbEY5phMUnG5oTqYT/illustrated-people.jpg"></div>


<div>  <img id = "images2" alt="?" src="https://stickeramoi.com/3777-large_default/autocollant-point-interrogation-muraux.jpg"></div>

<form  method="post" class="color">
    <fieldset>
        <legend>Vos Coordonnées</legend>
        
        <br>
        <br>

        <label>Nom :</label>
        <br>
        <input type="text" name="nom" placeholder="Nom" id="nom" class="dim_block2" id="colorBlock">
        <br>
        <br>
        <label>Prénom :</label>
        <br>
        <input type="text" name="prenom" placeholder="Prénom" id="prenom" class="dim_block2">
        <br>
       
     <br>
        <label>Numero</label>
        <br>
        <input type="text" name="numero"  id="numero" class="dim_block2">
        <br>
        
        <br>
        <label>Phone:</label>
        <br>
        <input type="text" name="phone"  id="phone" class="dim_block2">
        <br>
        <br>
        <label>Email :</label>
        <br>
        <input type="email" name="email" id="email" class="dim_block2">
        <br>
        <br>
        <label>Adresse</label>
        <br>
        <input type="text" name="adresse"  id="adresse" class="dim_block2">
        <br>
       <br>
       <label>Photo</label>
        <br>
        <input type="text" name="photo"  id="photo" class="dim_block2">
       
        <br>
        <br>
        
        

       
       <input type="submit"  value="Envoyer"  id="colorBlock">

  <input type="submit"  value="Annuler"  id="colorBlock">
  
       
    </fieldset>
    <br>
    
  
  
</form>
<a href="Users">
    Retour
</a>
</body>
</html>