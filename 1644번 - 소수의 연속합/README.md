<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Gold-3.svg" alt="티어그림" width="30px" height="35px"> [1644번 - 소수의 연속합](https://www.acmicpc.net/problem/1806)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
하나 이상의 연속된 소수의 합으로 나타낼 수 있는 자연수들이 있다. 몇 가지 자연수의 예를 들어 보면 다음과 같다.
    
- **3**: `3` (한 가지)
- **41**: `2 + 3 + 5 + 7 + 11 + 13 = 11 + 13 + 17 = 41` (세 가지)
- **53**: `5 + 7 + 11 + 13 + 17 = 53` (두 가지)
    
하지만 연속된 소수의 합으로 나타낼 수 없는 자연수들도 있는데, **20**이 그 예입니다. `7 + 13`을 계산하면 20이 되기는 하나 7과 13이 연속이 아니기 때문에 적합한 표현이 아닙니다. 또한, 한 소수는 반드시 한 번만 덧셈에 사용될 수 있기 때문에, `3 + 5 + 5 + 7`과 같은 표현도 적합하지 않습니다.

주어진 자연수를 연속된 소수의 합으로 나타낼 수 있는 경우의 수를 구하는 프로그램을 작성하세요.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 4,000,000)
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 자연수 N을 연속된 소수의 합으로 나타낼 수 있는 경우의 수를 출력한다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
20
예제 출력 1
0

예제 입력 2
3
예제 출력 2
1

예제 입력 3
41
예제 출력 3
3

예제 입력 4
53
예제 출력 4
2

```

## 📌 제출 코드
**내가 제출한 틀린 코드**:
- [틀린 코드/1644 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/1644%EB%B2%88%20-%20%EC%86%8C%EC%88%98%EC%9D%98%20%EC%97%B0%EC%86%8D%ED%95%A9/%ED%8B%80%EB%A6%B0%EC%BD%94%EB%93%9C)

## ❌ 내가 틀렸던 이유
- sum의 초기값을 10<sup>9</sup> + 10<sup>9</sup>인 2,000,000,000을 초기값으로 주었어야 하는데 잘 못 주었습니다.
- while안의 if문에서 sum의 값이 음수인지 양수인지가 아닌 max와 비교하여 인덱스의 값이 잘 못 증감하고 있었습니다.

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/1644 - Main.java]()
