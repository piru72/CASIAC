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


Truncate  table Advocate
select LEmail From Advocate
Select *From Advocate

SELECT LPass,LFName FROM Advocate WHERE LEmail ='parvezdirom2000@gmai.com' 
Drop table Advocate