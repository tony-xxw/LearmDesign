package design.proxy.dynamic;

import design.proxy.Order;
import design.proxy.OrderService;
import design.proxy.OrderServiceImp;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = (OrderService) new OrderServiceDynamicProxyJava(new OrderServiceImp()).bind();
        orderService.saveOrder(new Order(1, "dynamic"));
    }
}
