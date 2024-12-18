<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-4.svg" alt="티어그림" width="30px" height="35px"> [제로](https://www.acmicpc.net/problem/10773)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    나코더 기장 재민이는 동아리 회식을 준비하기 위해서 장부를 관리하는 중이다.<br>
    재현이는 재민이를 도와서 돈을 관리하는 중인데, 애석하게도 항상 정신없는 재현이는 돈을 실수로 잘못 부르는 사고를 치기 일쑤였다.<br>
    재현이는 잘못된 수를 부를 때마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 시킨다.<br>
    재민이는 이렇게 모든 수를 받아 적은 후 그 수의 합을 알고 싶어 한다. 재민이를 도와주자!
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫 번째 줄에 정수 <code>K</code>가 주어진다. (<code>1 ≤ K ≤ 100,000</code>)<br>
    이후 <code>K</code>개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0"일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.<br>
    정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    재민이가 최종적으로 적어 낸 수의 합을 출력한다. 최종적으로 적어낸 수의 합은 <code>231-1</code>보다 작거나 같은 정수이다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
4
3
0
4
0
예제 출력 1
0

예제 입력 2
10
1
3
5
4
0
0
7
0
0
6
예제 출력 2
7
```
<h2>💡 힌트</h2> 
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
예제 2의 경우를 시뮬레이션 해보면,<br> 
[1] → [1,3] → [1,3,5] → [1,3,5,4] → [1,3,5] (0을 불렀기 때문에 최근의 수를 지운다)<br> 
[1,3] → [1,3,7] → [1,3] (0을 불렀기 때문에 최근의 수를 지운다) → [1] (0을 불렀기 때문에 그 다음 최근의 수를 지운다)<br> 
[1,6] → 합은 7이다. </div> 

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/10773번 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/10773%EB%B2%88%20-%20%EC%A0%9C%EB%A1%9C/%EC%A0%95%EB%8B%B5%EC%BD%94%EB%93%9C)
