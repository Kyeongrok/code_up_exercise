package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int result =a;
        for(int i =1; i<n;i++){
            result += b;
        }
        System.out.println(result);
        sc.close();
    }
}
