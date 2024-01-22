REM   Script: Activity4
REM   Working with Alter and Update statement

select salesman_id, salesman_city from salesman;

select salesman_id, salesman_city from salesman;

describe salesman


CREATE TABLE salesman;

CREATE TABLE salesman;

CREATE TABLE salesman;

CREATE TABLE "salesman";

CREATE TABLE 'salesman';

CREATE TABLE salesman;

CREATE TABLE tableName;

CREATE TABLE tableName;

Create table salesman;

Create table salesman(salesman_id int, salesman_name varchar2, salesman_city varchar2, commission int);

Create table salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

Describe salesman


describe salesman 


select salesman_id, salesman_city from salesman;

describe salesman


select salesman_id, salesman_city from salesman;

INSERT ALL 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select salesman_id, salesman_city from salesman;

select *from salesman where salesman_city='Paris';

select salesman_id, commission from salesman where salesman_name='Paul Adam';

Alter table salesman add grade int;

Update salesman set grade=100;

Select *from salesman;

