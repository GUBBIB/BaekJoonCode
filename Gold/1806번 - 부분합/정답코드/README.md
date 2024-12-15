<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻 자바 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
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
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략

문제를 해결하기 위해 **투 포인터 알고리즘**을 적용했습니다. 이 방식은 두 개의 포인터를 사용하여 배열의 양 끝에서부터 접근하여 효율적으로 조건 값을 찾을 수 있습니다.<br>
`long sum` 변수에 `arr[j] + arr[k]`의 값을 넣어, sum의 값이 음수인지 양수인지 비교하여 `j`와 `k`의 인덱스값을 변화시켰습니다.

## 📊 누적합과 투 포인터 알고리즘

찾는 값의 범위가 `S ( 0 < S <= 100,000,000 )` 이므로, 극단적인 경우 누적합 `sumArr`의 마지막 값의 크기는 `int`형의 범위(`-2,147,483,648 ~ 2,147,483,647`)를 가뿐히 뛰어넘어 `long` 타입을 사용하여 누적합 배열을 만들었습니다.

- `sumArr[k] - sumArr[i]`의 값을 저장한 `sum` 변수와 찾는 값 `S`를 비교하여 `sum >= S`인 경우, `if(len < k-j)` 조건을 통해 `chk = true`로 바꾸고, `len = k-j`를 넣어줬습니다.

## ⛔ 예외 처리

- `k > sumArr.length - 1`일 때 `break;`를 통해 while문을 종료하여, 인덱스 범위 오류를 방지했습니다.

