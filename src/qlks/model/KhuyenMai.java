
package qlks.model;

import java.time.LocalDate;


public class KhuyenMai {
     private String MaKM;
    private String TenKM; 
    private String MoTaKM; 
    private LocalDate NgayBatDau;
    private LocalDate NgayKetThuc;
    private double PhanTramKM; 

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getTenKM() {
        return TenKM;
    }

    public void setTenKM(String TenKM) {
        this.TenKM = TenKM;
    }

    public String getMoTaKM() {
        return MoTaKM;
    }

    public void setMoTaKM(String MoTaKM) {
        this.MoTaKM = MoTaKM;
    }

    public LocalDate getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(LocalDate NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public LocalDate getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(LocalDate NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public double getPhanTramKM() {
        return PhanTramKM;
    }

    public void setPhanTramKM(double PhanTramKM) {
        this.PhanTramKM = PhanTramKM;
    }
    
}
