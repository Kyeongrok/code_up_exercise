package HelloWorld.Jeongho;

import java.util.Scanner;
import java.util.Stack;

public class codeup_java_2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = a%3;//
        int[] arr= new int[a];
        for(int i =0; i<arr.length; i++){
            int t = sc.nextInt();
            arr[i] = t;
            if(i%3==k && i!=0) {// i%3은 1~8까지 돌아가니까 앞에 있을수 있다 근데 k%3은 9니까 다를때가 존재 한다 그 차이 인거 같은데
                System.out.print(","+arr[i]);
            }else{
                System.out.print(arr[i]);
            }
        }

    }
}
