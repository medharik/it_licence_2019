<?php 
$hp=['libelle'=>'hp dv 6','prix'=>9000,'qte'=>20];
$dell=['libelle'=>'dell latitude','prix'=>6000,'qte'=>2];
$sony=['libelle'=>'sony vaio','prix'=>4500,'qte'=>12];
$acer=['libelle'=>'acer ','prix'=>7000,'qte'=>1];
$stock=[0=>$hp,$dell,$sony,$acer];
//  echo $stock[2]['libelle'];
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title><link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">
</head>
<body>

<table class="table table-striped "  align="center"  >
<thead>     
<tr>
            <th>Libelle</th>
            <th>Prix</th>
            <th>Quantite</th>
</tr>
</thead> 
<tbody>
    
    <?php  foreach($stock as $c=>$v) {  ?>
        <tr>
            <td><?=$v['libelle']?></td>
            <td><?=$v['prix']?></td>
            <?php 
            $qte=$v['qte'];
            if($qte<10){
                $color='bg-danger';  
            }else if($qte<15){ // entre 10 et 15
                $color='bg-warning';  
            
            }else{
                $color='';
            }
            ?>
            <td   class="<?=$color?>"  ><?=$v['qte']?></td>
        </tr>
        <?php } ?>




    </tbody>
    
</table>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
<script>

$(document).ready( function () {
    $('.table').DataTable();
} );

</script>
</body>
</html>