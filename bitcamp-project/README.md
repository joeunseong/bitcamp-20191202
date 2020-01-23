# 28_3 - 파일 포맷으로 JSON 도입하기

## 학습 목표 

- JSON 포맷을 사용 이점을 이해한다.
- Google JSON 라이브러리를 사용할 수 있다.

## JSON 데이터 포맷 특징

- 문자열로 데이터 형식를 표현한다.
- 
- 문자열이기 때문에 모든 프로그래밍 언어에서 다룰 수 있다.
- 바이너리 방식에 대해 데이터가 커지는 문제가 있지만,
 
## 실습 소스 및 결과

- build.gradle 변경
- src/main/java/com/eomcs/lms/App.java 변경
## 실습  

### 훈련 1: Gradle 스크립트 파일(build.gradle)에 Google JSON 라이브러리를 추가하라

- mvnrepository.com 에서 라이브러리 검색
  - json.org 사이트에서 자바 라이브러리 확인
  - 'gson' 키워드로 검색
- build.gradle 을 편집한다.
  - 의존 라이브러리 블록(dependencies {})에 gson 정보를 추가한다.
- 이클립스 설정 파일을 갱신한다.
  - 'gradle eclipse' 를 실행
  - 이클립스에서 해당 프로젝트를 'refresh' 한다.
  - 'Referenced Libraries' 노드에서 gson 라이브러리 파일이 추가된 것을 확인한다.
  
### 훈련 2: 게시물 데이터를 저장하고 읽을 때 JSON 형식을 사용하라.

- App.java
  - saveBoardData()를 변경한다.
  - loadBoardData()를 변경한다.
  
### 훈련 3: 회원 데이터를 저장하고 읽을 때 JSON 형식을 사용하라.

- App.java
  - saveMemberData()를 변경한다.
  - loadMemberData()를 변경한다.
  
### 훈련 4: 게시물 데이터를 저장하고 읽을 때 JSON 형식을 사용하라.

- App.java
  - saveBoardData()를 변경한다.
  - loadBoardData()를 변경한다.