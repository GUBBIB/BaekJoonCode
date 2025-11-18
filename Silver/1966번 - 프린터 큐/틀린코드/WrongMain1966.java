import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WrongMain1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int size  = Integer.parseInt(st.nextToken());
            int x =  Integer.parseInt(st.nextToken());
            int cnt = 0, chk = 0;
            Queue<int[]> q = new LinkedList<>();
            int[] cntP = new int[10];
            int pointer = 0;
            boolean boolChk = true;


            st = new StringTokenizer(br.readLine());

            for(int j=0; j<size; j++){
                int a =  Integer.parseInt(st.nextToken());
                if(j == x){
                    chk = a;
                }
                pointer = Math.max(pointer, a);
                cntP[a]++;
                q.add(new int[]{a, j});
            }
            if(size == 1){
                cnt++;
                sb.append(cnt).append("\n");
            } else {
                while(!q.isEmpty() && boolChk) {
                    int[] num = q.poll();


                    if(num[0] == chk && num[1] == x && pointer == num[0]){
                        cnt++;
                        boolChk = false;
                        sb.append(cnt).append("\n");
                        break;
                    } else if (pointer >= chk) {
                        if(num[1] != x && pointer == num[0]){
                            while (pointer > 0 && cntP[pointer] != 0) {
                                cntP[pointer]--;
                                cnt++;

                                if(cntP[pointer] > 0){
                                    num = q.poll();

                                    if(num[1] == x){
                                        cnt++;
                                        boolChk = false;
                                        sb.append(cnt).append("\n");
                                        break;
                                    }
                                }
                            }
                            for(int k=pointer-1; k>=0; k--){
                                if(cntP[k] > 0){
                                    pointer = k;
                                    break;
                                }
                            }
                        } else {
                            q.add(new int[]{num[0], num[1]});
                        }
                    }
                }
            }
        }

        System.out.println(sb);


    }
}