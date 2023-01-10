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

SELECT * FROM painting
SELECT * FROM artist
SELECT * FROM collectors
SELECT * FROM sales



INSERT INTO painting values(1,'The cutie',1,20000)
INSERT INTO painting values(2,'MounIce',3,30000)
INSERT INTO painting values(3,'Fire & Fork',2,40000)
INSERT INTO painting values(4,'Fire & Fork',1,100000)




INSERT INTO sales values(1,'2023-01-5',1,1,2,100000)
INSERT INTO sales values(2,'2023-01-3',1,1,3,100000)
INSERT INTO sales values(3,'2023-01-3',4,1,1,200000)
INSERT INTO sales values(4,'2023-01-2',3,2,4,250000)


SELECT MAX(artist_id)  FROM sales   

SELECT * FROM artist where id = (SELECT MAX(artist_id)  FROM sales  )


SELECT TOP 1 artist_id, COUNT(artist_id) AS 'OCCUR' FROM sales GROUP BY artist_id ORDER BY 'OCCUR' DESC 


SELECT artist_id, COUNT(artist_id) AS 'Items sold' FROM sales GROUP BY artist_id ORDER BY 'Items sold' DESC
SELECT * FROM artist where id = (SELECT TOP 1 artist_id, COUNT(artist_id) AS 'OCCUR' FROM sales GROUP BY artist_id ORDER BY 'OCCUR' DESC )


-- QUERY 1
SELECT * FROM painting where  listed_price > ( SELECT AVG(listed_price) FROM painting)

SELECT * FROM sales

-- QUERY 2
SELECT * FROM collectors where id  IN(SELECT  collector_id from sales)

SELECT artist_id, SUM(sells_price) as 'Income' FROM sales GROUP BY (artist_id)

-- QUERY 3
-- LIST THE ARTISTS TOTAL INCOME WITH THEIR NAME 
SELECT * FROM artist where artist.id in (SELECT artist_id FROM sales GROUP BY (artist_id))

-- QUERY 4
-- LIST THE COLLECTORS TOTAL COLELTION WITH THEIR NAMES AND ID 

--QUERY 5
--THE DETAILS OF ARTIST WITH ZERO SALES

SELECT artist.*,SUM(sales.sells_price) as 'Income' FROM artist,sales  where artist.id  IN(SELECT artist_id FROM sales GROUP BY (artist_id)) GROUP BY (sales.artist_id)
