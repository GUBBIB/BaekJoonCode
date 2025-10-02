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
문제를 해결하기 위해 **HahsMap**을 사용하여 ``{사이트 주소 : 비밀번호}`` 형태로 값을 저장한 후, 사이트 주소를 주면 그 값을 반환하게 만들었습니다.