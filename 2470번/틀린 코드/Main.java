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
        long max = 1_000_000_001;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        // 정렬
        mergeSort(arr, 0, arr.length-1);

        k = arr.length-1;

        while (j <= k) {
            // 절대값을 구하기
            if(((arr[j] + arr[k] < 0)? (arr[j] + arr[k]) * -1 : arr[j] + arr[k]) < max && j != k){
                index_1 = j;
                index_2 = k;
                max = (arr[j] + arr[k] < 0)? (arr[j] + arr[k]) * -1 : arr[j] + arr[k];
            } else if(((arr[j] + arr[k] < 0)? (arr[j] + arr[k]) * -1 : arr[j] + arr[k]) > max) {
                k--;
            } else {
                j++;
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
