## [Ex04] 배열의 회전

### 1. 목표
* 행과 열의 갯수가 같은 배열이 주어질 때, 배열의 모든 요소를 시계방향으로 90도 만큼 회전한 배열을 구하자.


### 2. 실행예시

* 입력예시 1

```
A = { { 1, 2, 3 }
     ,{ 4, 5, 6 }
     ,{ 7, 8, 9 } };  
```

* 출력예시 1

```
7	4	1
8	5	2
9	6	3
```


* 입력예시 2

```
A = { { 5, 6, 7, 8 }
     ,{ 2, 3, 4, 0 }
     ,{ 1, 9, 5, 3 }
     ,{ 9, 7, 6, 5 } };  
```

* 출력예시 2

```
9	1	2	5
7	9	3	6
6	5	4	7
5	3	0	8
```


### 3. 구현
* `Main.java`의 `rotateArray` 함수 안에 작성
