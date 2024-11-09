<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻 자바 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()), x = 0;
        int[] arr = new int[n];
        int j = 0, k = 0, cnt = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        x = Integer.parseInt(br.readLine());

        // 정렬
        mergeSort(arr, 0, arr.length-1);

        k = arr.length-1;
        while (j <= k) {
            if(arr[j] + arr[k] == x && j != k){
                cnt++;
                j++; k--;
            } else if(arr[j] + arr[k] > x){
                k--;
            } else {
                j++;
            }
        }

        System.out.println(cnt);
    }

    public static void merge(int[] arr, int s1, int e1, int s2, int e2) {
        int i = s1, j = s2, k = 0;
        int[] tmp = new int[e2 - s1 + 1];

        while (i <= e1 && j <= e2) {
            if (arr[i] > arr[j]) {
                tmp[k++] = arr[j++];
            } else if (arr[i] < arr[j]) {
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
    public static void mergeSort(int[] arr, int s, int e){
        if(s >= e) return;
        int m = s + (e - s) / 2;
        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);
        merge(arr, s, m, m + 1, e);
    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
문제를 해결하기 위해 **투 포인터 알고리즘**과 **합병 정렬**을 사용했습니다. 

## ⚙️ 투 포인터 알고리즘
배열의 양 끝에서부터 시작하여 조건에 따라 인덱스 j, k를 증감하였습니다.

arr[k] - arr[j]를 x와 비교하여 이를 기준으로 조건을 판단했습니다.
**조건에 따른 포인터 이동:**
`arr[k] - arr[j] > x`이면 `k--`
`arr[k] - arr[j] < x`이면 `j++`
`arr[k] - arr[j] == x`이면 `cnt++`, 그 후 `j++`와 `k--`를 통해 포인터를 동시에 증가시켰습니다.


## ⚙️ 합병 정렬 알고리즘

