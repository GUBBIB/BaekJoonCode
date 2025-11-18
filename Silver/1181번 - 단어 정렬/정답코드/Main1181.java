import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s;
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(br.readLine());
        }

        Collections.sort(arr, (s1, s2) ->
                s1.length() != s2.length() ? s1.length() - s2.length() : s1.compareTo(s2)
        );

        s = arr.get(0);
        sb.append(s).append("\n");

        for (String str : arr) {
            if(s.equals(str)){
                continue;
            }else {
                s = str;
                sb.append(s).append("\n");
            }
        }

        System.out.println(sb);
    }
}