## What is Layered Architecture?

### Main Concept
1. 관심사의 분리 (Separation of Concerns)를 달성하기 위해 '책임'을 기준으로 계층을 분리 
- 뻔한 얘기 : 응집도를 높이고 결합도를 낮추기가 목표 
  - 하지만? 쉽지 않다~ 말만큼 되지 않음....
- 보통 3계층 / 4계층으로 분리한다


2. 어떻게 구성되어있나?
- 상위 계층에서 하위 계층으로 Top-down 방식으로 지식이나 정보를 공유 
  - Presentation layer는 하위 Business layer 의존하는 식 

- 각 레이어의 역할은?
  - Presentation layer : 사용자와의 인터페이스 담당 
    - Client 요청 변환 - 요청 내용 검즘 - 수행 결과 Client에 반환   
    - ex) Controller, Scheduler, DTO 
  
  - Business layer / Application layer : Business Logic을 수행 담당
    - 애플리케이션 요구 사항, 비즈니스 로직 수행   
    - ex) Service, Facade
  
  - Domain layer : 핵심 비즈니스 로직과 애플리케이션의 도메인 모델 정의
    - appliction layer와 infrastructure layer에 의존하지 않고 독립적으로 유지
    - ex) Entity, Domain Service, Value Object
       
  - Infrastructure layer : 데이터베이스 접근, 외부 API 호출, 메시지 큐
    - Repository 
      - (Persistence layer : interface, Database layer: 구현체)  
      - 데이터베이스와 상호작용
      - JPA나 MyBatis와 같은 ORM을 사용해 엔티티와 데이터베이스 간 매핑 담당 
    - External Service
      - 외부 API와 통신 담당 
      - REST API나 SOAP과의 연동 담당 
    - Configuration 
      - 데이터베이스 설정, 캐싱 설정 

![스크린샷 2024-10-30 오후 12.39.40.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkd%2F12p9kpkn1tg90crw4by9tvyw0000gp%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_wegUmO%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-10-30%20%EC%98%A4%ED%9B%84%2012.39.40.png)

### 한계

1. 레이어 간 강한 결합성 
  - 상위 레이어가 하위 레이어에 강하게 의존하는 구조가 된다. 
  - Repository 를 변경하려면 Service 레이어도 다 변경해야한다. 
````java
// repository 패키지 내 OrderRepository.java
public interface OrderRepository {
    Order findOrderById(Long id);
    void saveOrder(Order order);
}

// service 패키지 내 OrderService.java
public class OrderService {
    private final OrderRepository orderRepository;

    // OrderService가 Repository에 강하게 의존 
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order processOrder(Long orderId) {
        Order order = orderRepository.findOrderById(orderId);
        order.setStatus("PROCESSED");
        orderRepository.saveOrder(order);  // 저장에 직접 접근
        return order;
    }
}
````

2. 테스트의 어려움 
- 위와 같은 이유로 테스트가 복잡해진다. 
- 데이터베이스와 분리된 단위테스트를 하려면 Repository를 Mock으로 대체해야하는데 그러면 귀찮아...


### 결론 
>장점 : 구조가 간단해서 이해하기 쉽고, 각 레이어 간 의존성을 통제할 수 있다.</br>
>단점 : 레이어 간 강한 결합으로 인해 변경에 취약하다. 