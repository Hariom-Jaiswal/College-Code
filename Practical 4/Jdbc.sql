CREATE DATABASE EmployeeDB;
USE EmployeeDB;

CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    department VARCHAR(50),
    salary DOUBLE,
    joining_date DATE
);

INSERT INTO Employee VALUES 
(1, 'John Doe', 'HR', 50000, '2022-01-10'),
(2, 'Jane Smith', 'IT', 60000, '2021-07-15'),
(3, 'Michael Brown', 'Finance', 55000, '2020-03-20'),
(4, 'Emily Davis', 'Marketing', 58000, '2019-11-30'),
(5, 'David Wilson', 'Sales', 62000, '2021-05-25');

DELIMITER //
CREATE PROCEDURE UpdateSalary()
BEGIN
    UPDATE Employee SET salary = salary * 1.2;
END //
DELIMITER ;
