// objectifs :
// mieux comprendre les variables
// mieux utiliser les entrees (lectures ) et sorties( affichage ou ecriture)
// mieux aprehender les traitements , calcul et affichage du resultat
// Exemple : Editer , en langage C , un programme permettant de 
// saisir le prix , et la qte et de'afficher le tht

#include<stdio.h>
main(){
	//declaration des variables (zone memoire pour stocker des valeurs)
float prix , qte , tht ;
// ecrire ou afficher un message
printf("enter un prix : \n");
// enregistrer ce que l'utilisateur  va saisir dans une variable (prix)
scanf("%f",&prix);

printf("entrer une qte : \n");
scanf("%f",&qte);
// calcul du prix * qte et le mettre dans une variable : tht
tht = prix * qte;
// afficher le resultat : 	
printf("le tht est %.2f DHS", tht);	
	
	
	
}
// exemple d'execution : 
// entrer un prix :
// 10
// entrer une qte : 
 //2
 // le tht est 20 DHS
