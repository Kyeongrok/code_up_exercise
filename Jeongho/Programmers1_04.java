package HelloWorld.Jeongho;

import java.util.Arrays;
class Solution4 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";
//            for(int i = 0; i < participant.length; i++ ) {
//                for (int j = 0; j < completion.length; j++) {
//                    if (participant[i] == completion[j]) {
//                        participant[i] = "-1";
//                        completion[j] = "-1";
//                        break;
//                    }
//                }
//                if(participant[i]!="-1"){
//                    answer = participant[i];
//                }
//            }
        for (int i = 0; i < completion.length; i++) {
            if (participant[i].equals(completion[i])) {
                continue;
            } else if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        if (answer.equals("")) {
            answer = participant[participant.length - 1];
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_04 {
       public static void main(String[] args) {
        //participant 에서 completion 빼주면 됨
        //동명이인이 있어도 상관은 participant에서
        Solution4 sol = new Solution4();
        String[] par = {"mislav", "stanko", "mislav", "ana"};
        String[] com = {"stanko", "ana", "mislav"};
        sol.solution(par,com);
    }
}
