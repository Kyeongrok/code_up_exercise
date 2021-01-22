package HelloWorld.Jeongho;

import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;

public class StackSequence2 {
    private int a = 8;


    public static int[] stackSequence2(int a, String seq) {
        int[] arr = new int[a];
        String[] ars = seq.split(" ");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(ars[i]);
        }
        return arr;
    }
    public static boolean sequence(int[] arr) {
        // arr에 일때
        Stack<Integer> stack = new Stack<Integer>();
        int[] st = new int[arr.length];
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < st.length; k++) {
                if (st[k] == arr[i]) {//값을 구하기위해 pop해준 잉여값들을 배열에 넣고 비교해서 있으면 false로한다.
                    return false;
                }
                // 6 2 1
                if (arr[i] > num) {
                    // 4 > 1
                    // 4 > 2
                    while (arr[i] >= num) {//arr[i]이 num보다 클땐 num이 오름차순으로 스택에 들어감
                        stack.push(num);
                        System.out.println(num + " " + i);
                        num++;
                    }
                    if (arr[i] == stack.peek()) {//같으면 stack에서 빼주고
                        int temp = stack.pop();
                        System.out.println(temp + " " + i);
                    }
                } else if (arr[i] < num) {//{6 4 3 2 1} arr[i]가 기존 num보다 작으면 {5, 4, 2, 3, 4} 5 -> 1 사이에 는 숫자가 발생한경우
                    try {
                        int a = 0;
                        while (arr[i] < stack.peek()) {//같을때까지 빼준다
                            int temp = stack.pop();
                            st[a] = temp;
                            a++;
                            System.out.println(temp + " " + st[a]);
                        }
                        if (arr[i] == stack.peek()) {
                            int b = stack.pop();
                            System.out.println(b + " " + i);
                        }
                    } catch (EmptyStackException e) { //40번에서 스택이 비어있을 경우가 있음
                        System.out.println("스택이 비어있음");
                    }
                }
                //arr에서 앞에것보다 뒤에것이 더 크거나 중복이면 안되는 조건식을 만들자
//           else if(arr[i] == num){//{4 5 3 2 1}
//                stack.push(num);
//                stack.pop();
//                num++;
//            }


            }
        }
        for (int p = 0; p < st.length; p++) {
            System.out.print(st[p]);
        }
        return true;
    }
    public static void main(String[] args) {
        /*
         */
        int[] arr = stackSequence2(3, "6 2 1");
        System.out.println(sequence(arr));
    }
}
