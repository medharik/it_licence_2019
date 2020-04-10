<?php
include("functions.php");

$notice="";
$classe="d-none";
 if(isset($_GET['op']) && $_GET['op']=="del"){
     $notice="Suppression effectuee avec succes";
     $classe="d-block";
 };
 if(isset($_GET['op']) && $_GET['op']=="upd"){
     $notice="Modification effectuee avec succes";
     $classe="d-block";
 };
 if(isset($_GET['op']) && $_GET['op']=="sto"){
     $notice="Ajout effectue avec succes";
     $classe="d-block";
 };
 if(isset($_GET['nom']) && !empty($_GET['nom'])){
    $etudiants=rechercher($_GET['nom']);

}else{
    $etudiants=all();
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>liste des etudiants</title>
<?php include("_css.php");?>
</head>
<body>
  <div class="container">
    
  <h3 class="text-center text-primary">Liste des etudiants</h3>

<div class="alert alert-info <?=$classe?>">
<?=$notice?>
</div>
<a href="create.php" class="btn btn-info mb-3 float-right">Nouveau </a>
<div class="alert alert-light">
<form action="index.php" method="get">
Rechercher : <input type="text" name="nom" id="nom">
<button class="btn btn-primary">ok</button></form>
</div>
<table class="table table-striped">
    <thead>
        <tr>
            <th>#</th>
            <th>Nom</th>
            <th>Classe</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
<?php foreach($etudiants as $e) {?>
        <tr>
            <td><?=$e['id']?></td>
            <td><?=$e['nom']?></td>
            <td><?=$e['classe']?></td>
            <td>
            <a  onclick="return  confirm('voulez vous vraiment supprimer cet etudiant?')" 
            class="btn btn-sm btn-danger" href="delete.php?id=<?=$e['id']?>">Supprimer</a>
            <a  href="edit.php?id=<?=$e['id']?>" class="btn btn-sm btn-warning" href="">Modifier</a>
            <a class="btn btn-sm btn-info"  href="show.php?id=<?=$e['id']?>">Consulter</a>
            </td>
        </tr>
<?php } ?>

    </tbody>
</table>
  </div>
</body>
</html>