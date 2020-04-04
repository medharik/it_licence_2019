<?php 
// les 3 extensions php / SGBD :
// mysql_ : 
// mysqli_ : facile / mono SGBD
// PDO : PHP DATA OBJECT : multi-sgbd
// fonction pour se connecter a une base de donnees 
// host : localhost, dbname=db1 , login (root) / mot de passe ()
function connecter_db(){
    //3 modes d'exception PDO 
    //silent_mode => production 
    // warning_mode => test 
    //EXECPTION_MODE
    try{
            $options=[PDO::ATTR_ERRMODE=>PDO::ERRMODE_EXCEPTION];
            $link=  new PDO ("mysql:host=localhost;dbname=db1;port=3306","root","",$options);
            return $link;
    }catch(PDOException $e ){
die ("erreur de connexion a la base de donnees ".$e->getMessage());
    }
 
}

function ajouter($nom,$classe){
 try{
            //connexion avec la base 
           $link= connecter_db();
            // preparer une requete bd  dans cette connexion: SQL
            $rp=$link->prepare("insert into etudiant(nom,classe) values(?,?)");
            // executer la requete  preparee
            $rp->execute([$nom,$classe]);
}catch(PDOException $e ){
   echo  ("erreur d'ajout de l'etudiant dans  la base de donnees ".$e->getMessage());
}
}


//supprimer une ressource (par id)
function supprimer($id){
    try{
       $link= connecter_db();
        $rp=$link->prepare("delete from etudiant where id=?");
        $rp->execute([$id]);
}catch(PDOException $e ){
die ("erreur de suppression  de l'etudiant dans  la base de donnees ".$e->getMessage());
}
}

//modifier  une ressource (par id)
function modifier($nom,$classe,$id){
    try{
       $link= connecter_db();
        $rp=$link->prepare("update etudiant set nom=? , classe=?  where id=?");
        $rp->execute([$nom,$classe,$id]);
}catch(PDOException $e ){
die ("erreur de modification   de l'etudiant dans  la base de donnees ".$e->getMessage());
}
}

// recuperer des ressources depuis la bd
function all(){
    try{
        $link= connecter_db();
         $rp=$link->prepare("select * from etudiant order by id  desc");
         $rp->execute();
     $resultat=  $rp->fetchAll(PDO::FETCH_ASSOC);  

     return $resultat;
 }catch(PDOException $e ){
 die ("erreur de  recuperation des etudiants dans  la base de donnees ".$e->getMessage());
 }

}
// recuperer une  ressource par son id depuis la bd
function find($id){  



    try{
        $link= connecter_db();
         $rp=$link->prepare("select * from etudiant  where id=? order by id  desc");
         $rp->execute([$id]);
     $resultat=  $rp->fetch(PDO::FETCH_ASSOC);  

     return $resultat;
 }catch(PDOException $e ){
 die ("erreur de  recuperation de l'etudiant d'id = $id dans  la base de donnees ".$e->getMessage());
 }

}

// // test de gotomeeting
// $table->dropColumn('column');




?>