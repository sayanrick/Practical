// using database employees
use employees;

// creating table employee
CREATE TABLE EMPLOYEE (
emp_id int (10) not null,
first_name varchar(20) not null,
last_name varchar(20) not null,
salary int(10) not null,
primary key(emp_id)
);

// selecting employee table from employees database
select * from employee;

//adding a extra column contact
alter table employee add column contact int;

//insertsing data into the table
insert into employee (emp_id, first_name, last_name, salary) values (101, 'Sayan', 'Das', 40000);

insert into employee (emp_id, first_name, last_name, salary) values (102, 'Robert', 'King', 50000);
insert into employee (emp_id, first_name, last_name, salary) values (103, 'Bebe', 'Rexha', 30000);

insert into employee (emp_id, first_name, last_name, salary) values (104, 'Jassie', 'Jane', 30000);
insert into employee (emp_id, first_name, last_name, salary) values (105, 'Alex', 'Alex', 25000);

// updating the table emenets
update employee set last_name = 'Hey' where emp_id = 102;

update employee set first_name = 'John' where emp_id = 105;

//deleting datas of 2 employees
delete from employee where emp_id in (103, 104);


// using database employees
use employees;

// creating table department
CREATE TABLE DEPARTMENT (
emp_dept varchar(20) not null, 
dept_code varchar(20) not null,
 dept_details varchar(50) not null
, primary key(emp_dept));

// selecting employee table from employees database
select * from department;

//adding a extra column dept_teacher
alter table employee add column dept_teacher int;

//insertsing data into the table
insert into department (emp_dept, dept_code, dept_details) values ('EE', 'EE2020', 'Department Electrical Engineering');

insert into department (emp_dept, dept_code, dept_details) values (CSE, 'CSE303', 'Department of Computer Science & Engineering');

insert into department (emp_dept, dept_code, dept_details) values ('IT', 'IT776', 'Department of Information Technology');

insert into department (emp_dept, dept_code, dept_details) values ('ECE', 'ECE654', 'Department of Electronics and Communication Engineering');

insert into department (emp_id, first_name, last_name, salary) values ('CE', 'CE2102', 'Department of Civil Engineering');

// updating the table emenets
update department set emp_code = 'EE1111' where emp_dept = 'EE';

update employee set emp_code = 'IT0000' where emp_dept = 'IT';

//deleting datas of 2 employees
delete from employee where emp_dept in ('EE', 'CSE');


