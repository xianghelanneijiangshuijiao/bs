package china.jdl.visualizationsystem.service;

import china.jdl.visualizationsystem.vo.DataVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceTest {
    @Autowired
    private StudentService service;


    @Test
    void findData(int page,int limit) {
        DataVO dataVO=service.findData(page,limit);

    }
}