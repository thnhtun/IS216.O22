
package Model;

import java.time.LocalDate;


public class HoaDonModel {
    private int MaHD;  
    private int MaHopDong;
    private int MaKM;
    private LocalDate NgayLapHD;
    private double TongTien; 
    
    public HoaDonModel(){
        
    }
    
    public HoaDonModel(int MaHD, int MaHopDong, int MaKM, LocalDate NgayLapHD, double TongTien){
        this.MaHD = MaHD;
        this.MaHopDong = MaHopDong;
        this.MaKM = MaKM;
        this.NgayLapHD = NgayLapHD;
        this.TongTien = TongTien;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }
    
    public int getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(int MaHopDong) {
        this.MaHopDong = MaHopDong;
    }

    public int getMaKM() {
        return MaKM;
    }

    public void setMaKM(int MaKM) {
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
