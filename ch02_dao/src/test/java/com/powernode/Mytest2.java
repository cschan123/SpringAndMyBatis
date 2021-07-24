package com.powernode;

import com.powernode.dao.StudentDao;
import com.powernode.dao.impl.StudentDaoimpl;
import com.powernode.domain.Student;
import org.junit.Test;

import java.util.List;

public class Mytest2 {
    /*
    * 测试方法通过反射得到全限定类型名称
    *dao是studentDao类型的，全限定名称为com.powernode.dao.StudentDao
    * selectById、selectStudents都是dao方法中的名称，也就是mapper标签的id
    *由mabatis框架在程序执行期间，根据你的dao接口，创建一个内存中的接口的实现类对象
    * 这就叫dao代理或者dao动态代理
    * proxy代替StudentDaoImpl
    * */
    @Test
    public void testSelectOne(){

        StudentDao dao = new StudentDaoimpl();
        Student student = dao.selectById(1);
        System.out.println("通过dao对象查询"+student);
    }

    @Test
    public void testSelectList(){
        StudentDao dao = new StudentDaoimpl();
        List<Student>student = dao.selectStudents();
       for(Student stu:student){
           System.out.println(stu);
       }
    }

    @Test
    public void testInsertStudet(){
        StudentDao dao = new StudentDaoimpl();
        Student student = new Student();
        student.setId(10);
        student.setName("大乔");
        student.setScore((float) 87.5);
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        student.setBirth(null);
        student.setAge(18);
        int rows = dao.insertStudent(student);
        System.out.println(rows);
    }
}
