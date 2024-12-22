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

        int n = Integer.parseInt(br.readLine());
        int result = 0, compare = 0;
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> (o1[0] == o2[0])? o1[1] - o2[1]: o2[0] - o1[0]);

        compare = arr[4][0];
        if(n != 5) {
            for (int i = 5; i < n; i++) {
                if (arr[i][0] == compare) {
                    result++;
                }
            }
        }
        
        System.out.println(result);
    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
문제를 해결하기 위해 **Comparator**를 사용하여 2차원 배열을 정렬 했습니다.

## ⚙️ Comparator
``Comparator``는 **두 객체를 비교**하고 **정렬 기준을 정하는**  ``인터페이스``이며, 이 코드에서는 ``Arrays.sort()``의 **매개변수로 사용되는 객체**입니다.