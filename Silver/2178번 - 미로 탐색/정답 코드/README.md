<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻 자바 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[N + 1][M + 1];
        int[][] dist = new int[N + 1][M + 1];
        int[][] arr = new int[N + 1][M + 1];

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for(int i=1; i<=N; i++){
            char[] str = br.readLine().toCharArray();
            for(int j=1; j<=M; j++){
                arr[i][j] = Integer.parseInt(String.valueOf(str[j-1]));
            }
        }

        q.offer(new int[]{1, 1});
        visited[1][1] = true;
        dist[1][1] = 1;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];

            for(int d=0; d<4; d++){
                int cx = x + dx[d];
                int cy = y + dy[d];

                if(cx < 1 || cy < 1 || cx > N || cy > M ) continue; // 범위 초과
                if(arr[cx][cy] == 0) continue; // 벽
                if(visited[cx][cy]) continue; // 방문함

                visited[cx][cy] = true;
                dist[cx][cy] = dist[x][y] + 1;
                q.offer(new int[]{cx, cy});
            }
        }

        sb.append(dist[N][M]);

        System.out.println(sb);
    }

}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
**BFS** 알고리즘을 사용해 문제를 해결 했으며, 벽을 확인하는 코드를 추가 했습니다 ``arr[cx][cy] == 0 이면 벽``.