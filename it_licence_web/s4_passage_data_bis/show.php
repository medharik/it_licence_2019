<?php 
include("functions.php");
$id=$_GET['id'];//show.php?id=4
$etudiant=find($id);

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <?php include("_css.php");?>
</head>
<body>
<div class="card" style="width: 18rem;">
  <img src="https://placehold.it/400x400" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title"><?=$etudiant['nom']?></h5>
    <p class="card-text">Classe : <?=$etudiant['classe']?></p>
    <a href="#"  onclick="history.go(-1)" class="btn btn-primary">Retour</a>
  </div>
</div>
    
</body>
</html>