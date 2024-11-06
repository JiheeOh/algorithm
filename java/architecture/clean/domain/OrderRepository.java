package architecture.clean.domain;

public interface OrderRepository {
    OrderEntity getOrderInfo(String userId);
}
