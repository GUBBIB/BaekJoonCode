<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-1.svg" alt="티어그림" width="30px" height="35px"> [1991번 - 트리 순회](https://www.acmicpc.net/problem/1991)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    이진 트리를 입력받아 전위 순회(preorder traversal), 중위 순회(inorder traversal), 후위 순회(postorder traversal)한 결과를 출력하는 프로그램을 작성하시오.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에는 이진 트리의 노드의 개수 <code>N</code> (1 ≤ <code>N</code> ≤ 26)이 주어진다.<br>
    둘째 줄부터 <code>N</code>개의 줄에 걸쳐 각 노드와 그의 왼쪽 자식 노드, 오른쪽 자식 노드가 주어진다.<br>
    노드의 이름은 A부터 차례대로 알파벳 대문자로 매겨지며, 항상 A가 루트 노드가 된다.<br>
    자식 노드가 없는 경우에는 <code>.</code>으로 표현한다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 전위 순회, 둘째 줄에 중위 순회, 셋째 줄에 후위 순회한 결과를 출력한다. 각 줄에 <code>N</code>개의 알파벳을 공백 없이 출력하면 된다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
7
A B C
B D .
C E F
E . .
F . G
D . .
G . .

예제 출력 1
ABDCEFG
DBAECFG
DBEGFCA
```

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/1991 - Main.java]()
