SGBD : ACCESS (client) , SQL SERVER (SERVER) , MYSQL SERVER , POSTGRESQL...

Oracle : SGBDRO  
SQL : STRUCTURED QUERY LANGUAGE => langage de requetes structurees (c'est un langage declaratif )

les 5 sous-langage SQL :
LDD : langage de definition de donnees (create , alter et drop ) (structure des donnees ou meta donnees )
LMD : L. manipulation des donnees (insert , update et delete ) (data)
LID : L. Interogation D (select)
LCD : L. controle D (create user , alter user , drop user , grant select   to samir on hr.employees )
LTD : l> transactions ( commit , rollback , savepoint)

TP :  ECOLE - ETUDIANT
-- creer la table ecole 

create table ecole (
id number primary key , 
nom varchar2(50) not null , 
adresse varchar2(200) default 'inconnu'

)

-- creer la table etudiant
create table etudiant(
id number  , 
nom varchar2(50) not null , 
prenom varchar2(50) ,
moyenne number (4,2) , 
adresse varchar2(200) default 'inconnu',
ecole_id number ,
option_langue  char(2),
constraint pk_etudiant primary key(id) ,
constraint uc_etudiant unique(nom,prenom),
constraint fk_etudiant_ecole foreign key(ecole_id) references  ecole(id) on delete cascade ,
constraint  ck_moyenne_etuadiant check (moyenne >=0 and moyenne <=20), 
constraint ck_option_etudiant check (option_langue in ('fr','en'))

)

-- les alters :
--- supprimer une contraints
alter table etudiant drop constraint ck_option_etudiant
-- supprimer une colonne 
alter table etudiant drop column option_langue
alter table etudiant add option_langue char(2)
alter table etudiant modify option_langue char(10) default 'fr'
-- supprimer une table 
drop table produit
EXEMPLE LDD :
create table produits (
id numbe primary key ,
libelle varchar2(20),
prix number(3),
qtestock number
)



create sequence sq_ecole start with 3 increment by 1 
insert  into ecole(id,nom,adresse) values(sq_ecole.nextval ,'ecole 2','casablanca numer0 90')

	select * from ecole  
-- les 5 contraintes des bases de donnees 
primary key : unique + not null => garantir l'unicite des enregistrements 
foreign key : cle etranger => lier les  tables  
- not null : pour les champs  obligatoire
- unique : =>  pas de doublons (mais peut etre null )
-check => constrainte de domaine (de metier) 

-- drop table produits
-- alter table produits add marque varchar2(30) default 'inconnu'
-- alter table produits drop column marque ;
-- alter table produits modify prix number(6) default 1000