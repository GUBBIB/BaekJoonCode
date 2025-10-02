<!-- ChatGPT를 사용하여 꾸몄습니다 -->

# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-4.svg" alt="티어그림" width="30px" height="35px"> [큐 2](https://www.acmicpc.net/problem/18258)

## 📝 문제 설명

정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

* `push X`: 정수 `X`를 큐에 넣는 연산이다.
* `pop`: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 `-1`을 출력한다.
* `size`: 큐에 들어있는 정수의 개수를 출력한다.
* `empty`: 큐가 비어있으면 `1`, 아니면 `0`을 출력한다.
* `front`: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 `-1`을 출력한다.
* `back`: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 `-1`을 출력한다.

## 📥 입력

첫째 줄에 주어지는 명령의 수 `N`(`1 ≤ N ≤ 2,000,000`)이 주어진다. 둘째 줄부터 `N`개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 `1`보다 크거나 같고, `100,000`보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

## 📤 출력

출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

<div>

## 💡 예제

```plaintext
예제 입력 1
15
push 1
push 2
front
back
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
front

예제 출력 1
1
2
2
0
1
2
-1
0
1
-1
0
3
```

## ✅ 정답 코드
**정답 코드**
- [정답 코드/18258번 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/17219%EB%B2%88%20-%20%EB%B9%84%EB%B0%80%EB%B2%88%ED%98%B8%20%EC%B0%BE%EA%B8%B0/%EC%A0%95%EB%8B%B5%EC%BD%94%EB%93%9C)
