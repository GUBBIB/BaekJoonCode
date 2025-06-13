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

        while(k < sumArr.length){
            sum = sumArr[k] - sumArr[j];
            if(sum > n){
                j++;
            } else if(sum < n){
                k++;
            } else {
                cnt++;
                j++; k++;

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
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
문제를 해결하기 위해 **투 포인터 알고리즘**과 **누적합**을 활용했습니다. 

## ⚙️ 에라토스테네스의 체 알고리즘
에라토스테네스의 체 알고리즘은 **소수 판별**을 위한 효율적인 방법으로, **배수들**을 차례대로 걸러내는 방식입니다. 먼저, **prime** 배열을 사용하여 각 수의 배수 위치에 `true` 값을 할당하며, 이를 반복하여 소수가 아닌 값들을 걸러냅니다. 결국, prime 배열에서 `true`인 값은 소수이고, `false`인 값은 소수가 아닌 수입니다.

## ⚙️ 투 포인터 알고리즘
이 문제를 해결 하기위해 양 끝에서부터가 아닌 는 배열의 양 끝에서부터 시작하지만, 이 문제를 해결 하기위해 양 끝에서부터가 아닌 누적합 배열 sumArr의 1번째와 0번째부터 비교를 했습니다.

- `sumArr[k] - sumArr[j]`를 **long** 타입 변수 `sum`에 저장하고, 이를 기준으로 조건을 판단했습니다.
- **조건에 따른 포인터 이동**:
  - `sum > n`이면 `j++`
  - `sum < n`이면 `k++`
  - `sum == n`이면 `cnt++`, 그 후 `j++`와 `k++`를 통해 포인터를 동시에 증가시켰습니다.

## ⚙️ 누적합
주어진 배열이 있을 때, **누적합 배열**은 각 위치에 해당하는 원소와 그 이전 원소들의 합을 누적한 값입니다. 예를 들어, 배열 `A`가 `[a, b, c, d]`라면, 누적합 배열 `B`는 `[a, a+b, a+b+c, a+b+c+d]`로 구성됩니다. 

이 누적합 배열 `B`에서 `B[3] - B[1]`을 하면, 배열 `A`의 `A[3]`와 `A[2]`의 합을 구할 수 있습니다.
