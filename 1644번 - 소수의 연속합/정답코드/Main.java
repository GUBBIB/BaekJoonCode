import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long[] primeArr = new long[n], sumArr = new long[n+1];
        int j = 0, k = 1, cnt = 0, idx = 0;
        long sum = 0;

        sumArr[0] = 0;
        idx = primeChk(n, primeArr);
        primeArr = Arrays.copyOf(primeArr, idx);
        sumArr = Arrays.copyOf(sumArr, idx+1);

        // 누적합
        for(int i=1; i<=primeArr.length; i++){
            sumArr[i] = primeArr[i-1] + sumArr[i-1];
        }

        while(k < sumArr.length){
            sum = sumArr[k] - sumArr[j];
            if(sum > n){
                j++;
            } else if(sum < n){
                k++;
            } else {
                cnt++;
                j++; k++;
                if(k >= sumArr.length-1){
                    break;
                }
            }

        }
        System.out.println(cnt);
    }

    // 에라토스테네스의 체 알고리즘
    public static int primeChk(int size, long[] primeArr) {
        prime = new boolean[size + 1];
        prime[0] = prime[1] = true;
        int k = 0;
        if (size < 2) {
            return 0;
        }

        // √400만 = 2000이므로 제곱의 값을 j로 줘도 범위 오류는 아니다
        for(int i=2; i<=Math.sqrt(size); i++){
            if(prime[i]) continue;


            for(int j=i*i; j<=prime.length; j=j+i){
                if(j > size) continue;
                prime[j] = true;
            }
        }

        for(int i=0; i<size+1; i++){
            if(!prime[i]){
                primeArr[k++] = i;
            }
        }
        return k;
    }
}