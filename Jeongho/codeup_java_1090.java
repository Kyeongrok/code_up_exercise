package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        int temp = a;
        for(int i = 1; i<n; i++) {
            temp *= r;
        }
        System.out.println(temp);
    }
}
