package HelloWorld.Jeongho;

import java.util.*;
class Solution15_1{
    public String solution(String new_id){
        //정규표현식 훨씬 편하다
        String answer = new_id;

        //1st
        answer = answer.toLowerCase();
        //2nd                               숫자,소문자 -_. 제외하고
        answer = answer.replaceAll("[^0-9a-z-_.]", "");
        //3rd                           . 2개이상
        answer =answer.replaceAll("[.]{2,}", ".");
        //4th
        if(answer.startsWith(".")){
            answer = answer.substring(1, answer.length());
        }else if(answer.endsWith(".")){
            answer = answer.substring(0, answer.length()-1);
        }
        //5th
        if(answer.length() == 0){
            answer +="a";
        }
        //6th 길이가 15이상인건 다 지우기
        if(answer.length() >= 16){
            answer= answer.substring(0, 15);
        }
        if(answer.endsWith(".")){
            answer = answer.substring(0,answer.length()-1);
        }
        //7th       문자열 길이가 2이하면 길이가 3될때가지 마지막 단어 더하기
        if(answer.length() <=2){
            while(answer.length()<3){
                answer += answer.charAt(answer.length() -1);
            }
        }
        System.out.println(answer);
        return answer;
    }
}
class Solution15 {
    public String solution(String new_id) {
        //배열에 넣고 하나씩 해보자 linkedlist로
        LinkedList<String> list = new LinkedList<>();
        String[] id = new_id.split("");
        for(int i = 0; i < id.length; i++) {
            list.add(id[i]);
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0) >= 65 && list.get(i).charAt(0) <= 90 ){
                list.set(i,list.get(i).toLowerCase(Locale.ROOT));
            }//1st step
        }
        for(int i = 0; i< list.size(); i++) {// 같이 하지않는 이유 => 같이하게 되면 대문자로 바꾸기전에 인덱스가 바뀌면서 제대로 훑고 지나가지 못함
            if(i < list.size()) {
                while (list.get(i).charAt(0) >= 33 && list.get(i).charAt(0) <= 44
                        || list.get(i).charAt(0) == 47
                        || list.get(i).charAt(0) >= 58 && list.get(i).charAt(0) <= 64
                        || list.get(i).charAt(0) >= 91 && list.get(i).charAt(0) <= 94
                        || list.get(i).charAt(0) >= 123 && list.get(i).charAt(0) <= 126
                        && list.size() >= 1) {
                    list.remove(i);
                }
            }
//            if (list.get(i).charAt(0) >= 33 && list.get(i).charAt(0) <= 44
//                    || list.get(i).charAt(0) == 47
//                    || list.get(i).charAt(0) >= 58 && list.get(i).charAt(0) <= 64
//                    || list.get(i).charAt(0) >= 91 && list.get(i).charAt(0) <= 94
//                    || list.get(i).charAt(0) >= 123 && list.get(i).charAt(0) <= 126) {
//                int d = 0;
//                list.remove(i);
//                while(d < i-1) {
//                    if (list.get(i).charAt(0) >= 33 && list.get(i).charAt(0) <= 44
//                            || list.get(i).charAt(0) == 47
//                            || list.get(i).charAt(0) >= 58 && list.get(i).charAt(0) <= 64
//                            || list.get(i).charAt(0) >= 91 && list.get(i).charAt(0) <= 94
//                            || list.get(i).charAt(0) >= 123 && list.get(i).charAt(0) <= 126) {
//                        list.remove(d);
//                    }
//                    d++;
//                }
            }//2nd step
        for(int i =0; i < list.size(); i++){
            if(list.get(i).charAt(0) == 46 ){
                int a  = i +1;
                if(a < list.size()) {
                    while (list.get(a).charAt(0) == 46) {
                        list.remove(a);
                        if(a>=list.size()){
                            break;
                        }
                    }
                }
            }
        }//3rd step
        if(list.getFirst().charAt(0) == 46){
            list.removeFirst();
        }else if(list.getLast().charAt(0) == 46){
            list.removeLast();
        }//4th step
        if(list.size() == 0){
            list.add("a");
        }//5th step
        if(list.size() >= 16){
            while(list.size() > 15){
                list.removeLast();
            }
            if(list.getLast().charAt(0) == 46){
                list.removeLast();
            }
        }//6th step
        if(list.size() <= 2){
            String tmp = list.getLast();
            while(list.size() < 3){
                list.add(tmp);
            }
        }//7th step
       StringBuffer res = new StringBuffer();
        for(int i = 0; i <list.size(); i++) {
            res.append(list.get(i));
        }
        String answer = res.toString();
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_15 {
    public static void main(String[] args) {
        Solution15_1 sol = new Solution15_1();
        String id = ".1.";
        sol.solution(id);
    }
}
