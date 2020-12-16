package HelloWorld.Jeongho;
import java.util.Scanner;
public class codeup_java_1027 {
    public static String field(String a) {  //매개변수
        String result; //변수 선언해주고 그 변수를 출력해줘야함
        String[] b = a.split("\\.");
        result = b[2] + "-" + b[1] + "-" + b[0];
        return result;
//        String replaceData = i.replace(".", "-");
//        String[] splitData = i.split("-");
//        char[] a = [i];
//        System.out.println(a);
//        System.out.println(replaceData);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(field(input));
        sc.close();
    }
}
