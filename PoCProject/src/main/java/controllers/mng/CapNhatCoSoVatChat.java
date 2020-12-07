/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.mng;

import services.MysqlConnection;
import models.ThongTinCoSoVatChat;
import java.sql.*;

/**
 *
 * @author macbookpro
 */
public class CapNhatCoSoVatChat {

    private String itemName;
    private String itemColor;
    private String roomName;
    private String itemDescriptions;
    private int amount;
    private String lastTimeUpDate;

    public boolean themMoiMonDo(ThongTinCoSoVatChat monDo) {
        // Thêm mới 1 món đồ.
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            // Lấy ra ItemId lớn nhất trong bảng Infrastructure
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT MAX(ITEMID) AS ITEMID FROM INFRASTRUCTURE");
            int itemID = 1;
            if (rs.next()) {
                itemID = rs.getInt("ITEMID") + 1;
            }
            // Lấy xong 
            //Tiến hành thêm món đồ mới vào.
            String pquery = "INSERT INTO INFRASTRUCTURE(ITEMID ,\n"
                    + "ITEMNAME ,\n"
                    + "AMOUNT ,\n"
                    + "COLOR  ,\n"
                    + "LASTTIMEUPDATE ,\n"
                    + "ITEMDESCRIPTION ,\n"
                    + "ROOMNAME) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstatement = connection.prepareStatement(pquery);
            pstatement.setInt(1, itemID);
            pstatement.setString(2, monDo.getItemName());
            pstatement.setInt(3, monDo.getAmount());
            pstatement.setString(4, monDo.getItemColor());
            pstatement.setString(5, monDo.getLastTimeUpDate());
            pstatement.setString(6, monDo.getItemDescriptions());
            pstatement.setString(7, monDo.getRoomName());
            pstatement.executeUpdate();
            // thêm xong
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

//    public static void main(String args[]) {
//        CapNhatCoSoVatChat capNhat = new CapNhatCoSoVatChat();
//        System.out.println(capNhat.themMoiMonDo(new ThongTinCoSoVatChat("Ghe Chu Tich", "Den", "Phong chuc nang 1", "Con moi toanh", 1, "2020:12:20 20:20:20")));
//
//    }
}
