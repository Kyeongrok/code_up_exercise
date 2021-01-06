package HelloWorld.Jeongho;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Stack<Character> stk = new Stack<Character>();

        while(num-- >0) {
            String input = sc.nextLine();
            for(int i=0; i<input.length(); i++) {
                if(input.charAt(i) ==' ' || input.charAt(i) == '\n') {
                    while (!stk.isEmpty()) {
                        System.out.print(stk.pop());
                    }
                    System.out.print(" ");
                } else{
                    stk.push(input.charAt(i));
                }
            }
            while(!stk.empty()) {
                System.out.print(stk.pop());
            }
        }
        sc.close();
    }
}
