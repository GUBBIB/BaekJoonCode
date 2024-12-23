import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // [][0] = fibonacci, [][1] = 0의 개수, [][2] = 1의 개수
    static int[][] memo = new int[41][3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            sb.append(fibonacci(x)[1]).append(" ").append(fibonacci(x)[2]).append("\n");
        }

        System.out.println(sb);

    }

    public static int[] fibonacci(int x){
        if(memo[x][0] > 0){
            return memo[x];
        }

        if(x < 2){
            memo[x][0] = x;
            if(x == 0 && memo[x][1] == 0) {
                memo[x][1]++;
            } else if(x == 1 && memo[x][2] == 0){
                memo[x][2]++;
            }
            return memo[x];
        } else {
            int[] a = fibonacci(x - 1);
            int[] b = fibonacci(x - 2);
            memo[x][0] = a[0] + b[0];
            memo[x][1] = a[1] + b[1];
            memo[x][2] = a[2] + b[2];
        }
        return memo[x];
    }
}