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
        
        int size = Integer.parseInt(br.readLine());
        int[][] arr = new int[size+1][size+1];
        int result = 0;

        for(int i=1; i<=size; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=i; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=2; i<=size; i++){
            for(int j=1; j<=i; j++){
                if(j==1){ //왼쪽
                    arr[i][j] += arr[i-1][j];
                }else  if(j==i) { //오른쪽
                    arr[i][j] += arr[i - 1][j - 1];
                } else { //중간
                    arr[i][j] = Math.max(arr[i-1][j]+arr[i][j], arr[i-1][j-1]+arr[i][j]);
                }
            }
        }

        for(int a : arr[size]){
            result = Math.max(result, a);
        }

        sb.append(result);
        System.out.println(sb);
    }
}
```

# 💭 나의 접근 방식
정수 삼각형을 저장하는 arr는 1-baseed 방식으로 했으며, 이중 for문으로 분기를 정하여 DP가 가능하게 코드를 짰습니다