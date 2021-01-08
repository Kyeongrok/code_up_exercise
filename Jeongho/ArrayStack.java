package HelloWorld.Jeongho;

import java.lang.reflect.Array;
interface Stack{
    boolean isEmpty();
    boolean isFull();
    void push(char item);
    char pop();
    char peek();
    void clear();
}
public class ArrayStack implements Stack {
    private int top;
    private int stackSize;
    private char stackArr[];


    public ArrayStack(int stackSize) {
        top = -1; //스택포인터 초기화
        this.stackSize = stackSize;
        stackArr = new char[this.stackSize];//스텍 사이즈
    }

    public boolean isEmpty() {
        return (top == -1);
    }


    public boolean isFull() {
        return (top == this.stackSize - 1);//스텍 포인터가 스텍 인덱스와 동일한지 아닌지
    }

    public void arrayPlus() {
        this.stackSize = stackSize+1;
        char[] temp = stackArr;
        stackArr = new char[this.stackSize];
        for(int i=0; i<temp.length; i++) {
            stackArr[i] = temp[i];
        }
    }
    public void push(char item) {
        if (isFull()) {
            System.out.println("Stack is full!");
            arrayPlus();
        }
        stackArr[++top] = item;//스택 포인터가 가르키는 인덱스에 추가
        System.out.println("Inserted Item :" + item);
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Deleting fail! Stack is empty");
            return 0;
        } else {
            System.out.println("Deleted Item :" + stackArr[top]);
            return stackArr[--top];
        }
    }
    public char peek() {
        if (isEmpty()) {
            System.out.println("Peeking fail! Stack is empty!");
            return 0;
        } else {
            System.out.println("Peeked Item :" + stackArr[top]);
            return stackArr[top];
        }
    }
    public void clear() {
        if (isEmpty()) {
            System.out.println("Stack is  alreadt mpty");
        } else {
            top = -1;
            stackArr = new char[this.stackSize];
            System.out.println("Stack is clear!");
        }
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.print("Stack elements :");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArr[i]);
            }
            System.out.println();
            System.out.println(stackArr.length);
        }
    }
    public void reverse() {
        System.out.print("Reverse Elements :");
        for(int i = top; i>=0; i--) {
            System.out.print(stackArr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int stackSize = 5 ;
        ArrayStack arrayStack = new ArrayStack(stackSize);

        arrayStack.push('A');
        arrayStack.push('B');
        arrayStack.push('C');
        arrayStack.push('D');
        arrayStack.push('E');
        arrayStack.push('F');
        arrayStack.printStack();
        arrayStack.reverse();
        arrayStack.pop();
//        arrayStack.clear();
//        arrayStack.printStack();
    }
}

