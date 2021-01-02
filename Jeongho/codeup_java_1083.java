package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a; i++) {
            if(i%3==0) {
                System.out.println("짝!");
            }else{
                System.out.println(i);
            }
        }
        sc.close();
    }
}
