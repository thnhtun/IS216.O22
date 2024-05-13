
package qlks.model;

import java.time.LocalDate;


public class HoaDon {
    private String MaHopDong;
    private String MaKH;  
    private LocalDate NgayDatPhong;
    private LocalDate NgayNhanPhong;
    private LocalDate NgayTraPhong;
    private String TinhTrangHD;  
    private int SoLuongNguoiLon;
    private int SoLuongTreEm;
    private long TriGiaHopDong; 

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

    public LocalDate getNgayDatPhong() {
        return NgayDatPhong;
    }

    public void setNgayDatPhong(LocalDate NgayDatPhong) {
        this.NgayDatPhong = NgayDatPhong;
    }

    public LocalDate getNgayNhanPhong() {
        return NgayNhanPhong;
    }

    public void setNgayNhanPhong(LocalDate NgayNhanPhong) {
        this.NgayNhanPhong = NgayNhanPhong;
    }

    public LocalDate getNgayTraPhong() {
        return NgayTraPhong;
    }

    public void setNgayTraPhong(LocalDate NgayTraPhong) {
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

    public long getTriGiaHopDong() {
        return TriGiaHopDong;
    }

    public void setTriGiaHopDong(long TriGiaHopDong) {
        this.TriGiaHopDong = TriGiaHopDong;
    }
    
}
