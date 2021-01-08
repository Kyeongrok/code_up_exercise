package Jeongho;

import java.util.Scanner;
import java.util.Stack;

public class codeup_java_1714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int t= 0; t<a; t++) {
            System.out.print("입력 :");
            for(int i = 0; i<4; i++) {
                int b = sc.nextInt();
                stack.push(b);
            }
            while(!stack.empty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}
