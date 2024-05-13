package Model;

public class ChamCong {

    private String MaCC;
    private String MaNV;
    private int SGLT;
    private int SNDL;

    public ChamCong() {
    }

    public ChamCong(String MaCC, String MaNV, int SGLT, int SNDL) {
        this.MaCC = MaCC;
        this.MaNV = MaNV;
        this.SGLT = SGLT;
        this.SNDL = SNDL;
    }

    public ChamCong(int SGLT) {
        this.SGLT = SGLT;
    }

    public ChamCong(String maCC) {
        this.MaCC = maCC;
    }

    public String getmaCC() {
        return MaCC;
    }

    public void setmaCC(String maCC) {
        this.MaCC = maCC;
    }

    public String getmaNV() {
        return MaNV;
    }

    public void setmaNV(String maNV) {
        this.MaNV = maNV;
    }

    public int getSGLT() {
        return SGLT;
    }

    public void setSGLT(int SGLT) {
        this.SGLT = SGLT;
    }

    public int getSNDL() {
        return SNDL;
    }

    public void setSNDL(int SNDL) {
        this.SNDL = SNDL;
    }
}
