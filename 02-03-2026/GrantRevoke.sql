CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    salary NUMERIC(10,2)
);


INSERT INTO employees VALUES
(1, 'Arun', 25000),
(2, 'Priya', 30000),
(3, 'Kumar', 28000);



CREATE VIEW employees_name_view AS
SELECT emp_name
FROM employees;

SELECT * FROM employees_name_view;

CREATE USER nithi WITH PASSWORD 'nithi123';


GRANT SELECT ON employees_name_view TO nithi;