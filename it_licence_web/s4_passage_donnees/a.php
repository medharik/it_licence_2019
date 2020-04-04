<?php 
// Notion a comprendre : variables implicites => variables creees automatiquement par PHP 
// $_GET = array('prix'=>'100','qte'=>10)
$prix=$_POST['prix'];
$qte=$_POST['qte'];
$marque=$_GET['m'];// info recuperee depuis le lien a.php?m=hp
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
Le prix est : <?=$prix?> , 
Le quantite est : <?=$qte?> , 
    <hr>

    la marque est <?=$marque?>
</body>
</html>