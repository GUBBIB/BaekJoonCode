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
        int v = Integer.parseInt(st.nextToken());
        int index = 0;

        ArrayList<ArrayList<Integer>> node = new ArrayList<>();
        boolean[] visited;

        for(int i=0; i<n+1; i++){
            node.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            node.get(s).add(e);
            node.get(e).add(s);

        }

        for(int i=1; i<=n; i++){
            Collections.sort(node.get(i));
        }

        visited = new boolean[n+1];
        DFS(node, v, visited);
        System.out.println();

        visited = new boolean[n+1];
        BFS(node, v, visited);

//        // 체크
//        System.out.println();
//        for(ArrayList<Integer> data : node){
//            System.out.print(index++ + " : ");
//            System.out.println(data);
//        }
    }

    public static void DFS(ArrayList<ArrayList<Integer>> node, int start, boolean[] visited){
        visited[start] = true;
        System.out.printf("%d ", start);
        for (int data : node.get(start)) {
            if(!visited[data]){
                DFS(node, data, visited);
            }
        }
    }

    public static void BFS(ArrayList<ArrayList<Integer>> node, int start, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int now = q.poll();
            System.out.printf("%d ", now);
            for(int data : node.get(now)){
                if(!visited[data]) {
                    q.offer(data);
                    visited[data] = true;
                }
            }
        }

    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
양방향 그래프를 만들기 위해 ``ArrayList<ArrayList<Integer>>`` 타입으로 ``인접 리스트`` 형태로 구현 했습니다.<br>
이후 ``BFS 알고리즘``과 ``DFS 알고리즘``을 사용하여 방문한 노드를 출력했습니다.

## ⚙️ DFS(Depth First Seach) 깊이 우선 탐색
**``DFS (Depth-First Search)``** 는 그래프를 탐색할 때 **``깊이를 우선적``**으로 탐색하는 알고리즘입니다. 이 알고리즘은 먼저 한 방향으로 가능한 깊이까지 탐색한 후, 더 이상 갈 곳이 없으면 돌아가서 다른 경로를 탐색하는 방식입니다.

## ⚙️ BFS(Breadth First Seach) 너비 우선 탐색
**BFS (Breadth-First Search)** 는 그래프를 탐색할 때 ``너비를 우선적``으로 탐색하는 알고리즘입니다. 이 알고리즘은 시작 노드에서 인접한 노드를 먼저 방문하고, 그 이후에 인접한 노드를 차례로 탐색합니다. 즉, 한 단계씩 넓게 탐색합니다.