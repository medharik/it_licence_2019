<?php 
include("functions.php");
 $id=$_POST['id'];
 $nom=$_POST['nom'];
 $classe=$_POST['classe'];
modifier($nom,$classe,$id);
header("location:index.php?op=upd");

?>