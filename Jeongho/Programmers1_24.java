package HelloWorld.Jeongho;

class Solution24 {
    private int cal(int l, int r, int n) {//if 타면 else if 안타는구나..
        if(n == 0){
            n = 11;
        }
        if(l == 0){
            l = 11;
        }
        if(r == 0){
            r = 11;
        }
        int lx = (l - 1) / 3;
        int ly = (l - 1) % 3; //ex) l == 2 -> (0, 1)
        int rx = (r - 1) / 3;
        int ry = (r - 1) % 3; //ex) r == 0 -> (3, 1)
        int nx = (n - 1) / 3;
        int ny = (n - 1) % 3; // ex) n == 8 -> (, 2)
        int ldis = Math.abs(lx - nx) + Math.abs(ly - ny);// == 2
        int rdis = Math.abs(rx - nx) + Math.abs(ry - ny);// == 1 -> return 0
        //System.out.println(n+" 일때 "+l+" "+r+" "+ldis+" "+rdis);
        if (ldis > rdis) {// 왼손의 거리가 더 길다
            return 1;
        } else if (ldis < rdis) {// 오른손의 거리가 더 길다
            return 0;
        } else{// 길이가 같은때
            return -1;
        }
    }

    public String solution(int[] numbers, String hand) {
        // right, left 스택을 만든다
        // numbers[i]에 대한 조건문 만들어서 1 4 7 || 3 6 9 각각 오른쪽 왼쪽으로 스택에 쌓고, answer에 넣음
        // 2 5 8 0일때는 오른 왼 손들의 위치랑 숫자랑 빼서 더 작은 값에 넣기 뺀값이 같거나 처음에 2580이 나오면
        // hand에 따라서  answer에 넣기
        int rid = 12;
        int lid = 10;
        String answer = "";
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(lid +" "+ rid+"= ");
//            if(i == 3){
//                cal(lid, rid, numbers[i]);
//            }
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                lid = numbers[i];
                answer += "L";
                System.out.println(lid +" "+ "L");
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                rid = numbers[i];
                answer += "R";
                System.out.println(rid +" "+ "R");
            } else if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
                // x 와 y의 값을 구하고 left right 비교
                // x = n / 3, y = n % 3
                // 왼쪽값 중앙값 오른쪽값 구해서 ld rd 구하고 비교
                if (cal(lid, rid, numbers[i]) == 1) {//오른손이 움직임
                    rid = numbers[i];
                    answer += "R";
                    System.out.println(rid +" "+ "R");
                } else if (cal(lid, rid, numbers[i]) == 0) {// 왼손이 움직임
                    lid = numbers[i];
                    answer += "L";
                    System.out.println(lid +" "+ "L");
                } else if (cal(lid, rid, numbers[i]) == -1) { //길이가 같을때
                    if (hand.equals("left")) {
                        lid = numbers[i];
                        answer += "L";
                        System.out.println(lid +" "+ "L");
                    } else if (hand.equals("right")) {
                        rid = numbers[i];
                        answer += "R";
                        System.out.println(rid +" "+ "R");
                    }
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_24 {
    public static void main(String[] args) {
        Solution24 sol = new Solution24();
        int[] numbers = {2,2,2,2,2,2};
        String hand = "right";
        sol.solution(numbers, hand);
    }
}
