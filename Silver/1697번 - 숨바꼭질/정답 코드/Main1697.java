import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1697 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        int[] dist = new int[100001];

        q.offer(N);
        visited[N] = true;
        dist[N] = 0;

        while(!q.isEmpty()){
            int cur = q.poll();

            for(int next : new int[]{cur-1, cur+1, cur*2}){
                if(next < 0 || next > 100000) continue;
                if(visited[next]) continue;

                visited[next] = true;
                dist[next] = dist[cur] + 1;
                q.offer(next);
            }
        }

        sb.append(dist[K]).append("\n");

        System.out.println(sb);
    }
}
