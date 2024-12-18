import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int k = 0, sum = 0, len = 0;

        for(int i=0; i<n; i++){
             k = Integer.parseInt(br.readLine());

             if(k != 0){
                 MyStack.push(k);
             } else {
                 MyStack.pop();
             }
        }

        len = MyStack.size();
        for(int i=0; i<len; i++){
            sum += MyStack.pop();
        }

        System.out.println(sum);
    }
}

class MyStack {
    static int size = 10, top = 0;
    static int[] stack = new int[size];

    public static void resize(){
        int[] tmp = new int[size*2];
        for(int i=0; i<stack.length; i++){
            tmp[i] = stack[i];
        }
        size *= 2;
        stack = tmp;
    }
    public static void push(int x){
        if(top == size){
            resize();
        }
        stack[top++] = x;
    }
    public static int pop() {
        return (stack.length <= 0) ? -1 : stack[--top];
    }

    public static int size(){
        return top;
    }
}