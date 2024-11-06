package architecture.clean.infrastructure;

/*
* 레이어드와는 다르게 infrastructure가 domain 계층에 의존하고 있는 형태
* */

import architecture.clean.domain.OrderEntity;
import architecture.clean.domain.OrderRepository;

public class OrderRepositoryImpl implements OrderRepository {
    private final OrderJPARepository jpaRepository;

    public OrderRepositoryImpl(OrderJPARepository jpaRepository){
        this.jpaRepository = jpaRepository;
    }

    @Override
    public OrderEntity getOrderInfo(String userId) {
        OrderJPAEntity  jpaEntity = jpaRepository.getOrderInfo(userId);
        return null;
    }
}
