package china.jdl.visualizationsystem.mapper;

import china.jdl.visualizationsystem.entity.student;
import china.jdl.visualizationsystem.vo.SexVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class studentMapperTest {

   @Resource
    private studentMapper studentMapper1;
    @Test
    void findAllsexbar() {
        List<SexVO> List= studentMapper1.findAllsexbar();
        int i=0;
    }
}