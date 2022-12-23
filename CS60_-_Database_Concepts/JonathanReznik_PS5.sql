--1. Write the query that will generate a combined list of customers(no duplicates)

select CUS_LNAME, CUS_FNAME from CUSTOMER_JR UNION select CUS_LNAME,CUS_FNAME from CUSTOMER_2_JR

--2. Write the query that DOES include the duplicates
select 

CUS_LNAME, CUS_FNAME from CUSTOMER_JR UNION ALL select CUS_LNAME,CUS_FNAME from CUSTOMER_2_JR

--3. Write the query that shows ONLHY duplicate customer records

select CUSTOMER_2_JR.* from  CUSTOMER_2_JR, CUSTOMER_JR WHERE CUSTOMER_2_JR.CUS_LNAME = CUSTOMER_JR.CUS_LNAME

--OR another is:  select CUS_LNAME,CUS_FNAME from CUSTOMER_2_JR INTERSECT select CUS_LNAME,CUS_FNAME from CUSTOMER_JR

--4. Write the query that is unique to Customer_2 table

select CUS_LNAME, CUS_FNAME from CUSTOMER_2_JR MINUS select CUS_LNAME,CUS_FNAME from CUSTOMER_JR;

--5. Write the query 

select INV_NUMBER, CUSTOMER_JR.CUS_CODE, CUSTOMER_JR.CUS_LNAME, CUSTOMER_JR.CUS_FNAME, INV_DATE, INV_AMT
from INVOICE_JR inner join CUSTOMER_JR on INVOICE_JR.CUS_CODE = CUSTOMER_JR.CUS_CODE
where CUS_BALANCE >= 1000;

--6.

select INV_NUMBER, AVG_INV, (INV_AMT - AVG_INV) as DIFF
from INVOICE_JR, (select avg(INV_AMT) as AVG_INV from INVOICE_JR)
group by INV_NUMBER, AVG_INV, INV_AMT - AVG_INV

--7.

create table JR41_CUSTOMER as select * from CUSTOMER_JR
alter table CUSTOMER_JR add (CUS_DOB date) add (CUS_AGE number)
update JR41_CUSTOMER 
set CUS_DOB = '15-MAR-1979'
where CUS_CODE = 1000;
update JR41_CUSTOMER 
set CUS_DOB = '22-DEC-1988'
where CUS_NUM=1001;

--8.

select CUS_LNAME, CUS_FNAME, ROUND((SYSDATE-CUS_DOB)/365,0) AS AGE
FROM JR41_CUSTOMER;

--9.

update JR41_CUSTOMER
set CUS_AGE = ROUND((SYSDATE-CUS_DOB)/365,0);

--10.

select avg(CUS_AVG) from JR41_CUSTOMER;