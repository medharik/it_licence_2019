<?php 
// var_dump($_POST);

$infos=$_FILES['fichier'];// 5 infos : nom , tmp_name, size, 
$nom=$infos['name'];
$tmp=$infos['tmp_name'];
$chemin="images/$nom";
  move_uploaded_file($tmp,$chemin );
?>
<hr>

<?php 
// var_dump($_FILES['fichier']);

?>