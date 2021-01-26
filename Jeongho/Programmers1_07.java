class Solution7 {
    boolean solution(String s) {
        /*
        1.String배열 만들어서 s에서 p,P와y,Y의 개수 각각 다른 변수에 더해준다
        2.변수 두개를 비교해서 같으면 true
        3.변수 두개가 0이면 true
        ==연산자와 String클래스의 equals()메소드의 가장 큰 차이점은 == 연산자는 비교하고자 하는 두개의 대상의 주소값을 비교하는데 반해
        String클래스의 equals 메소드는 비교하고자 하는 두개의 대상의 값 자체를 비교합니다
        String은 클래스이므로 서로 같은 값을 갖더라도 주소값이 다를수있다.
        ==연산자는 주소값을 비교하는거고 equals는 값 자체를 비교하는것이다.
         */
        int a=0;
        int b=0;
        String[] arr = s.split("");
        for(int i = 0; i< s.length(); i++){
            if(arr[i].equals("p") || arr[i].equals("P")){
                a++;
            }else if(arr[i].equals("y") || arr[i].equals("Y")){
                b++;
            }else{
                continue;
            }
        }
        boolean answer;
        if(a == b){
            answer = true;
        }else {
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_07 {
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        sol.solution("pPY");
    }
}
