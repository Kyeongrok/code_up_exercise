package HelloWorld.Jeongho;

import java.util.Arrays;
import java.util.Scanner;

public class codeup_java_1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[20][20];
        int n = sc.nextInt();
        for(int i = 0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = 0; j<= 19; j++) {
                arr[a][j] =1;// 세로줄
                for(int k = 0; k <=19; k++) {
                    arr[k][b] =1;//가로줄
                }
            }
        }
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j<arr.length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
