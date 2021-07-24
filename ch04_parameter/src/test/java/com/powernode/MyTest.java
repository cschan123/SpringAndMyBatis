package com.powernode;

import com.powernode.dao.StudentDao;
import com.powernode.domain.Student;
import com.powernode.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
/*
    @Test
    public void testSelectById(){
        //获取SqlSession对象
        SqlSession session = MybatisUtil.getSqlSession();
        //获取dao代理
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student = dao.selectById(1);
        System.out.println(student);
        //关闭SqlSession对象
        session.close();

    }
    @Test
    public void testSelectStudents(){
        //获取SqlSession对象
        SqlSession session = MybatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        System.out.println(dao.getClass().getName());
        List<Student> student = dao.selectStudents();
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

    @Test
    public void testSelectByNameOrAge(){
        //获取SqlSession对象
        SqlSession session = MybatisUtil.getSqlSession();
        //获取dao代理
        StudentDao dao = session.getMapper(StudentDao.class);
        List<Student> jm = dao.selectByNameOrAge("JM", 16);
        for(Student stu:jm){
            System.out.println("student:===="+stu);
        }
        //关闭SqlSession对象
        session.close();
    }


    */
/*传入对象*//*

    @Test
    public void testSselectByObject(){
        //获取SqlSession对象
        SqlSession session = MybatisUtil.getSqlSession();
        //获取dao代理
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("JM");
        student.setAge(56);
        List<Student> jm = dao.selectByObject(student);
        for(Student stu:jm){
            System.out.println("student:===="+stu);
        }
        //关闭SqlSession对象
        session.close();
    }
    */
/*传入位置*//*

    @Test
    public void testSelectPosition(){
        //获取SqlSession对象
        SqlSession session = MybatisUtil.getSqlSession();
        //获取dao代理
        StudentDao dao = session.getMapper(StudentDao.class);
        */
/*按位置传递参数*//*

        List<Student> jm = dao.selectByPositon("JM",16);
        for(Student stu:jm){
            System.out.println("student:===="+stu);
        }
        //关闭SqlSession对象
        session.close();
    }
    */
/*传入map*//*

    @Test
    public void testSelectByMap(){
        //获取SqlSession对象
        SqlSession session = MybatisUtil.getSqlSession();
        //获取dao代理
        StudentDao dao = session.getMapper(StudentDao.class);
        */
/*map传递参数*//*
;
        Map<String,Object> data = new HashMap<>();
        data.put("myname","JM");
        data.put("myage",56);
        List<Student> jm = dao.SelectByMap(data);

        for(Student stu:jm){
            System.out.println("student:===="+stu);
        }
        //关闭SqlSession对象
        session.close();
    }


   @Test
    public void testSelectLikeOne(){
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //获取dao代理
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        String name = "j%";
        List<Student> jm = dao.SelectLikeOne(name);

        for(Student stu:jm){
            System.out.println("student:===="+stu);
        }
        //关闭SqlSession对象
        sqlSession.close();
    }
*/


}
