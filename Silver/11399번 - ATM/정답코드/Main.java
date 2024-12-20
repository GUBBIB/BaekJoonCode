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