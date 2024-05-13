
package Model;


public class Phong {
    private String MaPhong;
    private String LoaiPhong; 
    private String KieuPhong;
    
    public Phong(){
        
    }
    
    public Phong(String MaPhong, String LoaiPhong, String KieuPhong){
        this.MaPhong = MaPhong;
        this.LoaiPhong = LoaiPhong;
        this.KieuPhong = KieuPhong;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getLoaiPhong() {
        return LoaiPhong;
    }

    public void setLoaiPhong(String LoaiPhong) {
        this.LoaiPhong = LoaiPhong;
    }

    public String getKieuPhong() {
        return KieuPhong;
    }

    public void setKieuPhong(String KieuPhong) {
        this.KieuPhong = KieuPhong;
    }

   
   
}
