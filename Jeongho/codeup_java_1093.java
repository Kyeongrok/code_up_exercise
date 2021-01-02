package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1093 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr = new int[23];
        for(int i = 1; i <= a; i++) {
            int t = sc.nextInt();
            arr[t-1] += 1;
        }
        for( int i =0;i<a;i++) {
            System.out.println(arr[i]);
        }
    }
}
