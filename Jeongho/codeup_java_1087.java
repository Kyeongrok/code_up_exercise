package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        int count = 0;
        for (i=1; ; i++) {
            sum += i;
            if(sum>=n)
                break;
        }
        System.out.println(sum);
        sc.close();
    }
}
