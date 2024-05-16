/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

//import Dao.TrangChuDao;
import DAO.TrangChuDAO;
import Model.NhanVienModel;
import javax.swing.JOptionPane;

/**
 *
 * @author phuch
 */
public class HomePageEmpFrame extends javax.swing.JFrame {
private static NhanVienModel currentUser;

    public HomePageEmpFrame() {
        initComponents();
         this.setLocationRelativeTo(null);
     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        MenuPanel = new javax.swing.JPanel();
        NhanVienButton = new javax.swing.JButton();
        KhachHangButton = new javax.swing.JButton();
        HopDongButton = new javax.swing.JButton();
        KhuyenMaiButton = new javax.swing.JButton();
        TrangBiButton = new javax.swing.JButton();
        HoaDonButton = new javax.swing.JButton();
        ChamCongButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        MenuPanel.setBackground(new java.awt.Color(153, 153, 255));

        NhanVienButton.setText("Nhân Viên");

        KhachHangButton.setText("Khách Hàng");
        KhachHangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhachHangButtonActionPerformed(evt);
            }
        });

        HopDongButton.setText("Hợp Đồng");
        HopDongButton.setPreferredSize(new java.awt.Dimension(75, 35));
        HopDongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HopDongButtonActionPerformed(evt);
            }
        });

        KhuyenMaiButton.setText("Khuyến Mãi");
        KhuyenMaiButton.setPreferredSize(new java.awt.Dimension(91, 35));
        KhuyenMaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhuyenMaiButtonActionPerformed(evt);
            }
        });

        TrangBiButton.setText("Trang Bị");
        TrangBiButton.setPreferredSize(new java.awt.Dimension(73, 35));
        TrangBiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrangBiButtonActionPerformed(evt);
            }
        });

        HoaDonButton.setText("Hóa Đơn");
        HoaDonButton.setPreferredSize(new java.awt.Dimension(78, 35));
        HoaDonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoaDonButtonActionPerformed(evt);
            }
        });

        ChamCongButton.setText("Chấm Công");
        ChamCongButton.setPreferredSize(new java.awt.Dimension(93, 35));
        ChamCongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChamCongButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChamCongButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(HoaDonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TrangBiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HopDongButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KhachHangButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(NhanVienButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KhuyenMaiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(KhachHangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NhanVienButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HopDongButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KhuyenMaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TrangBiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(HoaDonButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChamCongButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        getContentPane().add(MenuPanel);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Trang nội bộ khách sạn ");

        Logout.setBackground(new java.awt.Color(153, 153, 255));
        Logout.setText("Đăng xuất ");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Logout)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        dispose();
        DangNhapFrame.main(null);
    }//GEN-LAST:event_LogoutActionPerformed

    private void HopDongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HopDongButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HopDongButtonActionPerformed

    private void KhuyenMaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhuyenMaiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KhuyenMaiButtonActionPerformed

    private void TrangBiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrangBiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrangBiButtonActionPerformed

    private void HoaDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoaDonButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoaDonButtonActionPerformed

    private void ChamCongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChamCongButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChamCongButtonActionPerformed

    private void KhachHangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhachHangButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        KhachHangFrame.main(currentUser);
    }//GEN-LAST:event_KhachHangButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(NhanVienModel args) {
        currentUser = args;
        currentUser.setMaNV(args.getMaNV());
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomePageEmpFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChamCongButton;
    private javax.swing.JButton HoaDonButton;
    private javax.swing.JButton HopDongButton;
    private javax.swing.JButton KhachHangButton;
    private javax.swing.JButton KhuyenMaiButton;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JButton NhanVienButton;
    private javax.swing.JButton TrangBiButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
