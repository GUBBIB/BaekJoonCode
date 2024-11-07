<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Gold-5.svg" alt="티어그림" width="30px" height="35px"> [2470번 - 두 용액](https://www.acmicpc.net/problem/2470)

---

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
KOI 부설 과학연구소에서는 많은 종류의 산성 용액과 알칼리성 용액을 보유하고 있다. 각 용액에는 그 용액의 특성을 나타내는 하나의 정수가 주어져있다. 산성 용액의 특성값은 1부터 1,000,000,000까지의 양의 정수로 나타내고, 알칼리성 용액의 특성값은 -1부터 -1,000,000,000까지의 음의 정수로 나타낸다.

같은 양의 두 용액을 혼합한 용액의 특성값은 혼합에 사용된 각 용액의 특성값의 합으로 정의한다. 이 연구소에서는 같은 양의 두 용액을 혼합하여 특성값이 0에 가장 가까운 용액을 만들려고 한다.

예를 들어, 주어진 용액들의 특성값이 <code>[-2, 4, -99, -1, 98]</code>인 경우에는 특성값이 <code>-99</code>인 용액과 특성값이 <code>98</code>인 용액을 혼합하면 특성값이 <code>-1</code>인 용액을 만들 수 있고, 이 용액이 특성값이 0에 가장 가까운 용액이다. 참고로, 두 종류의 알칼리성 용액만으로나 혹은 두 종류의 산성 용액만으로 특성값이 0에 가장 가까운 혼합 용액을 만드는 경우도 존재할 수 있다.
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
첫째 줄에는 전체 용액의 수 <strong>N</strong>이 입력된다. <strong>N</strong>은 2 이상 100,000 이하이다. 둘째 줄에는 용액의 특성값을 나타내는 <strong>N</strong>개의 정수가 빈칸을 사이에 두고 주어진다. 이 수들은 모두 <strong>-1,000,000,000</strong> 이상 <strong>1,000,000,000</strong> 이하이다. <strong>N</strong>개의 용액들의 특성값은 모두 다르고, 산성 용액만으로나 알칼리성 용액만으로 입력이 주어지는 경우도 있을 수 있다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
첫째 줄에 특성값이 0에 가장 가까운 용액을 만들어내는 두 용액의 특성값을 출력한다. 출력해야 하는 두 용액은 특성값의 오름차순으로 출력한다. 특성값이 0에 가장 가까운 용액을 만들어내는 경우가 두 개 이상일 경우에는 그 중 아무것이나 하나를 출력한다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
5
-2 4 -99 -1 98

예제 출력 1
-99 98
```

## 📌 제출 코드
**내가 제출한 틀린 코드**:
- [틀린 코드/2470 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/2470%EB%B2%88%20-%20%EB%91%90%20%EC%9A%A9%EC%95%A1/%ED%8B%80%EB%A6%B0%20%EC%BD%94%EB%93%9C)

## ❌ 내가 틀렸던 이유
- sum의 초기값을 10<sup>9</sup> + 10<sup>9</sup>인 2,000,000,000을 초기값으로 주었어야 하는데 잘 못 주었습니다.
- while안의 if문에서 sum의 값이 음수인지 양수인지가 아닌 max와 비교하여 인덱스의 값이 잘 못 증감하고 있었습니다.

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/2470 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/2470%EB%B2%88/%EC%A0%95%EB%8B%B5%20%EC%BD%94%EB%93%9C)
