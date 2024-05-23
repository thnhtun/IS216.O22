package View;

import DAO.TrangChuDAO;
import Model.NhanVienModel;
import javax.swing.JOptionPane;

public class TrangBiFrame extends javax.swing.JFrame {
private static NhanVienModel currentUser;
 
    public TrangBiFrame() {
        initComponents();
        addSVG(); // Thêm ảnh SVG vào Frame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        LogoSvg = new Image.SVGImage();
        KhachHangSvg = new Image.SVGImage();
        NhanVienSvg = new Image.SVGImage();
        HopDongSvg = new Image.SVGImage();
        KhuyenMaiSvg = new Image.SVGImage();
        TrangBiSvg = new Image.SVGImage();
        HoaDonSvg = new Image.SVGImage();
        ChamCongSvg = new Image.SVGImage();
        DangXuatSvg = new Image.SVGImage();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TimComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        NhapTextfield = new javax.swing.JTextField();
        TraCuuButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ThemButton = new javax.swing.JButton();
        XoaButton = new javax.swing.JButton();
        SuaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPanel.setBackground(new java.awt.Color(24, 24, 68));
        MenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 220, 46));
        jLabel1.setText("BRIGHT STAR");
        MenuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 120, -1, -1));

        KhachHangLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        KhachHangLb.setForeground(new java.awt.Color(255, 255, 255));
        KhachHangLb.setText("Khách hàng");
        KhachHangLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhachHangLbMouseClicked(evt);
            }
        });
        MenuPanel.add(KhachHangLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        NhanVienLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        NhanVienLb.setForeground(new java.awt.Color(255, 255, 255));
        NhanVienLb.setText("Nhân viên");
        NhanVienLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhanVienLbMouseClicked(evt);
            }
        });
        MenuPanel.add(NhanVienLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        HopDongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        HopDongLb.setForeground(new java.awt.Color(255, 255, 255));
        HopDongLb.setText("Hợp đồng");
        MenuPanel.add(HopDongLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        KhuyenMaiLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        KhuyenMaiLb.setForeground(new java.awt.Color(255, 255, 255));
        KhuyenMaiLb.setText("Khuyến mãi");
        MenuPanel.add(KhuyenMaiLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        TrangBiLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        TrangBiLb.setForeground(new java.awt.Color(255, 255, 255));
        TrangBiLb.setText("Trang bị");
        MenuPanel.add(TrangBiLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        HoaDonLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        HoaDonLb.setForeground(new java.awt.Color(255, 255, 255));
        HoaDonLb.setText("Hoá đơn");
        MenuPanel.add(HoaDonLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        ChamCongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ChamCongLb.setForeground(new java.awt.Color(255, 255, 255));
        ChamCongLb.setText("Chấm công");
        ChamCongLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChamCongLbMouseClicked(evt);
            }
        });
        MenuPanel.add(ChamCongLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        DangXuatLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        DangXuatLb.setForeground(new java.awt.Color(255, 255, 255));
        DangXuatLb.setText("Đăng xuất");
        DangXuatLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatLbMouseClicked(evt);
            }
        });
        MenuPanel.add(DangXuatLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));
        MenuPanel.add(LogoSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 15, 90, 90));
        MenuPanel.add(KhachHangSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 30, 30));
        MenuPanel.add(NhanVienSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 30, 30));
        MenuPanel.add(HopDongSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 30, 30));
        MenuPanel.add(KhuyenMaiSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 30, 30));
        MenuPanel.add(TrangBiSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 30, 30));
        MenuPanel.add(HoaDonSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 30, 30));
        MenuPanel.add(ChamCongSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 30, 30));
        MenuPanel.add(DangXuatSvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 30, 30));

        jPanel1.add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 601));

        jLabel8.setBackground(new java.awt.Color(51, 0, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(19, 19, 79));
        jLabel8.setText("QUẢN LÝ TRANG BỊ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tìm kiếm theo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        TimComboBox.setBackground(new java.awt.Color(255, 255, 255));
        TimComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TimComboBox.setForeground(new java.awt.Color(0, 0, 0));
        TimComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(TimComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 100, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nhập thông tin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        NhapTextfield.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(NhapTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 200, 40));

        TraCuuButton.setBackground(new java.awt.Color(19, 19, 79));
        TraCuuButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TraCuuButton.setForeground(new java.awt.Color(255, 255, 255));
        TraCuuButton.setText("Tra cứu");
        jPanel1.add(TraCuuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 90, 40));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 640, 350));

        ThemButton.setBackground(new java.awt.Color(19, 19, 79));
        ThemButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ThemButton.setForeground(new java.awt.Color(255, 255, 255));
        ThemButton.setText("Thêm");
        jPanel1.add(ThemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 90, 40));

        XoaButton.setBackground(new java.awt.Color(19, 19, 79));
        XoaButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        XoaButton.setForeground(new java.awt.Color(255, 255, 255));
        XoaButton.setText("Xoá");
        jPanel1.add(XoaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, 90, 40));

        SuaButton.setBackground(new java.awt.Color(19, 19, 79));
        SuaButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SuaButton.setForeground(new java.awt.Color(255, 255, 255));
        SuaButton.setText("Sửa");
        jPanel1.add(SuaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSVG(){
         LogoSvg.setSVGImage("image/logo.svg", 90, 90);
         KhachHangSvg.setSVGImage("image/khachhang.svg", 30, 30);
         NhanVienSvg.setSVGImage("image/nhanvien.svg", 30, 30);
         HopDongSvg.setSVGImage("image/hopdong.svg", 30, 30);
         KhuyenMaiSvg.setSVGImage("image/khuyenmai.svg", 30, 30);
         TrangBiSvg.setSVGImage("image/trangbi.svg", 30, 30);
         HoaDonSvg.setSVGImage("image/hoadon.svg", 30, 30);
         ChamCongSvg.setSVGImage("image/chamcong.svg", 30, 30);
         DangXuatSvg.setSVGImage("image/dangxuat.svg", 30, 30);
         
         KhachHangSvg.setWhiteColor();
         NhanVienSvg.setWhiteColor();
         HopDongSvg.setWhiteColor();
         KhuyenMaiSvg.setWhiteColor();
         TrangBiSvg.setWhiteColor();
         HoaDonSvg.setWhiteColor();
         ChamCongSvg.setWhiteColor();
         DangXuatSvg.setWhiteColor();
    }
    
    private void ChamCongLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChamCongLbMouseClicked
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            ChamCongFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_ChamCongLbMouseClicked

    private void NhanVienLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienLbMouseClicked
        System.out.println(currentUser.toString());
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            NhanVienFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_NhanVienLbMouseClicked

    private void KhachHangLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangLbMouseClicked
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1 || TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 3) {
            dispose();
            KhachHangFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_KhachHangLbMouseClicked

    private void DangXuatLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatLbMouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            dispose();
            DangNhapFrame.main(null);
        }
    }//GEN-LAST:event_DangXuatLbMouseClicked

    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangBiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangBiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangBiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangBiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangBiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChamCongLb;
    private Image.SVGImage ChamCongSvg;
    private javax.swing.JLabel DangXuatLb;
    private Image.SVGImage DangXuatSvg;
    private javax.swing.JLabel HoaDonLb;
    private Image.SVGImage HoaDonSvg;
    private javax.swing.JLabel HopDongLb;
    private Image.SVGImage HopDongSvg;
    private javax.swing.JLabel KhachHangLb;
    private Image.SVGImage KhachHangSvg;
    private javax.swing.JLabel KhuyenMaiLb;
    private Image.SVGImage KhuyenMaiSvg;
    private Image.SVGImage LogoSvg;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel NhanVienLb;
    private Image.SVGImage NhanVienSvg;
    private javax.swing.JTextField NhapTextfield;
    private javax.swing.JButton SuaButton;
    private javax.swing.JButton ThemButton;
    private javax.swing.JComboBox<String> TimComboBox;
    private javax.swing.JButton TraCuuButton;
    private javax.swing.JLabel TrangBiLb;
    private Image.SVGImage TrangBiSvg;
    private javax.swing.JButton XoaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
