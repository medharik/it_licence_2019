<?php
include("functions.php");
$etudiants=all();
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>liste des etudiants</title>
    <link rel="stylesheet"     href="css/bootstrap.min.css" >

</head>
<body>
    
    <h3 class="text-center text-primary">Liste des etudiants</h3>
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
                <a class="btn btn-sm btn-danger" href="">Supprimer</a>
                <a class="btn btn-sm btn-warning" href="">Modifier</a>
                <a class="btn btn-sm btn-info" href="">Consulter</a>
                </td>
            </tr>
<?php } ?>

        </tbody>
    </table>
</body>
</html>