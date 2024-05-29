/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DAO;

import Connection.*;
import Model.ChamCongModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author phuch
 */
public class ChamCongDAO extends javax.swing.JFrame {

     public static ArrayList<ChamCongModel> showMACC(Integer manv){
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

     
   

  public static boolean ChamCong(Integer manv, ChamCongModel cc) throws SQLException{
        Connection con = null;      
        con = JDBCUtil.getConnection();
        String sql = "UPDATE CHAMCONG SET SOGIOLAMTHEM=SOGIOLAMTHEM+?, SONGAYDILAM=SONGAYDILAM+1 WHERE MaNV=?";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        //ps.setString(1, km.getMaKM());
        ps.setInt(1, cc.getSGLT());
        //ps.setString(5, cc.getNgayKT());
        ps.setInt(2,manv);
        
        return ps.executeUpdate()>0;
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChamCongDAO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
