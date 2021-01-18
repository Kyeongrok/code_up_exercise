package HelloWorld.Jeongho;
import java.util.Scanner;
import java.util.Stack;
public class StackSequence {
    public static int sequence(int input){

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int[] arr=new int[input];//
        int[] result=new int[arr.length];
        for(int i=0; i<arr.length;i++) {
            int b = sc.nextInt();
            arr[i] = b;// 1.수열 입력
        }
//        {수열에 중복이 있을때!}
//         for(int i=0;i<arr.length; i++ ) {// 4. 이걸 수열 입력받은 숫자만큼 반복
//            for (int j = 1; j <= arr[i]+1; j++  ) {
//                if (arr[i] >= j) {//2. 스택에 1부터 오름차순으로 넣는거 만들고반복
//                    stack.push(j);
//                }else {//3. 수열과 스택Top이 같을때 pop해주고
//                    result[i]=stack.pop();
//                }
//            }
//            System.out.print(result[i]+" ");
//        }
//        {수열에 중복이 없을때}
        int num =1;
        for(int i=0;i<arr.length; i++ ) {//{4 3 6 8 7 5 2 1}
            if(num <=arr[i]){//현재 숫자가 수열 요소보다 작을때
                while(num <= arr[i]){//num을 증가시키며 스택에 푸쉬
                    stack.push(num++);
//                    System.out.print(num);
                     if(num > arr[i]){//다 되면 스택에서 꺼냄
//                         stack.pop();
                         result[i]=stack.pop();
                     }
                }
            }else{//현재 숫자가 수열의 요소보다 클때 ->이미 스택안에 있으니까
                int n = stack.pop();
//                System.out.println(n);
                //이게 계속 진행되어야하고
                if(n>arr[i]){// 핵심 원리: 스택의 가장 위의 수(n)가 만들어야되는 수(arr[i])보다 크면 n이 빠져버림 -> 다음에 그 요소가 나오면 수열을 못만듬
                    System.out.println("NO");//{5, 1, 2, 5, 3, 4}
                    return 0;
                }else{//이건 마이너스를 진행하라는 소리
                    result[i]=n;
                }
            }
                System.out.print(result[i] + " ");
            }

        sc.close();
        System.out.println();
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sequence(a);
        sc.close();
    }
}
