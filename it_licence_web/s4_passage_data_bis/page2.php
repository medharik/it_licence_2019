<?php 
//on recupere les datas 
//variables implicites (superglobale)
// $_GET : cree par php et contient toutes les data envoyees  vers cette page 
 var_dump($_GET);
$ps= $_GET['pseudo'];
$age=$_GET['age'];
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h3><?php echo  $ps;?> a <?=$age?> ans</h3>
    
</body>
</html>