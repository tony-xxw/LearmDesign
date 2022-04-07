package design.proxy.dynamic

import design.proxy.Order
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

class OrderServiceDynamicProxy(private val target: Any) : InvocationHandler {

    fun bind(): Any {
        return Proxy.newProxyInstance(target.javaClass.classLoader, target.javaClass.interfaces, this)
    }

    override fun invoke(p0: Any, p1: Method, p2: Array<out Any>): Any {
        val argObj = p2[0]
        beforeMethod(argObj)
        val obj = p1.invoke(target, p2)
        afterMethod()
        return obj
    }

    fun beforeMethod(any: Any) {
        println("动态代理 before")
        if (any is Order) {
            println("动态代理分配到 ${any.userId % 2}处理数据")
        }
    }

    fun afterMethod() {
        println("动态代理 after code")
    }

}