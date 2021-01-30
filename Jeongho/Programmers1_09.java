package HelloWorld.Jeongho;

import java.util.Arrays;

class Solution9 {
    public int[] solution(int[] array, int[][] commands) {
        //command[-][i] ~command[-][j]까지 자르고 [-][k]번숫자 answer에 넣기
        int[] answer = new int[commands.length];
        int[] tmp ;
        for(int i = 0; i < commands.length;i++){
            tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);//시작점 포함 끝나는점 미포함
            //Arrays.copyOfRange(복사할 배열, 시작점(포함), 끝나는점(미포함))
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2]-1];
        }
        for(int i=0;i< answer.length; i++){
            System.out.println(answer[i]);
        }
        return answer;
    }
}
public class Programmers1_09 {
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1},{1,7,3}};
        sol.solution(array, commands);

    }
}
