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

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] sumArr = new int[n + 1];
        int[] arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<n+1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            // 누적 합
            sumArr[i] = sumArr[i-1] + arr[i];

        }


        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            sb.append(sumArr[e] - sumArr[s-1]).append("\n");

        }

        System.out.println(sb);

    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
문제를 해결하기 위해 **누적 합** 알고리즘을 사용했습니다.

## ⚙️ 누적 합
주어진 배열이 있을 때, **누적합 배열**은 각 위치에 해당하는 원소와 그 이전 원소들의 합을 누적한 값입니다. 예를 들어, 배열 `A`가 `[a, b, c, d]`라면, 누적합 배열 `B`는 `[a, a+b, a+b+c, a+b+c+d]`로 구성됩니다. 

이 누적합 배열 `B`에서 `B[3] - B[1]`을 하면, 배열 `A`의 `A[3]`와 `A[2]`의 합을 구할 수 있습니다.