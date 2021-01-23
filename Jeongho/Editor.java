package HelloWorld.Jeongho;

import java.util.Scanner;
import java.util.Stack;
public class Editor {
    public static void main(String[] args) {
        //왼쪽 오른쪽 스택 만들고, 스위치로 L, D, B, P$ 만들고
        // 처음 스택은 left에 다 넣는걸로 시작
        // 처음에 문자열 입력받고 left에 다 넣자
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();//str이 계속 씹힘
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();
        for(int i = 0; i < a; i++){
            left.push(arr[i]);
            System.out.print(arr[i]);
        }
        String ans = sc.nextLine();
        String[] arr2 = ans.split(" ");
        switch (ans) {
            case"L":
                if(!left.isEmpty()) right.push(left.pop());
                break;
            case "D":
                if(!right.isEmpty()) left.push(right.pop());
                break;
            case "B":
                if(!left.isEmpty()) left.pop();
                break;
            case "P":
                String add = sc.nextLine();
                left.push(add);
                break;
        }
        while(!left.isEmpty()) //오른쪽 스택에 왼쪽 스택 옮기기
            right.push(left.pop());

        while(!right.isEmpty())
            System.out.print(right.pop());

    }
}