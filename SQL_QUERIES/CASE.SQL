Use ProjectDB;

--> CREATE THE TABLE
CREATE TABLE CASES (
	CaseId INT IDENTITY(6001,1) NOT NULL PRIMARY KEY,
	ClientId INT NOT NULL FOREIGN KEY REFERENCES CLIENT(ClientId),
	Category VARCHAR(50) NOT NULL ,
	CaseWorker INT NOT NULL FOREIGN KEY REFERENCES Advocate(AdvocateId),
	IntroducedBy INT NOT NULL FOREIGN KEY REFERENCES Advocate(AdvocateId),
	Location VARCHAR(50) NOT NULL,
	OpeningDate DATE NOT NULL,
	PaymentId INT NOT NULL FOREIGN KEY REFERENCES PAYMENT(PaymentId)
	);

--> RENAMED THE NAME OF LOCATION COLUMN TO CASELOCATION
EXEC sp_rename 'Cases.Location', 'CaseLocation';

--> INSERT DATAS INTO THE TABLE

INSERT INTO CASES VALUES(3001,'Land',1001,1003,'Main Court','2023-01-29',7001)
INSERT INTO CASES VALUES(3002,'Marriage',1002,1001,'District Cour','2022-01-29',7002)
INSERT INTO CASES VALUES(3002,'Fight',1003,1002,'District Court','2022-01-26',7003)


--> SELECT STATEMENTS TO VIEW<--
--> ALL THE DATA

SELECT * FROM CASES

--> ALL THE CASES WITH A SPECIFIC CATEGORY

SELECT * FROM CASES WHERE Category ='Land'

--> ALL THE CASES WITH A SPECIFIC LOCATION
SELECT * FROM CASES WHERE Location ='Main Court'


--> DETAILS WITH THE CLIENT  NAME, LAWYERS NAME , PAYMENT AMOUNT
SELECT CaseId,
CLIENT.FirstName+ ' '  + CLIENT.LastName AS 'CLIENT NAME',
Category,
worker.FirstName + ' ' + worker.LastName AS 'Case Worker',
introducer.FirstName + ' ' + introducer.LastName AS 'Case Introduces',
CaseLocation AS 'Location',
OpeningDate,
payment.Amount AS 'Amount'
FROM CASES , CLIENT , Advocate  worker, Advocate introducer , PAYMENT payment
WHERE
CLIENT.ClientId = CASES.ClientId AND 
CASES.CaseWorker = worker.AdvocateId AND  
CASES.IntroducedBy = introducer.AdvocateId AND 
CASES.PaymentId = payment.PaymentId  

--> QUERY FOR MY FOLDER -- TO VIEW ALL THE CASES THE CURRENT ADVOCATE IS HANDLING AND THERIR DETAILS
SELECT CaseId,
CLIENT.FirstName+ ' '  + CLIENT.LastName AS 'CLIENT NAME',
Category,
introducer.FirstName + ' ' + introducer.LastName AS 'Case Introduces',
CaseLocation AS 'Location',
OpeningDate,
payment.Amount AS 'Amount'
FROM CASES , CLIENT , Advocate  worker, Advocate introducer , PAYMENT payment
WHERE
CLIENT.ClientId = CASES.ClientId AND 
CASES.CaseWorker = worker.AdvocateId AND  
CASES.IntroducedBy = introducer.AdvocateId AND 
CASES.PaymentId = payment.PaymentId  AND
CASES.CaseWorker = 1001


--> QUERY FOR MY FOLDER CATEGORY-- TO VIEW ALL THE CASES OF A SPECIFIC CATEGORY
SELECT CaseId,
CLIENT.FirstName+ ' '  + CLIENT.LastName AS 'CLIENT NAME',
Category,
introducer.FirstName + ' ' + introducer.LastName AS 'Case Introduces',
CaseLocation AS 'Location',
OpeningDate,
payment.Amount AS 'Amount'
FROM CASES , CLIENT , Advocate  worker, Advocate introducer , PAYMENT payment
WHERE
CLIENT.ClientId = CASES.ClientId AND 
CASES.CaseWorker = worker.AdvocateId AND  
CASES.IntroducedBy = introducer.AdvocateId AND 
CASES.PaymentId = payment.PaymentId  AND
CASES.CaseWorker = 1001 AND 
Category = 'Land'


--> QUERY FOR MY FOLDER LOCATION-- TO VIEW ALL THE CASES OF A SPECIFIC LOCATION
SELECT CaseId,
CLIENT.FirstName+ ' '  + CLIENT.LastName AS 'CLIENT NAME',
Category,
introducer.FirstName + ' ' + introducer.LastName AS 'Case Introduces',
CaseLocation AS 'Location',
OpeningDate,
payment.Amount AS 'Amount'
FROM CASES , CLIENT , Advocate  worker, Advocate introducer , PAYMENT payment
WHERE
CLIENT.ClientId = CASES.ClientId AND 
CASES.CaseWorker = worker.AdvocateId AND  
CASES.IntroducedBy = introducer.AdvocateId AND 
CASES.PaymentId = payment.PaymentId  AND
CASES.CaseWorker = 1001 AND 
CaseLocation = 'Main Court'
