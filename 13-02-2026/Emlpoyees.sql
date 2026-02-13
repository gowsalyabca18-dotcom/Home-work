create table Employees(e_id int primary key,e_name varchar not null,dept varchar not null,salary bigint not null)

insert into Employees values(1,'Gowsalya','BCA',25000),(2,'Ramya','B.COM',30000),(3,'Divya','B.A',35000),(4,'Chella','B.E',70000),(5,'Muthu','Farmer',18000)

select * from Employees

select dept,sum(salary) from Employees group by dept

select dept,avg(salary) from Employees group by dept

select dept,avg(salary) from Employees group by dept having avg(salary)>30000

select dept,count(e_id) from Employees group by dept