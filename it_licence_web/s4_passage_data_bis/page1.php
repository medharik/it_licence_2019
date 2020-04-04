<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>passage de donnees </title>
</head>
<body>
    
    <form action="page2.php" method="get">
    
    Pseudo : <input type="text" name="pseudo" id="">
    Age : <input type="number" name="age" id="">
    <button type="submit">Valider</button>
    </form>
    <hr>

    <form action="page_post.php" method="post" >
    
    Pseudo : <input type="text" name="pseudo" id="">
    Age : <input type="number" name="age" id="">
    <button type="submit">Valider</button>
    </form>
    <hr>

    <a href="produit.php?prod=hp">
    HP
    </a>
    
    <a href="produit.php?prod=dell">DELL</a>


</body>
</html>