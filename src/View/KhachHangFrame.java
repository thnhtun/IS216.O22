
package View;

import DAO.KhachHangDAO;
import Model.KhachHangModel;
import Model.NhanVienModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class KhachHangFrame extends javax.swing.JFrame {
private static NhanVienModel currentUser;
    /**
     * Creates new form HomePageEmpFrame
     */
    public KhachHangFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        
        dsKhachhangjTable.setModel(defaultTableModel);
               
        defaultTableModel.addColumn("Mã KH");
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("CCCD");
        defaultTableModel.addColumn("Ngày sinh");
        defaultTableModel.addColumn("Giới tính");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("SĐT");
        defaultTableModel.addColumn("Số hợp đồng");
        
        
        ArrayList<KhachHangModel> danhSachKH = KhachHangDAO.getDSKhachHang();         
        
        for (KhachHangModel kh : danhSachKH){
            defaultTableModel.addRow(new Object[]{kh.getMaKH(), kh.getTenKH(), kh.getCCCD(), kh.getNgaySinh(),
                                        kh.getGioiTinh(), kh.getDiaChi(), kh.getSDT(), kh.getSoHopDong()});
        }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPanel = new javax.swing.JPanel();
        jPanelKhachhang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelNhanvien = new javax.swing.JPanel();
        NhanVien = new javax.swing.JLabel();
        jPanelHopdong = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelKhuyenmai = new javax.swing.JLabel();
        jPanelTrangbi = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelChamcong = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelHoadon = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dsKhachhangjTable = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        traCuuJBut = new javax.swing.JButton();
        themjButton = new javax.swing.JButton();
        xoajButton = new javax.swing.JButton();
        suajButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuPanel.setBackground(new java.awt.Color(153, 153, 255));

        jPanelKhachhang.setBackground(new java.awt.Color(255, 255, 255));
        jPanelKhachhang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelKhachhang.setPreferredSize(new java.awt.Dimension(130, 38));

        jLabel1.setText("Khách hàng ");

        javax.swing.GroupLayout jPanelKhachhangLayout = new javax.swing.GroupLayout(jPanelKhachhang);
        jPanelKhachhang.setLayout(jPanelKhachhangLayout);
        jPanelKhachhangLayout.setHorizontalGroup(
            jPanelKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhachhangLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanelKhachhangLayout.setVerticalGroup(
            jPanelKhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKhachhangLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanelNhanvien.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNhanvien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelNhanvien.setPreferredSize(new java.awt.Dimension(130, 38));

        NhanVien.setText("Nhân viên ");

        javax.swing.GroupLayout jPanelNhanvienLayout = new javax.swing.GroupLayout(jPanelNhanvien);
        jPanelNhanvien.setLayout(jPanelNhanvienLayout);
        jPanelNhanvienLayout.setHorizontalGroup(
            jPanelNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanvienLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(NhanVien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNhanvienLayout.setVerticalGroup(
            jPanelNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NhanVien)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanelHopdong.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHopdong.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelHopdong.setPreferredSize(new java.awt.Dimension(130, 38));

        jLabel3.setText("Hợp đồng ");

        javax.swing.GroupLayout jPanelHopdongLayout = new javax.swing.GroupLayout(jPanelHopdong);
        jPanelHopdong.setLayout(jPanelHopdongLayout);
        jPanelHopdongLayout.setHorizontalGroup(
            jPanelHopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHopdongLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanelHopdongLayout.setVerticalGroup(
            jPanelHopdongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHopdongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setPreferredSize(new java.awt.Dimension(130, 38));

        jLabelKhuyenmai.setText("Khuyến mãi ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelKhuyenmai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabelKhuyenmai)
                .addContainerGap())
        );

        jPanelTrangbi.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTrangbi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTrangbi.setPreferredSize(new java.awt.Dimension(130, 38));

        jLabel5.setText("Trang bị ");

        javax.swing.GroupLayout jPanelTrangbiLayout = new javax.swing.GroupLayout(jPanelTrangbi);
        jPanelTrangbi.setLayout(jPanelTrangbiLayout);
        jPanelTrangbiLayout.setHorizontalGroup(
            jPanelTrangbiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrangbiLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanelTrangbiLayout.setVerticalGroup(
            jPanelTrangbiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrangbiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanelChamcong.setBackground(new java.awt.Color(255, 255, 255));
        jPanelChamcong.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelChamcong.setPreferredSize(new java.awt.Dimension(130, 38));

        jLabel7.setText("Chấm công");

        javax.swing.GroupLayout jPanelChamcongLayout = new javax.swing.GroupLayout(jPanelChamcong);
        jPanelChamcong.setLayout(jPanelChamcongLayout);
        jPanelChamcongLayout.setHorizontalGroup(
            jPanelChamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChamcongLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanelChamcongLayout.setVerticalGroup(
            jPanelChamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChamcongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanelHoadon.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHoadon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelHoadon.setPreferredSize(new java.awt.Dimension(130, 38));

        jLabel6.setText("Hóa đơn ");

        javax.swing.GroupLayout jPanelHoadonLayout = new javax.swing.GroupLayout(jPanelHoadon);
        jPanelHoadon.setLayout(jPanelHoadonLayout);
        jPanelHoadonLayout.setHorizontalGroup(
            jPanelHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHoadonLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanelHoadonLayout.setVerticalGroup(
            jPanelHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHoadonLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelChamcong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelHoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTrangbi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelHopdong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jPanelKhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelHopdong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelTrangbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelChamcong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel8.setText("Khách hàng ");

        Logout.setBackground(new java.awt.Color(153, 153, 255));
        Logout.setText("Đăng xuất ");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        dsKhachhangjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ tên", "CCCD", "Ngày Sinh", "Giới Tình", "Địa chỉ", "SĐT", "Số hợp đồng"
            }
        ));
        jScrollPane1.setViewportView(dsKhachhangjTable);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tìm kiếm theo");

        jLabel4.setText("Nhập thông tin");

        traCuuJBut.setBackground(new java.awt.Color(153, 153, 255));
        traCuuJBut.setText("Tra cứu");

        themjButton.setBackground(new java.awt.Color(153, 153, 255));
        themjButton.setText("Thêm");
        themjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themjButtonActionPerformed(evt);
            }
        });

        xoajButton.setBackground(new java.awt.Color(153, 204, 255));
        xoajButton.setText("Xóa");
        xoajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoajButtonActionPerformed(evt);
            }
        });

        suajButton.setBackground(new java.awt.Color(153, 204, 255));
        suajButton.setText("Sửa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(themjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(xoajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(183, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addGap(189, 189, 189)
                            .addComponent(Logout))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(195, 195, 195)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(63, 63, 63)
                                            .addComponent(traCuuJBut, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Logout)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(traCuuJBut)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themjButton)
                    .addComponent(xoajButton)
                    .addComponent(suajButton))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**/
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void themjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themjButtonActionPerformed

    private void xoajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoajButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xoajButtonActionPerformed

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseClicked


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
//        </editor-fold>
//        </editor-fold>
    
//        </editor-fold>
//        </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new KhachHangFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel NhanVien;
    private javax.swing.JTable dsKhachhangjTable;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelKhuyenmai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelChamcong;
    private javax.swing.JPanel jPanelHoadon;
    private javax.swing.JPanel jPanelHopdong;
    private javax.swing.JPanel jPanelKhachhang;
    private javax.swing.JPanel jPanelNhanvien;
    private javax.swing.JPanel jPanelTrangbi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton suajButton;
    private javax.swing.JButton themjButton;
    private javax.swing.JButton traCuuJBut;
    private javax.swing.JButton xoajButton;
    // End of variables declaration//GEN-END:variables
}
