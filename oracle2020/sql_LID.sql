-- LID : langage d'interogation des donnees : select
-- syntaxe de base
-- select col1, col2,... ou * from table1 
-- left/right/full join other_tables on condition de jointure
-- where conditions
-- group by col1,col2,
-- having condition sur fct de groupe
-- order by col1,col2
-- select * from employees 
-- select first_name , last_name from employees
-- select first_name || ' ' || last_name as "nom complet" , salary , commission_pct , job_id from employees
-- select first_name || ' ' || last_name as "nom complet" , salary , commission_pct , job_id , 
-- salary + NVL(commission_pct,0) * salary  as "salaire net"
-- from employees
-- select * from employees where salary >=10000  and salary <=20000
-- ou between 
-- select * from employees where salary between 10000 and 20000

--  select  UPPER(first_name), last_name , to_char(hire_date,'day/month yyyy')  ,
-- (SYSDATE - hire_date)/365.25 "annees d'exprience" ,
-- salary
-- from employees  where ((SYSDATE - hire_date)) >10*365.25 
--  and to_char(hire_date,'d')=1
-- order by salary  desc , last_name asc
-- select * from employees
-- select * from employees where salary
-- >=
-- (select salary from employees where first_name= 'John' and last_name='Chen') 

-- and department_id =(select department_id from employees where upper(first_name)= 'LEX' and last_name='De Haan')
-- select * from    employees


select * from employees where manager_id = ( select employee_id from employees where last_name='Greenberg' and first_name='Nancy' )
and salary > ( select salary from employees where first_name='Ismael' and last_name='Sciarra')