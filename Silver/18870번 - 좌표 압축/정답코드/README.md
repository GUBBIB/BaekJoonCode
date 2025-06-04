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

        int n = Integer.parseInt(br.readLine()), compare, cnt=1;
        int[] arr = new int[n];
        int[] sorted = new int[n];
        Map<Integer, Integer> hashMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sorted[i] = arr[i];
        }

        Arrays.sort(sorted);

        compare = sorted[0];
        hashMap.put(sorted[0], 0);

        for(int i=1; i<n; i++){
            if(compare != sorted[i]){
                hashMap.put(sorted[i], cnt++);
            } else {
                hashMap.put(sorted[i], cnt - 1);
            }
            compare = sorted[i];
        }

        for(int a : arr){
            sb.append(hashMap.get(a)).append(" ");
        }
        System.out.println(sb);
    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
입력받은 값들을 **정렬을 한 후**, ``HashMap``을 사용해서 **각 값의 압축된 좌표(순위)**를 **key**로 주었고 값을 원래 순서대로 출력했습니다.