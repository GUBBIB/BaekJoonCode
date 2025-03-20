<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-5.svg" alt="티어그림" width="30px" height="35px"> [덩치](https://www.acmicpc.net/problem/7568)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    우리는 사람의 덩치를 키와 몸무게, 이 두 개의 값으로 표현하여 그 등수를 매겨보려고 한다.<br>
    어떤 사람의 몸무게가 <code>x</code> kg이고 키가 <code>y</code> cm라면 이 사람의 덩치는 <code>(x, y)</code>로 표시된다.<br>
    두 사람 A와 B의 덩치가 각각 <code>(x, y)</code>, <code>(p, q)</code>라고 할 때 <code>x > p</code> 그리고 <code>y > q</code> 이라면 우리는 A의 덩치가 B의 덩치보다 "더 크다"고 말한다.<br><br>

    예를 들어 어떤 A, B 두 사람의 덩치가 각각 <code>(56, 177)</code>, <code>(45, 165)</code> 라고 한다면 A의 덩치가 B보다 큰 셈이 된다.<br>
    그런데 서로 다른 덩치끼리 크기를 정할 수 없는 경우도 있다.<br>
    예를 들어 두 사람 C와 D의 덩치가 각각 <code>(45, 181)</code>, <code>(55, 173)</code>이라면 몸무게는 D가 C보다 더 무겁고, 키는 C가 더 크므로,<br>
    "덩치"로만 볼 때 C와 D는 누구도 상대방보다 더 크다고 말할 수 없다.<br><br>

    <code>N</code>명의 집단에서 각 사람의 덩치 등수는 자신보다 더 "큰 덩치"의 사람의 수로 정해진다.<br>
    만일 자신보다 더 큰 덩치의 사람이 <code>k</code>명이라면 그 사람의 덩치 등수는 <code>k+1</code>이 된다.<br>
    이렇게 등수를 결정하면 같은 덩치 등수를 가진 사람은 여러 명도 가능하다.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫 줄에는 전체 사람의 수 <code>N</code>이 주어진다. (<code>2 ≤ N ≤ 50</code>)<br>
    그리고 이어지는 <code>N</code>개의 줄에는 각 사람의 몸무게와 키를 나타내는 양의 정수 <code>x</code>와 <code>y</code>가 하나의 공백을 두고 각각 나타난다.<br>
    (<code>10 ≤ x, y ≤ 200</code>)
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    입력에 나열된 사람의 덩치 등수를 구해서 그 순서대로 첫 줄에 출력해야 한다.<br>
    단, 각 덩치 등수는 공백문자로 분리되어야 한다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
5
55 185
58 183
88 186
60 175
46 155

예제 출력 1
2 2 1 2 5
```

## ✅ 정답 코드
[정답 코드/7568번 - Main.java]()