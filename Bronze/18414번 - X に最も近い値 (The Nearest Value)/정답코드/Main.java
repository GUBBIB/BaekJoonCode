import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static ArrayList<ArrayList<Integer>> node = new ArrayList<>();
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int min = 100_001, tmp = 0, data = 0;

        int x = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        for(int i=l; i<=r; i++){
            tmp = x - i;
            tmp = (tmp < 0 )? tmp*-1 : tmp;
            if(min > tmp){
                min = tmp;
                data = i;
            }
        }

        System.out.println(data);

    }
}