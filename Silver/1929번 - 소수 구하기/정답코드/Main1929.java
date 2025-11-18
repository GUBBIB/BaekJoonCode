import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1929 {

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