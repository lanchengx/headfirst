package com.example.headfirst.singtelon;

/**
 * @Author: lanchengx
 * @Date: 2020/4/27 0027
 * 利用双重检加锁，首先检查是否实例已经创建，如果未创建才进行同步。
 * 这样只有一次会同步
 *
 */
public class DoubleCheckSingleton {
    // valatile 确保 当uniqueInstance 变量初始化成单例时，多线程能正确处理
    private volatile static DoubleCheckSingleton uniqueInstance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getUniqueInstance() {
        // 检查实例 不存在进入同步代码块
        if (uniqueInstance == null) {
            // 只有第一次才彻底执行代码块
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
