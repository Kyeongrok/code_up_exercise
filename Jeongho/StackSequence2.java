package HelloWorld.Jeongho;

import java.util.Scanner;
import java.util.Stack;

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
    public static boolean sequence(int[] arr){

        // arr에 일때
        Stack<Integer> stack = new Stack<Integer>();
        int num = 1;
        for(int i=0; i<arr.length; i++){
            //arr에서 앞에것보다 뒤에것이 더 크거나 중복이면 안되는 조건식을 만들자
            for(int a = 1; a < arr.length-1; a++){
                if(arr[i+1]<=arr[a]){// {5, 1, 2, 6, 3, 4, 5}

                }
            }
            if(arr[i] > num){
                // 4 > 1
                // 4 > 2
                while(arr[i]>=num){//arr[i]이 num보다 클땐 num이 오름차순으로 스택에 들어감
                    stack.push(num);
                    System.out.println(num +" "+ i);
                    num++;
                }
                if(arr[i] == stack.peek()){//같으면 stack에서 빼주고
                    stack.pop();
                }
            }else if(arr[i] < num){//{6 4 3 2 1} arr[i]가 기존 num보다 작으면
                while(arr[i] <= stack.peek()){//같을때까지 빼준다
                    int temp = stack.pop();
                    System.out.println(temp);
                    if(arr[i]== temp){//같아지면 스택에서 빼주고
                        System.out.println(temp);
                    }
                }
            }
//           else if(arr[i] == num){//{4 5 3 2 1}
//                stack.push(num);
//                stack.pop();
//                num++;
//            }
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
