import java.util.Scanner;
import java.util.Stack;
public class Editor2 {
    static class Edit{
        private Stack<String> left = new Stack<>();
        private Stack<String> right = new Stack<>();
        public String[] stk(int a, String str){
            String[] arr = str.split(" ");
            for(int i = 0; i < a; i++){
                this.left.push(arr[i]);
            }for(int i = 0; i < a; i++) {
                System.out.print(arr[i]);
            }
            return arr;
        }
        public void l(){//커서 왼쪽으로
            if(!this.left.isEmpty()) this.right.push(this.left.pop());
        }
        public void d(){//커서 오른쪽으로
            if(!right.isEmpty()) left.push(right.pop());
        }
        public void b(){// 지우는거
            if(!left.isEmpty()) left.pop();
        }
        public void p(String a){
            left.push(a);
        }
        public void print() {
            while(!left.isEmpty()) //오른쪽 스택에 왼쪽 스택 옮기기
                right.push(left.pop());

            while(!right.isEmpty())
                System.out.print(right.pop());
        }
    }
    public static void main(String[] args) {
        //왼쪽 오른쪽 스택 만들고, 스위치로 L, D, B, P$ 만들고
        // 처음 스택은 left에 다 넣는걸로 시작
        // 처음에 문자열 입력받고 left에 다 넣자
        Scanner sc = new Scanner(System.in);
        Edit ed = new Edit();
        ed.stk(3, "a b c");
        System.out.println();
        ed.l();//ab|c
        ed.l();//a|bc
        ed.p("x");//ax|bc
        ed.print();
    }
}

