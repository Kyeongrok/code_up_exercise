package HelloWorld.Jeongho;

import java.util.Scanner;
import java.util.Stack;

public class codeup_java_2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr= new int[a];
        for(int i =0; i<arr.length; i++){
            int t = sc.nextInt();
            arr[i] = t;
            if(i%3==2 && i!=0) {
                System.out.print(","+arr[i]);
            }else{
                System.out.print(arr[i]);
            }
        }

    }
}
