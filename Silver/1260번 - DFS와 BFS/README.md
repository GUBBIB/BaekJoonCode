<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-2.svg" alt="티어그림" width="30px" height="35px"> [1260번 - DFS와 BFS](https://www.acmicpc.net/problem/1260)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 정점의 개수 <code>N</code> (1 ≤ <code>N</code> ≤ 1,000), 간선의 개수 <code>M</code> (1 ≤ <code>M</code> ≤ 10,000), 탐색을 시작할 정점의 번호 <code>V</code>가 주어진다.<br>
    다음 <code>M</code>개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. <code>V</code>부터 방문된 점을 순서대로 출력하면 된다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
4 5 1
1 2
1 3
1 4
2 4
3 4
예제 출력 1
1 2 4 3
1 2 3 4

예제 입력 2
5 5 3
5 4
5 2
1 2
3 4
3 1
예제 출력 2
3 1 2 5 4
3 1 4 2 5

예제 입력 3
1000 1 1000
999 1000
예제 출력 3
1000 999
1000 999
```

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/1260번 - Main.java]()
