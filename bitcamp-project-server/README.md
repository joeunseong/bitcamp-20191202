# 38_1 - 트랜잭션 적용 전: 사진 게시판 추가하기


## 학습목표

- 여러 개의 DB 변경 작업을 한 작업 단위로 묶는 트랜잭션을 다룰 수 있다.
- 'commit'과 'rollback'을 활용할 수 있다.


## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습  

### 훈련 1: 스레드 풀을 적용하여 스레드를 관리하라.

- com.eomcs.lms.ServerApp을 변경한다.
  - 스레드 풀을 준비한다.
  - 스레드를 생성할 때 스레드 풀을 사용한다.
  
  