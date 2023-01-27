Use ProjectDB;


--> CREATING THE TABLE
CREATE TABLE CLIENT(
	ClientId int Identity(3001,1) NOT NULL PRIMARY KEY,
	FirstName VARCHAR (50) NOT NULL,
	LastName VARCHAR (50) NOT NULL,
	Email VARCHAR (50) NOT NULL UNIQUE,
	PhoneNumber VARCHAR(11) NOT NULL UNIQUE,
	Location varchar(50) NOT NULL
	);

--> INSERT DATAS INTO THE TABLE

INSERT INTO CLIENT  VALUES('Abdullah', 'Yusha','abdullah.cse.200104114@aust.edu' , '01972709402','Khilgaon- Dhaka');
INSERT INTO CLIENT  VALUES('Arafath', 'Piyal','piyal.cse.200104107@aust.edu' , '01880288682','Banasree- Dhaka');
INSERT INTO CLIENT  VALUES('Arman', 'Mahy','arman.cse.200104110@aust.edu' , '01675324403','Badda- Dhaka');




--> SELECT STATEMENTS TO VIEW<--
--> ALL THE DATA
Select *From CLIENT