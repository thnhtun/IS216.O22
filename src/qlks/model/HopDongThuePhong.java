
package qlks.model;

import java.time.LocalDateTime;


public class HopDongThuePhong {
    private String MaHopDong;
    private String MaKH;  
    private LocalDateTime NgayDatPhong;
    private LocalDateTime NgayNhanPhong;
    private LocalDateTime NgayTraPhong;
    private String TinhTrangHD;  
    private int SoLuongNguoiLon;
    private int SoLuongTreEm;
    private double TriGiaHopDong; 

    public String getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(String MaHopDong) {
        this.MaHopDong = MaHopDong;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public LocalDateTime getNgayDatPhong() {
        return NgayDatPhong;
    }

    public void setNgayDatPhong(LocalDateTime NgayDatPhong) {
        this.NgayDatPhong = NgayDatPhong;
    }

    public LocalDateTime getNgayNhanPhong() {
        return NgayNhanPhong;
    }

    public void setNgayNhanPhong(LocalDateTime NgayNhanPhong) {
        this.NgayNhanPhong = NgayNhanPhong;
    }

    public LocalDateTime getNgayTraPhong() {
        return NgayTraPhong;
    }

    public void setNgayTraPhong(LocalDateTime NgayTraPhong) {
        this.NgayTraPhong = NgayTraPhong;
    }

    public String getTinhTrangHD() {
        return TinhTrangHD;
    }

    public void setTinhTrangHD(String TinhTrangHD) {
        this.TinhTrangHD = TinhTrangHD;
    }

    public int getSoLuongNguoiLon() {
        return SoLuongNguoiLon;
    }

    public void setSoLuongNguoiLon(int SoLuongNguoiLon) {
        this.SoLuongNguoiLon = SoLuongNguoiLon;
    }

    public int getSoLuongTreEm() {
        return SoLuongTreEm;
    }

    public void setSoLuongTreEm(int SoLuongTreEm) {
        this.SoLuongTreEm = SoLuongTreEm;
    }

    public double getTriGiaHopDong() {
        return TriGiaHopDong;
    }

    public void setTriGiaHopDong(double TriGiaHopDong) {
        this.TriGiaHopDong = TriGiaHopDong;
    }
    
}
