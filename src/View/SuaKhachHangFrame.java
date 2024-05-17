
package View;

import DAO.KhachHangDAO;
import DAO.TrangChuDAO;
import Model.KhachHangModel;
import Model.NhanVienModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SuaKhachHangFrame extends javax.swing.JFrame {
    private static NhanVienModel currentUser;
    
    private DefaultTableModel defaultTableModel = new DefaultTableModel(){
            public boolean isCellEdittable(int row, int column){
                return false;
            }
        };
    
    private static final Logger LOGGER = Logger.getLogger(SuaKhachHangFrame.class.getName());
    
    String maKH;

    public SuaKhachHangFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

        maKH = "";
        
        khoiTaoBang();
        inDanhSach();
    }


   public void khoiTaoBang() {
        defaultTableModel = new DefaultTableModel();
    
        defaultTableModel.addColumn("Mã KH");
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("CCCD");
        defaultTableModel.addColumn("Ngày sinh");
        defaultTableModel.addColumn("Giới tính");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("SĐT");
        defaultTableModel.addColumn("SHĐ");
    
        danhSachKHTable.setModel(defaultTableModel);
    }
   
   public void inDanhSach() {
        // Tạo đối tượng danh sách khách hàng
        ArrayList<KhachHangModel> DS_KH = KhachHangDAO.getDSKhachHang();

        // Xóa tất cả các hàng hiện có trong bảng
        defaultTableModel.setRowCount(0);

        // Thêm dữ liệu vào bảng
        for (KhachHangModel khachHang : DS_KH) {
            defaultTableModel.addRow(new Object[]{
                khachHang.getMaKH(), khachHang.getTenKH(), khachHang.getCCCD(),
                khachHang.getNgaySinh(), khachHang.getGioiTinh(), khachHang.getDiaChi(),
                khachHang.getSDT(), khachHang.getSoHopDong()
            });
        }
    }
   
   public void TraCuuKH() {
        // Lấy tùy chọn tìm kiếm và đầu vào từ người dùng
        String option = (String) this.timTheoComboBox.getSelectedItem();
        String input = this.nhapjTextField.getText();

        // Xóa tất cả các hàng trong bảng
        defaultTableModel.setRowCount(0);

        // Tạo danh sách khách hàng để chứa kết quả tìm kiếm
        ArrayList<KhachHangModel> DS_KH = KhachHangDAO.TimKH(option, input);

        // Thêm kết quả tìm kiếm vào bảng
        for (KhachHangModel khachHang : DS_KH) {
            defaultTableModel.addRow(new Object[]{
                khachHang.getMaKH(), khachHang.getTenKH(), khachHang.getCCCD(),
                khachHang.getNgaySinh(), khachHang.getGioiTinh(), khachHang.getDiaChi(),
                khachHang.getSDT(), khachHang.getSoHopDong()
            });
        }

        // Hiển thị thông báo nếu không tìm thấy kết quả
        if (DS_KH.size() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Thông tin không tồn tại. Vui lòng thử lại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
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
        maKHjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hoTenjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CCCDjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gioiTinhjComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        diaChijTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SDTjTextField = new javax.swing.JTextField();
        suajButton = new javax.swing.JButton();
        huyjButton = new javax.swing.JButton();
        ngaySinhjComboBox = new de.wannawork.jcalendar.JCalendarComboBox();
        luuYjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        danhSachKHTable = new javax.swing.JTable();
        timTheoComboBox = new javax.swing.JComboBox<>();
        nhapjTextField = new javax.swing.JTextField();
        traCuujButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        MenuPanel.setBackground(new java.awt.Color(153, 153, 255));

        NhanVienButton.setText("Nhân Viên");
        NhanVienButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhanVienButtonMouseClicked(evt);
            }
        });

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
        ChamCongButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChamCongButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChamCongButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(HoaDonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TrangBiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HopDongButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KhachHangButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(NhanVienButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KhuyenMaiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(KhachHangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NhanVienButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HopDongButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KhuyenMaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(TrangBiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(HoaDonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChamCongButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        getContentPane().add(MenuPanel);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Khách Hàng ");

        Logout.setBackground(new java.awt.Color(153, 153, 255));
        Logout.setText("Đăng xuất ");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        maKHjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                maKHjTextFieldFocusLost(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sửa Thông tin");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mã KH");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Họ tên");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CCCD");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Giới tính");

        gioiTinhjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ngày sinh");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Địa chỉ");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Số điện thoại");

        suajButton.setBackground(new java.awt.Color(153, 153, 255));
        suajButton.setText("Lưu");
        suajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suajButtonActionPerformed(evt);
            }
        });

        huyjButton.setBackground(new java.awt.Color(153, 153, 255));
        huyjButton.setText("Hủy");
        huyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyjButtonActionPerformed(evt);
            }
        });

        luuYjLabel.setForeground(new java.awt.Color(0, 0, 0));

        danhSachKHTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Họ tên", "CCCD", "Ngày sinh", "Giới tính", "Địa chỉ", "SĐT", "Số HĐ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(danhSachKHTable);

        timTheoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã KH", "Họ tên", "CCCD", "SĐT", " " }));

        traCuujButton.setBackground(new java.awt.Color(153, 153, 255));
        traCuujButton.setForeground(new java.awt.Color(0, 0, 0));
        traCuujButton.setText("Tra cứu");
        traCuujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traCuujButtonActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tìm theo");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nhập thông tin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(huyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(maKHjTextField)
                                            .addComponent(jLabel5)
                                            .addComponent(gioiTinhjComboBox, 0, 120, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(luuYjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(hoTenjTextField)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ngaySinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 56, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SDTjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CCCDjTextField)
                                    .addComponent(diaChijTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timTheoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nhapjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(traCuujButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logout)
                    .addComponent(jLabel8))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timTheoComboBox)
                    .addComponent(nhapjTextField)
                    .addComponent(traCuujButton))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(luuYjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maKHjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hoTenjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CCCDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gioiTinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngaySinhjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(diaChijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SDTjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suajButton)
                    .addComponent(huyjButton))
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(156, 156, 156)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(360, Short.MAX_VALUE)))
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

    private void ChamCongButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChamCongButtonMouseClicked
        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            ChamCongFrame.main(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_ChamCongButtonMouseClicked

    private void NhanVienButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienButtonMouseClicked

        if (TrangChuDAO.KTLoaiNV(currentUser.getMaNV()) == 1) {
            dispose();
            NhanVienFrame.main(currentUser);
        } else { 
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập vào chức năng này", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_NhanVienButtonMouseClicked

    private void suajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suajButtonActionPerformed
        // TODO add your handling code here:
        String maKH = this.maKHjTextField.getText();
        
        String hoTen = this.hoTenjTextField.getText();
        String cccd = this.CCCDjTextField.getText();
        java.sql.Date sqldate = new java.sql.Date(this.ngaySinhjComboBox.getDate().getTime());
        String gioiTinh = (String) this.gioiTinhjComboBox.getSelectedItem();
        String diaChi = this.diaChijTextField.getText();
        String sdt = this.SDTjTextField.getText();
  
        try {
            KhachHangModel KH = new KhachHangModel(hoTen, cccd, sqldate.toLocalDate(),  gioiTinh, diaChi, sdt);
            if (KhachHangDAO.CapNhatKH(maKH, KH)) {
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
                this.maKHjTextField.setText("");
                this.hoTenjTextField.setText("");
                this.diaChijTextField.setText("");
                this.CCCDjTextField.setText("");
                this.SDTjTextField.setText("");
                this.ngaySinhjComboBox.setCalendar(null);
                inDanhSach();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Cập nhật không thành công. Vui lòng thử lại!",
                        "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_suajButtonActionPerformed

    private void huyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyjButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        KhachHangFrame.main(currentUser);
    }//GEN-LAST:event_huyjButtonActionPerformed

    private void maKHjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_maKHjTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (KhachHangDAO.isAvailable(this.maKHjTextField.getText()) == true) {
                luuYjLabel.setText("* MaKH đã tồn tại *");
            } else {
                luuYjLabel.setText("");
            }
        } catch (Exception ex) {
            // Ghi lại ngoại lệ vào log
            LOGGER.log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_maKHjTextFieldFocusLost

    private void KhachHangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhachHangButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        KhachHangFrame.main(currentUser);
    }//GEN-LAST:event_KhachHangButtonActionPerformed

    private void traCuujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traCuujButtonActionPerformed
        // Lấy đầu vào từ người dùng
        String input = this.nhapjTextField.getText();

        // Kiểm tra đầu vào và gọi phương thức tương ứng
        if (input.equals("")) {
            inDanhSach();
        } else {
            TraCuuKH();
        }
    }//GEN-LAST:event_traCuujButtonActionPerformed


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
            new SuaKhachHangFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCCDjTextField;
    private javax.swing.JButton ChamCongButton;
    private javax.swing.JButton HoaDonButton;
    private javax.swing.JButton HopDongButton;
    private javax.swing.JButton KhachHangButton;
    private javax.swing.JButton KhuyenMaiButton;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JButton NhanVienButton;
    private javax.swing.JTextField SDTjTextField;
    private javax.swing.JButton TrangBiButton;
    private javax.swing.JTable danhSachKHTable;
    private javax.swing.JTextField diaChijTextField;
    private javax.swing.JComboBox<String> gioiTinhjComboBox;
    private javax.swing.JTextField hoTenjTextField;
    private javax.swing.JButton huyjButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel luuYjLabel;
    private javax.swing.JTextField maKHjTextField;
    private de.wannawork.jcalendar.JCalendarComboBox ngaySinhjComboBox;
    private javax.swing.JTextField nhapjTextField;
    private javax.swing.JButton suajButton;
    private javax.swing.JComboBox<String> timTheoComboBox;
    private javax.swing.JButton traCuujButton;
    // End of variables declaration//GEN-END:variables

}
