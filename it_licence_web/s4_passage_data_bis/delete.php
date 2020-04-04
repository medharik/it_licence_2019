<?php 
include("functions.php");
$id=$_GET['id'];//delete.php?id=4

supprimer($id);
header("location:index.php?op=del");

?>