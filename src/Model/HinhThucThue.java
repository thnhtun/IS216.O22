
package Model;


public class HinhThucThue {
    private String MaHT;
    private String TenHT;

    public HinhThucThue(){
        
    }
    
    public HinhThucThue(String MaHT, String TenHT){
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
