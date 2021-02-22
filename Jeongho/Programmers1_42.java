import java.util.Arrays;
import java.util.Comparator;

class Solution42 {
    public int[] solution(int N, int[] stages) {
        //  이차 배열 0번엔 실패율 1번엔 인덱싱
        int[] answer = new int[N];
        double[] arr = new double[N];
        int stage = 1;
        while (stage <= N){
            double a = 0;
            double b = 0;
            for(int i = 0; i< stages.length; i++){
                if(stages[i] >=stage){
                    a++;
                }
                if(stages[i] == stage) {
                    b++;
                }
            }
            arr[stage-1] = b/a;
            if(a == 0 || b == 0) arr[stage-1] = 0;
           // System.out.print(arr[stage-1]+" ");
            stage++;
        }
        //System.out.println();
        //이차원배열로 해보자
        double[][] ans = new double[N][2];
        for(int i =0; i < ans.length; i++){
            ans[i][0] = arr[i];//실패율
            ans[i][1] = i+1;// 스테이지
            System.out.println(ans[i][0] +" "+ans[i][1]);
        }
//        Arrays.sort(ans, new Comparator<double[]>() { 왜이럴까
//            @Override
//            public int compare(double[] o1, double[] o2) {
//                if (o1[0] == 0 || o2[0] == 0) return 1;//0일땐 오름차순
//                if(o1[0] == o2[0])return 1; //같으면 오름차순
//                else return -1; //나머진 내림차순
//            }
//        });
        Arrays.sort(ans, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                if(o1[0] == o2[0]) return 0;
                return (o1[0] < o2[0])? 1:-1;
            }
        });
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i][1]);
        }
        for(int i =0; i < ans.length; i++){
            answer[i] = (int)ans[i][1];
            System.out.print(answer[i]);
        }
        //내림차순 문제..
        return answer;
    }
}
public class Programmers1_42 {
    public static void main(String[] args) {
        Solution42 sol = new Solution42();
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        sol.solution(N, stages);
    }
}
