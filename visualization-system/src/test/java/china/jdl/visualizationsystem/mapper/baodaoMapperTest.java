package china.jdl.visualizationsystem.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class baodaoMapperTest {
   @Resource
    private baodaoMapper mapper;
    @Test
    void test1(){//测试使用宿舍号能否查询它里面的学号
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("roomnum","100");
        System.out.println(mapper.selectOne(wrapper));
        int i=0;

    }
}