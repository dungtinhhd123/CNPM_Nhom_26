package services;

import java.sql.*;
/**
 *
 * @author dungtinhhd123
 */
public class MysqlConnection {
    public static Connection getMysqlConnection() throws SQLException, ClassNotFoundException {
        String hostName = "localhost";
        String dbName = "PoCProject";
        String userName = "root";
        String password = "root";
        return getMysqlConnection(hostName, dbName, userName, password);
    }
    
    public static Connection getMysqlConnection(String hostName, String dbName, String userName, String password) 
        throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionUrl = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        Connection conn = DriverManager.getConnection(connectionUrl, userName, password);
        return conn;
    }
}
