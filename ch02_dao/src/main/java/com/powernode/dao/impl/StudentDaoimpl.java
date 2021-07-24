package com.powernode.dao.impl;

import com.powernode.dao.StudentDao;
import com.powernode.domain.Student;
import com.powernode.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoimpl implements StudentDao {
    @Override
    public Student selectById(Integer id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sqlId = "com.powernode.dao.StudentDao"+"."+"selectById";
        Student student = sqlSession.selectOne(sqlId, id);
        sqlSession.close();
        return  student;
    }

    @Override
    public List<Student> selectStudents() {
        //获取SqlSession对象
        SqlSession session = MybatisUtil.getSqlSession();
        //指定sqlid
        String sqlId = "com.powernode.dao.StudentDao"+"."+"selectStudents";
        //执行mapper的sql
        List<Student> students = session.selectList(sqlId);
        for(Student stu:students){
            System.out.println("student:===="+stu);
        }
        //关闭SqlSession对象
        session.close();
        return students;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession session = MybatisUtil.getSqlSession();
        //指定sqlid
        String sqlId = "com.powernode.dao.StudentDao"+"."+"sertStudent";
        //执行mapper的sql

        int rows =session.insert(sqlId,student);
        session.commit();
        //关闭SqlSession对象
        session.close();
        return rows;
    }
}
