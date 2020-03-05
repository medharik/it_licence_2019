-- LDD
LES 5 TYPES DE  CONSTRAINTES DES BASES DE DONNEES : 
(pour garantir l'integrite et la coherence  des donnees )

primary key : (ou identifiant id) => information unique + obligatoire 
foreign key : cle etrangere => mettre en relation des tables 
=> garantir l'integrite referentielle 

not null : obligatoire  (RQ : NULL => ABSENCE E VALEUR) 
unique :  un champs unique n'acceotre pas des valeurs identique (pas de doublons)

check : contrainte  de domaine (ou de verification)
RAPPEL :
base de donnees : 
au niveau logique : c'est une ensemble de tables , eventuellement relationnelles 
au niveau physique : fichier persistant dans le Disque Dur  et gerer par  un SGBDR
 (ACCESS , ORACLE , SQL SERVER , POSTGRESQL , MYSQL, ...)

exemple : 


create :


create table fournisseur (
id  number   primary key ,
nom varchar2(20) not null ,
constraint pk_frn_prd primary key(id) 

)

create table produit (
id NUMBER PRIMARY KEY ,
libelle varchar2(50) unique,
prix number(6,2) not null , 
qtestock  NUMBER  default 0 , 
marque varchar2(100) default 'hp',
fournisseur_id number ,
constraint verif_prix check( prix >= 1 ),
constraint verif_marque check ( marque in ('hp','dell') ),
constraint fk_prd_frn foreign key (fournisseur_id)
 references fournisseur (id)  
)


les 4 options qu'on peut definir  dans une relation entre  tables 
on delete  casacade => supprimer parent entraine la suppression
 de tous les child
on delete restrict => interdit la suppression de parent s'il a au moins 1 child 
on delete set null 
on delete no action 



alter (modifier la structure des donnees )

alter table produit add config varchar2(20)

alter table produit modify  config varchar2(200)
alter table produit drop column config

alter table produit drop constraint  verif_marque
alter table produit add  constraint  verif_marque
alter table produit modify constraint  verif_marque

aly
drop :
- supprimer une table (produit)
drop table produit

describe produit pour afficher la structure de la table




select * from user_constraints

LMD :

-- INSERT INTO fournisseur (id,nom ) values ( 4 , 'DELL RABAT' )
-- create sequence sq_fournisseur start with 3 INCREMENT BY 1  
-- connaire la valeur courante de la sequente 
-- select SQ_FOURNISSEUR.CURRVAL  FROM DUAL 
-- pour incrementer la sequnce sq_fournisseur.nextval

-- INSERT INTO fournisseur (id,nom ) values ( SQ_FOURNISSEUR.nextval , 'DELL RABAT' )
-- select * from fournisseur
-- 
-- correction exercice (appart - locataire)
create table appart(
id number primary key,
adresse VARCHAR2(200)


)
create table locataire (
id number  ,
nom VARCHAR2(100) ,
appart_id number,
CONSTRAINT pk_loc PRIMARY KEY(id),
CONSTRAINT uq_nom_loca unique(nom),
CONSTRAINT fk_loc_apprt  FOREIGN KEY(appart_id) references appart(id) 


)
insert into appart(id,adresse) values (2,'Rabat , hay RIYAD numero 33')
create sequence sq_appart start WITH 3 INCREMENT by 1
insert into appart(id,adresse) values (SQ_APPART.nextval ,'FES , hay RIYAD numero 35')
insert into locataire (id, nom , appart_id) values (SQ_APPART.nextval, 'ACHRAF DYAZ ',1)
 -- update locataire set nom ='Nasser ALI MOHAMED ' where id=10
-- insert into locataire (id, nom , appart_id) values (SQ_APPART.nextval, 'N ASSERA ALI BABA ',1)
 select * from locataire	
les regles de passage (transition) du diagramme de classe uml vers le schema relationnel de la base e donnees (MLD)
R1:
	 classe => table
	 champs =>colonne
R2: cas d'une relation de type 1 - plusieurs 
=> le pk de la table cote 1 devient cle etrangere dans la table cote * 

R3 : 
Les règles de transitions utilisées sont les suivantes :
- R1. Attribut et classe : Une classe devient une relation composée des attributs de la classe.
- R2. Dans le cas d’une association de cardinalités de type (1 - 1..*), on ne crée pas de relation pour
l’association. La clé de la relation qui correspond à la classe associée à la cardinalité 1 est intégrée
dans la relation qui correspond à la classe associée à la cardinalité 1..* en tant que clé étrangère.
- R3. Lorsque l’association en possède (c’est le cas de la classe association emprunt), les attributs de la
classe-association forment les champs « non clés » de cette nouvelle relation.
NB. La règle de passage concernant les relations de généralisation/spécialisation n’a pas à être expliquée



