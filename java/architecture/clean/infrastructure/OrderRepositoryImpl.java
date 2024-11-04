package architecture.clean.infrastructure;

import architecture.clean.domain.OrderRepository;

public class OrderRepositoryImpl implements OrderRepository {
    private final OrderJPARepository jpaRepository;

    public OrderRepositoryImpl(OrderJPARepository jpaRepository){
        this.jpaRepository = jpaRepository;
    }
}
