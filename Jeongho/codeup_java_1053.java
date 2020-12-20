package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1) {
            System.out.println("1");
        }
        else if ( a != 1) {
            System.out.println("0");
        }
        sc.close();
    }
}
