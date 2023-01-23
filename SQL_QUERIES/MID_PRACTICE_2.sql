use parvez



create table SuperMarket(
		ItemID int IDENTITY(1,1) PRIMARY KEY,
		ItemName varchar(50) not null,
		ItemPrice money not null,
		ItemExpireDate Date not null,
		Quantity int not null
);

Insert into SuperMarket values('potato',30,'12-05-2022',30)
Insert into SuperMarket values('Tomato',60,'12-06-2024',40)
Insert into SuperMarket values('Onion',70,'12-03-2024',90)

Insert into SuperMarket values('Chili',20,'12-05-2022',30)
Insert into SuperMarket values('carrot',60,'12-06-2024',70)
Insert into SuperMarket values('Kiwi',100,'12-06-2024',10)

SELECT ItemName , ItemPrice From SuperMarket where Quantity > 20

SELECT * FROM SuperMarket where CAST( GETDATE() AS Date ) >  ItemExpireDate

SELECT Top 1(ItemPrice) FROM SuperMarket 

SELECT MAX (ItemPrice) as 'ItemPrice'
FROM SuperMarket 
WHERE ItemPrice NOT IN (SELECT Max (ItemPrice) 
                          FROM SuperMarket ); 

SELECT * FROM SuperMarket
