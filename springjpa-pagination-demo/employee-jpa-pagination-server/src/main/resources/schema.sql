CREATE TABLE employee (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    emp_name VARCHAR(100) NOT NULL,
    salary DOUBLE NOT NULL,
    department_name VARCHAR(100) NOT NULL,
    date_of_joining DATE NOT NULL
);
