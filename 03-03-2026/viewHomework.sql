create table food(id int primary key,name varchar not null,price decimal not null)

insert into food values(1,'idty',15),(2,'dosa',80),(3,'vadai',10)

insert into food values(4,'samosa',10),(5,'cutlet',15),(6,'tea',10)

select * from food

create view vi_name as select name,price from food where price='10'

select * from vi_name

drop view vi_name
