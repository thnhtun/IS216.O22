/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Connection.JDBCUtil;
import Model.NhanVienModel;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author phuch
 */
public class NhanVienDAO {
   public static NhanVienModel getUser(String user, String password) {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
        con = JDBCUtil.getConnection();
        String sql = "SELECT * FROM NhanVien WHERE TaiKhoan=? AND MatKhau=?";
        ps = con.prepareStatement(sql);
        ps.setString(1, user);
        ps.setString(2, password);
        
        rs = ps.executeQuery();
        if (rs.next()) {
            LocalDate NgaySinh = rs.getObject("NgaySinh", LocalDate.class);
            return new NhanVienModel(
                rs.getInt("MaNV"),
                rs.getString("TenNV"),
                rs.getString("CCCD"),
                NgaySinh,
                rs.getString("GioiTinh"),
                rs.getString("DiaChi"),
                rs.getString("LoaiNV"),
                rs.getString("TaiKhoan"),
                rs.getString("MatKhau"),
                rs.getDouble("LuongCB")
            );
        }
    } catch (SQLException ex) {
        Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return null;
}

}
