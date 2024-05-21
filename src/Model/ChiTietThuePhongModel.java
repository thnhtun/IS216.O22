
package Model;

public class ChiTietThuePhongModel {
    private int MaHopDong;
    private int MaHT;
    private int MaPhong;
    private double Gia;
    
    public ChiTietThuePhongModel(){
    }
    
    public ChiTietThuePhongModel(int MaHopDong, int MaHT, int MaPhong, double Gia){
        this.MaHopDong = MaHopDong;
        this.MaHT = MaHT;
        this.MaPhong = MaPhong;
        this.Gia = Gia;
    }

    public int getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(int MaHopDong) {
        this.MaHopDong = MaHopDong;
    }
    
    public int getMaHT() {
        return MaHT;
    }

    public void setMaHT(int MaHT) {
        this.MaHT = MaHT;
    }

    public int getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(int MaPhong) {
        this.MaPhong = MaPhong;
    }
    
    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }
    
}
