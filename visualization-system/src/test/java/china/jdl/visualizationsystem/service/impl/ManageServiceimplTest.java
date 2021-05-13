package china.jdl.visualizationsystem.service.impl;

import china.jdl.visualizationsystem.entity.manage;
import china.jdl.visualizationsystem.mapper.manageMapper;
import china.jdl.visualizationsystem.service.ManageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ManageServiceimplTest {

   @Resource
    private  manageMapper manageMapper1;
    @Test
    void selectbyid() {
            manageMapper1.selectid("abc");
            int i=0;
    }
}