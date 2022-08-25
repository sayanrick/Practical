use sayanndb;
create table customer_0(
cust_id varchar(5),
Fname varchar(10),
Lname varchar(15),
Area char(2),
Phone numeric(10),
DOB date,
Payment numeric(6,2)
);

insert into customer_0 values('A01','Ivan','Ross','SA',6125467,'1986-01-15',800.50);
insert into customer_0 values('A02','Vandama','Ray','MU',5560379,'1987-12-20',1000.75);
insert into customer_0 values('A03','Pramada','Jauguste','DA',4560389,'1967-07-25',500.00);
insert into customer_0 values('A04','Basu','Navindi','BA',6125401,'1956-02-25',860.00);
insert into customer_0 values('A05','Ravi','Shridhar','NA',null,'1989-02-15',500.50);
insert into customer_0 values('A06','Rukmini','Aiyer','GH',5125274,'1987-07-23',1500.50);
select * from customer_0;
update customer_0 set Phone = 9080706 where cust_id ='A02';
update customer_0 set Phone = 9080707 where cust_id ='A04';
update customer_0 set DOB = '1968-07-25' where cust_id ='A03';
update customer_0 set DOB = '1977-08-15' where cust_id ='A05';
select * from customer_0;
delete from customer_0 where cust_id = 'A01';
delete from customer_0 where cust_id = 'A05';
delete from customer_0;
insert into customer_0 values('A07','Alex','SA',7725467,'1993-01-15',400.50);
insert into customer_0 values('A08','Sonali','MU',6660379,'1994-12-20',2000.75);
insert into customer_0 values('A09','Sayan','DA',6560389,'1992-07-25',1500.00);
insert into customer_0 values('A10','Rima','BA',8725401,'1990-02-15',1860.00);
insert into customer_0 values('A11','Arijit','NA',null,'1989-02-15',5200.50);
update customer_0 set Phone = 9080403 where cust_id = 'A05';
delete from customer_0 where Area = 'BA'; 

