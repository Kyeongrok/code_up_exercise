package HelloWorld.Jeongho;

import java.util.Scanner;

public class Programmers1_04 {
    public static String year (int a, int b){
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //string 배열로 일주일 만들고
        //2016년 1월 1일 금욜
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();//달
//        int b = sc.nextInt();
        int cntday = 0;
        for(int i = 0 ; i < a-1; i++){//달
            cntday += month[i];
        }
        cntday += b;
        String ans = day[cntday%7];

        System.out.println(ans+" "+ cntday);
        return ans;
    }
    public static void main(String[] args) {
        year(5, 6);

    }
}
