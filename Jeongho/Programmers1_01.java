package HelloWorld.Jeongho;

import java.awt.*;
import java.util.*;
import java.util.List;


class Solution {
    public int[] solution(int[] numbers) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int cnt = 0;
        int a=0;
//        for(int i=1; i<numbers.length;i++) {//더한값을 넣어줄 배열의 길이
//            a+=i;
//        }
//        int[] arr = new int[a];//arr의 크기
        for(int i = 0; i<numbers.length; i++) {//list에 arr더한값들 넣기
            for (int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i]+numbers[j]);
              System.out.print(list.get(i)+" ");
            }
        }
        System.out.println();//중복 제거
        for(int i=0; i<list.size();i++) {
            for(int j=i+1; j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    list.remove(j);
                }
            }
        }//오름차순 정렬, answer에 넣을수 있게 형변환

            int[] answer = {};
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
        Solution sol = new Solution();
        sol.solution(j);
    }
}
