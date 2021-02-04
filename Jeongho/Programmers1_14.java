package HelloWorld.Jeongho;

class Solution14 {
    public int solution(int n) {
//        // j~n까지가 나눠지는 대상
//        //1과 자기자신말고 다른걸로 나눠떨어지면 안됨
//        // 2~n-1까지 하나라도 나눠떨어지면 n에서 빼버리자
        //int a = n;
//        for(int j = 2; j <=n; j++) {
//            //System.out.print(j+" ");
//            for(int i = 2; i < j; i++){
//                if ((j % i) == 0) {
//                    //System.out.print(j+" ");
//                    a--;
//                    break;
//               }
//           }
//       } 빼는것보다 더하는게 더 빠르다
//       System.out.println(a-1);//1은 항상 소수가 아니니까 빼고처음 내가 했던 풀이 -> 효율성 문제에서 걸림
        // 에라토스테네스의 체 이용 => 2의배수 빼주고, 3의 배수 빼주고, 5의 배수 빼주고..... 이렇게 배수들 빼주는 걸 반복
        int answer = 0;
        int[] num = new int[n+1];
        for(int i = 2; i<=n; i++){
            num[i] = i;// i~n까지 배열에 넣어줌
        }
        for(int i = 2; i<=n; i++){
            if(num[i] ==0) continue;

            for(int j = 2*i; j<=n; j+=i){//i의 배수들을 전부 0으로 바꿔준다
                num[j] = 0;
            }
        }
        for(int i = 0; i<num.length; i++){
            if(num[i] != 0){
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_14 {
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        int n = 10;
        sol.solution(n);
    }
}
