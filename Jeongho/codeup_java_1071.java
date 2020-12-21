package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while( a != 0) {
            a = sc.nextInt();
            if( a != 0) {
                System.out.println(a);
            }

        }
        sc.close();
    }
}
