import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int INF =  2_147_483_646;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        HashMap<String, Integer> hash = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            hash.put(br.readLine(), 1);
        }

        for(int i=0; i<m; i++){
            String input = br.readLine();
            if (hash.get(input) != null) {
                list.add(input);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for (String data : list) {
            System.out.println(data);
        }
    }
}