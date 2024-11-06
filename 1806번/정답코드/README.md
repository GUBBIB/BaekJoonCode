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

## 🌟 데이터 타입 선택
문제의 데이터 범위가 -10<sup>9</sup> ~ 10<sup>9</sup>까지이지만, 혹시 발생할 수 있는 오버플로우를 방지하기 위해 배열(`arr`)의 타입은 `long`으로 설정하였습니다. 이를 통해 안정성을 높였습니다.

## 💡 문제 해결 전략
문제를 해결하기 위해 **투 포인터 알고리즘**을 적용했습니다. 이 방식은 두 개의 포인터를 사용하여 배열의 양 끝에서부터 접근하여 효율적으로 조건 값을 찾을 수 있습니다.<br>
long sum 변수에 arr[j] + arr[k] 의 값을 넣어 sum의 값이 음수인지 양수인지 비교하여 j와 k의 인덱스값을 변화시켰습니다.
