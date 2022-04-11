package design.struct.proxy.dynamic;

import design.struct.proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxyJava implements InvocationHandler {
    private Object targer;

    public OrderServiceDynamicProxyJava(Object targer) {
        this.targer = targer;
    }

    public Object bind() {
        return Proxy.newProxyInstance(targer.getClass().getClassLoader(), targer.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object arg = args[0];
        beforeMethod(arg);
        Object invoke = method.invoke(targer, args);
        afterMethod();
        return invoke;
    }

    public void beforeMethod(Object object) {
        System.out.println("动态代理 before");
        if (object instanceof Order) {
            System.out.println("动态代理分配到" + ((Order) object).getUserId() + "处理数据");
        }
    }

    public void afterMethod() {
        System.out.println("动态代理 after code");
    }

}
