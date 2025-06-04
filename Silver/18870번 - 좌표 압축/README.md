<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-2.svg" alt="티어그림" width="30px" height="35px"> [좌표 압축](https://www.acmicpc.net/problem/18870)

## 📝 문제 설명
수직선 위에 `N`개의 좌표 `X1, X2, ..., XN`이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.  

`Xi`를 좌표 압축한 결과 `X'i`의 값은 `Xi > Xj`를 만족하는 서로 다른 좌표 `Xj`의 개수와 같아야 한다.  

`X1, X2, ..., XN`에 좌표 압축을 적용한 결과 `X'1, X'2, ..., X'N`를 출력해보자.

## 📥 입력
- 첫째 줄에 `N`이 주어진다. (`1 ≤ N ≤ 1,000,000`)  
- 둘째 줄에는 공백 한 칸으로 구분된 `X1, X2, ..., XN`이 주어진다.  
  (`-10⁹ ≤ Xi ≤ 10⁹`)

## 📤 출력
- 첫째 줄에 `X'1, X'2, ..., X'N`을 공백 한 칸으로 구분해서 출력한다.

<div>

## 💡 예제

```plaintext
예제 입력 1
5
2 4 -10 4 -9
예제 출력 1
2 3 0 3 1

예제 입력 2
6
1000 999 1000 999 1000 999
예제 출력 2
1 0 1 0 1 0
```

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/18870번 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/18870%EB%B2%88%20-%20%EC%A2%8C%ED%91%9C%20%EC%95%95%EC%B6%95/%EC%A0%95%EB%8B%B5%EC%BD%94%EB%93%9C)
