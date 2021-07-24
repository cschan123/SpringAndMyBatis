package com.powernode;

import com.powernode.service.SomeService;
import com.powernode.service.impl.SomeServiceImpl;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
       /* //传统创建对象
        SomeService someService = new SomeServiceImpl();
        someService.dosome();*/
       //SPring创建对象,类路径（classpath,也可以是resource）之下的开始的路径
        String config = "beans.xml";
        //2、创建容器对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);

        SomeService service = (SomeService) context.getBean("someService");
        service.dosome();

    }
}
