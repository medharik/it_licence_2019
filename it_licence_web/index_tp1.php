<?php 
$prenom ='JOHN'; 
$nom ="DOE";
define('TVA',20);
$age=20;
$majorite=($age>18)? "Majeur":"Mineur";
$c=($age>18)? "blue":"red";
$sexe="homme"; ;
if($sexe=="homme"){
    $poli="Mr.";
    $couleur="deepskyblue";
}else{
    $poli="Mme.";
    $couleur="pink";
    }
$m=$age>18;//true
$b=1=="1";
var_dump($b);
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>first page</title>
</head>
<body style="background:<?=$couleur?>" >

<h3>Ma premiere page php</h3>
<h2>Bienvenue  1: <?php echo  $prenom ;?> <?php echo $nom?></h2>
<?php echo "<h2>Bienvenue $prenom $nom</h2>"; ?>
<?php echo '<h2>Bienvenue $prenom $nom</h2>'; ?>
<?php echo '<h2>Bienvenue'. $prenom.' '.$nom.'</h2>'; ?>
<?php echo "<h2>Bienvenue".$prenom." ". " $nom</h2>"; ?>
<hr>
<h2 style="color:red">Bienvenue <?= $nom?> <?=$prenom?></h2>
<h3>tva est <?=TVA?></h3>
<hr>
<h5 style="color:<?=$c?>" >

Bienvenue <?=$poli?> <?=$prenom?>
</h5>

</body>
</html>