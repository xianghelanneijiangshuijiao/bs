package china.jdl.visualizationsystem.service.impl;

import china.jdl.visualizationsystem.entity.student;
import china.jdl.visualizationsystem.mapper.studentMapper;
import china.jdl.visualizationsystem.service.StudentService;
import china.jdl.visualizationsystem.vo.Bar2VO;
import china.jdl.visualizationsystem.vo.BarVO;
import china.jdl.visualizationsystem.vo.DataVO;
import china.jdl.visualizationsystem.vo.StudentVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceimplTest {

    @Autowired
    private StudentService studentService;



    @Test
    void findData() {
    }

    @Test
    void test(){
        BarVO barVO=studentService.getBarVO();
        int i=0;
    }

    @Test
    void test1(){
        student student1=new student();
        student1.setSno(20170111);
        student1.setSname("1111");
        student1.setPwd("12344");
        studentService.updatastudent(student1);
        int i=0;

    }
    @Test
    void test2(){
        studentService.deletebyid(20170107);
        int i=0;
    }


    @Test
    void test3(){//测试搜索框
        studentService.selectbyid(20170101);
        int i=0;

    }


    @Test
    void test5(){ //测试第二个柱状图
        Bar2VO bar2VO=studentService.getBar2VO();
        int i=0;
    }




}