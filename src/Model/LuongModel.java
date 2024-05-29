/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author phuch
 */
public class LuongModel {
    private String MaNV;
    private String MaCC;
    private String TenNV;
    private String LoaiNV;
    private Double LuongCB;
    private int SNDL;
    private int SGLT;

    public LuongModel() {
    }

    public LuongModel(String MaNV, String MaCC, String HoTen, String LoaiNV, Double LuongCB, int SNDL, int SGLT) {
        this.MaNV = MaNV;
        this.MaCC = MaCC;
        this.TenNV = HoTen;
        this.LoaiNV = LoaiNV;
        this.LuongCB = LuongCB;
        this.SNDL = SNDL;
        this.SGLT = SGLT;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaCC() {
        return MaCC;
    }

    public void setMaCC(String MaCC) {
        this.MaCC = MaCC;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String HoTen) {
        this.TenNV = HoTen;
    }

    public String getLoaiNV() {
        return LoaiNV;
    }

    public void setLoaiNV(String ChucVu) {
        this.LoaiNV = ChucVu;
    }

    public Double getLuongCB() {
        return LuongCB;
    }

    public void setLuongCB(Double LuongCB) {
        this.LuongCB = LuongCB;
    }

    public int getSNDL() {
        return SNDL;
    }

    public void setSNDL(int SNDL) {
        this.SNDL = SNDL;
    }

    public int getSGLT() {
        return SGLT;
    }

    public void setSGLT(int SGLT) {
        this.SGLT = SGLT;
    }
    
}
