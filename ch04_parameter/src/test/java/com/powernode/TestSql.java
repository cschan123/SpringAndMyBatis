package com.powernode;

import com.github.pagehelper.PageHelper;
import com.powernode.dao.StudentDao;
import com.powernode.domain.Student;
import com.powernode.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSql {

  /*  @Test
    public void testSelectIf(){
        SqlSession session = MybatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);

        Student student = new Student();
        student.setName("JM");
        student.setAge(20);
        List<Student> students = dao.SelectIf(student);

        for(Student stu:students){
            System.out.println(stu);
        }

        session.close();
    }

    @Test
    public void testSelectWhere(){
        SqlSession session = MybatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);

        Student student = new Student();
        student.setName("JM");
        student.setAge(20);
        List<Student> students = dao.SelectWhere(student);

        for(Student stu:students){
            System.out.println(stu);
        }

        session.close();
    }

    @Test
    public void testFor(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        StringBuffer sql = new StringBuffer("");
        sql.append("select * from tbl_student where id in ");
        sql.append("(");
        for (int i = 0; i <arrayList.size() ; i++) {
            Integer item = arrayList.get(i);
            sql.append(item);
            sql.append(",");
        }
        sql.deleteCharAt(sql.length()-1);
        sql.append(")");
        System.out.println(sql);
    }



    @Test
    public void testSelectForeachOne(){
        SqlSession session = MybatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        List<Student> students = dao.SelectForeachOne(arrayList);
        for(Student stu:students){
            System.out.println(stu);
        }

        session.close();
    }
*/

    @Test
    public void testSelectPage(){
        SqlSession session = MybatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        //PageHelper.startPage(1,3);
        List<Student> students = dao.selectAllStudents();
        for(Student stu:students){
            System.out.println(stu);
        }



    }
}
