package china.jdl.visualizationsystem.controller;

import china.jdl.visualizationsystem.entity.message;
import china.jdl.visualizationsystem.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MessageController {
    @Resource
    private MessageService messageService;


    @PostMapping("/addmes")
    @ResponseBody
    public String addmes(@RequestBody message message1){
        messageService.insert(message1);
    return "200";
    }

    @RequestMapping(value="/findAllMes")
    @ResponseBody
    public List<message> findAllMes(){
        return messageService.findAllMes();
    }
}
