package com.powernode.service.impl;

import com.powernode.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void dosome() {
        System.out.println("执行业务someService");
    }
    //Spring 默认使用无参构造方法创建对象，如果使用有参数构造方法，应该在定义无参构造方法中
    public SomeServiceImpl(){
        System.out.println("someServiceImpl无参构造函数");
    }

}
