import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] n = br.readLine().toCharArray();
        String[] answer = {"◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!", "흥칫뿡!! <(￣ ﹌ ￣)>"};
        boolean chk = true;
        int tmp = 0;

        if(n.length == 1){
            System.out.println(answer[0]);
        } else {
            tmp = n[0] - n[1];
            for(int i=1; i<n.length; i++){
                if(!(tmp == n[i-1] - n[i])){
                    chk = false;
                    break;
                }
            }

            if(chk){
                System.out.println(answer[0]);
            } else {
                System.out.println(answer[1]);
            }
        }

    }
}