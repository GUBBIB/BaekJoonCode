<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-5.svg" alt="티어그림" width="30px" height="35px"> [단어 정렬](https://www.acmicpc.net/problem/1181)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.<br><br>
    1. 길이가 짧은 것부터<br>
    2. 길이가 같으면 사전 순으로<br><br>
    단, 중복된 단어는 하나만 남기고 제거해야 한다.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 단어의 개수 <code>N</code>이 주어진다. (<code>1 ≤ N ≤ 20,000</code>)<br>
    둘째 줄부터 <code>N</code>개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다.<br>
    주어지는 문자열의 길이는 50을 넘지 않는다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    조건에 따라 정렬하여 단어들을 출력한다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours

예제 출력 1
i
im
it
no
but
more
wait
wont
yours
cannot
hesitate
```

## ✅ 정답 코드
[정답 코드/1181번 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/1181%EB%B2%88%20-%20%EB%8B%A8%EC%96%B4%20%EC%A0%95%EB%A0%AC/%EC%A0%95%EB%8B%B5%EC%BD%94%EB%93%9C)