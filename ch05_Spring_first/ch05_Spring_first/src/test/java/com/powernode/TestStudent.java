package com.powernode;

import com.powernode.entity.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    @Test
    public void test01(){
        //通过配置文件给Student赋值applicationContext.xml
        String config = "entity/applicationContext.xml";
        ClassPathXmlApplicationContext cxa = new ClassPathXmlApplicationContext(config);
        Student student = (Student) cxa.getBean("myStudent");
        System.out.println(student);
    }
}
