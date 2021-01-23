package HelloWorld.Jeongho;

import java.awt.*;
import java.util.*;
import java.util.List;


class Solution1 {
    public int[] solution(int[] numbers) {
        LinkedList<Integer> list = new LinkedList<Integer>();
//       int[] arr = new int[a];//arr의 크기
        boolean bol1 = numbers.length >= 2 && numbers.length <= 100;
        boolean bol2 = true;
        if(!bol1) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0 || numbers[i] > 100) {
                    bol2 = false;
                    break;
                }
               }
        }
        for (int i = 0; i < numbers.length; i++) {//list에 [i]+[i+1] 넣기
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println();//중복 제거
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }//오름차순 정렬
        Collections.sort(list);
        //answer에 넣을수 있게 형변환
        int a = list.size();
        int[] answer = new int[a];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
//            System.out.print(answer[i]+" ");
        }
        //int[] answer = {};
        return answer;
    }
}
public class Programmers1_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int[] j=new int[a];
        for(int i=0;i<j.length;i++) {
            int b = sc.nextInt();
            j[i]=b;
        }
        for(int i =0;i<j.length;i++) {
            System.out.print(j[i]+" ");
        }
        System.out.println();
        Solution1 sol = new Solution1();
        sol.solution(j);
    }
}
