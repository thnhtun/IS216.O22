package DAO;

import Connection.JDBCUtil;
import Model.ChamCongModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChamCongDAO {

    public static ArrayList<ChamCongModel> showMACC(Integer manv) {
        ArrayList<ChamCongModel> DSCC = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CHAMCONG WHERE CHAMCONG.MaNV = ?";
            Connection con = JDBCUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, manv);  // Sử dụng setInt vì manv giờ là Integer
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChamCongModel cms = new ChamCongModel(
                        rs.getInt("MaCC"),
                        rs.getInt("MaNV"),
                        rs.getInt("SONGAYDILAM"),
                        rs.getInt("SOGIOLAMTHEM")
                );
                DSCC.add(cms);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return DSCC;
    }

    public static boolean ChamCong(Integer manv, ChamCongModel cc) throws SQLException {
        Connection con = null;
        con = JDBCUtil.getConnection();
        String sql = "UPDATE CHAMCONG SET SOGIOLAMTHEM=SOGIOLAMTHEM+?, SONGAYDILAM=SONGAYDILAM+1 WHERE MaNV=?";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        //ps.setString(1, km.getMaKM());
        ps.setInt(1, cc.getSGLT());
        //ps.setString(5, cc.getNgayKT());
        ps.setInt(2, manv);

        return ps.executeUpdate() > 0;
    }
}
