package design.single;

public class LazySingletonPattern {
    private static LazySingletonPattern instance = null;

    private LazySingletonPattern() {
    }

    public static LazySingletonPattern getInstance() {
        if (instance == null) {
            instance = new LazySingletonPattern();
        }
        return instance;
    }

    public static synchronized LazySingletonPattern synchronizeInstance() {
        if (instance == null) {
            instance = new LazySingletonPattern();
        }
        return instance;
    }


    public static LazySingletonPattern doubleCheckInstance() {
        //多线程情况下,会存在指令重排序的情况
        //未重排序
        //1.创建对象内存空间
        //2.初始化对象
        //3.instance变量指向对象内存地址

        //重排序
        //1.创建对象内存空间
        //3.instance变量指向对象内存地址
        //2.初始化对象

        //解决办法
        //1. volatile关键字 禁止重排序,线程可见性
        //2. 禁止其他线程查看  静态内部类
        if (instance == null) {
            synchronized (LazySingletonPattern.class) {
                if (instance == null) {
                    instance = new LazySingletonPattern();
                }
            }
        }
        return instance;
    }
}
