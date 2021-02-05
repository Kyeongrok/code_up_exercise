package HelloWorld.Jeongho;

import java.util.*;

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
            if (list.get(i).charAt(0) >= 33 && list.get(i).charAt(0) <= 44
                    || list.get(i).charAt(0) == 47
                    || list.get(i).charAt(0) >= 58 && list.get(i).charAt(0) <= 64
                    || list.get(i).charAt(0) >= 91 && list.get(i).charAt(0) <= 94
                    || list.get(i).charAt(0) >= 123 && list.get(i).charAt(0) <= 126) {
                int d = i;
                list.remove(i);
                if(d < list.size()) {
                    if (list.get(i).charAt(0) >= 33 && list.get(i).charAt(0) <= 44
                            || list.get(i).charAt(0) == 47
                            || list.get(i).charAt(0) >= 58 && list.get(i).charAt(0) <= 64
                            || list.get(i).charAt(0) >= 91 && list.get(i).charAt(0) <= 94
                            || list.get(i).charAt(0) >= 123 && list.get(i).charAt(0) <= 126) {
                        list.remove(d);
                    }
                }
            }//2nd step
        }
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
       res.append(list);
        String answer = res.toString();
        System.out.println(answer);
        return answer;
    }
}
public class Programmers1_15 {
    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        String id = "abcdefghijklmn.p";
        sol.solution(id);
    }
}
