# 44_1 - UI 객체에서 비즈니스 로직 분리하기

## 학습목표

- Presentation/Service(Business)/Presistence Layer 구조를 이해한다.

### Presentation Layer

- UI를 담당한다.

### Business(Service) Layer

- 업무 로직을 담당한다.
- 트랜잭션 제어를 담당한다.

### Persistence Layer

- 데이터 저장을 담당한다.


## 실습 소스 및 결과

- src/main/java/com/eomcs/sql/ConnectionFactory.java 삭제
- src/main/java/com/eomcs/sql/DataSource.java 추가
- src/main/java/com/eomcs/sql/PlatformTransactionManager.java 변경
- src/main/java/com/eomcs/lms/dao/mariadb/XxxDaoImpl.java 변경
- src/main/java/com/eomcs/lms/DataLoaderListener.java 변경
- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습  

### 훈련1: 트랜잭션 관리자를 사용하는 코드를 캡슐화하여 별도의 클래스로 분리하라.

- com.eomcs.sql. 추가
  - ConnectionFactory를 DataSource로 이름을 변경한다.
  - JDBC API에서는 커넥션 객체를 생성하고 관리하는 역할자를 DataSource로 정의하였다. 
  - 그래서 이 이름과 같게 만들자.
  - ConnectionFactory + Pooling 기능 = DataSource
  
### 훈련2: PlatformTransactionManager 를 변경하라.

- com.eomcs.sql.PlatformTransactionManager 변경
  - ConnectionFactory 대신 DataSource를 사용하도록 변경한다.

### 훈련3: DataSource를 사용하도록 DAO를 변경하라.

- com.eomcs.lms.dao.mariadb.XxxDaoImpl 변경
  - ConnectionFactory 대신 DataSource를 사용하도록 변경한다.
  
### 훈련4: DataSource를 DAO에 주입하라.

- com.eomcs.lms.DataLoaderListener 변경
  - ConnectionFactory 대신 DataSource 객체를 생성한다.
  - DAO에 DataSource를 주입한다.
  - 애플리케이션이 종료될 때 모든 DB 커넥션을 닫는다.
  
### 훈련5: 클라이언트 요청을 처리한 후 Connection을 닫지 말고 반납하라.

- com.eomcs.lms.ServerApp 변경
  - 클라이언트에게 응답한 후 스레드에서 커넥션 객체를 제거한다.
  - 제거된 커넥션 객체는 재사용하기 위해 닫지 않는다.
  
### 훈련7: /photoboard/add, /photoboard/update, /photoboard/delete을 테스트 해 보라.