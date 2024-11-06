package architecture.clean.domain;

public class OrderUsecase {

    private final OrderRepository orderRepository;

    public OrderUsecase(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderEntity getOrderInfo(User user) {
        OrderEntity orderEntity = orderRepository.getOrderInfo(user.getUserId());
        return orderEntity;
    }


}
