# Zero Shopping Mall

Zero Shopping Mall은 쇼핑몰 프로젝트의 일부분을 구현하며 사용자 친화적인 온라인 쇼핑 경험을 제공하는 웹 애플리케이션입니다. <br>
이 프로젝트는 클린 코드, RESTful API 설계, 그리고 효과적인 테스트 전략을 통해 안전하고 효율적인 쇼핑몰 프로젝트를 구현합니다. 
사용자 인증, 상품 관리, 주문 처리 등의 기능을 지원하며, Spring Boot와 JPA, MySQL을 주요 기술 스택으로 사용합니다.

## 주요 기능

- **회원 관리**: 회원가입, 로그인, 로그아웃 기능을 제공합니다.
- **상품 관리**: 상품 등록, 수정, 삭제 및 조회 기능을 지원합니다.
- **장바구니**: 사용자가 선택한 상품을 장바구니에 담고 관리할 수 있습니다.
- **주문 처리**: 상품 구매 및 주문 내역 조회 기능을 제공합니다.
- **관리자 기능**: 상품 및 사용자 관리를 위한 관리자 페이지를 제공합니다.

## 기술 스택

- **프론트엔드**: Thymeleaf
- **백엔드**: Java, Spring Boot, Spring Data JPA, Spring Security
- **데이터베이스**: MySQL
- **빌드 도구**: Maven


## 프로젝트 구조

```
zero-shoppingmall/
├── src/
│   ├── main/
│   │   ├── java/       # 백엔드 코드
│   │   ├── resources/  # 설정 파일 및 템플릿
│   └── test/           # 테스트 코드
├── .gitignore
├── README.md
├── pom.xml             # Maven 설정 파일
└── ...
```

## 설치 및 실행 방법

### 사전 요구 사항
- Java 17 이상
- Maven
- MySQL

### 설치

1. 레포지토리 클론:

   ```bash
   git clone https://github.com/yunyoung1819/zero-shoppingmall.git
   cd zero-shoppingmall
   ```

2. 데이터베이스 설정:
   - MySQL DB에 데이터베이스를 생성하고, `src/main/resources/application.properties` 파일에 데이터베이스 연결 정보를 설정합니다.

3. 의존성 설치 및 빌드:

   ```bash
   mvn clean install
   ```

4. 애플리케이션 실행:

   ```bash
   mvn spring-boot:run
   ```

5. 웹 브라우저에서 `http://localhost:8080`으로 접속하여 애플리케이션을 확인합니다.

## 테스트

JUnit을 활용하여 단위 테스트 및 통합 테스트를 작성하였습니다. 테스트를 실행하려면 다음 명령어를 사용하세요:

```bash
mvn test
```

## 기여 방법

1. 레포지토리를 포크합니다.
2. 새로운 브랜치를 생성합니다: `git checkout -b feature/새로운기능`
3. 변경 사항을 커밋합니다: `git commit -m '새로운 기능 추가'`
4. 브랜치에 푸시합니다: `git push origin feature/새로운기능`
5. 풀 리퀘스트를 생성합니다.


