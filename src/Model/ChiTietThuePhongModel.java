
package Model;

public class ChiTietThuePhongModel {
    private String MaHopDong;
    private String MaHT;
    private String MaPhong;
    private double Gia;
    
    public ChiTietThuePhongModel(){
    }
    
    public ChiTietThuePhongModel(String MaHopDong, String MaHT, String MaPhong, double Gia){
        this.MaHopDong = MaHopDong;
        this.MaHT = MaHT;
        this.MaPhong = MaPhong;
        this.Gia = Gia;
    }

    public String getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(String MaHopDong) {
        this.MaHopDong = MaHopDong;
    }
    
    public String getMaHT() {
        return MaHT;
    }

    public void setMaHT(String MaHT) {
        this.MaHT = MaHT;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }
    
    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }
    
}
