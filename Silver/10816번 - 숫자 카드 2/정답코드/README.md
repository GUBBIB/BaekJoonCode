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
        HashMap<Integer, Integer> hm = new HashMap<>();

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(hm.get(tmp) != null) {
                hm.put(tmp, hm.get(tmp) + 1);
            } else {
                hm.put(tmp, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<m; i++){
            int key = Integer.parseInt(st.nextToken());
            int tmp = (hm.get(key) == null)? 0 : hm.get(key);

            sb.append(tmp+ " ");
        }

        System.out.println(sb);

    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
간단하게 문제를 해결하기 위해 **HashMap** 을 사용했습니다.