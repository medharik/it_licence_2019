<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>upload de fichier en php</title>
</head>
<body>
    
    <form action="charger.php" method="post" enctype="multipart/form-data">
    Nom : <input type="text" name="nom" id="">
    Fichier : <input type="file" name="fichier" id="">
    <button>Valider</button>
    </form>
</body>
</html>