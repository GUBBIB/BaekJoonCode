<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-4.svg" alt="티어그림" width="30px" height="35px"> [28278번 - 스택2](https://www.acmicpc.net/problem/28278)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
</div>

<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    명령은 총 다섯 가지이다.
    <ul>
        <li><strong>1 X</strong>: 정수 <code>X</code>를 스택에 넣는다. (<code>1 ≤ X ≤ 100,000</code>)</li>
        <li><strong>2</strong>: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 <code>-1</code>을 출력한다.</li>
        <li><strong>3</strong>: 스택에 들어있는 정수의 개수를 출력한다.</li>
        <li><strong>4</strong>: 스택이 비어있으면 <code>1</code>, 아니면 <code>0</code>을 출력한다.</li>
        <li><strong>5</strong>: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 <code>-1</code>을 출력한다.</li>
    </ul>
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 명령의 수 <strong>N</strong>이 주어진다. (<code>1 ≤ N ≤ 1,000,000</code>)<br>
    둘째 줄부터 <code>N</code>개 줄에 명령이 하나씩 주어진다.<br>
    출력을 요구하는 명령은 하나 이상 주어진다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.
</div>

<h2>💡 예제</h2>
<h2>💡 예제</h2>

```plaintext
예제 입력 1
9
4
1 3
1 5
3
2
5
2
2
5

예제 출력 1
1
2
5
3
3
-1
-1
```

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/28278번 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/28278%EB%B2%88%20-%20%EC%8A%A4%ED%83%9D%202/%EC%A0%95%EB%8B%B5%EC%BD%94%EB%93%9C)
