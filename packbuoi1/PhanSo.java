package packbuoi1;

/**
 * NGUYEN CONG QUY
 * 2180603884
 */
public class PhanSo {
    private int tuso;
    private int mauso;

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public PhanSo(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
        
    }

    public PhanSo() {
        
    }
    
    public boolean checkPS(int mau){
        if(mau != 0){
            return true;
        }
        return false;
    }
    
    public void inPS() {
        if (tuso == mauso) {
            System.out.print("1");
        }
        else if (mauso == 1){
            System.out.print(tuso);
        }
        else{
            System.out.print(tuso + "/" + mauso);
        }
    }
    
    public int timUCLN(int a, int b){
        if (a % b == 0 ){
            return b;
        }
        return timUCLN(b, a%b);
    }
    
    public PhanSo RutGon(){
        PhanSo ps = new PhanSo();
        int UCLN = timUCLN(tuso, mauso);
        ps.setTuso(tuso / UCLN);
        ps.setMauso(mauso/UCLN);
        
        if (ps.mauso < 0){
            ps.tuso *= -1;
            ps.mauso *= -1;
        }
        return ps;
    }
    
    public PhanSo Cong(PhanSo that){
        PhanSo KQ = new PhanSo();
        if (this.mauso == that.mauso) {
            KQ.tuso = this.tuso + that.tuso;
            KQ.mauso = this.mauso;
        }
        else {
            KQ.tuso = this.tuso * that.mauso + this.mauso * that.tuso;
            KQ.mauso = this.mauso * that.mauso;
        }
        return KQ.RutGon();
    }
    
}
