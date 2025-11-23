<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻 자바 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main12865_1 {
    static int[] v;
    static int[] w;
    static int[][] memo;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 물품의 수
        int k = Integer.parseInt(st.nextToken()); // 배낭의 무게
        int result = 0;

        w = new int[n+1];
        v = new int[n+1];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());

            w[i] = Integer.parseInt(st.nextToken()); // 물건의 무게
            v[i] = Integer.parseInt(st.nextToken()); // 물건의 가치
        }

        memo = new int[n + 1][k + 1];
        for(int i=0; i<=n; i++){
            Arrays.fill(memo[i], -1);
        }

        result = run(n, k);

        sb.append(result);
        System.out.println(sb);
    }

    static int run(int n, int k){
        if(n == 0 || k == 0) return 0;
        if(memo[n][k] != -1) return memo[n][k];

        if(w[n] > k){
            memo[n][k] = run(n-1, k);
        } else {
            int no = run(n-1, k);
            int yes = v[n] + run(n - 1, k - w[n]);
            memo[n][k] = Math.max(no, yes);
        }

        return memo[n][k];
    }

}
```

# 💭 나의 접근 방식
DP 방식과 재귀함수를 사용해 물건을 가방에 넣을 때와 넣지 않을 때를 구분해서 제작했습니다. 