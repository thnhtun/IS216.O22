
package Model;

import java.time.LocalDateTime;


public class HopDongThuePhong {
    private String MaHopDong;
    private String MaKH;  
    private LocalDateTime NgayLapHopDong;
    private LocalDateTime TGNhanPhong;
    private LocalDateTime TGTraPhong;
    private String TinhTrangHD;  
    private int SoLuongNguoiLon;
    private int SoLuongTreEm;
    private double TriGiaHopDong; 
    
    public HopDongThuePhong(){
    
    }
    
    public HopDongThuePhong(String MaHopDong, String MaKH, LocalDateTime NgayLapHopDong, LocalDateTime TGNhanPhong, 
                            LocalDateTime TGTraPhong, String TinhTrangHD, int SoLuongNguoiLon, int SoLuongTreEm, double TriGiaHopDong){
        this.MaHopDong = MaHopDong;
        this.MaKH = MaKH;
        this.NgayLapHopDong = NgayLapHopDong;
        this.TGNhanPhong = TGNhanPhong;
        this.TGTraPhong = TGTraPhong;
        this.TinhTrangHD = TinhTrangHD;
        this.SoLuongNguoiLon = SoLuongNguoiLon;
        this.SoLuongTreEm = SoLuongTreEm;
        this.TriGiaHopDong = TriGiaHopDong;
    }

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

    public LocalDateTime getNgayLapHopDong() {
        return NgayLapHopDong;
    }

    public void setNgayLapHopDong(LocalDateTime NgayLapHopDong) {
        this.NgayLapHopDong = NgayLapHopDong;
    }

    public LocalDateTime getTGNhanPhong() {
        return TGNhanPhong;
    }

    public void setTGNhanPhong(LocalDateTime TGNhanPhong) {
        this.TGNhanPhong = TGNhanPhong;
    }

    public LocalDateTime getTGTraPhong() {
        return TGTraPhong;
    }

    public void setTGTraPhong(LocalDateTime TGTraPhong) {
        this.TGTraPhong = TGTraPhong;
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
