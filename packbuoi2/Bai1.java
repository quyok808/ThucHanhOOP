package packbuoi2;

import java.util.Scanner;

/**
 * NGUYEN CONG QUY
 * 2180603884
 */
public class Bai1 {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sv: ");
        int n = sc.nextInt();
        HOCSINH[] dshs = new HOCSINH[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap vao hs thu " + i);
            dshs[i] = new HOCSINH();
            dshs[i].Nhap();
        }
        
        for (int i = 0; i < n; i++){
            System.out.println("hs thu "+ i);
            dshs[i].InHS();
        }
        
//        int min;
        for (int i = 0; i < n-1; i++){
//            min = i;
            for (int j = 0; j < n; j++){
                if (dshs[i].getDtb() < dshs[j].getDtb()){
//                    min = j;
                
                HOCSINH temp = new HOCSINH();
                temp = dshs[i];
                dshs[i] = dshs[j];
                dshs[j] = temp;
                }
            }
        }
        System.out.println("\ndshs sau sap xep \n");
        for (int i = 0; i < n; i++){
            System.out.println("hs thu "+ i);
            dshs[i].InHS();
        }
    }
    
}
