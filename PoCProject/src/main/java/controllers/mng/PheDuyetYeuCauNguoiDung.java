/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.mng;

import services.MysqlConnection;
import models.DonYeuCau;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author macbookpro
 */
public class PheDuyetYeuCauNguoiDung {

    private List<DonYeuCau> listDonYeuCau = new ArrayList<DonYeuCau>();

    public List<DonYeuCau> getDanhSachChuaPheDuyet() {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT FINISHTIMEREQUEST, STARTTIMEREQUEST, \n"
                    + " REQUESTROOM, USERUSERNAME, REQUESTDESCRIPTIONS, \n"
                    + " REQUEST.REQUESTID AS REQUESTID FROM REQUEST LEFT JOIN APPROVE \n"
                    + "ON REQUEST.REQUESTID = APPROVE.REQUESTID WHERE APPROVE.STATE IS NULL";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                DonYeuCau temp = new DonYeuCau(); // Biến lưu tạm giá trị lấy trong rs ra để sau đó thêm vào listDonYeuCau.
                temp.setFinishTime(rs.getString("FINISHTIMEREQUEST"));
                temp.setStartTime(rs.getString("STARTTIMEREQUEST"));
                temp.setRequestRoom(rs.getString("REQUESTROOM"));
                temp.setUserUsername(rs.getString("USERUSERNAME"));
                temp.setRequestDescription(rs.getString("REQUESTDESCRIPTIONS"));
                temp.setRequestID(rs.getInt("REQUESTID"));
                listDonYeuCau.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listDonYeuCau;
    }

    public static void main(String args[]) {
        PheDuyetYeuCauNguoiDung pheDuyetYeuCau = new PheDuyetYeuCauNguoiDung();
        for (DonYeuCau show : pheDuyetYeuCau.getDanhSachChuaPheDuyet()) {
            System.out.println(show.getUserUsername());
            System.out.println(show.getStartTime());
            System.out.println(show.getFinishTime());
            System.out.println(show.getRequestRoom());
            System.out.println(show.getRequestDescription());
            System.out.println(show.getRequestID());         
        }
//        
//        pheDuyetYeuCau.pheDuyetYeuCau(6);
//        
    }

    /* 
     * Tìm xem trong danh sách các yêu cầu chưa phê duyệt, lấy ra yêu cầu có REQUESTID = requestID,
     * phê duyệt yêu cầu này và đưa nó ra khỏi danh sách chờ, nếu như thiết lập trạng thái cho
     * yêu cầu này là "để sau" (later) thì không cần đưa yêu cầu ra khỏi danh sách chờ.
     */
    public void pheDuyetYeuCau(int requestID) {
        List<DonYeuCau> temp = getDanhSachChuaPheDuyet();
        for (DonYeuCau pheDuyet : temp) {
            if (pheDuyet.getRequestID() == requestID) {
                if (!ketQuaPheDuyet(requestID, "Tu choi", "admin", "Dang ban", 0).equals("Để sau")) {
                    temp.remove(pheDuyet);
                };
                break;
            }         
        }
    }

    public String ketQuaPheDuyet(int requestID, String state, String mngUsername, String note, int fee) {
        try {                        
            if (!state.equals("Để sau")) {
                Connection connection = MysqlConnection.getMysqlConnection();
                String prequery = "INSERT INTO APPROVE(MNGUSERNAME,\n"
                        + "REQUESTID,\n"
                        + "STATE ,\n"
                        + "NOTE ,\n"
                        + "FEE) \n" 
                        + " VALUES(?, ?, ?, ?, ?)";
                PreparedStatement pstatement = connection.prepareStatement(prequery);
                pstatement.setString(1, mngUsername);
                pstatement.setInt(2, requestID);
                pstatement.setString(3, state);
                pstatement.setString(4, note);
                pstatement.setInt(5, fee);
                pstatement.executeUpdate();                
                // Sau khi phê duyệt yêu cầu xong thì loại yêu cầu đó ra khỏi danh sách yêu cầu.
                prequery = "DELETE FROM REQUEST WHERE REQUESTID = " + requestID;
                Statement statement = connection.createStatement();
                statement.executeUpdate(prequery);
            }
        } catch (Exception e) {
            System.out.println(e);            
        }
        return state;
    }
}
