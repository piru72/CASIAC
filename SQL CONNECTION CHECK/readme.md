Steps for Connecting NetBeans Project to MSSQL Server
1. Find the guide folder above and follow the instructions with caution.
<br> Thing to keep in mind
<br> 1. In the sql server configuration manager check if SQL Server Browser is running (Check out sql servers also)
<br> 2.  Add sqljdbc4.jar , mssql-jdbc-11.2.3.jre8.jar to Libraries. I have also added them in the JAR folder.
<br> 3. In the  ConnectMSSQL class I have updated the url a little bit like below . For the full sample  project you can check SqlConnectionCheck folder above
```JAVA
            // The tcp port number that was setted on the SQL SERVER NETWORK CONFIGURATION -> TCP/IP -> IP 
            String port = "1433"; ADDRESSESS -> IPAIII

            // AS THE PROJECT IS RUNNING IN lOCALHOST
            String server = "localhost"; 


             // The name of the database that you created using the MSSQL STUDIO
            String databaseName = "ProjectDB";

            // The password  setted for sa
            String password = "123456"; 
            
            
            String url = "jdbc:sqlserver://" + server + ":" + port + ";databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";
            

            Connection connection = DriverManager.getConnection(url, "sa", password);

```   

Feel free to create raise a issue if you still face any problem

