<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-4.svg" alt="티어그림" width="30px" height="35px"> [4949번 - 균형잡힌 세상](https://www.acmicpc.net/problem/4949)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    세계는 균형이 잘 잡혀있어야 한다. 양과 음, 빛과 어둠 그리고 왼쪽 괄호와 오른쪽 괄호처럼 말이다.<br><br>
    정민이의 임무는 어떤 문자열이 주어졌을 때, 괄호들의 균형이 잘 맞춰져 있는지 판단하는 프로그램을 짜는 것이다.<br><br>
    문자열에 포함되는 괄호는 소괄호("()") 와 대괄호("[]")로 2종류이고, 문자열이 균형을 이루는 조건은 아래와 같다.
    <ul>
        <li>모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.</li>
        <li>모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.</li>
        <li>모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.</li>
        <li>모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.</li>
        <li>짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.</li>
    </ul>
    정민이를 도와 문자열이 주어졌을 때 균형잡힌 문자열인지 아닌지를 판단해보자.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    각 문자열은 마지막 글자를 제외하고 영문 알파벳, 공백, 소괄호("( )"), 대괄호("[ ]")로 이루어져 있으며, 온점(".")으로 끝나고, 길이는 100글자보다 작거나 같다.<br>
    입력의 종료조건으로 맨 마지막에 온점 하나(".")가 들어온다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력한다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
So when I die (the [first] I will see in (heaven) is a score list).
[ first in ] ( first out ).
Half Moon tonight (At least it is better than no Moon at all].
A rope may form )( a trail in a maze.
Help( I[m being held prisoner in a fortune cookie factory)].
([ (([( [ ] ) ( ) (( ))] )) ]).
 .
.

예제 출력 1
yes
yes
no
no
no
yes
yes
```

## ✅ 정답 코드
**정답 코드**:
- [정답코드/4949번 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/4949%EB%B2%88%20-%20%EA%B7%A0%ED%98%95%EC%9E%A1%ED%9E%8C%20%EC%84%B8%EC%83%81/%EC%A0%95%EB%8B%B5%EC%BD%94%EB%93%9C)
