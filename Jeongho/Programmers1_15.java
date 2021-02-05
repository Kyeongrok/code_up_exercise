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
        char c = id[5].charAt(0);
        c += 32;
        System.out.println(c);
        list.get(5).replace(list.get(5).charAt(0), c);
        System.out.println(list.get(5).charAt(0));

        for(int i = 0; i < list.size(); i++) {
            char tmp = list.get(i).charAt(0);
            if(list.get(i).charAt(0) >= 65 && list.get(i).charAt(0) <= 90 ){
                //tmp.toLowerCase();
                //list.set(i,list.get(i));
               // System.out.println(list.get(i)+"a");
            }else if(list.get(i).charAt(0) == 33 || list.get(i).charAt(0) == 35 || list.get(i).charAt(0) == 64){
                list.remove(i);
            }
//            System.out.print(list.get(i)+" ");
        }
        String answer = "";
        return answer;
    }
}
public class Programmers1_15 {
    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        String id = "...!@BaT#*..y.abcdefghijklm";
        sol.solution(id);
    }
}
