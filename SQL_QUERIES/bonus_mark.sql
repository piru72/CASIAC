create database parvez
use parvez

create table artist(
	ID int primary key ,
	first_name varchar(50) not null,
	last_name varchar(50) not null,
)

create table painting (

	ID int primary key ,
	p_name varchar(50) not null,
	artist_id int FOREIGN KEY REFERENCES artist(ID),
	listed_price money not null

)

create table collectors(

	ID int primary key ,
	first_name varchar(50) not null,
	last_name varchar(50) not null,
)

create table sales(
	ID int primary key ,
	date date not null,
	painting_id int FOREIGN KEY REFERENCES painting(ID),
	artist_id int FOREIGN KEY REFERENCES artist(ID),
	collector_id int FOREIGN KEY REFERENCES collectors(ID),
	sells_price money not null,
)

INSERT INTO artist values(1,'parvez','Ahammed')
INSERT INTO artist values(2,'Tabassum','Tara')
INSERT INTO artist values(3,'Mirazur','Zim')
INSERT INTO artist values(4,'Abdullah','Yusha')


INSERT INTO collectors values(1,'Arman','Mahy')
INSERT INTO collectors values(2,'Piyal','Ahmed')
INSERT INTO collectors values(3,'Ashraf','Shuvo')
INSERT INTO collectors values(4,'Arafath','Shakil')




INSERT INTO painting values(1,'The cutie',1,20000)
INSERT INTO painting values(2,'MounIce',3,30000)
INSERT INTO painting values(3,'Fire & Fork',2,40000)
INSERT INTO painting values(4,'Fire & Fork',1,100000)




INSERT INTO sales values(1,'2023-01-5',1,1,2,100000)
INSERT INTO sales values(2,'2023-01-3',1,1,3,100000)
INSERT INTO sales values(3,'2023-01-3',4,1,1,200000)
INSERT INTO sales values(4,'2023-01-2',3,2,4,250000)


SELECT * FROM painting
SELECT * FROM artist
SELECT * FROM collectors
SELECT * FROM sales


-- QUERY 1
-- TO FIND THE DETAILS OF THE PAINTING WHICH HAS MORE PRICE THAN THE AVERAGE
SELECT * FROM painting where  listed_price > ( SELECT AVG(listed_price) FROM painting)

SELECT * FROM sales

-- QUERY 2
-- TO FIND THE DETAILS OF THE COLLECTORS WHO HAS COLLECTED AT LEAST ONE PAINTING
SELECT * FROM collectors where id  IN(SELECT collector_id from sales)

-- QUERY 3
-- LIST THE ARTISTS TOTAL INCOME WITH THEIR NAME 
 
SELECT A.ID, A.first_name + ' ' + A.last_name AS 'Artist Name' , B.Income as 'Total Income' FROM artist A  JOIN 
(SELECT artist_id, SUM(sells_price) as 'Income' FROM sales GROUP BY (artist_id)) 
AS B ON B.artist_id = A.ID

-- QUERY 4
-- LIST THE COLLECTORS TOTAL COLELTION WITH THEIR NAMES AND ID
SELECT C.ID, C.first_name + ' ' + C.last_name AS 'Artist Name' , S.[Painting In Collection ] FROM collectors C JOIN
(SELECT collector_id, COUNT(collector_id) as 'Painting In Collection ' FROM sales GROUP BY (collector_id))
AS S ON S.collector_id = c.ID

--QUERY 5
--THE DETAILS OF ARTIST WITH ZERO SALES
SELECT * FROM collectors where id  NOT IN(SELECT artist_id from sales)
