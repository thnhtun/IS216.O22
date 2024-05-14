
package DAO;

import Connection.JDBCUtil;
import Model.KhachHangModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class KhachHangDAO {
    
    // lấy danh sách khách hàng có trong cơ sở dữ liệu
    public static ArrayList<KhachHangModel> getDSKhachHang() {
        
        // Tạo cái ArrayList lưu danh sách khách hàng
        ArrayList<KhachHangModel> DS_KH = new ArrayList<>();
        try {
            
            // Tạo câu truy vấn 
            String sql = "SELECT * FROM KHACHHANG";
            
            // Tạo đối tượng connection
            Connection conn = null;
            conn = JDBCUtil.getConnection();
            
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            DS_KH.clear();
            
            while (rs.next()) {
                String MaKH = rs.getString(1);
                String TenKH = rs.getString(2);
                String CCCD = rs.getString(3);
                LocalDate NgaySinh = rs.getDate(4).toLocalDate();
                String GioiTinh = rs.getString(5);
                String DiaChi = rs.getString(6);
                String SDT = rs.getString(7);
                int SoHopDong = rs.getInt(8);
                
                // gọi contructer
                KhachHangModel kh = new KhachHangModel(MaKH, TenKH, CCCD, NgaySinh,  GioiTinh, DiaChi, SDT, SoHopDong);
                DS_KH.add(kh);
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DS_KH;
    }
}
