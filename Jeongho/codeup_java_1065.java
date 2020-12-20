package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if( a%2 == 0) {
            System.out.println(a);
        } else if( a%2 != 0){
            System.out.println("a는 짝수가 아닙니다");
        }
        if( b%2 == 0) {
            System.out.println(b);
        }else if( b%2 != 0){
            System.out.println("b는 짝수가 아닙니다");
        }
        if( c%2 == 0) {
            System.out.println(c);
        }else if( c%2 != 0){
            System.out.println("c는 짝수가 아닙니다");
        }
    }
}
