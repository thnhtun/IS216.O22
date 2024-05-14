
package Model;

public class HongTrangBiModel {
    private String MaTB;
    private String MaHD;
    private int SoLuongHong;
    
    public HongTrangBiModel(){
        
    }
    
    public HongTrangBiModel(String MaTB, String MaHD, int SoLuongHong){
        this.MaTB = MaTB;
        this.MaHD = MaHD;
        this.SoLuongHong = SoLuongHong;
    }

    public String getMaTB() {
        return MaTB;
    }

    public void setMaTB(String MaTB) {
        this.MaTB = MaTB;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public int getSoLuongHong() {
        return SoLuongHong;
    }

    public void setSoLuongHong(int SoLuongHong) {
        this.SoLuongHong = SoLuongHong;
    }
    
    
    
}
