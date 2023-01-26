Create Database ProjectDB;
Use ProjectDB;

Create Table Advocate(
    LawyerId int Identity(1001,1) NOT NULL Primary Key,
	LFName varchar(50) NOT NULL,
	LLName varchar(50) NOT NULL,
	LEmail varchar(50) NOT NULL Unique,
	LPhone varchar(11) NOT NULL,
    LPass varchar(20) NOT NULL,
	LDate Date NOT NULL,
	LGender varchar(10) NOT NULL

);

--> INSERT DATAS INTO THE TABLE
Insert into Advocate
values('Super','ADMIN','casiacAdmin12@yahoo.com','01790603952','Syltherin','2001-06-20','Female')
Insert into Advocate
values('Arif','Shuvo','ashrDali@yahoo.com','0190934589','abcd@','1985-04-20','male')
Insert into Advocate
values('Riyadul','Islam','thisisRiyad@yahoo.com','0170933509','1234@','1990-01-01','male')
Insert into Advocate
values('Sabrina','Akter','akterSabina31@gmail.com','0188930589','kiop@','1993-04-22','Female')
Insert into Advocate
values('Waziha','Afrin','wazzihaa@yahoo.com','0170135589','poik$','1988-09-20','Female')



--> SELECT STATEMENTS TO VIEW<--

--> ALL THE DATAS
Select *From Advocate

--> ALL THE MALE LAWYERS
SELECT * FROM Advocate WHERE LGender = 'MALE'

--> FIRST NAME ADN LAST NAME
SELECT LFName , LLName FROM Advocate

--> NOT EQUAL
SELECT LFName , LLName FROM Advocate WHERE LFName <> 'PARVEZ'

--> DISTINCT FIRST NAME 
SELECT DISTINCT LFName FROM Advocate

--> MERGE TWO COLUMS
SELECT LFName + ' ' + LLName as 'LAWYER NAME' FROM Advocate

--> ORDER BY ASSCENDING ORDER
SELECT * FROM Advocate  ORDER BY LFName

--> ORDER BY DESSCENDING ORDER
SELECT * FROM Advocate  ORDER BY LFName DESC


select LEmail From Advocate


SELECT LPass,LFName FROM Advocate WHERE LEmail ='parvezdirom2000@gmai.com'


--> OPERATORS
--> LIKE 


-- > STARTS WITH TAB AND ENDS WITH ANYTHING
SELECT * FROM ADVOCATE WHERE LFName LIKE 'TAB%'

--> ENDS WITH UM AND STARTS WITH ANYTHING
SELECT * FROM ADVOCATE WHERE LFName LIKE '%UM'

--> HAS SU ANYWHERE IN MIDDLE 
SELECT * FROM ADVOCATE WHERE LFName LIKE '%SU%'

--> THE THIRD CHARACTER IS B
SELECT * FROM ADVOCATE WHERE LFName LIKE '__B%'
 


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