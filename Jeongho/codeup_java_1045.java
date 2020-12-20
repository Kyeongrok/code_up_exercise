package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(String.format("%.2f", a/(float)b));
        sc.close();
    }
}
