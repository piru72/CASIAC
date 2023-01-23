
CREATE DATABASE LAB7C1

USE LAB7C1

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
	   
	   
--DROP TABLE CustomerOrder;

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
		
CREATE TABLE Customer_Online(
	
	CustomerID int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	FirstName varchar (50) NOT NULL,
	LastName varchar (50) NOT NULL,
	CustomerAddress varchar (50) NOT NULL,
	City varchar (50) NOT NULL,
	Country varchar (50) NOT NULL
);


INSERT INTO Customer_Online
VALUES ('Amy', 'Johnson', '11000 Beecher', 'Joliet',  'USA'),
       ('Bill', 'Brown', '7312 Bettis Ave.', 'Pittsburg','USA'),
       ('Janna', 'Smith', '200 E. Elm Apt. #32', 'Sparks','USA'),
       ('Evette', 'LeBlanc', '207 Queens Quay West', 'Toronto','CA'),
       ('Drew', 'Brisco', '1690 Hollis Street', 'Ottawa','CA')


CREATE TABLE Customer_Offline(
	
	CustomerID int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	FirstName varchar (50) NOT NULL,
	LastName varchar (50) NOT NULL,
	CustomerAddress varchar (50) NOT NULL,
	City varchar (50) NOT NULL,
	Country varchar (50) NOT NULL
);


INSERT INTO Customer_Offline
VALUES ('David', 'Link', '567 Queens', 'Vacouver','CA'),
       ('Emily', 'Harper', '456 Elm Apt. #44', 'Dallas',  'USA'),
       ('Criss', 'Witt', '7312 GoergeTown.', 'South Carolina','USA'),
       ('Hansen', 'Jones', '11000 Hampton', 'Edmenton','CA'),
       ('Sophie', 'Watson', '1690 Hollis Street', 'Toronto','CA'),
	   ('Drew', 'Brisco', '1690 Hollis Street', 'Ottawa','CA')
	   
CREATE TABLE CLIENT(
	
	ClientID int IDENTITY(500,1) NOT NULL PRIMARY KEY,
	ClientFirstName varchar (50) NOT NULL,
	ClientLastName varchar (50) NOT NULL,
	ClientAddress varchar (50) NOT NULL,
	ClientCity varchar (50) NOT NULL,
	ClientCountry varchar (50) NOT NULL
);


INSERT INTO CLIENT
VALUES ('David', 'Link', '567 Queens', 'Vacouver','CA'),
       ('Emily', 'Harper', '456 Elm Apt. #44', 'Dallas',  'USA'),
       ('Criss', 'Witt', '7312 GoergeTown.', 'South Carolina','USA'),
       ('Hansen', 'Jones', '11000 Hampton', 'Edmenton','CA'),
       ('Sophie', 'Watson', '1690 Hollis Street', 'Toronto','CA'),
	   ('Drew', 'Brisco', '1690 Hollis Street', 'Ottawa','CA')


SELECT * FROM CLIENT;
SELECT * FROM Customer;
SELECT * FROM Customer_Offline;
SELECT * FROM Customer_Online;
SELECT * FROM CustomerOrder;

---ANS 1

SELECT ORDERID,BILL,FIRSTNAME,LASTNAME FROM CUSTOMERORDER
INNER JOIN CUSTOMER
ON CUSTOMERORDER.CUSTOMERID=CUSTOMER.CUSTOMERID WHERE BILL BETWEEN 9 AND 10

--ANS 2

SELECT FIRSTNAME ,LASTNAME FROM Customer_Offline
INTERSECT 
SELECT FIRSTNAME ,LASTNAME FROM Customer_Online

-- Ans 3
SELECT CUSTOMERORDER.CUSTOMERID,COUNTRY,FIRSTNAME,ORDERID FROM CUSTOMERORDER
INNER JOIN CUSTOMER
ON CUSTOMERORDER.CUSTOMERID=CUSTOMER.CUSTOMERID WHERE CUSTOMERORDER.CUSTOMERID >5 AND 9<CUSTOMERORDER.CUSTOMERID
 
--Ans 4
SELECT * FROM CLIENT WHERE CLIENTADDRESS = '1690 Hollis Street'

--ANS 5 
SELECT * FROM CustomerOrder WHERE OrderDate <> '2019-01-13'

-- ANS 6

(SELECT DISTINCT FirstName + ' ' + LASTNAME AS 'CUSTOMER NAME' FROM Customer WHERE Country LIKE 'US%' )
UNION 
(SELECT DISTINCT FirstName + ' ' + LASTNAME AS 'CUSTOMER NAME ONLINE' FROM Customer_Online WHERE Country LIKE 'US%' )
UNION
(SELECT DISTINCT FirstName + ' ' + LASTNAME AS 'CUSTOMER NAME ONLINE' FROM Customer_Offline WHERE Country LIKE 'US%' ) 


--ANS 7
(SELECT  FirstName ,  LASTNAME,City  FROM Customer_Online WHERE CITY = 'TORONTO' OR CITY = 'OTTAWA')
UNION ALL
(SELECT  FirstName , LASTNAME,City    FROM Customer_Offline WHERE CITY = 'TORONTO' OR CITY = 'OTTAWA') 

--ANS 8

SELECT * FROM CLIENT 
EXCEPT 
SELECT * FROM CLIENT WHERE CLIENTCOUNTRY !='USA'