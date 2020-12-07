/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.mng;

import services.MysqlConnection;
import java.sql.*;

/**
 *
 * @author macbookpro
 */
public class MngLoginController {

    public boolean mngLogin(String mngUsername, String mngPassword) {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT MNGUSERNAME, MNGPASSWORD FROM MANAGER WHERE MNGUSERNAME = '" + mngUsername + "'";
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                rs.close();
                return true;
            } else {
                rs.close();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
//    public static void main(String args[]) {
//        MngLoginController mng = new MngLoginController();
//        System.out.println(mng.mngLogin("admin", "admin"));
//    }
}
