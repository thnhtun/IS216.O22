package DAO;


import java.util.logging.Level;
import java.util.logging.Logger;
import Connection.JDBCUtil;
import Model.NhanVienModel;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
                        rs.getString("SDT"),
                        rs.getString("LoaiNV"),
                        rs.getString("TaiKhoan"),
                        rs.getString("MatKhau"),
                        rs.getLong("LuongCB")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    // lấy danh sách nhân viên có trong cơ sở dữ liệu
    public static ArrayList<NhanVienModel> getDSNhanVien() throws SQLException {
        
        // Tạo cái ArrayList lưu danh sách nhân viên
        ArrayList<NhanVienModel> DS_NV = new ArrayList<>();
        try {
            
            // Tạo câu truy vấn 
            String sql = "SELECT * FROM NHANVIEN ORDER BY MANV ASC";
            
            // Tạo đối tượng connection
            Connection conn = null;
            conn = JDBCUtil.getConnection();
            
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            DS_NV.clear();
            
            while (rs.next()) {
                int MaNV = rs.getInt(1);
                String TenNV = rs.getString(2);
                String CCCD = rs.getString(3);
                LocalDate NgaySinh = rs.getDate(4).toLocalDate();
                String GioiTinh = rs.getString(5);
                String DiaChi = rs.getString(6); 
                String SDT = rs.getString(7);
                String LoaiNV = rs.getString(8);
                String TaiKhoan = rs.getString(9);
                String MatKhau = rs.getString(10);
                long LuongCB = rs.getLong(11);
                
                
                // gọi contructer
                NhanVienModel kh = new NhanVienModel(MaNV, TenNV, CCCD, NgaySinh, GioiTinh, DiaChi, SDT, LoaiNV, TaiKhoan, MatKhau, LuongCB);
                DS_NV.add(kh);
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DS_NV;
    }
    
    // Tra cứu nhân viên đầu vào là 5 option MaNV, tên NV, CCCD, SOoDDT và Loại NV
    public static ArrayList<NhanVienModel> TimNV(String option, String textInput) {
        ArrayList<NhanVienModel> DS_NV = new ArrayList<>();
        try {
            // Tạo đối tượng kết nối
            Connection con = null;
            con = JDBCUtil.getConnection();
            String sql = null;
            
            switch (option) {
                case "Mã NV" -> {
                    sql = "SELECT * FROM NHANVIEN WHERE LOWER(MANV) LIKE LOWER(?)";
                    textInput = "%" + textInput + "%"; // Để tìm theo chuỗi con
                }
                case "Họ tên" -> {
                    sql = "SELECT * FROM NHANVIEN WHERE LOWER(TENNV) LIKE LOWER(?)";
                    textInput = "%" + textInput + "%"; // Để tìm theo chuỗi con
                }
                case "CCCD" -> sql = "SELECT * FROM NHANVIEN WHERE CCCD = ?";
                case "SĐT" -> sql = "SELECT * FROM NHANVIEN WHERE SDT = ?";
                case "Loại NV" -> {
                    sql = "SELECT * FROM NHANVIEN WHERE LOWER(LOAINV) LIKE LOWER(?)";
                    textInput = "%" + textInput + "%"; // Để tìm theo chuỗi con
                }
            }

            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, textInput);
                       
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVienModel nv_temp = new NhanVienModel();
                nv_temp.setMaNV(rs.getInt("MANV"));
                nv_temp.setTenNV(rs.getString("TENNV"));
                nv_temp.setCCCD(rs.getString("CCCD"));
                nv_temp.setNgaySinh(rs.getDate("NGAYSINH").toLocalDate());
                nv_temp.setGioiTinh(rs.getString("GIOITINH"));
                nv_temp.setDiaChi(rs.getString("DIACHI"));
                nv_temp.setSDT(rs.getString("SDT"));
                nv_temp.setLoaiNV(rs.getString("LOAINV"));
                nv_temp.setTaiKhoan(rs.getString("TAIKHOAN"));
                nv_temp.setMatKhau(rs.getString("MATKHAU"));
                nv_temp.setLuongCB(rs.getLong("LUONGCB"));
                DS_NV.add(nv_temp);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DS_NV;
    }
    
    public boolean ThemNV(NhanVienModel nv) throws SQLException {
        String sql = "INSERT INTO DATABASE_DOAN_NPNT.NHANVIEN (MANV, TENNV, CCCD, GIOITINH, NGAYSINH, DIACHI, LOAINV, TAIKHOAN, MATKHAU, SDT, LUONGCB) VALUES (NhanVien_Seq.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = JDBCUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            // Thiết lập các tham số cho câu lệnh SQL
            ps.setString(1, nv.getTenNV());
            ps.setString(2, nv.getCCCD());
            ps.setString(3, nv.getGioiTinh());
            ps.setObject(4, nv.getNgaySinh());
            ps.setString(5, nv.getDiaChi());
            ps.setString(6, nv.getLoaiNV());


            // Kiểm tra điều kiện mỗi loại nhân viên sẽ được cấp tài khoản và mật khẩu khác nhau
            switch (nv.getLoaiNV()) {
                case "Quản lý" -> {
                    ps.setString(7, "quanly" + nv.getMaNV());
                    ps.setString(8, nv.getMatKhau());
                }
                case "Lễ tân" -> {
                    ps.setString(7, "letan" + nv.getMaNV());
                    ps.setString(8, nv.getMatKhau());
                }
                case "Tạp Vụ" -> {
                    ps.setNull(7, java.sql.Types.VARCHAR);
                    ps.setNull(8, java.sql.Types.VARCHAR);
                }

            }
            ps.setString(9, nv.getSDT());
            ps.setLong(10, nv.getLuongCB());

            // Thực thi câu lệnh SQL
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    
    public static int XoaNV(int value) throws SQLException {
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
//        System.out.println(value);
        String sql = "DELETE NHANVIEN WHERE MANV=?";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setInt(1, value);
        return ps.executeUpdate();
    }
    
    public static boolean CapNhatNV(int maNV, NhanVienModel nv) throws SQLException {
        
        // tạo đối tượng kết nối với dtb
        Connection con = null;
        try {
            con = JDBCUtil.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        
        String sql = "UPDATE NHANVIEN SET TENNV=?, CCCD=?, NGAYSINH=?, GIOITINH=?, DIACHI=?, SDT=?, MATKHAU=?, LUONGCB=? WHERE MANV =?";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setString(1, nv.getTenNV());
        ps.setString(2, nv.getCCCD());
        ps.setObject(3, nv.getNgaySinh());
        ps.setString(4, nv.getGioiTinh());
        ps.setString(5, nv.getDiaChi());
        ps.setString(6, nv.getSDT());
        ps.setString(7, nv.getMatKhau());
        ps.setLong(8, nv.getLuongCB());
        ps.setInt(9, maNV);
        return ps.executeUpdate() > 0;
    }

    
    public static NhanVienModel getNVtheoMaNV(int maNV) throws SQLException {
        // Tạo câu truy vấn 
        String sql = "SELECT * FROM NHANVIEN WHERE MaNV=?";

        // Tạo đối tượng connection
        Connection conn = null;
        NhanVienModel nv = null;

        try {
            conn = JDBCUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, maNV);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String TenNV = rs.getString(2);
                String CCCD = rs.getString(3);
                LocalDate NgaySinh = rs.getDate(4).toLocalDate();
                String GioiTinh = rs.getString(5);
                String DiaChi = rs.getString(6);
                String SDT = rs.getString(7);
                String LoaiNV = rs.getString(8); 
                String TaiKhoan = rs.getString(9);
                String MatKhau = rs.getString(10);
                long LuongCB = rs.getLong(11);

                // gọi constructor
                nv = new NhanVienModel(maNV, TenNV, CCCD, NgaySinh, GioiTinh, DiaChi, SDT, LoaiNV, TaiKhoan, MatKhau, LuongCB);
            }

            rs.close();
            ps.close();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return nv;
    }
}
