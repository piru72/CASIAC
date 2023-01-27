/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advocate;

/**
 *
 * @author taral
 */
public class DatabaseCredentials {

    // private static final  String URL = "jdbc:sqlserver://TABASSUM\\SQLEXPRESS;databaseName=projectDB;integratedSecurity=true;encrypt=false";
    String port = "1433"; // The tcp port number that was setted on the SQL SERVER NETWORK CONFIGURATION -> TCP/IP -> IP ADDRESSESS -> IPAIII
    String server = "localhost"; // AS THE PROJECT IS RUNNING IN lOCALHOST
    String databaseName = "ProjectDB"; // The name of the database that you created using the MSSQL STUDIO
    String password = "123456"; // The password you had setted for sa
    private String URL = "jdbc:sqlserver://" + server + ":" + port + ";databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";

    //String url = "jdbc:sqlserver://" + server + ":" + port + ";databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";
    public String getDatabaseUrl() {
        return URL;
    }

}
