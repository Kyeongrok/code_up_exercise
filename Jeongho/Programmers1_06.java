import java.util.EmptyStackException;
import java.util.Stack;


class Solution6{
    public int solution(int[][] board, int[] moves) {
        /*
        1. 스택 5개만들고, result배열(바구니) 만들고
        2. 스택에 역순으로 넣어야함
        3. moves를 돌리면서 스택에 있는것들 pop해주고
        4. result와 비교했을때
        */
        //1.
        int answer = 0;
        Stack<Integer> result = new Stack<>();
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        Stack<Integer> stk3 = new Stack<>();
        Stack<Integer> stk4 = new Stack<>();
        Stack<Integer> stk5 = new Stack<>();
        //2.
        for(int i = board.length-1; i >= 0; i--){
            if(board[i][0] != 0) {
                stk1.push(board[i][0]);
            }
        }
        for(int i = board.length-1; i >= 0; i--){
            if(board[i][1] != 0) {
                stk2.push(board[i][1]);
            }
        }
        for(int i = board.length-1; i >= 0; i--){
            if(board[i][2] != 0) {
                stk3.push(board[i][2]);
            }
        }
        for(int i = board.length-1; i >= 0; i--){
            if(board[i][3] != 0) {
                stk4.push(board[i][3]);
            }
        }
        for(int i = board.length-1; i >= 0; i--){
            if(board[i][4] != 0) {
                stk5.push(board[i][4]);
            }
        }
        //3. moves를 돌리면서 스택에 있는것들 pop해주고 result stack에 넣고
        //4. 서로 같은 숫자가 있으면 answer++ 해주고 break; push도 말고 그냥 넘어가자
        for(int i = 0; i < moves.length; i++) {
            try {
                switch (moves[i]) {
                    case 1:
                        int a = stk1.pop();
                        if (result.size() >1 && result.peek() == a) {
                            result.pop();
                            answer+=2;
                            System.out.println("1에서 더해짐");
                            break;
                        }
                        result.push(a);
                        break;
                    case 2:
                        int b = stk2.pop();
                        if (result.peek() == b) {
                            result.pop();
                            answer+=2;
                            System.out.println("2에서 더해짐");
                            break;
                        }
                        result.push(b);
                        break;
                    case 3:
                        int c = stk3.pop();
                        if (result.peek() == c) {
                            result.pop();
                            answer+=2;
                            System.out.println("3에서 더해짐");
                            break;
                        }
                        result.push(c);
                        break;
                    case 4:
                        int d = stk4.pop();
                        if (result.peek() == d) {
                            result.pop();
                            answer+=2;
                            System.out.println("4에서 더해짐");
                            break;
                        }
                        result.push(d);
                        break;
                    case 5:
                        int e = stk5.pop();
                        if (result.peek() == e) {
                            result.pop();
                            answer+=2;
                            System.out.println("5에서 더해짐");
                            break;
                        }
                        result.push(e);
                        break;
                }
            } catch (EmptyStackException e) { //40번에서 스택이 비어있을 경우가 있음
            }//try catch
        }//for



        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_06 {
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        sol.solution(board, moves);


    }
}
