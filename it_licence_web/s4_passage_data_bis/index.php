<?php
include("functions.php");
$etudiants=all();
$notice="";
$classe="d-none";
 if(isset($_GET['op']) && $_GET['op']=="del"){
     $notice="Suppression effectuee avec succes";
     $classe="d-block";
 };

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
    
    <h3 class="text-center text-primary">Liste des etudiants</h3>

    <div class="alert alert-info <?=$classe?>">
    <?=$notice?>
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
                <a class="btn btn-sm btn-warning" href="">Modifier</a>
                <a class="btn btn-sm btn-info"  href="show.php?id=<?=$e['id']?>">Consulter</a>
                </td>
            </tr>
<?php } ?>

        </tbody>
    </table>
</body>
</html>