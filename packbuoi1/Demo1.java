package packbuoi1;

/**
 * NGUYEN CONG QUY
 * 2180603884
 */
public class Demo1 {

    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(0, -3);
        PhanSo ps2 = new PhanSo(4, 4);
        if (ps1.checkPS(ps1.getMauso()) == false  || ps2.checkPS(ps2.getMauso()) == false){
            System.out.println("Mau so cua phan so khong duoc bang 0");
        }
        else {
            System.out.println("Phan so toi gian: ");
            System.out.print("ps1: ");
            ps1.RutGon().inPS();
            System.out.println();
            System.out.print("ps2: ");
            ps2.RutGon().inPS();
            System.out.println();

            System.out.println("Cong 2 phan so: ");
            ps1.inPS();
            System.out.print(" + ");
            ps2.inPS();
            System.out.print(" = ");
            ps1.Cong(ps2).inPS();
            System.out.println();
        }
        
    }
    
}
