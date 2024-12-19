<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-3.svg" alt="티어그림" width="30px" height="35px"> [11659번 - 구간 합 구하기 4](https://www.acmicpc.net/problem/11659)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    수 <code>N</code>개가 주어졌을 때, <code>i</code>번째 수부터 <code>j</code>번째 수까지 합을 구하는 프로그램을 작성하시오.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 수의 개수 <code>N</code>과 합을 구해야 하는 횟수 <code>M</code>이 주어진다.<br>
    둘째 줄에는 <code>N</code>개의 수가 주어진다. 수는 <code>1,000</code>보다 작거나 같은 자연수이다.<br>
    셋째 줄부터 <code>M</code>개의 줄에는 합을 구해야 하는 구간 <code>i</code>와 <code>j</code>가 주어진다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    총 <code>M</code>개의 줄에 입력으로 주어진 <code>i</code>번째 수부터 <code>j</code>번째 수까지 합을 출력한다.
</div>

<h2>📋 제한</h2>
<div style="background-color: #fff8dc; padding: 10px; border-radius: 5px; line-height: 1.6;">
    <ul>
        <li><code>1 ≤ N ≤ 100,000</code></li>
        <li><code>1 ≤ M ≤ 100,000</code></li>
        <li><code>1 ≤ i ≤ j ≤ N</code></li>
    </ul>
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
5 3
5 4 3 2 1
1 3
2 4
5 5

예제 출력 1
12
9
1
```

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/11659번 - Main.java]()