## What is hexagonal?

### Main concept 
1. Layered, Clean과 같이 계층 간의 분리는 당연해


2. Clean architecture ( 도메인을 보호하자) + port / adapter 개념을 더한 아키텍처 
- `ports-and-adapters`로도 알려져있다. 
- Clean architecture은 계층 구조와 의존성 역전에 중점
- Hexagonal은 비즈니스 로직을 포트와 어댑터로 감싸서 외부 의존성을 추상화하는데에 중점 

3. 모든 의존성은 코어를 향한다. 
- Adapter 의 종류
  - Web adapter : 웹 브라우저와 상호작용
  - External System Adapter :  외부 시스템과 상호 작용
  - Persistence Adapter : 데이터베이스와 상호 작용


- Adapter의 역할 
  - 좌측 Adapter : Application을 주도하는 어댑터 
    - Application core을 호출한다. 
  - 우측 Adapter : Application에 의해 주도되는 어댑터 
    - Appilication core에 의해 호출된다. 
  
  
- Port란? -> Interface
  - Input port ( Interface )
    - Core의 Use Case 중 하나에 의해 구현된다.
    - driving adapter에 의해 호출된다. 

  - Output port ( Interface )
    - driven adapter에 의해 구현된다.
    - Core의 Use Case 중 하나에 의해 호출된다. 

    
![스크린샷 2024-11-07 오전 12.23.03.png](%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-11-07%20%EC%98%A4%EC%A0%84%2012.23.03.png)


### Pros and Cons 

1. Pros
- 유연하게 외부 시스템을 교체할 수 있다.
- 테스트가 용이하다
- 내부 도메인 로직이 안정적이다. 
- 코드의 모듈화를 높일 수 있다. (각 포트와 어댑터가 독립적으로 동작)


2. Cons
- 초기 복잡성 증가 
  - 포트와 어댑터를 각각 정의하고 연결해야해서 구조가 복잡해진다. 

- 추상화로 인한 오버헤드 
  - 포트와 어댑터가 추상화 계층이기 때문에 성능 오버헤드가 발생할 수 있다. 

- 테스트의 복잡성 증가 
  - 모듈화된 구조로 인해 각 포트, 어댑터, 비즈니스 로직을 별도로 테스트해야한다. 
  