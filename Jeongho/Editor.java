import java.util.Scanner;
import java.util.Stack;
public class Editor {
    class Edit{
        public static
    }
    public static void main(String[] args) {
        //왼쪽 오른쪽 스택 만들고, 스위치로 L, D, B, P$ 만들고
        // 처음 스택은 left에 다 넣는걸로 시작
        // 처음에 문자열 입력받고 left에 다 넣자
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();
        for(int i = 0; i < a; i++){
            left.push(arr[i]);
        }
        String ans = sc.nextLine();
        String[] arr2 = ans.split(" ");
        switch (arr[0]) {
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
                left.push(arr[1]);
                break;
        }
        while(!left.isEmpty()) //오른쪽 스택에 왼쪽 스택 옮기기
            right.push(left.pop());

        while(!right.isEmpty())
            System.out.print(right.pop());

    }
}

