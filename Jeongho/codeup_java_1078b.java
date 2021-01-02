package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1078b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for (int i = 0; i <= a ;i++ ) {
            if(i%2==0){
               b += i;
            }
        }
        System.out.println(b);
        sc.close();
    }
}
