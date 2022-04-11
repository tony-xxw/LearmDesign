package design.struct.proxy.dynamic;

import design.struct.proxy.Order;
import design.struct.proxy.OrderService;
import design.struct.proxy.OrderServiceImp;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = (OrderService) new OrderServiceDynamicProxyJava(new OrderServiceImp()).bind();
        orderService.saveOrder(new Order(1, "dynamic"));
    }
}
