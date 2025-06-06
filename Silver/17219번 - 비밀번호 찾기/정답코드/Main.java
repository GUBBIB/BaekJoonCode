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