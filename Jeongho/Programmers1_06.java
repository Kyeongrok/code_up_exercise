package HelloWorld.Jeongho;

import java.util.EmptyStackException;
import java.util.Stack;


class Solution6{
    public int solution(int[][] board, int[] moves) {
        /*
        1. result스택(바구니) 만들고
        2. moves[i]-1해서 인덱스 맞추고 result스택에 쌓는다
        3. moves를 돌리면서 board 값이 0이 아닐때 을 result stack에 넣고 0으로바꿔줌
        4. 서로 같은 숫자가 있으면 answer++ 해주고 break; push도 말고 그냥 넘어가자
        */
        //1.
        int answer = 0;
        Stack<Integer> result = new Stack<>();
        //2. moves[i]-1해서 인덱스 맞추고 result스택에 쌓는다
        //3.  board 값이 0이 아닐때 을 result stack에 넣고 0으로바꿔줌
        //4. 서로 같은 숫자가 있으면 answer++ 해주고 break; push도 말고 그냥 넘어가자
        for(int i = 0; i < moves.length; i++) {
                int k = moves[i]-1;//인덱스 맞춰주기
                for(int j = 0; j < board.length; j++){
                    if(board[j][k]!=0){
                        if (result.size() !=0 && result.peek() == board[j][k]) {
                            result.pop();
                            answer+=2;
                            System.out.println("더해짐");
                        }else {
                            result.push(board[j][k]);
                        }
                        board[j][k] =0;
                        break;
                    }
                }
            // 스택이 비어있을 경우가 있음
            //try catch
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
