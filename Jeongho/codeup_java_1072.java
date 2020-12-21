package HelloWorld.Jeongho;

import java.util.Scanner;

public class codeup_java_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        int i = 0;
        while(i < a) {
            int temp = sc.nextInt();
            arr[i] = temp;
            i++;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
        sc.close();
    }
}
