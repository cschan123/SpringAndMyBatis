package com.powernode;

import com.powernode.entity.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class TestFile {
    @Test
    public void test01(){
        //通过配置文件给Student赋值applicationContext.xml
        String config = "entity/applicationContext.xml";
        ClassPathXmlApplicationContext cxa = new ClassPathXmlApplicationContext(config);
        File file = (File) cxa.getBean("myFile");
        System.out.println(file.getName());
    }
}
