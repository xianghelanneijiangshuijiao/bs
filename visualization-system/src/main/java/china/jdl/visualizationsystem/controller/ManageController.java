package china.jdl.visualizationsystem.controller;

import china.jdl.visualizationsystem.entity.manage;
import china.jdl.visualizationsystem.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class ManageController {
    @Resource
    private ManageService manageService;

    @PostMapping("/login")
    public String ccc(@RequestParam(value="id") String id,
                      @RequestParam(value="password") String password){

        if(password.equals(manageService.selectbyid(id))){

            return "/admin";
        }
        else
            return "123";
    }

}
