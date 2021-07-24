package com.powernode;

import com.powernode.domain.Student;
import com.powernode.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void testSelectById(){
        //获取SqlSession对象
        SqlSession session = MybatisUtil.getSqlSession();
        //指定sqlid
        String sqlId = "com.powernode.dao.StudentDao"+"."+"selectById";
        //执行mapper的sql
        Student student = session.selectOne(sqlId, 1);
        System.out.println(student);
        //关闭SqlSession对象
        session.close();

    }
    @Test
    public void testSelectStudents(){
        //获取SqlSession对象
        SqlSession session = MybatisUtil.getSqlSession();
        //指定sqlid
        String sqlId = "com.powernode.dao.StudentDao"+"."+"selectStudents";
        //执行mapper的sql
        List<Student> student = session.selectList(sqlId);
        for(Student stu:student){
            System.out.println("student:===="+stu);
        }
        //关闭SqlSession对象
        session.close();
    }

    @Test
    public void testInsertStudent(){
        //获取SqlSession对象
        SqlSession session = MybatisUtil.getSqlSession();
        //指定sqlid
        String sqlId = "com.powernode.dao.StudentDao"+"."+"sertStudent";
        //执行mapper的sql
        Student student = new Student();
        student.setId(9);
        student.setName("小乔");
        student.setScore((float) 57.5);
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        student.setBirth(null);
        student.setAge(56);
        int rows =session.insert(sqlId,student);
        session.commit();
        //关闭SqlSession对象
        session.close();
    }


}
