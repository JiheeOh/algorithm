package architecture.clean.infrastructure;

public interface OrderJPARepository {
    // implements JPARepository<OrderJPAEntity,String>;
    OrderJPAEntity getOrderInfo(String userId);
}
