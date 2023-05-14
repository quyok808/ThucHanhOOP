package packbuoi1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NGUYEN CONG QUY
 * 2180603884
 */
public class bai8 {
    
    public static int[] Sort(int[] array){
        int min;
        int n = array.length;
        int[] array_sorted = new int[n];
        for (int i = 0; i < n-1; i++){
            min = i;
            for (int j = i+1 ; j < n; j++){
                if (array[j] < array[min]){
                    min = j;
                }
                int t = array[i];
                array[i] = array[min];
                array[min] = t;
            }
        }
        array_sorted = array.clone();
        return array_sorted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so luong ptu cua mang: ");
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Mang chua sap xep: " + Arrays.toString(array));
        
        System.out.println("Mang sap xep la: ");
        array = Sort(array);
        System.out.println(Arrays.toString(Sort(array)));
    }
    
}
