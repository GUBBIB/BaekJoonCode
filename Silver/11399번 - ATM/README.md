<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-4.svg" alt="티어그림" width="30px" height="35px"> [11399번 - ATM](https://www.acmicpc.net/problem/11399)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    인하은행에는 ATM이 1대밖에 없다. 지금 이 ATM앞에 <code>N</code>명의 사람들이 줄을 서있다. 사람은 1번부터 <code>N</code>번까지 번호가 매겨져 있으며, <code>i</code>번 사람이 돈을 인출하는데 걸리는 시간은 <code>Pi</code>분이다.
    <br><br>
    사람들이 줄을 서는 순서에 따라서, 돈을 인출하는데 필요한 시간의 합이 달라지게 된다. 예를 들어, 총 5명이 있고, <code>P1 = 3</code>, <code>P2 = 1</code>, <code>P3 = 4</code>, <code>P4 = 3</code>, <code>P5 = 2</code> 인 경우를 생각해보자. [1, 2, 3, 4, 5] 순서로 줄을 선다면, 1번 사람은 3분만에 돈을 뽑을 수 있다. 2번 사람은 1번 사람이 돈을 뽑을 때 까지 기다려야 하기 때문에, 3+1 = 4분이 걸리게 된다. 3번 사람은 1번, 2번 사람이 돈을 뽑을 때까지 기다려야 하기 때문에, 총 3+1+4 = 8분이 필요하게 된다. 4번 사람은 3+1+4+3 = 11분, 5번 사람은 3+1+4+3+2 = 13분이 걸리게 된다. 이 경우에 각 사람이 돈을 인출하는데 필요한 시간의 합은 3+4+8+11+13 = 39분이 된다.
    <br><br>
    줄을 [2, 5, 1, 4, 3] 순서로 줄을 서면, 2번 사람은 1분만에, 5번 사람은 1+2 = 3분, 1번 사람은 1+2+3 = 6분, 4번 사람은 1+2+3+3 = 9분, 3번 사람은 1+2+3+3+4 = 13분이 걸리게 된다. 각 사람이 돈을 인출하는데 필요한 시간의 합은 1+3+6+9+13 = 32분이다. 이 방법보다 더 필요한 시간의 합을 최소로 만들 수는 없다.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 사람의 수 <code>N</code>(<code>1 ≤ N ≤ 1,000</code>)이 주어진다. 둘째 줄에는 각 사람이 돈을 인출하는데 걸리는 시간 <code>Pi</code>가 주어진다. (<code>1 ≤ Pi ≤ 1,000</code>)
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 출력한다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
5
3 1 4 3 2

예제 출력 1
32
```

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/11399번 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/11399%EB%B2%88%20-%20ATM/%EC%A0%95%EB%8B%B5%EC%BD%94%EB%93%9C)
