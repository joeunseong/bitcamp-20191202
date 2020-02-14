# 35 - 스레드풀을 이용하여 스레드를 재사용하기

## 학습 목표

- 'Flyweight' 디자인 패턴의 용도를 이해한다.
- 'Flyweight' 디자인 패턴의 응용 기법인 Pooling 기법의 동작 원리를 이해한다.
- Pooling 기법을 사용하여 객체를 재활용할 수 있다.
- Thread를 종료시키지 않고 계속 재활용할 수 있다.
- Thread의 wait()/notify()의 사용법을 이해한다.

## 프로젝트 - 수업관리 시스템  

### 과제: 스레드풀을 적용하라.



#### 실행 결과

먼저 `ServerApp`을 실행한다.
```
실행 결과는 이전 버전과 같다.
```

## 실습 소스

- src/main/java/com/eomcs/lms/ServerApp.java 변경