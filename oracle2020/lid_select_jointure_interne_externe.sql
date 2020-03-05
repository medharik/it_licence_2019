-- liste des employees ayant un salaire d'un It_PROG
 select * from employees where salary between (select min_salary from jobs where job_id like  'IT%' ) 
 and (select  max_salary  from jobs where job_id like  'IT%')    ;    
--  select * from jobs where job_id like  'IT%'

-- select * from departments ;
-- select * from employees;
-- liste des employees travaillant ds l'IT
-- select * from employees where department_id =(select department_id from departments where department_name ='IT')
-- select * from regions
-- select first_name , last_name , department_name  , city , c.country_name
-- from employees e , departments d , locations l , countries c
-- where
-- condition de jointure 
-- e.department_id=d.department_id 
-- and d.location_id=l.location_id
-- and l.country_id=c.country_id

-- and  upper(c.country_name) like '%ITALY%' 

select first_name , last_name , region_name from 
employees   e 
join  departments d on e.department_id=d.department_id
join locations l on d.location_id=l.location_id
join countries c on l.country_id=c.country_id
join regions r on r.region_id =c.region_id
where r.region_name like 'Euro%'
and e.salary >= (select salary from employees where first_name= 'Peter' and lower(last_name)='hall')
and 
e.salary <=((select salary from employees where first_name= 'John' and lower(last_name)='chen')) ;
-- liste des employees n'ayant un departement
-- select * from employees where department_id is  null
select first_name , last_name , department_name from employees e full  
join departments d 
on e.department_id =d.department_id
where e.employee_id is null

order by e.employee_id desc 
;

-- les nom des departements et les villes 
-- select department_name , city from locations l INNER JOIN departments d on l.location_id=d.location_id
-- toutes les   avec leurs eventuels departements
--  select department_name , city from locations l full   JOIN departments d on l.location_id=d.location_id
 
 --------------------------------------------------------------------------------------------------------------
 -- les fonctions de groupes (agregations) : count(*), max(salary) , min(salary) , sum(salary) , avg(salary)
 select count(*), max(salary) , min(salary) , sum(salary) , avg(salary) , sum(salary)/ count(*) from employees
 
 ---exercice ---
 -- 1-  liste des employees ayant un salaire < salaire moyen
 -- 2- le nom / prenom / le nom du departement et la ville des employees ayant un salaire
 --    <= a celui de John Chen
 -- 3-  le nom/prenom/ job_title des employees ayant le meme manager que celui de John  Chen
-- 1-a : liste des employes ayant un salaire < au min_salary du job ayant job_title = 'Programmer'
-- 1-b liste des departements (department_name et city) qui se trouvent a Seatle (city)
-- 2-a first_name , last_name , hire_date , departement_name et region name de tous les employees 
 --    ayant un salaire > 2000
-- 1 -select * from employees where salary < (select avg(salary) from employees)
3-- select e.first_name , e.last_name , j.job_title from employees e 
join jobs j on e.job_id = j.job_id
where e.manager_id >=  all  ( select manager_id from employees where first_name ='John'  )
-- 1-a 
select e.*, j.job_title from employees e 
join jobs j on e.job_id =j.job_id
and job_title= 'Programmer';
-- 
select department_name    ,  count(*) , max(salary) from employees  e
join departments d on e.department_id=d.department_id
group by d.department_name