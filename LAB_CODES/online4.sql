create database lab11c2
use lab11c2

CREATE TABLE Customer(
	
	CustomerID int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	FirstName varchar (50) NOT NULL,
	LastName varchar (50) NOT NULL,
	CustomerAddress varchar (50) NOT NULL,
	City varchar (50) NOT NULL,
	Country varchar (50) NOT NULL
);

INSERT INTO CUSTOMER 
VALUES ('Amy', 'Johnson', '11000 Beecher', 'Joliet',  'USA'),
       ('Bill', 'Brown', '7312 Bettis Ave.', 'Pittsburg','USA'),
       ('Janna', 'Smith', '200 E. Elm Apt. #32', 'Sparks','USA'),
       ('Evette', 'LeBlanc', '207 Queens Quay West', 'Toronto','CA'),
       ('Drew', 'Brisco', '1690 Hollis Street', 'Ottawa','CA')
	  

CREATE TABLE CustomerOrder(
	
	OrderID int IDENTITY(101,1) NOT NULL PRIMARY KEY,
	OrderDate date NOT NULL,
	CustomerID int NOT NULL,
	Bill money NOT NULL
);


INSERT INTO CustomerOrder
VALUES  ('2019-01-13' , 3, 12.9500),
		('2019-01-12' , 5, 7.9500),
		('2019-01-05' , 2, 9.9500),
		('2019-01-07' , 1, 12.9500),
		('2019-01-09' , 5, 7.9500),
		('2019-01-04' , 1, 7.9500),
		('2019-01-04' , 5, 7.9500),
		('2019-01-06' , 2, 12.9500),
		('2019-01-07' , 3,  9.9500),
		('2019-01-08' , 3,  5.9500),
		('2018-11-11' , 9, 8.9500),
		('2018-12-12' , 8, 9.9500)
		
	   
CREATE TABLE Employee(
	
	EmployeeID int IDENTITY(500,1) NOT NULL PRIMARY KEY,
	EmployeeFirstName varchar (50) NOT NULL,
	EmployeeLastName varchar (50) NOT NULL,
	EmployeeAddress varchar (50) NOT NULL,
	EmployeeCity varchar (50) NOT NULL,
	EmployeeSalary decimal(7,2) NOT NULL,
	EmployeeDept varchar (50) NOT NULL
);


INSERT INTO Employee
VALUES ('David', 'Link', '567 Queens', 'Vacouver',5000.00,'Sales'),
       ('Emily', 'Harper', '456 Elm Apt. #44', 'Dallas', 6000.00,'HR'),
       ('Criss', 'Witt', '7312 GoergeTown.', 'South Carolina',7000.00,'IT'),
       ('Hansen', 'Jones', '11000 Hampton', 'Edmenton',10000.00,'HR'),
       ('Sophie', 'Watson', '1690 Hollis Street', 'Toronto',5500.00,'IT'),
	   ('Drew', 'Brisco', '1690 Hollis Street', 'Toronto', 8500.00,'IT')


SELECT * FROM Employee;
SELECT * FROM Customer;
SELECT * FROM CustomerOrder;

--> 1
SELECT EmployeeFirstName , EmployeeLastName , EmployeeDept FROM Employee WHERE EmployeeSalary 
IN ( SELECT MIN(EmployeeSalary) FROM Employee GROUP BY EmployeeDept)

-->2
SELECT * FROM CustomerOrder;
SELECT FirstName , LastName , co.OrderId , co.Bill FROM Customer c , CustomerOrder co
WHERE c.CustomerID = co.CustomerID AND
co.Bill >= 9 AND co.Bill <= 10

--> 3
SELECT c.CustomerID , c.Country , co.OrderId , co.Bill FROM Customer c , CustomerOrder co
WHERE c.CustomerID = co.CustomerID AND
co.CustomerID > 5 AND co.CustomerID < 9

 -- > 4
 SELECT * FROM Customer WHERE CustomerAddress = '1690 Hollis Street'

 -->5
  SELECT * FROM CustomerOrder WHERE OrderDate <> '2019-01-13'

  -->6
  SELECT TOP(1) * FROM Employee WHERE EmployeeSalary <> (SELECT MAX(EmployeeSalary) FROM Employee) 
  ORDER BY EmployeeSalary DESC  

  -->7
  SELECT CustomerId , Sum(Bill) AS 'TOTAL ORDER VALUE' FROM CustomerOrder GROUP BY (CustomerID)

  -->8
 SELECT  DISTINCT other.EmployeeFirstName , other.EmployeeLastName, other.EmployeeDept
 FROM Employee drew , Employee other
 WHERE
 other.EmployeeFirstName <> 'Drew' AND
 other.EmployeeDept = ( SELECT EmployeeDept FROM Employee WHERE EmployeeFirstName = 'Drew')



 --> 9
SELECT COUNT(EmployeeId) AS 'No of Employee' FROM  Employee WHERE EmployeeSalary <= 10000

 --> 10 
 SELECT * FROM Employee;
SELECT * FROM Employee WHERE
EmployeeSalary >  ( SELECT AVG(EmployeeSalary) FROM Employee) AND 
EmployeeDept LIKE (SELECT TOP(1) EmployeeDept FROM EMployee WHERE EmployeeFirstName LIKE ('D%'))
