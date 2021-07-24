package com.powernode.dao;

import com.powernode.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    /*Student selectById(Integer id);
    List<Student> selectStudents();
    List<Student> selectByNameOrAge(@Param("myName") String name,@Param("myAge") Integer age);
    int insertStudent(Student student);

    *//*java 对象作为参数,对象有属性，有getter setter
    * *//*
    List<Student>selectByObject(Student student);

    *//*使用位置获取参数*//*
    List<Student>selectByPositon(String name,Integer age);

    *//*map参数*//*
    List<Student>SelectByMap(Map<String,Object> map);
    List<Student>SelectLikeOne(@Param("name") String name);
    List<Student>SelectLikeOne2(@Param("name") String name);

    List<Student>SelectIf(Student student);


    List<Student>SelectWhere(Student student);

    List<Student>SelectForeachOne(List<Integer>idlist);*/

    //List<Student>SelectForeachtwo(List<Student>studentList);

    List<Student> selectAllStudents();


}
