create table Students(stu_id int primary key,stu_name varchar not null,age int not null,marks int not null,dept varchar not null)

insert into Students values(1,'Gowsalya',28,86,'BCA'),(2,'Ramya',25,82,'B.com CA'),(3,'Divya',22,84,'CSE'),(4,'Aruna',18,69,'CSE'),(5,'Nandhini',19,64,'CSE'),(6,'Chella',21,94,'B.E')

select * from Students

select stu_name,marks from Students where marks>70

select stu_name,dept from Students where dept='CSE'

select stu_name,age from Students where age between 18 and 22

select * from Students order by marks desc

select * from Students order by marks desc limit 3
