create table attendance(idd serial primary key,employeeId int,datee date,status text)

insert into attendance(employeeId,datee,status)values(101,'2026-02-20','Present')
insert into attendance(employeeId,datee,status)values(102,'2026-02-20','Absent')
insert into attendance(employeeId,datee,status)values(103,'2026-02-20','Present')
insert into attendance(employeeId,datee,status)values(104,'2026-02-20','Present')
insert into attendance(employeeId,datee,status)values(105,'2026-02-20','Late')


create or replace procedure employeeAttendance()
language plpgsql
as $$
declare 
rec Record;
absentCount int;
begin
for rec in select employeeId from attendance loop
select count(*) into absentCount from attendance 
where employeeId = rec.employeeId and status = 'Absent';
raise notice 'Employee % has % absent days',rec.employeeId,absentCount;
end loop;
end;
$$

create or replace function updateLatePresent()
returns void
language plpgsql
as $$
begin 
update attendance
set status = 'Present' where status = 'Late';
end;
$$

select employeeId,
count(case when status = 'Absent' then 1 end) as absentDays,
case
when count(case when status = 'Absent' then 1 end)<=2 then
'Good'
when count(case when status = 'Absent' then 1 end)between
3 and 5 then 'Average'
else 'Poor'
end as attendanceRecord from attendance
group by employeeId;

call employeeAttendance();

select updateLatePresent();

select * from attendance;