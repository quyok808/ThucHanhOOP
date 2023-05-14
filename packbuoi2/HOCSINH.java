
package packbuoi2;

import java.util.Scanner;

/**
 * NGUYEN CONG QUY
 * 2180603884
 */
public class HOCSINH {
    private String MSSV;
    private String HoTen;
    private String Lop;
    private double dtb;

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public HOCSINH() {
    }

    public HOCSINH(String MSSV, String HoTen, String Lop, double dtb) {
        this.MSSV = MSSV;
        this.HoTen = HoTen;
        this.Lop = Lop;
        this.dtb = dtb;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mssv: ");
        MSSV = sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        HoTen = sc.nextLine();
        System.out.println("Nhap dtb: ");;
        dtb = sc.nextDouble();
    }
    
    public void InHS(){
        System.out.println(MSSV + " - " + HoTen + " - " + dtb);
    }
    
   
}
