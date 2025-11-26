import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3273 {
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