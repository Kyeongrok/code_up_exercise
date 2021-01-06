package HelloWorld.Jeongho;

import java.util.Scanner;
import java.util.Stack;

public class PsStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Stack<Character> stack = new java.util.Stack<Character>();
        while(num-- >0) {
            boolean bol = true;
            String str = sc.nextLine();
            for(int i= 0; i<str.length(); i++) {
                char temp = str.charAt(i);
                if (temp == '(') {
                    stack.push(temp);
                } else if (temp == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        bol = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) {
                bol = false;
            }
            if(bol) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
