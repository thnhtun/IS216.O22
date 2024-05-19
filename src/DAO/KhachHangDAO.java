
package DAO;

import Connection.JDBCUtil;
import Model.KhachHangModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.time.LocalDate;
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
    
    
    public static int XoaKH(String value) throws SQLException {
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(value);
        String sql = "DELETE KHACHHANG WHERE MAKH=?";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setString(1, value);
        return ps.executeUpdate();
    }
    
    public static boolean CapNhatKH(String maKH, KhachHangModel kh) throws SQLException {
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        String sql = "UPDATE KHACHHANG SET TENKH=?, CCCD=?, NGAYSINH=?, GIOITINH=?, DIACHI=?, SDT=? WHERE MAKH =?";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setString(1, kh.getTenKH());
        ps.setString(2, kh.getCCCD());
        ps.setObject(3, kh.getNgaySinh());
        ps.setString(4, kh.getGioiTinh());
        ps.setString(5, kh.getDiaChi());
        ps.setString(6, kh.getSDT());
        ps.setString(8, maKH);
        return ps.executeUpdate() > 0;
    }

    public static boolean isAvailable(String manv) throws SQLException {
        boolean result = false;
        String str = "";
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException ex) {
        }

        String sql = "SELECT * FROM KHACHHANG WHERE MaKH=?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, manv);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            str = rs.getString("MaKH");
        }
        if (!str.equals("")) {
            result = true;
        }

        con.close();

        return result;
    }
    
    public boolean ThemKH(KhachHangModel kh) throws SQLException {
        
        Connection con = null;

        try {
            // Tạo kết nối đến cơ sở dữ liệu
            con = JDBCUtil.getConnection();

            // Thực thi câu lệnh SQL
            String sql = "INSERT INTO KHACHHANG (MaKH, TenKH, CCCD, NgaySinh, GioiTinh, DiaChi, SDT, SoHopDong) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
            // Tạo đối tượng PreparedStatement
            PreparedStatement ps = con.prepareStatement(sql);
        
            // Thiết lập các tham số cho câu lệnh SQL
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTenKH());
            ps.setString(3, kh.getCCCD());
            ps.setObject(4, kh.getNgaySinh()); 
            ps.setString(5, kh.getGioiTinh());
            ps.setString(6, kh.getDiaChi());
            ps.setString(7, kh.getSDT());
            ps.setInt(8, kh.getSoHopDong());
            
            System.out.println("thêm thành công");

            // Thực thi câu lệnh SQL
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } 
    }
    
    public static KhachHangModel getKHtheoMaKHK(String maKH) throws SQLException {
        // Tạo câu truy vấn 
        String sql = "SELECT * FROM KHACHHANG WHERE MaKH=?";

        // Tạo đối tượng connection
        Connection conn = null;
        KhachHangModel kh = null;

        try {
            conn = JDBCUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maKH);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String TenKH = rs.getString(2);
                String CCCD = rs.getString(3);
                LocalDate NgaySinh = rs.getDate(4).toLocalDate();
                String GioiTinh = rs.getString(5);
                String DiaChi = rs.getString(6);
                String SDT = rs.getString(7);
                int SoHopDong  = rs.getInt(8);

                // gọi constructor
                kh = new KhachHangModel(maKH, TenKH, CCCD, NgaySinh, GioiTinh, DiaChi, SDT, SoHopDong);
            }

            rs.close();
            ps.close();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return kh;
    }

    
    public static ArrayList<KhachHangModel> TimKH(String option, String textInput) {
        ArrayList<KhachHangModel> DS_KH = new ArrayList<>();
        try {
            Connection con = null;
            con = JDBCUtil.getConnection();
            String sql = null;
            switch (option) {
                case "Mã KH":
                    sql = "SELECT * FROM KHACHHANG WHERE LOWER(MAKH) LIKE LOWER(?)";
                    textInput = "%" + textInput + "%"; // Để tìm theo chuỗi con
                    break;
                case "Họ tên":
                    sql = "SELECT * FROM KHACHHANG WHERE LOWER(TENKH) LIKE LOWER(?)";
                    textInput = "%" + textInput + "%"; // Để tìm theo chuỗi con
                    break;
                case "CCCD":
                    sql = "SELECT * FROM KHACHHANG WHERE CCCD = ?";
                    break;
                case "SĐT":
                    sql = "SELECT * FROM KHACHHANG WHERE SDT = ?";
                    break;
            }

            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, textInput);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangModel kh_temp = new KhachHangModel();
                kh_temp.setMaKH(rs.getString("MAKH"));
                kh_temp.setTenKH(rs.getString("TENKH"));
                kh_temp.setCCCD(rs.getString("CCCD"));
                kh_temp.setNgaySinh(rs.getDate("NGAYSINH").toLocalDate());
                kh_temp.setGioiTinh(rs.getString("GIOITINH"));
                kh_temp.setDiaChi(rs.getString("DIACHI"));
                kh_temp.setSDT(rs.getString("SDT"));
                kh_temp.setSoHopDong(rs.getInt("SOHOPDONG"));
                DS_KH.add(kh_temp);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DS_KH;
    }
}
