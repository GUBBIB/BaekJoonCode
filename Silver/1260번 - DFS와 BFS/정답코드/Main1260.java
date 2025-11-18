import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1260 {
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