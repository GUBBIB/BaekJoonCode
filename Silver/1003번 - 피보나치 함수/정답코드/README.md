<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻 자바 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // [][0] = fibonacci, [][1] = 0의 개수, [][2] = 1의 개수
    static int[][] memo = new int[41][3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            sb.append(fibonacci(x)[1]).append(" ").append(fibonacci(x)[2]).append("\n");
        }

        System.out.println(sb);

    }

    public static int[] fibonacci(int x){
        if(memo[x][0] > 0){
            return memo[x];
        }

        if(x < 2){
            memo[x][0] = x;
            if(x == 0 && memo[x][1] == 0) {
                memo[x][1]++;
            } else if(x == 1 && memo[x][2] == 0){
                memo[x][2]++;
            }
            return memo[x];
        } else {
            int[] a = fibonacci(x - 1);
            int[] b = fibonacci(x - 2);
            memo[x][0] = a[0] + b[0];
            memo[x][1] = a[1] + b[1];
            memo[x][2] = a[2] + b[2];
        }
        return memo[x];
    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
문제를 해결하기 위해 **피보나치 함수**를 구하는 알고리즘에 **동적계획법**을 적용한 다음 ``0``과 ``1``을 방문한 횟수를 출력했습니다.

## ⚙️ 피보나치 함수
재귀함수를 통해서 피보나치 값을 구하는 알고리즘입니다.

## ⚙️ 동적계획법
- ``특정 범위까지의 값``을 구하기 위해서 ``그것과 다른 범위까지의 값``을 이용하여 **효율적으로 값**을 구하는 **알고리즘**입니다.<br>
- 이 코드에서는 2차원 배열 memo 변수를 이용하여 동적계획법을 이용했습니다.<br>
- **``[][0] = 피보나치의 값``, ``[][1] = 0 방문 횟수``, ``[][2] = 1 방문 횟수``** 을 이용해서 StringBilder에 ``"[x][1] [x][2]"``의 값을 넣고 마지막에 출력했습니다.