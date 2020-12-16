package HelloWorld.Jeongho;
import java.util.Scanner;
public class codeup_java_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String[] splitData  = i.split(":");
        System.out.println(splitData[1]);
    }
}
