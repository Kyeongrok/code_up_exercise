package HelloWorld.Jeongho;

import java.util.Scanner;
import java.util.Stack;

public class PsStack {
    public static void main(String[] args) {
        //(일떈 넣고 )일땐 맨위에 넣어준 (가있으면 뺀다
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();// 이거일때 3일땐 출력을 안하고 싶은데 어떻게..?
        Stack<Character> stack = new Stack<Character>();
        while(num-- >=0) {
            boolean bol = true;
            String str = sc.nextLine();
            for(int i= 0; i<str.length(); i++) {
                char temp = str.charAt(i);//임시저장변수
                if (temp == '(') {// '('일땐 푸쉬
                    stack.push(temp);
                } else if (temp == ')') {// ')'일땐 팝
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        bol = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) {//스택이 비어있으면 bol은 true 차있이으 false
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
