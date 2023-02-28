Use ProjectDB;
-- > CREATE THE TABLE
CREATE TABLE PAYMENT(
	PaymentId INT IDENTITY(7001,1) NOT NULL PRIMARY KEY,
	ClientId INT NOT NULL FOREIGN KEY REFERENCES CLIENT(ClientId),
	CreatedTime DATETIME NOT NULL ,
	UpdatedTime DATETIME NOT NULL,
	Status VARCHAR(50) NOT NULL,
	Amount MONEY NOT NULL,
	Detail VARCHAR(50) NOT NULL
 );

 
ALTER TABLE PAYMENT
ADD CaseId INT NOT NULL  FOREIGN KEY REFERENCES Cases(CaseId) DEFAULT 6002;

 --> INSERT DATAS INTO THE TABLE

 INSERT INTO PAYMENT VALUES(3001,'2022-12-26','2022-12-26','PENDING',50000, ' Will be paid via bank')
 INSERT INTO PAYMENT VALUES(3002,'2022-12-26','2022-12-26','DONE',150000, ' Will be paid via cash soon')
 INSERT INTO PAYMENT VALUES(3003,'2020-11-26','2021-12-26','PENDING',20000, ' Will be paid via bkash soon')
  INSERT INTO PAYMENT VALUES(3003,'2020-11-26','2021-12-26','DONE',40000, ' Will be paid via bkash soon',6005)


 --> SELECT STATEMENTS TO VIEW<--
--> ALL THE DATA

SELECT * FROM PAYMENT
SELECT * FROM CASES

-- > TOTAL PAYMENT
SELECT SUM(Amount) as 'TOTAL EARNING ' 
FROM PAYMENT p 
JOIN CASES c ON
p.caseId = c.CaseId
where Status = 'DONE' and c.CaseWorker = 1001

SELECT (SUM(Amount) * .2) as 'TOTAL Commision ' 
FROM PAYMENT p 
JOIN CASES c ON
p.caseId = c.CaseId
where Status = 'DONE' and c.IntroducedBy = 1001 and c.IntroducedBy <> c.CaseWorker

SELECT 
  SUM(p.Amount) + (SELECT SUM(p.Amount) * 0.2 
                    FROM PAYMENT p
                    JOIN CASES c ON p.caseId = c.CaseId
                    WHERE c.IntroducedBy = 1001 AND p.Status = 'DONE') as 'TOTAL EARNING'
FROM PAYMENT p 
JOIN CASES c ON p.caseId = c.CaseId
WHERE c.CaseWorker = 1001 AND p.Status = 'DONE'

SELECT * FROM CASES

-->  SHOW DETAILS WITH THE CLIENT NAME

SELECT PaymentId , Client.FirstName + ' ' + CLIENT.LastName As 'Client Name' , CreatedTime ,UpdatedTime , Status, Amount , Detail
FROM PAYMENT , CLIENT
WHERE PAYMENT.ClientId = CLIENT.ClientId
