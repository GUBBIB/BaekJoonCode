import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WrongMain12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 물품의 수
        int k = Integer.parseInt(st.nextToken()); // 배낭의 무게
        int current_k = 0, current_v = 0, now_k = 0, now_v = 0, result = 0;

        ArrayList<int[]> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken()); // 물건의 무게
            int v = Integer.parseInt(st.nextToken()); // 물건의 가치

            arr.add(new int[]{w, v});
        }

        arr.sort((a, b) -> {
            if(a[0] != b[0]){
                return a[0] - b[0];
            }
            return b[1] - a[1];
        });

        for(int i=0; i<n; i++){
            current_k = arr.get(i)[0];
            current_v = arr.get(i)[1];
            for(int j=i; j<n; j++){
                if(i != j){
                    now_k = arr.get(j)[0];
                    now_v = arr.get(j)[1];
                }else {
                    now_k = now_v = 0;
                }
                if(current_k + now_k <= k){
                    current_k += now_k;
                    current_v += now_v;
                } else {
                    break;
                }
            }
            result = Math.max(current_v, result);

        }

        sb.append(result);
        System.out.println(sb);

    }
}