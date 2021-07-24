package com.powernode;

import com.powernode.service.SomeService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        String config = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        SomeService service = context.getBean(SomeService.class);
        service.dosome();
    }

    @Test
    public void test02(){
        String config = "beans.xml";
        //创建容器的时候就已经创建对象了
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        //SomeService service = (SomeService) context.getBean("someService");
        //service.dosome();
    }

    @Test
    public void test03(){
        String config = "beans.xml";
        //创建容器ClassPathXmlApplicationContext或者（ApplicationContext）的时候把配置文件的对象都创建出来
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        //SomeService service = (SomeService) context.getBean("someService");
        //service.dosome();
        //容器的数量和名称
        int nums = context.getBeanDefinitionCount();
        System.out.println(nums);
        String names[] = context.getBeanDefinitionNames();
        for(String ss :names){
            System.out.println(ss);
        }
    }
    @Test
    public void testDate(){
        String config = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);

        Date mydate = (Date) context.getBean("mydate");
        System.out.println(mydate);
    }


}
