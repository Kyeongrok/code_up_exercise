package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b +c;
        System.out.println("합 :" +sum + " 평균 : " + (a+b+c)/3);
    }
}
