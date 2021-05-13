package china.jdl.visualizationsystem.controller;

import china.jdl.visualizationsystem.entity.room;
import china.jdl.visualizationsystem.service.RoomService;
import china.jdl.visualizationsystem.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RoomController {

    @Resource
    private RoomService roomService;
    @RequestMapping("/listRoom")
    @ResponseBody
    public DataVO listRoom(Integer page,Integer limit){
        return roomService.findData(page,limit);
    }

    @RequestMapping("/adddorm")
    @ResponseBody
    public Integer adddorm(@RequestBody room room1){
        roomService.adddorm(room1);
        return 200;
    }

    @RequestMapping("/deletedorm")
    @ResponseBody
    public Integer deletedorm(String roomnum){
        roomService.deletebyroomnum(roomnum);
        return 200;
    }

    @RequestMapping("/updatanumlive")
    @ResponseBody
    public void updatanumlive(String roomnum,String numlive){
        roomService.updatanumlive(roomnum,Integer.valueOf(numlive));
    }

    @PostMapping("/clientdorm")
    @ResponseBody
    public List<room> clientdorm(String sex){
        return roomService.selectdorm(sex);
    }



}
