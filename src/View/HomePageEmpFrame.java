
package View;

import DAO.TrangChuDAO;
import Model.NhanVienModel;
import javax.swing.JOptionPane;



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
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        MenuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        KhachHangLb = new javax.swing.JLabel();
        NhanVienLb = new javax.swing.JLabel();
        HopDongLb = new javax.swing.JLabel();
        KhuyenMaiLb = new javax.swing.JLabel();
        TrangBiLb = new javax.swing.JLabel();
        HoaDonLb = new javax.swing.JLabel();
        ChamCongLb = new javax.swing.JLabel();
        DangXuatLb = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(24, 24, 68));
        jLabel8.setText("TRANG NỘI BỘ KHÁCH SẠN");

        MenuPanel.setBackground(new java.awt.Color(24, 24, 68));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 220, 46));
        jLabel1.setText("BRIGHT STAR");

        KhachHangLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        KhachHangLb.setForeground(new java.awt.Color(255, 255, 255));
        KhachHangLb.setText("Khách hàng");
        KhachHangLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhachHangLbMouseClicked(evt);
            }
        });

        NhanVienLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        NhanVienLb.setForeground(new java.awt.Color(255, 255, 255));
        NhanVienLb.setText("Nhân viên");
        NhanVienLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhanVienLbMouseClicked(evt);
            }
        });

        HopDongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        HopDongLb.setForeground(new java.awt.Color(255, 255, 255));
        HopDongLb.setText("Hợp đồng");

        KhuyenMaiLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        KhuyenMaiLb.setForeground(new java.awt.Color(255, 255, 255));
        KhuyenMaiLb.setText("Khuyến mãi");

        TrangBiLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        TrangBiLb.setForeground(new java.awt.Color(255, 255, 255));
        TrangBiLb.setText("Trang bị");

        HoaDonLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        HoaDonLb.setForeground(new java.awt.Color(255, 255, 255));
        HoaDonLb.setText("Hoá đơn");

        ChamCongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ChamCongLb.setForeground(new java.awt.Color(255, 255, 255));
        ChamCongLb.setText("Chấm công");
        ChamCongLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChamCongLbMouseClicked(evt);
            }
        });

        DangXuatLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        DangXuatLb.setForeground(new java.awt.Color(255, 255, 255));
        DangXuatLb.setText("Đăng xuất");
        DangXuatLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatLbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(KhachHangLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(NhanVienLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(HopDongLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(KhuyenMaiLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(TrangBiLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(HoaDonLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(ChamCongLb))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(DangXuatLb)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(KhachHangLb)
                .addGap(23, 23, 23)
                .addComponent(NhanVienLb)
                .addGap(23, 23, 23)
                .addComponent(HopDongLb)
                .addGap(23, 23, 23)
                .addComponent(KhuyenMaiLb)
                .addGap(23, 23, 23)
                .addComponent(TrangBiLb)
                .addGap(23, 23, 23)
                .addComponent(HoaDonLb)
                .addGap(23, 23, 23)
                .addComponent(ChamCongLb)
                .addGap(53, 53, 53)
                .addComponent(DangXuatLb)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(145, 145, 145))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KhachHangLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangLbMouseClicked
        dispose();
        KhachHangFrame.main(currentUser);
    }//GEN-LAST:event_KhachHangLbMouseClicked

    private void NhanVienLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienLbMouseClicked
        System.out.println(currentUser.toString());
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            NhanVienFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_NhanVienLbMouseClicked

    private void ChamCongLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChamCongLbMouseClicked
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            ChamCongFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_ChamCongLbMouseClicked

    private void DangXuatLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatLbMouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            dispose();
            DangNhapFrame.main(null);
        }
    }//GEN-LAST:event_DangXuatLbMouseClicked


    public static void main(NhanVienModel args) {
        currentUser = args;
        currentUser.setMaNV(args.getMaNV());

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
        
        java.awt.EventQueue.invokeLater(() -> {
            new HomePageEmpFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChamCongLb;
    private javax.swing.JLabel DangXuatLb;
    private javax.swing.JLabel HoaDonLb;
    private javax.swing.JLabel HopDongLb;
    private javax.swing.JLabel KhachHangLb;
    private javax.swing.JLabel KhuyenMaiLb;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel NhanVienLb;
    private javax.swing.JLabel TrangBiLb;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
