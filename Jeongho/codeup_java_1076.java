package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        System.out.println(a);
        int alpha = (int)a -1;
        while (alpha >96) {
            char calpha =(char) alpha;
            System.out.println(calpha);
            alpha--;
        }

    }
}
