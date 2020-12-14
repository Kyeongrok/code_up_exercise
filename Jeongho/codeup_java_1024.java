package HelloWorld.Jeongho;
import java.util.Scanner;

public class codeup_java_1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] a = sc.nextLine().toCharArray();
		for(char c : a) {
			System.out.println("'" + c + "'");
		}
	}		
}