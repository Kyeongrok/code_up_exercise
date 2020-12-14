package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] nums = a.split("\\.");
		
		System.out.println(nums[0]);
		System.out.println(Integer.parseInt(nums[1]));
	}
}
