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

        int n = Integer.parseInt(br.readLine());
        int j = 0, k, index_1 = 0, index_2 = 0;
        long[] arr = new long[n];
        long max = 2_000_000_001, sum=0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        // 정렬
        mergeSort(arr, 0, arr.length-1);

        k = arr.length-1;

        while (j < k) {
            sum = arr[j] + arr[k];
            // 절대값을 구하기
            if(Math.abs(sum) < max){
                index_1 = j;
                index_2 = k;
                max = Math.abs(sum);

            }
            if (sum > 0) {
                k--;
            } else if(sum < 0){
                j++;
            } else {
                break;
            }
        }

        System.out.printf("%d %d", arr[index_1], arr[index_2]);
    }

    public static void merge(long[] arr, int s1, int e1, int s2, int e2) {
        int i = s1, j = s2, k = 0;
        long[] tmp = new long[e2 - s1 + 1];

        while (i <= e1 && j <= e2) {
            if (arr[i] >= arr[j]) {
                tmp[k++] = arr[j++];
            } else if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            }
        }
        while (i <= e1) {
            tmp[k++] = arr[i++];
        }
        while (j <= e2){
            tmp[k++] = arr[j++];
        }

        for (int n = 0; n < tmp.length; n++) {
            arr[s1 + n] = tmp[n];
        }

    }
    public static void mergeSort(long[] arr, int s, int e){
        if(s >= e) return;
        int m = s + (e - s) / 2;
        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);
        merge(arr, s, m, m + 1, e);
    }
}
```

# 💭 나의 접근 방식

## 🌟 데이터 타입 선택
문제의 데이터 범위가 -10<sup>9</sup> ~ 10<sup>9</sup>까지이지만, 혹시 발생할 수 있는 오버플로우를 방지하기 위해 배열(`arr`)의 타입은 `long`으로 설정하였습니다. 이를 통해 안정성을 높였습니다.

## ⚙️ 정렬 알고리즘
입력된 수의 정렬은 **합병 정렬(Merge Sort)**을 사용하여 처리하였습니다. 이 알고리즘의 시간복잡도는 O(N log N)으로 O(n<sup>2</sup>) 보다 빠르게 정렬이 가능합니다

## 💡 문제 해결 전략
문제를 해결하기 위해 **투 포인터 알고리즘**을 적용했습니다. 이 방식은 두 개의 포인터를 사용하여 배열의 양 끝에서부터 접근하여 효율적으로 조건 값을 찾을 수 있습니다.

long sum 변수에 arr[j] + arr[k] 의 값을 넣어 sum의 값이 음수인지 양수인지 비교하여 j와 k의 인덱스값을 변화시켰습니다.
