CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR not null,
    salary DECIMAL not null)



CREATE OR REPLACE FUNCTION before_insert_employee()
RETURNS TRIGGER AS
$$
BEGIN
    IF NEW.salary < 10000 THEN
        NEW.salary := 10000;
    END IF;

    RETURN NEW;
END;
$$
LANGUAGE plpgsql;



CREATE TRIGGER trg_before_insert
BEFORE INSERT ON Employee
FOR EACH ROW
EXECUTE FUNCTION before_insert_employee();



CREATE OR REPLACE FUNCTION before_update_salary()
RETURNS TRIGGER AS
$$
BEGIN
    IF NEW.salary < 10000 THEN
        RAISE EXCEPTION 'Salary cannot be less than 10000';
    END IF;

    RETURN NEW;
END;
$$
language plpgsql



CREATE TRIGGER trg_before_update
BEFORE UPDATE ON Employee
FOR EACH ROW
EXECUTE FUNCTION before_update_salary();



CREATE OR REPLACE PROCEDURE employee_menu(
    IN choice INT,
    IN p_id INT DEFAULT NULL,
    IN p_name VARCHAR DEFAULT NULL,
    IN p_salary NUMERIC DEFAULT NULL
)
LANGUAGE plpgsql
AS
$$
BEGIN

    IF choice = 1 THEN
        INSERT INTO Employee VALUES (p_id, p_name, p_salary);
        RAISE NOTICE 'Employee Inserted Successfully';

    ELSIF choice = 2 THEN
        UPDATE Employee
        SET salary = p_salary
        WHERE emp_id = p_id;
        RAISE NOTICE 'Salary Updated Successfully';

    ELSIF choice = 3 THEN
        DELETE FROM Employee
        WHERE emp_id = p_id;
        RAISE NOTICE 'Employee Deleted Successfully';

    ELSIF choice = 4 THEN
        RAISE NOTICE 'Use SELECT * FROM Employee to view records';

    ELSIF choice = 5 THEN
        RAISE NOTICE 'Exit';

    ELSE
        RAISE NOTICE 'Invalid Choice';

    END IF;

END;
$$;


CALL employee_menu(1, 101, 'Gowsalya', 9000.00);

CALL employee_menu(2, 101, NULL, 9000);


CALL employee_menu(3, 101, NULL, NULL);


SELECT * FROM Employee;


INSERT INTO Employee VALUES (102, 'Ranjana', 5000);




