<?php 
// Les tableaux en PHP : ensemble d'informations (heterogenes )  , de taille dynamique
// 2 types de tableaux 
// indéxé : numerote de 0
$ti=['hp dv 5','dell latitude','sony vaio'];
$ti[3]='acer';
$ti[]='MAC AIR ';//push 
$ti[]='HP DV 8 ';//push 

// associatif : cases sont nommees
$hp=['libelle'=>'hp dv 6','prix'=>9000];
$hp['prix']=2000;
$hp[]='MARQUE HP';
$hp[]='italie';
$hp['cout']=1000;
var_dump($hp);
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>PHP</h1>
    <h3>Tableaux indexes</h3>
   <ul>
   <?php  foreach($ti as $i=>$e) {  ?>
    <li>    <?=$i?> est  <?=$e?>        </li>
    <?php }  ?>


   </ul>
    <h3>Tableaux associatif</h3>
   <ul>
   <?php  foreach($hp as $c=>$v) {  ?>
    <li>    <?=$c?> est  <?=$v?>        </li>
    <?php }  ?>


   </ul>
    
   

    
</body>
</html>