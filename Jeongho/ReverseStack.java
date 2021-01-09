package HelloWorld.Jeongho;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

    public static String reverse(String input){
        Stack<Character> stk = new Stack<Character>();
//        System.out.printf("input:%s \n", input);
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) ==' ' || input.charAt(i) == '\n') {
                while (!stk.isEmpty()) {//스택이 차있으면 뽑고
                    System.out.print(stk.pop());
                }
                System.out.print(" ");
            } else{//없으면 넣는다
                stk.push(input.charAt(i));
            }
        }
        while(!stk.empty()) {
            System.out.print(stk.pop());
        }
        System.out.println();
        return input;
    }


    public static void main(String[] args) {
        //입력받은걸 공백이나 개행문자가 있을때마다 넣고 뽑는다
        // input, reverse
        // SOLID
        // Single
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        /*
        3
         */
        for (int n = 0; n < num; n++) {
            String input = sc.nextLine();
            String result = reverse(input);
//            System.out.println(result);
        }
        sc.close();
    }
}
