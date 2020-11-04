package com.example.begin.common.util;

/**
 * @project cloudlike
 * @description id生成器单例
 * @author 徐天麒
 * @createTime 2020/11/3 15:08
 * @version 1.0
 */
public class IdGeneratorSingleton {

    public IdGenerator generator;

    private IdGeneratorSingleton() {
        generator = new IdGenerator();
    }

    private static IdGeneratorSingleton singleton = new IdGeneratorSingleton();

    public static IdGeneratorSingleton getInstance() {
        return singleton;
    }
}
