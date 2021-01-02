package HelloWorld.Jeongho;

import java.util.Locale;
import java.util.Scanner;

public class codeup_java_1082 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = Integer.valueOf(a, 16);
        for(int i =1; i<16; i++ ){
            String input = Integer.toHexString(i).toUpperCase();
            String result = Integer.toHexString(b*i).toUpperCase();
            System.out.println(b +" * " + input+ "="+ result);
        }
        sc.close();
    }
}
