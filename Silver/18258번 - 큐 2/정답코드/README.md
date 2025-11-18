<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻 자바 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int cnt = Integer.parseInt(br.readLine());
        String str = "";
        int num = 0;
        MyQueue q = new MyQueue();

        for (int i = 0; i < cnt; i++) {
            st =  new StringTokenizer(br.readLine());
            if(st.countTokens() == 2){
                str = st.nextToken();
                num = Integer.parseInt(st.nextToken());
            } else {
                str = st.nextToken();
            }

            switch(str){
                case "push":
                    q.push(num);
                    break;

                case "pop":
                    sb.append(q.pop()).append("\n");
                    break;

                case "size":
                    sb.append(q.size()).append("\n");
                    break;

                case "empty":
                    sb.append(q.empty()).append("\n");
                    break;

                case "front":
                    sb.append(q.front()).append("\n");
                    break;

                case "back":
                    sb.append(q.back()).append("\n");
                    break;

            }
        }

        System.out.println(sb);

    }
}

class MyQueue {
    LinkedList<Integer> queue = new LinkedList<>();
    int size = 0;

    public MyQueue(){

    }

    public void push(int x){
        queue.add(x);
        size++;
    }
    public int pop(){
        if(size == 0){
            return -1;
        }
        size--;
        return queue.poll();
    }
    public int size(){
        return size;
    }
    public int empty(){
        return queue.isEmpty()? 1: 0;
    }
    public int front(){
        if(size == 0){
            return -1;
        }
        return queue.getFirst();
    }
    public int back(){
        if(size == 0){
            return -1;
        }
        return queue.getLast();
    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
문제를 해결하기 위해 직접 **Queue**를 만들어 **switch-case** 문으로 분기 시켰습니다