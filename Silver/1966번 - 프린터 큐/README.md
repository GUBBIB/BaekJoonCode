<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-3.svg" alt="티어그림" width="30px" height="35px"> [1929번 - 소수 구하기](https://www.acmicpc.net/problem/1929)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
    10,000 이하의 자연수로 이루어진 길이 N짜리 수열이 주어진다. 이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하는 프로그램을 작성하시오.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 N (10 ≤ N < 100,000)과 S (0 < S ≤ 100,000,000)가 주어진다. 둘째 줄에는 수열이 주어진다. 수열의 각 원소는 공백으로 구분되어져 있으며, 10,000이하의 자연수이다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
    첫째 줄에 구하고자 하는 최소의 길이를 출력한다. 만일 그러한 합을 만드는 것이 불가능하다면 0을 출력하면 된다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
3 16

에제 출력 1
3
5
7
11
13
```

## 📌 제출 코드
**내가 제출한 틀린 코드**:
- [틀린 코드/1966 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/1966%EB%B2%88%20-%20%ED%94%84%EB%A6%B0%ED%84%B0%20%ED%81%90/%ED%8B%80%EB%A6%B0%EC%BD%94%EB%93%9C)

## ❌ 내가 틀렸던 이유
- 큐에서 실제로 문서를 꺼내( poll ) 제거하지 않고 빈도만 줄여서, 큐가 줄지 않아 무한 회전이 발생했고 그 결과 메모리 초과가 났습니다.

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/1966 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/)