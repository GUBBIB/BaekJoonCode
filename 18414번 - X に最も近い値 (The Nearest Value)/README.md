<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-4.svg" alt="티어그림" width="30px" height="35px"> [X に最も近い値 (The Nearest Value)](https://www.acmicpc.net/problem/XXXX)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    整数 <strong>X</strong>, <strong>L</strong>, <strong>R</strong> が与えられる. <strong>L</strong> 以上 <strong>R</strong> 以下の整数のうち, <strong>X</strong> との差の絶対値が最も小さいものを出力せよ. そのような整数はちょうど 1 つだけ存在することが証明できる.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    入力は以下の形式で標準入力から与えられる:
    <pre>X L R</pre>
    <ul>
        <li><code>X</code>: 1 ≤ <code>X</code> ≤ 100,000</li>
        <li><code>L</code>: 1 ≤ <code>L</code> ≤ <code>R</code> ≤ 100,000</li>
    </ul>
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    <strong>L</strong> 以上 <strong>R</strong> 以下の整数のうち, <strong>X</strong> との差の絶対値が最も小さいものを出力する.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
8 3 6
예제 출력 1
6
● 3, 4, 5, 6 のうち，8 との差の絶対値が最も小さいものは 6 である．したがって 6 を出力する．

예제 입력 2
7 3 10
예제 출력 2
7
● 3, 4, 5, 6, 7, 8, 9, 10 のうち，7 との差の絶対値が最も小さいものは 7 である．したがって 7 を出力する．

예제 입력 3
8 10 10
예제 출력 3
10
```