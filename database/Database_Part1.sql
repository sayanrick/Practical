
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
