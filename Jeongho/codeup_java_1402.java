package HelloWorld.Jeongho;

import java.util.Scanner;
import java.util.Stack;

public class codeup_java_1402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stackSize = sc.nextInt();
        Stack stack = new Stack();
        for(int i = 0; i<stackSize; i++) {
            int input = sc.nextInt();
            stack.push(input);

        }
        while(!stack.empty()) {
            System.out.print(stack.pop());
        }
    }
}
