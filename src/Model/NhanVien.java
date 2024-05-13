
package Model;

import java.time.LocalDate;


public class NhanVien {
    private String MaNV;
    private String TenNV;
    private String CCCD;
    private LocalDate NgaySinh;
    private String GioiTinh;
    private String DiaChi;
    private String LoaiNV; // 'Tạp vụ', 'Lễ tân', 'Quản lý'
    private String TaiKhoan;
    private String MatKhau;
    private double LuongCB;
    
    public NhanVien(){
    }
    
    public NhanVien(String MaNV, String TenNV, String CCCD, LocalDate NgaySinh, String GioiTinh, String DiaChi, 
                    String LoaiNV, String TaiKhoan, String MatKhau, double LuongCB){
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.CCCD = CCCD;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.LoaiNV = LoaiNV;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.LuongCB = LuongCB;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(LocalDate NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getLoaiNV() {
        return LoaiNV;
    }

    public void setLoaiNV(String LoaiNV) {
        this.LoaiNV = LoaiNV;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
    public double getLuongCB() {
        return LuongCB;
    }

    public void setLuongCB(double LuongCB) {
        this.LuongCB = LuongCB;
    }

}
