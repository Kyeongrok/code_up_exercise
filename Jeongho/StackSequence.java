package Jeongho;

import java.util.Scanner;
import java.util.Stack;

public class StackSequence {
    public static int sequence(int input){
        //
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int[] arr=new int[input];//
        int[] result=new int[arr.length];
        for(int i=0; i<arr.length;i++) {
            int b = sc.nextInt();
            arr[i] = b;// 1.수열 입력
        }
        for(int i=0;i<arr.length; i++ ) {
            for (int j = 1; j <= arr[i]+1; j++) {
                if (arr[i] >= j) {//2. 스택에 1부터 오름차순으로 넣는거 만들고반복
                    stack.push(j);
                }else {//3. 수열과 스택Top이 같을때 pop해주고 -> 스택 사이즈가 너무 크다
                    result[i]=stack.pop();
                }
            }
            System.out.print(result[i]+" ");
        }

        // 4. 이걸 수열 입력받은 숫자만큼 반복
        sc.close();
        System.out.println();
        System.out.println(stack.size());
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sequence(a);

        sc.close();
    }
}
