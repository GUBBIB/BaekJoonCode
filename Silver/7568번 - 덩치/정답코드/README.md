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

        // (x, y) (p, q) x > p && y > q 덩치가 더 크다
        // 하나라도 참이 아니라면 패스
        // 작으면 작다

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int[] cntArr = new int[n];
        int weight = 0, height = 0;

        Arrays.fill(cntArr, 1);

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++){
            weight = arr[i][0];
            height = arr[i][1];

            for(int j=i; j<n; j++){
                if(i != j) {
                    if (weight > arr[j][0] && height > arr[j][1]) {
                        cntArr[j]++;
                    } else if (weight < arr[j][0] && height < arr[j][1]) {
                        cntArr[i]++;
                    } else {
                        continue;
                    }
                }
            }
        }

        for(int data : cntArr){
            System.out.printf("%d ", data);
        }

    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
**브루트포스 문제** 이고 ``N``의 크기가 ``2 ≤ N ≤ 50`` 이기에 단순하게 **이중 for문** 으로 해결했습니다.