package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        int count = 0;
        for (i=1; sum<=n; i++) {
            sum += i;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
