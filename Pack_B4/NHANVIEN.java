package Pack_B4;

import java.util.Scanner;

/**
 * NGUYEN CONG QUY
 * 2180603884
 */
public class NHANVIEN {
    private String manv;
    private String HoTen;
    private double LuongCB;
    private double HSL;
    static int SLNV = 0;

    public NHANVIEN() {
        SLNV++;
    }

    public NHANVIEN(String manv, String HoTen, double LuongCB, double HSL) {
        this.manv = manv;
        this.HoTen = HoTen;
        this.LuongCB = LuongCB;
        this.HSL = HSL;
        SLNV++;
    }
    
    

    public NHANVIEN(NHANVIEN nv) {
        this.manv = nv.manv;
        this.HoTen = nv.HoTen;
        this.LuongCB = nv.LuongCB;
        this.HSL = nv.HSL;
        SLNV++;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public double getHSL() {
        return HSL;
    }

    public void setHSL(double HSL) {
        this.HSL = HSL;
    }
    
    
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap manv: ");
        manv = sc.nextLine();
        System.out.print("Nhap ho va ten nv: ");
        HoTen = sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        LuongCB = sc.nextDouble();
        System.out.println("Nhap he so luong: ");
        HSL = sc.nextDouble(); 
    }
    
    public void output(){ 
        System.out.println(manv + " - " + HoTen + " - " +LuongCB + " - " + HSL);
    }
    
    public double tinhLuong(){
        double thanhtien;
        thanhtien = LuongCB * HSL;
        return thanhtien;
    }
    
    static void inSLNV(){
        System.out.println("SLNV: " + SLNV);
    }
}
