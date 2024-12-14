<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻 자바 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static ArrayList<ArrayList<Integer>> node = new ArrayList<>();
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int x = Integer.parseInt(br.readLine());
        int tmp = x % 3;

        if (tmp == 1) {
            System.out.println("U");
        } else if (tmp == 2) {
            System.out.println("O");
        } else {
            System.out.println("S");
        }

    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
단순 구현 했습니다