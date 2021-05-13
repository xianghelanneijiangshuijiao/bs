package china.jdl.visualizationsystem.controller;

import china.jdl.visualizationsystem.entity.manage;
import china.jdl.visualizationsystem.service.ManageService;
import china.jdl.visualizationsystem.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentControllerTest {
    @Resource
    private StudentService studentService1;

    @Test
    void test1(){  //测试第二个柱状图
        studentService1.getBar2VO();
        int i=0;
    }

}