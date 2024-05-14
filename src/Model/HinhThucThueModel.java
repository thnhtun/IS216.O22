
package Model;


public class HinhThucThueModel {
    private String MaHT;
    private String TenHT;

    public HinhThucThueModel(){
        
    }
    
    public HinhThucThueModel(String MaHT, String TenHT){
        this.MaHT = MaHT;
        this.TenHT = TenHT;
    }
    
    public String getMaHT() {
        return MaHT;
    }

    public void setMaHT(String MaHT) {
        this.MaHT = MaHT;
    }

    public String getTenHT() {
        return TenHT;
    }

    public void setTenHT(String TenHT) {
        this.TenHT = TenHT;
    }
    
}
