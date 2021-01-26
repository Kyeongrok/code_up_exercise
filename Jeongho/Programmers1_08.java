import java.util.*;

class Solution8 {
    public int[] solution(int[] answers) {
        int[] std1 = new int[answers.length];
        int[] std2 = new int[answers.length];
        int[] std3 = new int[answers.length];
        int a =1;
        int[] d = {1, 3, 4, 5};
        int[] f = {3, 1, 2, 4, 5};
        for(int i = 0; i < answers.length; i++){
            std1[i] = a;
            ++a;
            if(a > 5){
                a = 1;
            }
        }
        for(int i = 0; i< answers.length; i++){
            if(i%2 == 0){
                std2[i]=2;
            }
        }
        for(int i = 0; i<answers.length; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < answers.length/2; j++) {
                    std2[i] = d[j];
                    i += 2;
                }
            }
        }
        for(int i =0; i<answers.length; i++){
            if(i%2 ==0){
                for (int j = 0; j < (answers.length/2)+1; j++) {
                    std3[i] = f[j];
                    i += 2;
                }
            }
        }
        for(int i =0; i<answers.length; i++){
            if(i%2 ==1){
                for (int j = 0; j < answers.length/2; j++) {
                    std3[i] = f[j];
                    i += 2;
                }
            }
        }
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;
        for(int i =0; i< answers.length; i++){
            if(answers[i]==std1[i]){
                cnt1++;
            }else if(answers[i]==std2[i]){
                cnt2++;
            }else if(answers[i]==std3[i]){
                cnt3++;
            }
        }
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));

        List<Integer> list = new ArrayList<>();
        if(max == cnt1)
            list.add(1);
        if(max == cnt2)
            list.add(2);
        if(max == cnt3)
            list.add(3);

        if(list.size()>1)
            Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }
        return answer;
    }
}
public class Programmers1_08 {
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int[] a ={1, 3, 2, 4, 2};
        sol.solution(a);
    }
}
