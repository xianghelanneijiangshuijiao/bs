package china.jdl.visualizationsystem.service.impl;

import china.jdl.visualizationsystem.entity.room;
import china.jdl.visualizationsystem.mapper.roomMapper;
import china.jdl.visualizationsystem.service.RoomService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RoomServiceimplTest {

    @Autowired
    private RoomService roomService;

    @Resource
    private china.jdl.visualizationsystem.mapper.roomMapper roomMapper1;
    @Test
    void findData() {
    }

    @Test
    void test1(){
        room room1=new room();
        room1.setRoomnum("101");
        room1.setSex("女");
        room1.setAllstu(6);
        room1.setNumlive(0);
        roomService.adddorm(room1);
        int i=0;
    }

    @Test
    void test2(){
       roomMapper1.selectById("102");
       int i=0;
    }

    @Test
    void test(){
        roomMapper1.updatenumlive("101",3);
        int i=0;
    }
}