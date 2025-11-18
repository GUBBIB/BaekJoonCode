import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int j = 0, k = 1, len = 100_000;
        long sum = 0;
        boolean chk = false;

        int[] intArr = new int[n];
        long[] sumArr = new long[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        // 누적합 구하기
        sumArr[0] = 0;
        for(int i=1; i<=n; i++){
            sumArr[i] = intArr[i-1] + sumArr[i-1];
        }

//        누적합 확인
//        for(long a : sumArr){
//            System.out.printf("%d ", a);
//        }
//        System.out.println();

        while(j < k){
            sum = sumArr[k] - sumArr[j];
            if(sum >= S){
                if(k-j < len){
                    len = k-j;
                    chk = true;
                }
                j++;
            } else {
                k++;
            }
            if(k > sumArr.length-1){
                break;
            }
        }

        if(chk){
            System.out.println(len);
        } else {
            System.out.println(0);
        }

    }
}