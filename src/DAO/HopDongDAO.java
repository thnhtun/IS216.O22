
package DAO;

import Connection.JDBCUtil;
import Model.HopDongModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class HopDongDAO {
    
    
    // lấy danh sách khách hàng có trong cơ sở dữ liệu
    public static ArrayList<HopDongModel> getDSHopDong() {
        
        // Tạo cái ArrayList lưu danh sách khách hàng
        ArrayList<HopDongModel> DS_HopDong = new ArrayList<>();
        try {
            
            // Tạo câu truy vấn 
            String sql = "SELECT * FROM HOPDONGTHUEPHONG ORDER BY MaHopDong DESC";
            
            // Tạo đối tượng connection
            Connection conn = null;
            conn = JDBCUtil.getConnection();
            
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            DS_HopDong.clear();
            
            while (rs.next()) {
                int MaHopDong = rs.getInt(1);
                int MaKH = rs.getInt(2);
                LocalDateTime NgayLapHopDong = rs.getTimestamp(3).toLocalDateTime();
                LocalDateTime TGNhanPhong = rs.getTimestamp(4).toLocalDateTime();
                LocalDateTime TGTraPhong = rs.getTimestamp(5).toLocalDateTime();
                String TinhTrangHD = rs.getString(6);
                int SoNguoiLon = rs.getInt(7);
                int SoTreEm = rs.getInt(8);
                double TriGiaHopDong = rs.getDouble(9);
               
                
                // gọi contructer
                HopDongModel hopDong = new HopDongModel(MaHopDong, MaKH, NgayLapHopDong, TGNhanPhong, TGTraPhong,  TinhTrangHD, SoNguoiLon, SoTreEm, TriGiaHopDong);
                DS_HopDong.add(hopDong);
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DS_HopDong;
    }
    
    public static ArrayList<HopDongModel> getHopDongTheoTinhTrang(String textInput) {
        ArrayList<HopDongModel> DS_HopDong = new ArrayList<>();
        try {
            Connection con = null;
            con = JDBCUtil.getConnection();
            String sql = null;
            
            sql = "SELECT * FROM HOPDONGTHUEPHONG WHERE TinhTrangHD = ?";            

            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, textInput);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HopDongModel hopdong_temp = new HopDongModel();
                hopdong_temp.setMaHopDong(rs.getInt("MAHOPDONG"));
                hopdong_temp.setMaKH(rs.getInt("MAKH"));
                hopdong_temp.setNgayLapHopDong(rs.getTimestamp("NGAYLAPHOPDONG").toLocalDateTime());
                hopdong_temp.setTGNhanPhong(rs.getTimestamp("TGNHANPHONG").toLocalDateTime());
                hopdong_temp.setTGTraPhong(rs.getTimestamp("TGTRAPHONG").toLocalDateTime());
                hopdong_temp.setTinhTrangHD(rs.getString("TINHTRANGHD"));
                hopdong_temp.setSoLuongNguoiLon(rs.getInt("SONGUOILON"));
                hopdong_temp.setSoLuongTreEm(rs.getInt("SOTREEM"));
                hopdong_temp.setTriGiaHopDong(rs.getDouble("TRIGIAHD"));
                DS_HopDong.add(hopdong_temp);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DS_HopDong;
    }
    
    public static ArrayList<HopDongModel> TimHopDong(String option, String textInput) {
        ArrayList<HopDongModel> DS_HopDong = new ArrayList<>();
        try {
            Connection con = null;
            con = JDBCUtil.getConnection();
            String sql = null;
            switch (option) {
                case "Mã Hợp Đồng":
                    sql = "SELECT * FROM HOPDONGTHUEPHONG WHERE LOWER(MAHOPDONG) LIKE LOWER(?)";
                    textInput = "%" + textInput + "%"; // Để tìm theo chuỗi con
                    break;
                case "Mã KH":
                    sql = "SELECT * FROM HOPDONGTHUEPHONG WHERE LOWER(MAKH) LIKE LOWER(?)";
                    textInput = "%" + textInput + "%"; // Để tìm theo chuỗi con
                    break;
                case "Tình Trạng HĐ":
                    sql = "SELECT * FROM HOPDONGTHUEPHONG WHERE LOWER(TINHTRANGHD) LIKE LOWER(?)";
                    textInput = "%" + textInput + "%"; // Để tìm theo chuỗi con
                    break;
            }

            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, textInput);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HopDongModel hopdong_temp = new HopDongModel();
                hopdong_temp.setMaHopDong(rs.getInt("MAHOPDONG"));
                hopdong_temp.setMaKH(rs.getInt("MAKH"));
                hopdong_temp.setNgayLapHopDong(rs.getTimestamp("NGAYLAPHOPDONG").toLocalDateTime());
                hopdong_temp.setTGNhanPhong(rs.getTimestamp("TGNHANPHONG").toLocalDateTime());
                hopdong_temp.setTGTraPhong(rs.getTimestamp("TGTRAPHONG").toLocalDateTime());
                hopdong_temp.setTinhTrangHD(rs.getString("TINHTRANGHD"));
                hopdong_temp.setSoLuongNguoiLon(rs.getInt("SONGUOILON"));
                hopdong_temp.setSoLuongTreEm(rs.getInt("SOTREEM"));
                hopdong_temp.setTriGiaHopDong(rs.getDouble("TRIGIAHD"));
                DS_HopDong.add(hopdong_temp);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DS_HopDong;
    }
    
    public static int XoaHopDong(int maHopDong) throws SQLException {
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String sql = "DELETE HOPDONGTHUEPHONG WHERE MAHOPDONG=?";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setInt(1, maHopDong);
        
        
        return ps.executeUpdate();
    }
    
    public static HopDongModel getHDtheoMaHopDong(int maHopDong) throws SQLException {
        // Tạo câu truy vấn 
        String sql = "SELECT * FROM HOPDONGTHUEPHONG WHERE MaHopDong=?";

        // Tạo đối tượng connection
        Connection conn = null;
        HopDongModel hopDong = null;

        try {
            conn = JDBCUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, maHopDong);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int MaKH = rs.getInt(2);
                LocalDateTime NgayLapHopDong = rs.getTimestamp(3).toLocalDateTime();
                LocalDateTime TGNhanPhong = rs.getTimestamp(4).toLocalDateTime();
                LocalDateTime TGTraPhong = rs.getTimestamp(5).toLocalDateTime();
                String TinhTrangHD = rs.getString(6);
                int SoNguoiLon = rs.getInt(7);
                int SoTreEm = rs.getInt(8);
                double TriGiaHopDong = rs.getDouble(9);

                // gọi constructor
                hopDong = new HopDongModel(MaKH, NgayLapHopDong, TGNhanPhong, TGTraPhong,  TinhTrangHD, SoNguoiLon, SoTreEm, TriGiaHopDong);
            }

            rs.close();
            ps.close();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return hopDong;
    }
    
    public static boolean CapNhatHopDong(int maHopDong, HopDongModel hopDong) throws SQLException {
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        String sql = "UPDATE HOPDONGTHUEPHONG SET SONGUOILON = ?, SOTREEM = ?, NGAYLAPHOPDONG = ?, TINHTRANGHD = ? WHERE MAKH =?";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setInt(1, hopDong.getSoLuongNguoiLon());
        ps.setInt(2, hopDong.getSoLuongTreEm());
        ps.setObject(3, hopDong.getNgayLapHopDong());
        ps.setString(4, hopDong.getTinhTrangHD());
        ps.setInt(5, maHopDong);
        return ps.executeUpdate() > 0;
    }

    
}
