
Use ProjectDB;

--> CREATE THE TABLE 
CREATE	TABLE TASKS(
	TaskId int IDENTITY(3000,1) PRIMARY KEY,
	TaskDetails varchar(150) not null,
	Deadline date NOT NULL,
	TaskPriority varchar(50) NOT NULL,
	LawyerId int NOT NULL FOREIGN KEY REFERENCES Advocate(AdvocateId),
	TaskStatus VARCHAR(50) NOT NULL,
	CompletedTime DATETIME NULL DEFAULT '2023-01-20',
	CreatedTime DATETIME NOT NULL

); 

--> ADDED A CHECK THAT THE LAWYER ID CANT BE LESS THAN 1000 
ALTER TABLE TASKS ADD CHECK(LawyerId > 999);

ALTER TABLE tasks
ADD CaseId INT NOT NULL CONSTRAINT CaseId FOREIGN KEY REFERENCES Cases(CaseId) DEFAULT 6002;


--> INSERT DATAS INTO THE TABLE
INSERT INTO TASKS (TaskDetails,Deadline,TaskPriority,LawyerId,TaskStatus,CreatedTime) VALUES('FInd out the time of the hearing.' ,'2023-01-29','MEDIUM',1001,'PENDING' ,'2022-12-26');
INSERT INTO TASKS (TaskDetails,Deadline,TaskPriority,LawyerId,TaskStatus,CreatedTime) VALUES('Arrange a meeting with the client number 01.' ,'2023-01-29','MEDIUM',1002,'PENDING','2022-12-26');
INSERT INTO TASKS (TaskDetails,Deadline,TaskPriority,LawyerId,TaskStatus,CreatedTime) VALUES('Collect documents from Mr. Khayer' ,'2023-01-20','HIGH',1002,'PENDING', '2022-12-26');
INSERT INTO TASKS (TaskDetails,Deadline,TaskPriority,LawyerId,TaskStatus,CreatedTime) VALUES('Arrange a date with a beautiful client' ,'2023-01-23','HIGH',1003,'PENDING' ,'2022-12-26');



--> UPDATE
UPDATE TASKS SET TaskPriority ='LOW'  WHERE TaskPriority = 'HIGH'AND LawyerId = 1002
UPDATE TASKS SET TaskPriority ='HIGH'  WHERE TaskPriority = 'LOW'

--> DELETE
DELETE FROM TASKS WHERE LawyerId = 1003




--> SELECT STATEMENTS TO VIEW<--
--> ALL THE DATAS
SELECT * FROM TASKS

--> TASK WITH A SPECIFIC PRIORITY
SELECT * FROM TASKS WHERE TaskPriority = 'MEDIUM'

--> TASk WITH COMING DEADLINE
 -- > DEADLINES
SELECT TaskDetails ,Deadline,TaskPriority ,TaskStatus FROM TASKS Where LawyerId = 1002 ORDER BY Deadline 

--> TASK OVERDUE
SELECT TaskDetails , Deadline , TaskPriority  , a.FirstName + ' '  + a.LastName as 'Working Lawyer'
FROM TASKS 
Join CASES c on 
Tasks.CaseId = c.caseId
JOIN Advocate a on
c.CaseWorker = a.AdvocateId
Where Deadline < GETDATE() AND TaskStatus = 'PENDING' 

--> TASK DONE
SELECT TaskDetails , Deadline , TaskPriority  , a.FirstName + ' '  + a.LastName as 'Working Lawyer'
FROM TASKS 
Join CASES c on 
Tasks.CaseId = c.caseId
JOIN Advocate a on
c.CaseWorker = a.AdvocateId
Where Deadline < GETDATE() AND TaskStatus = 'DONE' 


--> SHOW THE DETAILS WITH A DIFFERENT COLUMN NAME
SELECT TaskDetails as 'Task Details' FROM TASKS

-->  SHOW DETAILS WITH THE LAWER NAME
SELECT taskId , TaskDetails,Deadline,TaskPriority, ADVOCATE.FirstName + ' ' + Advocate.LastName AS  'Advocate Name' ,TaskStatus , CompletedTime,CreatedTime 
FROM TASKS , Advocate 
WHERE TASKS.LawyerId = Advocate.AdvocateId


--> DATA DEFINATION LANGUAGE (DDL) THINGS
--> DELETE ALL THE DATAS BUT KEEP THE TABLE STATUS SAME AS BEFORE

TRUNCATE TABLE TASKS

--> DROP THE WHOLE TABLE WITH THE DATAS
DROP TABLE TASKS




