/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author taral
 */
public class DatabaseCredentials {

    //private static final String URL= "jdbc:sqlserver://TABASSUM\\SQLEXPRESS;databaseName=projectDB;integratedSecurity=true;encrypt=false";

    private static final String PORT = "1433"; // The tcp port number that was setted on the SQL SERVER NETWORK CONFIGURATION -> TCP/IP -> IP ADDRESSESS -> IPAIII
    private static final String SERVER = "localhost"; // AS THE PROJECT IS RUNNING IN lOCALHOST
    private static final String DATABASENAME = "ProjectDB"; // The name of the database that you created using the MSSQL STUDIO
    private static final String SQLPASSWORD = "123456"; // The password you had setted for sa
    private static final String SQLUSERNAME = "sa";
    private static final String URL = "jdbc:sqlserver://" + SERVER + ":" + PORT + ";databaseName=" + DATABASENAME + ";encrypt=true;trustServerCertificate=true;";

    public String getDatabaseUrl() {
      return URL;
    }

    public String getSqlPassword() {
        return SQLPASSWORD;
    }

    public String getSqlUserName() {
        return SQLUSERNAME;
    }

}
