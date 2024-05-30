
package View;

import DAO.HopDongDAO;
import DAO.KhachHangDAO;
import DAO.TrangChuDAO;
import Model.HopDongModel;
import Model.KhachHangModel;
import Model.NhanVienModel;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


public class HopDongFrame extends javax.swing.JFrame {
    
    private static NhanVienModel currentUser;
    
    private DefaultTableModel defaultTableModel = new DefaultTableModel(){
            public boolean isCellEdittable(int row, int column){
                return false;
            }
        };
    private JScrollPane scrollPane;
    
    int maKH;
    ArrayList<KhachHangModel> DS_KH;
    int current = 0;

    public HopDongFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
     
        khoiTaoBang(); // Gọi phương thức khởi tạo bảng
        inDanhSach(); // Gọi phương thức in danh sách ban đầu nếu cần thiết
    }

    
    public void khoiTaoBang() {
        defaultTableModel = new DefaultTableModel();
    
        defaultTableModel.addColumn("Mã Hợp Đồng");
        defaultTableModel.addColumn("Mã KH");
        defaultTableModel.addColumn("Ngày Lập Hợp Đồng");
        defaultTableModel.addColumn("Thời Gian Nhận Phòng");
        defaultTableModel.addColumn("Thời Gian Trả Phòng");
        defaultTableModel.addColumn("Tình Trạng HĐ");
        defaultTableModel.addColumn("SL Người Lớn");
        defaultTableModel.addColumn("SL Trẻ Em");
        defaultTableModel.addColumn("Trị Giá HĐ");
        
        
        danhSachHopDongTable.setModel(defaultTableModel);
    }


    public void inDanhSach() {
        // Tạo đối tượng danh sách hợp đồng
        ArrayList<HopDongModel> DS_HopDong = HopDongDAO.getDSHopDong();

        // Xóa tất cả các hàng hiện có trong bảng
        defaultTableModel.setRowCount(0);

        // Thêm dữ liệu vào bảng
        for (HopDongModel hopDong : DS_HopDong) {
            defaultTableModel.addRow(new Object[]{
                hopDong.getMaHopDong(), hopDong.getMaKH(), hopDong.getNgayLapHopDong(),
                hopDong.getTGNhanPhong(), hopDong.getTGTraPhong(), hopDong.getTinhTrangHD(),
                hopDong.getSoLuongNguoiLon(), hopDong.getSoLuongTreEm(), hopDong.getTriGiaHopDong()
            });
        }
        
        for (int i = 0; i < defaultTableModel.getColumnCount(); i++) {
            TableColumn column = danhSachHopDongTable.getColumnModel().getColumn(i);
            int maxWidth = 0;

            // Tính toán chiều rộng dựa trên nội dung lớn nhất trong cột
            for (int row = 0; row < danhSachHopDongTable.getRowCount(); row++) {
                TableCellRenderer cellRenderer = danhSachHopDongTable.getCellRenderer(row, i);
                Component c = danhSachHopDongTable.prepareRenderer(cellRenderer, row, i);
                maxWidth = Math.max(c.getPreferredSize().width, maxWidth);
            }

            // Thiết lập chiều rộng cột + padding
            column.setPreferredWidth(maxWidth + 30);
        }
    }

    
    public void TraCuuHopDong() {
        // Lấy tùy chọn tìm kiếm và đầu vào từ người dùng
        String option = (String) this.timTheoComboBox.getSelectedItem();
        String input = this.nhapjTextField.getText().toLowerCase();

        // Xóa tất cả các hàng trong bảng
        defaultTableModel.setRowCount(0);

        // Tạo danh sách Hợp Đồng để chứa kết quả tìm kiếm
        ArrayList<HopDongModel> DS_HopDong = HopDongDAO.TimHopDong(option, input);

         // Thêm dữ liệu vào bảng
        for (HopDongModel hopDong : DS_HopDong) {
            defaultTableModel.addRow(new Object[]{
                hopDong.getMaHopDong(), hopDong.getMaKH(), hopDong.getNgayLapHopDong(),
                hopDong.getTGNhanPhong(), hopDong.getTGTraPhong(), hopDong.getTinhTrangHD(),
                hopDong.getSoLuongNguoiLon(), hopDong.getSoLuongTreEm(), hopDong.getTriGiaHopDong()
            });
        }
        
        for (int i = 0; i < defaultTableModel.getColumnCount(); i++) {
            TableColumn column = danhSachHopDongTable.getColumnModel().getColumn(i);
            int maxWidth = 0;

            // Tính toán chiều rộng dựa trên nội dung lớn nhất trong cột
            for (int row = 0; row < danhSachHopDongTable.getRowCount(); row++) {
                TableCellRenderer cellRenderer = danhSachHopDongTable.getCellRenderer(row, i);
                Component c = danhSachHopDongTable.prepareRenderer(cellRenderer, row, i);
                maxWidth = Math.max(c.getPreferredSize().width, maxWidth);
            }

            // Thiết lập chiều rộng cột + padding
            column.setPreferredWidth(maxWidth + 30);
        }

        // Hiển thị thông báo nếu không tìm thấy kết quả
        if (DS_HopDong.size() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Thông tin không tồn tại. Vui lòng thử lại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        danhSachHopDongTable = new javax.swing.JTable();
        timTheoComboBox = new javax.swing.JComboBox<>();
        TieudeTK = new javax.swing.JLabel();
        nhapjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        traCuujButton = new javax.swing.JButton();
        suajButton = new javax.swing.JButton();
        xoajButton = new javax.swing.JButton();
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
        luongLb = new javax.swing.JLabel();
        phongLb = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(24, 24, 68));
        jLabel8.setText("HỢP ĐỒNG");

        danhSachHopDongTable.setBackground(new java.awt.Color(255, 255, 255));
        danhSachHopDongTable.setForeground(new java.awt.Color(0, 0, 0));
        danhSachHopDongTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hợp Đồng", "Mã KH", "Ngày Lập Hợp Đồng", "Thời Gian Nhận Phòng", "Thời Gian Trả Phòng", "Tình Trạng HĐ", "SL Người Lớn", "SL Trẻ Em", "Trị Giá HĐ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(danhSachHopDongTable);

        timTheoComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timTheoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Hợp Đồng", "Mã KH", "Tình Trạng HĐ" }));
        timTheoComboBox.setPreferredSize(new java.awt.Dimension(100, 40));

        TieudeTK.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TieudeTK.setForeground(new java.awt.Color(0, 0, 0));
        TieudeTK.setText("Tìm kiếm theo");

        nhapjTextField.setBackground(new java.awt.Color(255, 255, 255));
        nhapjTextField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nhập thông tin");

        traCuujButton.setBackground(new java.awt.Color(24, 24, 68));
        traCuujButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        traCuujButton.setForeground(new java.awt.Color(255, 255, 255));
        traCuujButton.setText("Tra cứu");
        traCuujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traCuujButtonActionPerformed(evt);
            }
        });

        suajButton.setBackground(new java.awt.Color(24, 24, 68));
        suajButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        suajButton.setForeground(new java.awt.Color(255, 255, 255));
        suajButton.setText("Sửa");
        suajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suajButtonActionPerformed(evt);
            }
        });

        xoajButton.setBackground(new java.awt.Color(24, 24, 68));
        xoajButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xoajButton.setForeground(new java.awt.Color(255, 255, 255));
        xoajButton.setText("Xóa");
        xoajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoajButtonActionPerformed(evt);
            }
        });

        MenuPanel.setBackground(new java.awt.Color(24, 24, 68));
        MenuPanel.setPreferredSize(new java.awt.Dimension(200, 600));

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
        KhuyenMaiLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhuyenMaiLbMouseClicked(evt);
            }
        });

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

        luongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        luongLb.setForeground(new java.awt.Color(255, 255, 255));
        luongLb.setText("Lương");
        luongLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                luongLbMouseClicked(evt);
            }
        });

        phongLb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        phongLb.setForeground(new java.awt.Color(255, 255, 255));
        phongLb.setText("Phòng");

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
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
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(luongLb)
                            .addComponent(ChamCongLb)
                            .addComponent(DangXuatLb)
                            .addComponent(phongLb))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(phongLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(KhachHangLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NhanVienLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HopDongLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(KhuyenMaiLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TrangBiLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HoaDonLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChamCongLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(luongLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DangXuatLb)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(246, 246, 246))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(xoajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TieudeTK)
                                        .addComponent(timTheoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(45, 45, 45)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(nhapjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(45, 45, 45)
                                            .addComponent(traCuujButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TieudeTK)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timTheoComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nhapjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(traCuujButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void traCuujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traCuujButtonActionPerformed
        // Lấy đầu vào từ người dùng
        String input = this.nhapjTextField.getText();

        // Kiểm tra đầu vào và gọi phương thức tương ứng
        if (input.equals("")) {
            inDanhSach();
        } else {
            TraCuuHopDong();
        }
    }//GEN-LAST:event_traCuujButtonActionPerformed

    private void xoajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoajButtonActionPerformed
        // TODO add your handling code here:
        int removeIndex = this.danhSachHopDongTable.getSelectedRow();
        try {
            if (removeIndex == -1) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn dữ liệu cần xoá!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else if (this.danhSachHopDongTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Dữ liệu trống!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                Object maHopDongObject = this.danhSachHopDongTable.getValueAt(removeIndex, 0);
                Object maKHObject = this.danhSachHopDongTable.getValueAt(removeIndex, 1);
                
                int maHopDong = (Integer) maHopDongObject;
                int maKH = (Integer) maKHObject;
                
                
                int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa không?", "Xác nhận xóa", JOptionPane.OK_CANCEL_OPTION);
                if (choice == JOptionPane.OK_OPTION) {
                    // Xử lý xóa hợp đồng ở đây
                    int row = HopDongDAO.XoaHopDong(maHopDong);
                    
                    // Kiểm tra nếu số lượng hợp đồng bé hơn 1 thì sẽ xóa luôn thông tin khách hàng đó 
                    int sl = KhachHangDAO.demSoHopDong(maKH);
                    if (sl <= 1){
                        KhachHangDAO.XoaKH(maKH);
                    }
                    else{
                        sl = sl - 1;
                        KhachHangDAO.capNhatSoHopDong(maKH, sl);
                    }
          
                    if (row > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Xoá thành công!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Xoá không thành công. Vui lòng thử lại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    // Người dùng hủy xóa
                    JOptionPane.showMessageDialog(rootPane, "Đã hủy xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }

                inDanhSach();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_xoajButtonActionPerformed

    private void suajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suajButtonActionPerformed
        int selectedIndex = this.danhSachHopDongTable.getSelectedRow();

        try {
            if (selectedIndex == -1) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn dữ liệu cần sửa!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else if (this.danhSachHopDongTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Dữ liệu trống!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                Object maHopDongObject = this.danhSachHopDongTable.getValueAt(selectedIndex, 0);
                int maHopDong = (Integer) maHopDongObject;
                dispose();
                SuaHopDongFrame.main(currentUser, maHopDong);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_suajButtonActionPerformed

    private void KhachHangLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangLbMouseClicked
        dispose();
        KhachHangFrame.main(currentUser);
    }//GEN-LAST:event_KhachHangLbMouseClicked

    private void NhanVienLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienLbMouseClicked
//        System.out.println(currentUser.toString());
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

    private void luongLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_luongLbMouseClicked
        // TODO add your handling code here:
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            LuongFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_luongLbMouseClicked

    private void KhuyenMaiLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhuyenMaiLbMouseClicked
        // TODO add your handling code here:
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            KhuyenMaiFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_KhuyenMaiLbMouseClicked


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
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HopDongFrame().setVisible(true);
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
    private javax.swing.JLabel TieudeTK;
    private javax.swing.JLabel TrangBiLb;
    private javax.swing.JTable danhSachHopDongTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel luongLb;
    private javax.swing.JTextField nhapjTextField;
    private javax.swing.JLabel phongLb;
    private javax.swing.JButton suajButton;
    private javax.swing.JComboBox<String> timTheoComboBox;
    private javax.swing.JButton traCuujButton;
    private javax.swing.JButton xoajButton;
    // End of variables declaration//GEN-END:variables

}
