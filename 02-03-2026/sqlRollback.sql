CREATE TABLE bank_account (
    acc_no INT PRIMARY KEY,
    acc_holder VARCHAR(50),
    balance NUMERIC(10,2)
);


INSERT INTO bank_account (acc_no, acc_holder, balance)
VALUES 
(101, 'Gowsalya', 10000.00),
(102, 'Divya', 15000.00),
(103, 'Ramya', 20000.00);

SELECT * FROM bank_account;

begin

UPDATE bank_account
SET balance = balance - 2000
WHERE acc_no = 101;

SELECT * FROM bank_account WHERE acc_no = 101;

rollback

SELECT * FROM bank_account WHERE acc_no = 101;