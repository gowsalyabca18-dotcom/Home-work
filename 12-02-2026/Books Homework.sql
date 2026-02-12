create table Books(book_id int primary key ,title text not null,author text not null, published_year int check (published_year>1900),available boolean default true)
create table Members(memeber_id int primary key,name text not null,e_mail varchar unique,join_date date default current_date)
create table Borrowed(borrow_id int primary key,book_id int references Books(book_id),member_id int references Members(memeber_id),borrow_date date default current_date)

insert into Books values(101,'The Great Gatsby','F.Scott Fitzgerald',1925)

insert into Books values(102,'1984','George Orwell',1949),(103,'The Hobbit','J.R.R. tolkien',1937)

select * from Books

insert into Members values(201,'Alice Jonhson','alice@gmail.com'),(202,'Bob Smith','bob@gmail.com')
select * from Members

insert into Borrowed values(1,101,201)
select * from Borrowed

Update Books set available=false where book_id=101

delete from Members where memeber_id=201