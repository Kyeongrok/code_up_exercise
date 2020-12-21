package HelloWorld.Jeongho;

import java.util.Scanner;


public class codeup_java_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1 || a == 2 || a==12) {
            System.out.println("WINTER");
        } else if (a == 3 || a ==4 || a== 5) {
            System.out.println("SPRING");
        }else if (a == 6 || a == 7 || a== 8) {
            System.out.println("SUMMER");
        }else if(a == 9 || a == 10 || a == 11) {
            System.out.println("FALL");
        }
        sc.close();
    }
}
