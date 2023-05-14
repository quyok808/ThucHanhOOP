package Pack_B4;

import java.util.ArrayList;

/**
 * NGUYEN CONG QUY
 * 2180603884
 */
public class Bai4 {

    public static void main(String[] args) {
        NHANVIEN nv1 = new NHANVIEN();
        nv1.input();
        
        NHANVIEN nv2 = new NHANVIEN("125462", "Nguyen Van B", 6.7, 2.3);
        
        NHANVIEN nv3 = new NHANVIEN(nv1);
        
        nv1.output();
        nv2.output();
        nv3.output();
        
        nv2.setHoTen("Nguyen Cong A");
        System.out.println();
        nv2.output();
        
        NHANVIEN.inSLNV();
        
        double max = nv1.getHSL();
        NHANVIEN nvt = new NHANVIEN();
        nvt = nv1;
        if (nv2.getHSL() > max){
            max = nv2.getHSL();
            nvt = nv2;
        }
        if (nv3.getHSL() > max){
            max = nv3.getHSL();
            nvt = nv3;
        }
        System.out.print("NV co HSL lon nhat la: ");
        System.out.println(nvt.getHoTen());
        System.out.println();
        
        DSNV ds = new DSNV();
        NHANVIEN nv4 = new NHANVIEN("125463", "Nguyen Van C", 5, 2.3);
        NHANVIEN nv5 = new NHANVIEN("125452", "Nguyen Cong D", 7, 2);
        NHANVIEN nv6 = new NHANVIEN("127351", "Tran van E", 8.3, 2.8);
        NHANVIEN nv7 = new NHANVIEN("125962", "Nguyen Thi G", 8, 2.5);
        NHANVIEN nv8 = new NHANVIEN("127762", "Hoang Thi M", 9.1, 1);
        NHANVIEN nv9 = new NHANVIEN("127772", "Nguyen Van K", 8.5, 3);
        
        ds.ThemNV(nv4);
        ds.ThemNV(nv5);
        ds.ThemNV(nv6);
        ds.ThemNV(nv7);
        ds.ThemNV(nv8);
        ds.ThemNV(nv9);
        
        ds.XuatDS();
        
        System.out.println("SLNV co trong ds la: "+ds.InSLNVtrongds());
    }
    
}
