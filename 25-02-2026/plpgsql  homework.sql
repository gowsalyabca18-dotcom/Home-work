create or replace function calculate(m1 int,m2 int,m3 int)
returns int
language plpgsql
as $$
declare
total int :=0;
begin
total :=m1+m2+m3;
return total;
end
$$

select calculate(81,74,92)

create or replace procedure Stu_detail(m1 int,m2 int,m3 int)
language plpgsql
as $$
declare
result int;
begin
result :=calculate(m1,m2,m3);
raise notice'TOTAL MARK %',total;

    IF total >= 150 THEN
        raise notice'Result = PASS';
    ELSE
      raise notice  'Result = FAIL';
    END IF;


end;
$$

call  Stu_detail(81,74,92);