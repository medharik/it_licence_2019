--  nombre d'employee par departement(_id) 
--le departement ayant le plus grand nombre d'employe
select d.department_name, count(*), min(salary), max(salary) , avg(salary) , sum(salary)
from employees  e join departments d on e.department_id=d.department_id

group by d.department_name
having count(*) in ( select max( count(*))
from employees  e join departments d on e.department_id=d.department_id
group by d.department_id
)
-- le salaire max par departement (department_name)
-- la masse salariale   par region (department_name)
-- la region ayant la plus grande masse salariale 
-- les departements ayant au min 1 employe
-- les departement ayant plus de 6 employes

View : table virtuelle (logique ) qui enregistre le resultat d'une requete select

--  nombre d'employee par departement(_id) 
--le departement ayant le plus grand nombre d'employe
create or replace view dep_max_emp as
select d.department_name, count(*) as nombre_emp
from employees  e join departments d on e.department_id=d.department_id
group by d.department_name
having count(*) in ( select max( count(*))
from employees  e join departments d on e.department_id=d.department_id
group by d.department_id
);
select * from  dep_max_emp
-- le salaire max par departement (department_name)
create or replace  view masse_sal_par_departement as 
select d.department_name,  sum(salary) as masse_salariale
from employees  e join departments d on e.department_id=d.department_id
group by d.department_name
-- la masse salariale   par region (department_name)
-- la region ayant la plus grande masse salariale 
-- les departements ayant au min 1 employe
-- les departement ayant plus de 6 employes
select * from masse_sal_par_departement
where masse_salariale >=all ( select max( masse_salariale) from masse_sal_par_departement)
-- table copie 
create table employe_It as 
select first_name  as nom ,salary as salaire from employees where 1=0
select * from employe_it