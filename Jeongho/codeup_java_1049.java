package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a > b) {
            System.out.println("1");
        }
        else if( a < b) {
            System.out.println("0");
        }
        sc.close();
    }
}
