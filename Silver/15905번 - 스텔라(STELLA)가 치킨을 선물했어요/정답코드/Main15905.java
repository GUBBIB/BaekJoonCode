import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main15905 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int result = 0, compare = 0;
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> (o1[0] == o2[0])? o1[1] - o2[1]: o2[0] - o1[0]);

        compare = arr[4][0];
        if(n != 5) {
            for (int i = 5; i < n; i++) {
                if (arr[i][0] == compare) {
                    result++;
                }
            }
        }
        
        System.out.println(result);
    }
}