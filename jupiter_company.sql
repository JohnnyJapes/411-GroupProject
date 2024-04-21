-- Create the jupiter_company database
drop database if exists jupiter_company;
CREATE DATABASE IF NOT EXISTS `jupiter_company`;

-- Use the jupiter_company database
USE `jupiter_company`;

-- Create the employeedatatable table
drop table if exists employeedatatable;
CREATE TABLE IF NOT EXISTS `employeedatatable` (
    `Employee_ID` INT AUTO_INCREMENT PRIMARY KEY,
    `First_Name` VARCHAR(50),
   `Last_Name` VARCHAR(50),
    `Start_Date` DATE,
    `Start_Salary` DECIMAL(10, 2),
    `Employee_Contract_Signed` ENUM('Y', 'N'),
    `Social_Security_Number` VARCHAR(11),
    `Birthdate` DATE,
    `Phone_Number` VARCHAR(15),
    `Emergency_Contact_Name` VARCHAR(100),
    `Emergency_Contact_Phone` VARCHAR(15)
)ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Insert sample records into employeedatatable
INSERT INTO `employeedatatable` VALUES 
(1,'John', 'Doe', '2023-01-15', 50000.00, 'Y', '123-45-6789', '1990-05-20', '123-456-7890', 'Jane Doe', '987-654-3210'),
(2,'Alice', 'Smith', '2023-03-10', 55000.00, 'Y', '987-65-4321', '1992-11-12', '456-789-0123', 'Bob Smith', '456-123-7890'),
(3,'Michael', 'Johnson', '2022-12-05', 48000.00, 'Y', '456-78-9012', '1988-07-30', '789-012-3456', 'Sarah Johnson', '321-654-0987'),
(4,'Emily', 'Brown', '2023-05-20', 52000.00, 'Y', '234-56-7890', '1991-09-25', '234-567-8901', 'David Brown', '789-012-3456'),
(5,'David', 'Garcia', '2023-02-28', 60000.00, 'Y', '890-12-3456', '1985-03-15', '678-901-2345', 'Maria Garcia', '876-543-2109'),
(6,'Sophia', 'Martinez', '2023-04-15', 53000.00, 'Y', '345-67-8901', '1993-06-05', '345-678-9012', 'Juan Martinez', '543-210-9876');

select * from employeedatatable;