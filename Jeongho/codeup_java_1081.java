package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i, j;
        for( i = 1; i<=a; i++) {
            for(j = 1; j<=b; j++) {
                System.out.println(i +" "+j);
            }
        }
        sc.close();

    }
}
