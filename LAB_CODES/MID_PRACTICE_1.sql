create database parvez
use parvez

create table students(
	StudentId int IDENTITY(1,1) PRIMARY KEY,
	StudentName varchar(50) not null,
	StudentSex varchar(50) not null,
	StudentAge int not null,
	StudentCgpa float
);

SELECT * FROM students

INSERT INTO students values('Tara','Female',20,8.9,'2002-11-13')
INSERT INTO students values('Farliha','Female',21,6.9,'2002-12-13')
INSERT INTO students values('Rubya','Female',19,5.9,'2002-10-13')

INSERT INTO students values('Parvez','Male',18,2.9,'2002-10-13')
INSERT INTO students values('Miraz','Male',28,5.9,'2002-12-13')
INSERT INTO students values('Yusha','Male',38,4.9,'2002-09-13')
INSERT INTO students values('Shuvo','Male',26,3.9,'2002-08-13')
INSERT INTO students values('Piyal','Male',26,9.9,'2002-07-13')

TRUNCATE TABLE students


--1 -- FINDING OUT FEMALE STUDENTS

SELECT * FROM students where StudentSex ='Female'

-- 2 -- FINDING OUT YOUNGEST STUDENTS
SELECT MIN(StudentAge) FROM students 
SELECT * FROM students where StudentAge = (SELECT MIN(StudentAge) FROM students ) 

-- 3 -- FINDING OUT STUDENTS WITH HIGHER CGPA THAN ^>%
SELECT * from students where StudentCgpa > 6.5 ORDER BY StudentCgpa, StudentName

--  FINDIG OUT THE TOPPER 
SELECT * from students where StudentCgpa =  (SELECT MAX(StudentCgpa) FROM students )


ALTER TABLE students ADD  DOB Date Default ('2002-11-13')


-- FOR GETTING THE CURRENT DATE 
SELECT CAST( GETDATE() AS Date ) ;

-- FINDING OUT THE ACTUAL DATE OF BIRTH 
SELECT DATEDIFF(YEAR ,DOB ,CAST( GETDATE() AS Date )) AS date_difference FROM students
