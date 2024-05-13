
package Model;

public class TaoHoaDon {
    private String MaHD;
    private String MaNV;
    
    public TaoHoaDon(){
        
    }
    
    public TaoHoaDon(String MaHD, String MaNV){
        this.MaHD = MaHD;
        this.MaNV = MaNV;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
}
