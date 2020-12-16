package HelloWorld.Jeongho;
import java.util.Scanner;

public class codeup_java_1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        String toHex = Integer.toHexString(i);

        int  a = Integer.parseInt(toHex, 16);

        String  b = Integer.toOctalString(a);

        System.out.println("10진수를 16진수로" + toHex);
        System.out.println("16진수를 8진수로" + b);
    }
}
