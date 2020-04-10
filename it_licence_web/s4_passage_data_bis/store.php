<?php 
include("functions.php");
 $nom=$_POST['nom'];
 $classe=$_POST['classe'];
 ajouter($nom,$classe);

 header("location:index.php?op=sto");

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h4>
Ajout de 
<?=$nom?>
 <?=$classe?> est effectue avec succes;
</h4>
    
</body>
</html>