<?php
  include("functions.php");
 $etudiant= find($_GET['id']);

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nouveau</title>
</head>
<body>
    
    <form action="update.php" method="post">
    <input type="hidden" name="id" value="<?=$etudiant['id']?>">
     Nom : <input type="text" name="nom" id="" value="<?=$etudiant['nom']?>">
     Classe : <input type="text" name="classe" id="" value="<?=$etudiant['classe']?>">
    <button type="submit">Valider</button>
    
    </form>
</body>
</html>