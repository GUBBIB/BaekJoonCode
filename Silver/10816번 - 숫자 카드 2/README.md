<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-4.svg" alt="티어그림" width="30px" height="35px"> [숫자 카드 2](https://www.acmicpc.net/problem/10816)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    숫자 카드는 정수 하나가 적혀져 있는 카드이다.<br>
    상근이는 숫자 카드 N개를 가지고 있다.<br>
    정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 <code>N</code>이 주어진다. (<code>1 ≤ N ≤ 500,000</code>)<br>
    둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 <code>-10,000,000</code>보다 크거나 같고, <code>10,000,000</code>보다 작거나 같다.<br>
    셋째 줄에는 <code>M</code>(<code>1 ≤ M ≤ 500,000</code>)이 주어진다.<br>
    넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 <code>M</code>개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다.<br>
    이 수도 <code>-10,000,000</code>보다 크거나 같고, <code>10,000,000</code>보다 작거나 같다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 입력으로 주어진 <code>M</code>개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10

예제 출력 1
3 0 0 1 2 0 0 2
```

## ✅ 정답 코드
[정답 코드/10816번 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/10816%EB%B2%88%20-%20%EC%88%AB%EC%9E%90%20%EC%B9%B4%EB%93%9C%202/%EC%A0%95%EB%8B%B5%EC%BD%94%EB%93%9C)