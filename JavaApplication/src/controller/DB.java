/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
/**
 *
 * @author keplegarry
 */
public class DB {
    private static Connection conn;
    private static final String DB_URL = "jdbc:mysql://localhost/mysql_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    private DB(){
    }
    
    public static Connection getConn(){
        try{
        conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch(SQLException e){
        }    
        return conn;
    }

}
