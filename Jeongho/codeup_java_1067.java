package Jeongho;

import java.util.Scanner;

public class codeup_java_1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("plus \neven");
            } else {
                System.out.println("plus \nodd");
            }
        }
        if (a < 0) {
            if (a % 2 == 0) {
                System.out.println("minus \neven");
            } else {
                System.out.println("minus \nodd");
            }
        }
    }
}

