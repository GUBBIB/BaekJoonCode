<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻 자바 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s;
        boolean chk = true;

        while (!(s = br.readLine()).equals(".")) {
            chk = true;
            char[] arr = s.toCharArray();
            MyStack.reset();

            for(int i=0; i<arr.length; i++){
                if(arr[i] == '(' || arr[i] == '['){
                    MyStack.push(String.valueOf(arr[i]));
                } else if(arr[i] == ')'){
                    if(MyStack.empty() || !MyStack.peek().equals("(")){
                        chk = false;
                        break;
                    } else {
                        MyStack.pop();
                    }
                } else if(arr[i] == ']'){
                    if(MyStack.empty() || !MyStack.peek().equals("[")){
                        chk = false;
                        break;
                    } else {
                        MyStack.pop();
                    }
                }
            }
            if(MyStack.peek().equals("(") || MyStack.peek().equals("[")){
                chk = false;
            }

            if(chk){
                sb.append("yes").append("\n");
            } else{
                sb.append("no").append("\n");
            }

        }
        System.out.println(sb);

    }

    public static class MyStack {
        static private int size = 10, t_p = 0;
        static private String[] stack = new String[size];

        public static void resize(){
            String[] tmp = new String[size*2];
            for(int i=0; i<stack.length; i++){
                tmp[i] = stack[i];
            }
            stack = tmp;
            size *= 2;

        }
        public static void push(String x){
            if(t_p == size) resize();
            stack[t_p++] = x;
        }

        public static String pop(){
            if(t_p == 0) return "no";
            String tmp = stack[t_p-1];
            t_p--;
            return tmp;
        }

        public static int count(){
            return t_p;
        }

        public static boolean empty(){
            return t_p == 0;
        }

        public static String peek(){
            if(t_p == 0) return "no";
            return stack[t_p-1];
        }

        public static void reset(){
            t_p = 0;
        }

    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략

문제를 해결하기 위해 **스택**을 직접 구현 한 후, 응용 하여 문제를 해결했습니다.

## ⚙️ 스택 알고리즘
흔히 FIFO, 선입선출 알고리즘이라고도 하며 먼저 입력된 값이 나중에 출력되게 동작하는 알고리즘입니다.
저는 직접 클래스를 만들어 여러가지 기능을 추가 해 봤습니다.