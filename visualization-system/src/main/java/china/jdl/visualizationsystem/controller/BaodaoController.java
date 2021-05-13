package china.jdl.visualizationsystem.controller;

import china.jdl.visualizationsystem.service.BaodaoService;
import china.jdl.visualizationsystem.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BaodaoController {
    @Resource
    private BaodaoService baodaoService;
    @Resource
    private RoomService roomService;
    @PostMapping("/clientadddorm")
    @ResponseBody
    public String clientadddorm(String sno,String status,String roomnum,String numlive){
        baodaoService.clientadddorm(Integer.valueOf(sno),status,roomnum);
        roomService.updatanumlive(roomnum,Integer.valueOf(numlive)+1);
        return "200";
    }
}
