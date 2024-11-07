<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻자바 코드
```java
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

        while(j <= k){
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

        for(int i=2; i<Math.sqrt(size); i++){
            if(prime[i]) continue;


            for(int j=i*i; j<=prime.length; j=j+i){
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
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
문제를 해결하기 위해 **투 포인터 알고리즘**을 적용했습니다. 이 방식은 두 개의 포인터를 사용하여 배열의 양 끝에서부터 접근하여 효율적으로 조건 값을 찾을 수 있습니다.

## ⚙️ 에라토스테네스의 체 알고리즘

## ⚙️ 두 포인터 알고리즘

## ❌ 내가 틀렸던 이유
- 에라토스테네스의 체 알고리즘에서 두 번째 for문의 초기값이 극단적인 상황에서  `int`형의 범위(`-2,147,483,648 ~ 2,147,483,647`)를 가뿐히 뛰어넘어 런타임에러가 발생하였습니다.
- while문안의 투 포인터의 증감 조건이 잘 못 돼었습니다.
