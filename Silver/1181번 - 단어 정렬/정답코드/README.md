<!-- 꾸미는데 있어 ChatGPT를 사용하였습니다. -->
# 💻 자바 코드
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s;
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(br.readLine());
        }

        Collections.sort(arr, (s1, s2) ->
                s1.length() != s2.length() ? s1.length() - s2.length() : s1.compareTo(s2)
        );

        s = arr.get(0);
        sb.append(s).append("\n");

        for (String str : arr) {
            if(s.equals(str)){
                continue;
            }else {
                s = str;
                sb.append(s).append("\n");
            }
        }

        System.out.println(sb);
    }
}
```

# 💭 나의 접근 방식

## 💡 문제 해결 전략
문제를 해결하기 위해 **ArrayList**와 **Comparator** Interface를 사용했습니다.

## ⚙️ Comparator
**Comparator**는 **두개의 객체 매개변수**를 받아 비교하여 정렬하는 ``인터페이스``이다.<br>
**인터페이스**이기에 ``class``에 **implements**하여 사용할 수도 있고 ``익명 클래스`` 또는 **람다식**을 이용한 ``익명 함수``로 사용할 수도 있다.<br>

