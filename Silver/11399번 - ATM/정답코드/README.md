<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻 자바 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int[] sumArr = new int[n+1];
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, arr.length-1);

        // 누적합 구하기
        for(int i=1; i<=n; i++){
            sumArr[i] = sumArr[i-1] + arr[i-1];
            result += sumArr[i];
        }
        
        System.out.println(result);

    }

    public static void mergeSort(int s, int e){
        if(s >= e) return;
        int m = s + (e - s) / 2;
        mergeSort(s, m);
        mergeSort(m+1, e);
        merge(s, m, m+1, e);
    }

    public static void merge(int s1, int e1, int s2, int e2){
        int i = s1, j = s2, k = 0;
        int[] tmp = new int[e2 - s1 + 1];

        while(i <= e1 && j <= e2){
            if (arr[i] >= arr[j]) {
                tmp[k++] = arr[j++];
            } else if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            }
        }
        while(i <= e1){
            tmp[k++] = arr[i++];
        }
        while(j <= e2){
            tmp[k++] = arr[j++];
        }

        for(int n = 0; n < tmp.length; n++){
            arr[s1 + n] = tmp[n];
        }
    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
문제를 해결하기 위해 **합병 정렬**과 **누적 합** 알고리즘을 사용했습니다.
``출력 값``은 ``누적 합`` 에서 구한 ``값``들을 ``모두 합한 값``입니다.

## ⚙️ 누적 합
주어진 배열이 있을 때, **누적합 배열**은 각 위치에 해당하는 원소와 그 이전 원소들의 합을 누적한 값입니다. 예를 들어, 배열 `A`가 `[a, b, c, d]`라면, 누적합 배열 `B`는 `[a, a+b, a+b+c, a+b+c+d]`로 구성됩니다. 

이 누적합 배열 `B`에서 `B[3] - B[1]`을 하면, 배열 `A`의 `A[3]`와 `A[2]`의 합을 구할 수 있습니다.

## ⚙️ 합병 정렬
입력된 수의 정렬은 **합병 정렬(Merge Sort)**을 사용하여 처리하였습니다. 이 알고리즘의 시간복잡도는 O(N log N)으로 O(n<sup>2</sup>) 보다 빠르게 정렬이 가능합니다