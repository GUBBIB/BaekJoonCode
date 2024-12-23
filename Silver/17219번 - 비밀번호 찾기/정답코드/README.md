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
        HashMap<String, String> hash = new HashMap<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            hash.put(st.nextToken(), st.nextToken());
        }

        for(int i=0; i<m; i++){
            String str = br.readLine();

            if(!hash.get(str).isEmpty()){
                sb.append(hash.get(str)).append("\n");
            }
        }

        System.out.println(sb);

    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
문제를 해결하기 위해 **Comparator**를 사용하여 2차원 배열을 정렬 했습니다.

## ⚙️ Comparator
``Comparator``는 **두 객체를 비교**하고 **정렬 기준을 정하는**  ``인터페이스``이며, 이 코드에서는 ``Arrays.sort()``의 **매개변수로 사용되는 객체**입니다.