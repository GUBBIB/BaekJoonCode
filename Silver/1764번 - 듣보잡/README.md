<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-4.svg" alt="티어그림" width="30px" height="35px"> [1764번 - 듣보잡](https://www.acmicpc.net/problem/1764)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 듣도 못한 사람의 수 <code>N</code>, 보도 못한 사람의 수 <code>M</code>이 주어진다.<br>
    이어서 둘째 줄부터 <code>N</code>개의 줄에 걸쳐 듣도 못한 사람의 이름과, <code>N+2</code>째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.<br>
    이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. <code>N</code>, <code>M</code>은 500,000 이하의 자연수이다.<br>
    듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    듣보잡의 수와 그 명단을 사전순으로 출력한다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
3 4
ohhenrie
charlie
baesangwook
obama
baesangwook
ohhenrie
clinton

예제 출력 1
2
baesangwook
ohhenrie
```

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/1764번 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/1764%EB%B2%88%20-%20%EB%93%A3%EB%B3%B4%EC%9E%A1/%EC%A0%95%EB%8B%B5%EC%BD%94%EB%93%9C)