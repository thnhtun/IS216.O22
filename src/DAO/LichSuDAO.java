/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.*;
import Model.LichSuModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
/**
 *
 * @author phuch
 */
public class LichSuDAO {
   public static ArrayList<LichSuModel> getDSLS(){
    ArrayList<LichSuModel> DS_LichSu = new ArrayList<>();
    Connection con = null;
    try {
        String sql = "SELECT KHACHHANG.MaKH, HOPDONGTHUEPHONG.MaHopDong, KHACHHANG.TenKH, HOPDONGTHUEPHONG.TGNhanPhong, HOPDONGTHUEPHONG.TGTraPhong, HOADON.TongTien FROM HOPDONGTHUEPHONG INNER JOIN KHACHHANG ON KHACHHANG.MaKH = HOPDONGTHUEPHONG.MaKH INNER JOIN HOADON ON HOADON.MaHopDong = HOPDONGTHUEPHONG.MaHopDong";
        con = JDBCUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            LichSuModel lichSu = new LichSuModel(
                rs.getInt("MaKH"),
                rs.getInt("MaHopDong"),
                rs.getString("TenKH"),
                rs.getTimestamp("TGNhanPhong").toLocalDateTime(),
                rs.getTimestamp("TGTraPhong").toLocalDateTime(),
                rs.getDouble("TongTien")
            );
            DS_LichSu.add(lichSu);
        }
    } catch (SQLException ex) {
        System.err.println("SQL Error: " + ex.getMessage());
        throw new RuntimeException("Error accessing database", ex);
    } finally {
        try {
            if (con != null) con.close();
        } catch (SQLException ex) {
            System.err.println("Error closing connection: " + ex.getMessage());
        }
    }
    return DS_LichSu;
}
   public static ArrayList<LichSuModel> timKH( String textInput){
        ArrayList<LichSuModel> DS_LS = new ArrayList<>();
        try {
            Connection con = null;
            con = JDBCUtil.getConnection();
            String sql = "SELECT KHACHHANG.MaKH, HOPDONGTHUEPHONG.MaHopDong, KHACHHANG.TenKH, HOPDONGTHUEPHONG.TGNhanPhong, HOPDONGTHUEPHONG.TGTraPhong, HOADON.TongTien FROM HOPDONGTHUEPHONG INNER JOIN KHACHHANG ON KHACHHANG.MaKH = HOPDONGTHUEPHONG.MaKH INNER JOIN HOADON ON HOADON.MaHopDong = HOPDONGTHUEPHONG.MaHopDong WHERE KHACHHANG.CCCD=?";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, textInput);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                LichSuModel lichsu_temp = new LichSuModel();
                lichsu_temp.setMaKH(rs.getInt("MaKH"));
                lichsu_temp.setMaHD(rs.getInt("MaHopDong"));
                lichsu_temp.setTenKH(rs.getString("TenKH"));
                lichsu_temp.settGNhanPhong(rs.getTimestamp("TGNhanPhong").toLocalDateTime());
                lichsu_temp.settGTraPhong(rs.getTimestamp("TGTraPhong").toLocalDateTime());
                lichsu_temp.setTongTien(rs.getDouble("TongTien"));
                DS_LS.add(lichsu_temp);
            }
            con.close();
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return DS_LS;
    }
}
