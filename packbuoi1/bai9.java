package packbuoi1;

import java.util.Scanner;

/**
 * NGUYEN CONG QUY
 * 2180603884
 */
public class bai9 {

    public static int tinhTongHangK(int[][] matrix, int k, int m) {
        int tong = 0;
        for (int j = 0; j < m; j++) {
                tong += matrix[k][j];
        }
        return tong;	
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Nhap hang: ");
        n = sc.nextInt();
        System.out.println("Nhap cot: ");
        m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
//                System.out.print("Nhap gtri [" + i+"]["+ i + "] =");
//                matrix[i][j] = sc.nextInt();
                matrix[i][j] = (int)(Math.random()*30);
            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int k;
        do {
            System.out.print("Nhap vao hang can tinh: ");
            k = sc.nextInt();	
            if (k >= n) System.out.println("Ngoai pham vi hang trong ma tran !!!");
        } while (k >= n);
        System.out.println("Tong cua hang " + k + " la: " + tinhTongHangK(matrix, k, m));
    }   
}
