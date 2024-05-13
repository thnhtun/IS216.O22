
package Model;

import java.time.LocalDate;


public class HoaDon {
    private String MaHD;  
    private String MaHopDong;
    private String MaKM;
    private LocalDate NgayLapHD;
    private double TongTien; 
    
    public HoaDon(){
        
    }
    
    public HoaDon(String MaHD, String MaHopDong, String MaKM, LocalDate NgayLapHD, double TongTien){
        this.MaHD = MaHD;
        this.MaHopDong = MaHopDong;
        this.MaKM = MaKM;
        this.NgayLapHD = NgayLapHD;
        this.TongTien = TongTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }
    
    public String getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(String MaHopDong) {
        this.MaHopDong = MaHopDong;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }
    
    public LocalDate getNgayLapHD() {
        return NgayLapHD;
    }

    public void setNgayLapHD(LocalDate NgayLapHD) {
        this.NgayLapHD = NgayLapHD;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(long TongTien) {
        this.TongTien = TongTien;
    }
    
}
