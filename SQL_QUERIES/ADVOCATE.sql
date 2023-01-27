Create Database ProjectDB;
Use ProjectDB;


--> CREATE THE TABLE
Create Table Advocate(
    AdvocateId int Identity(1001,1) NOT NULL Primary Key,
	FirstName varchar(50) NOT NULL,
	LastName varchar(50) NOT NULL,
	Email varchar(50) NOT NULL Unique,
	PhoneNumber varchar(11) NOT NULL,
    Password varchar(20) NOT NULL,
	DateOfBirth Date NOT NULL,
	Gender varchar(10) NOT NULL,
	Address_ VARCHAR(50)  NOT NULL DEFAULT'DHAKA'

);

--> INSERT DATAS INTO THE TABLE
Insert into Advocate
values('Super','ADMIN','casiacAdmin12@yahoo.com','01790603952','Syltherin','2001-06-20','Female','Rampura - dhaka')
Insert into Advocate
values('Arif','Shuvo','ashrDali@yahoo.com','0190934589','abcd@','1985-04-20','male', 'Khilgaon - Dhaka')
Insert into Advocate
values('Riyadul','Islam','thisisRiyad@yahoo.com','0170933509','1234@','1990-01-01','male','Banasreee - Dhaka')
Insert into Advocate
values('Sabrina','Akter','akterSabina31@gmail.com','0188930589','kiop@','1993-04-22','Female','Badda - Dhaka')
Insert into Advocate
values('Waziha','Afrin','wazzihaa@yahoo.com','0170135589','poik$','1988-09-20','Female',' Malibagh - Dhaka')



--> SELECT STATEMENTS TO VIEW<--

--> ALL THE DATAS
Select *From Advocate

--> ALL THE MALE LAWYERS
SELECT * FROM Advocate WHERE Gender = 'MALE'

--> FIRST NAME ADN LAST NAME
SELECT FirstName , LastName FROM Advocate

--> NOT EQUAL
SELECT FirstName , LastName FROM Advocate WHERE FirstName <> 'PARVEZ'

--> DISTINCT FIRST NAME 
SELECT DISTINCT FirstName FROM Advocate

--> MERGE TWO COLUMS
SELECT FirstName + ' ' + LastName as 'LAWYER NAME' FROM Advocate

--> ORDER BY ASSCENDING ORDER
SELECT * FROM Advocate  ORDER BY FirstName

--> ORDER BY DESSCENDING ORDER
SELECT * FROM Advocate  ORDER BY FirstName DESC


select Email From Advocate


SELECT Password,FirstName FROM Advocate WHERE Email ='parvezdirom2000@gmai.com'


--> OPERATORS
--> LIKE 


-- > STARTS WITH TAB AND ENDS WITH ANYTHING
SELECT * FROM ADVOCATE WHERE FirstName LIKE 'TAB%'

--> ENDS WITH UM AND STARTS WITH ANYTHING
SELECT * FROM ADVOCATE WHERE FirstName LIKE '%UM'

--> HAS SU ANYWHERE IN MIDDLE 
SELECT * FROM ADVOCATE WHERE FirstName LIKE '%SU%'

--> THE THIRD CHARACTER IS B
SELECT * FROM ADVOCATE WHERE FirstName LIKE '__B%'
 


--> DATA DEFINATION LANGUAGE (DDL) THINGS

--> ADD A COULMN
ALTER TABLE ADVOCATE ADD ADVOCATE_ADDRESS VARCHAR(50) 

--> DELETE A COLUMN
ALTER TABLE ADVOCATE DROP COLUMN ADVOCATE_ADDRESS

--> CHANE COULMN NAME 

--> DELETE ALL THE DATAS BUT KEEP THE TABLE STATUS SAME AS BEFORE
TRUNCATE TABLE ADVOCATE
--> DROP THE WHOLE TABLE WITH THE DATAS
DROP TABLE ADVOCATE