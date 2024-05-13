
package Model;

public class TrangBi {
    private String MaTB; 
    private String TenTB; 
    private double GiaTB;
    private int SoLuong;

    public TrangBi(){
        
    }
    
    public TrangBi(String MaTB, String TenTB, double GiaTB, int SoLuong){
        this.MaTB = MaTB;
        this.TenTB = TenTB;
        this.GiaTB = GiaTB;
        this.SoLuong = SoLuong;
    }
    
    public String getMaTB() {
        return MaTB;
    }

    public void setMaTB(String MaTB) {
        this.MaTB = MaTB;
    }

    public String getTenTB() {
        return TenTB;
    }

    public void setTenTB(String TenTB) {
        this.TenTB = TenTB;
    }

    public double getGiaTB() {
        return GiaTB;
    }

    public void setGiaTB(double GiaTB) {
        this.GiaTB = GiaTB;
    }
    
    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}
