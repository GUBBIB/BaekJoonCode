<!-- ChatGPT를 사용하여 꾸몄습니다 -->
# <img src="https://github.com/GUBBIB/BaekJoonCode/blob/main/Tier_Img/Silver-5.svg" alt="티어그림" width="30px" height="35px"> [15905번 - 스텔라(STELLA)가 치킨을 선물했어요](https://www.acmicpc.net/problem/15905)

<h2>📝 문제 설명</h2>
<div style="background-color: #f9f9f9; padding: 10px; border-radius: 5px; line-height: 1.6;">
경인지역 6개대학 연합 프로그래밍 경시대회 <code>shake!</code>는 아주대학교, 경희대학교, 성균관대학교, 인하대학교, 한국항공대학교, 한양대학교ERICA가 함께하는 대학교 자체 연합 대회이다. <code>shake!</code>는 매년 1등 학생에게 사과북 프로 레티나를 비롯하여 5등까지 상장과 상품을 수여하고 있다.
<br><br>
2018년 올해는 특별히 세계 최고 에듀테크 기업인 ST Unitas와 함께한다. 스텔라(STELLA)는 ST Unitas의 인공지능 사원이다. 인간을 동경하는 스텔라는 최대한 많은 학생에게 혜택이 돌아가지 못하는 점을 늘 안타까워하였다. 혜택을 주기 위해 많은 고민을 거듭하던 스텔라는 ST Unitas의 전설적인 “스카이에듀 치킨 기프티콘“ 전략을 읽어보고 감명을 받아 이를 따라하기로 결심하였다. 너무 많은 치킨으로 회사에 큰 피해를 주면 안 되기에, 스텔라는 대회의 5등과 푼 문제 수는 같지만 패널티 차이로 수상하지 못한 학생들에게만 치킨 기프티콘을 보내주고자 한다.
<br><br>
아쉽게도 2018년의 최신기술로도 인공지능 사원이 직접 프로그래밍을 할 수는 없어서, 여러분들이 스텔라를 도와주어야 한다. <code>shake!</code> 순위는 아래와 같은 방식으로 정해진다고 할 때, 스텔라가 몇 개의 기프티콘을 구매해야 하는지 알아보자.
<ul>
    <li>각 참가자는 해결한 문제 개수와 패널티 총합을 가진다.</li>
    <li>해결한 문제의 개수가 더 많은 참가자가 더 높은 순위를 가진다.</li>
    <li>해결한 문제의 수가 같을 때, 패널티 총합이 더 작은 참가자가 더 높은 순위를 가진다.</li>
</ul>
</div>

<h2>📥 입력</h2>
<div style="background-color: #f0f8ff; padding: 10px; border-radius: 5px; line-height: 1.6;">
첫 줄에 참가자의 수 <code>N</code>(<code>5 ≤ N ≤ 66</code>)이 주어진다. 이후 <code>N</code>개의 줄에 걸쳐 각 참가자가 해결한 문제 개수와 패널티 총합이 주어진다. 각 참가자가 해결한 문제의 개수는 8개보다 작거나 같은 음이 아닌 정수이며 패널티 총합은 100,000보다 작거나 같은 음이 아닌 정수이다. <br><br>
5등 학생은 적어도 한 문제 이상을 해결하였음이 보장되며, 한 문제 이상을 푼 학생 중 문제 수와 패널티가 모두 같은 학생은 존재하지 않는다.
</div>

<h2>📤 출력</h2>
<div style="background-color: #f0fff0; padding: 10px; border-radius: 5px; line-height: 1.6;">
한 줄에 5등과 해결한 문제 개수가 같지만 수상하지 못하는 학생의 수를 출력한다.
</div>

<h2>💡 예제</h2>

```plaintext
예제 입력 1
5
7 620
4 500
2 420
5 300
4 510
#

예제 출력 1
0

예제 입력 2
7
7 620
4 500
2 420
5 300
4 510
5 420
4 340
#

예제 출력 2
1

예제 입력 3
7
4 620
4 500
4 420
4 300
4 510
4 440
4 340
#

예제 출력 3
2
```

## ✅ 정답 코드
**정답 코드**:
- [정답 코드/15905번 - Main.java](https://github.com/GUBBIB/BaekJoonCode/tree/main/Silver/15905%EB%B2%88%20-%20%EC%8A%A4%ED%85%94%EB%9D%BC(STELLA)%EA%B0%80%20%EC%B9%98%ED%82%A8%EC%9D%84%20%EC%84%A0%EB%AC%BC%ED%96%88%EC%96%B4%EC%9A%94/%EC%A0%95%EB%8B%B5%EC%BD%94%EB%93%9C)
