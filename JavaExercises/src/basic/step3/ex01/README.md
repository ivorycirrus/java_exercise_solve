## [Ex01] 369 게임

### 1. 게임 설명
* 369게임은 1부터 차례대로 하나씩 수를 늘려가며 자기 차례에 해당하는 수를 부르는 게임이다.
* 단, 해당 차례에 부를 수에 3,6,9가 들어있으면 수를 부르지 말고 3,6,9의 갯수만큼 솜뼉을 쳐야 한다.

### 2. 목표
* N명의 사람이 사람이 둥글게 앉아서 369 게임을 한다고 한다.
* S번째 자리에 앉은 사람이 불러야 할 수를 순서대로 5개 출력하시오.
* 손뼉을 쳐야 하는 경우 X 로 표시하시오.  

### 3. 실행예시

* 4명이 모였을때 첫번째 사람인 경우 (N=5, S=1) 
    * (1), 2, X, 4, 
    * (5), X, 7, 8, 
    * (X:9), 10, 11, 12, 
    * (X:13), 14, 15, X, 
    * (17)

```
1
5
X
X
17
```

* 7명이 모였을 때 5번째 사람인 경우
    * 1,2,X,4,(5),X,7,
    * 8,X,10,11,(12),X,14
    * 15,X,17,18,(X:19),20,21
    * 22,X,24,25,(X:26),27,28
    * X,X,X,X,(XX:33),X,X
    
```
5
12
19
26
33
```

### 4. 구현
* `Main.java`의 `call` 함수 안에 작성