import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main12865_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 물품의 수
        int k = Integer.parseInt(st.nextToken()); // 배낭의 무게
        int result = 0;

        int[] w = new int[n + 1];
        int[] v = new int[n + 1];
        int[][] dp = new int[n + 1][k + 1];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());

        }

        for(int i=1; i<=n; i++){ // 물건 인덱스
            for(int j=1; j<=k; j++){ // 배낭의 무게

                if(j - w[i] < 0){
                    dp[i][j] = dp[i-1][j];
                    continue;
                }

                dp[i][j] = Math.max(dp[i - 1][j], v[i] + dp[i - 1][j-w[i]]);
            }
        }

        sb.append(dp[n][k]);
        System.out.println(sb);
    }
}