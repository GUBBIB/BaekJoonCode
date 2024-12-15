<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻 자바 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] prime = new boolean[m+1];

        prime[0] = prime[1] = true;

        for(int i=2; i<=Math.sqrt(m); i++){
            if(prime[i]) {
                continue;
            }

            for(int j=i*i; j<=prime.length; j=j+i){
                // j = j + i; 이기 때문에 i를 더할 때 m을 넘어가는 경우가 있음
                // 3 20 일 때 j = 18 시점이 끝나고 그 다음 값이 21이 기때문에 그 때 IndexBound가 난다
                if(j > m) continue;
                prime[j] = true;
            }
        }

        for(int i=n; i<=m; i++){
            if(!prime[i]) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
문제를 해결하기위해 **에라토스테네스의 체 알고리즘**을 사용 하여 소수를 판별한 뒤, `prime[i] = false`인경우 `StringBuilder sb변수`에 넣은 후 마지막에 출력하였습니다.

## ⚙️ 에라토스테네스의 체 알고리즘
에라토스테네스의 체 알고리즘은 **소수 판별**을 위한 효율적인 방법으로, **배수들**을 차례대로 걸러내는 방식입니다. 먼저, **prime** 배열을 사용하여 각 수의 배수 위치에 `true` 값을 할당하며, 이를 반복하여 소수가 아닌 값들을 걸러냅니다. 결국, prime 배열에서 `true`인 값은 소수이고, `false`인 값은 소수가 아닌 수입니다.

