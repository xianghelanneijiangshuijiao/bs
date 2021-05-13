package china.jdl.visualizationsystem.controller;

import china.jdl.visualizationsystem.entity.student;
import china.jdl.visualizationsystem.service.StudentService;
import china.jdl.visualizationsystem.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;




    @RequestMapping("/list")
    @ResponseBody
    public DataVO list(Integer page,Integer limit){
        return studentService.findData(page, limit);
    }

    @GetMapping("/{url}")
    public String redirect(@PathVariable("url") String url){
        return url;
    }

    @RequestMapping("/barVO")
    @ResponseBody
    public BarVO getBarVO(){
        return studentService.getBarVO();

    }

    @RequestMapping("/bar2VO")
    @ResponseBody
    public Bar2VO bar2VO(){
        return studentService.getBar2VO();
    }

    @RequestMapping("/pieVO")
    @ResponseBody
    public List<PieVO> getPieVO(){
        return  studentService.getPieVO();
    }

    @RequestMapping("/pie2VO")
    @ResponseBody
    public List<Pie2VO> getPie2VO(){
        return  studentService.getPie2VO();
    }

    @PostMapping("/updataStudent")
    @ResponseBody
    public Integer updataStudent(@RequestBody student student1){
        student1.setStatus("1");
        student1.setNum(1);
        studentService.updatastudent(student1);
        return 200;
    }

    @PostMapping("/deletebyid")
    @ResponseBody
    public Integer deletebyid(String sno){
        System.out.println(sno);
        Integer sno1=Integer.valueOf(sno);
        studentService.deletebyid(Integer.valueOf(sno1));
        return 200;
    }

    @RequestMapping("/selectbysno")
    @ResponseBody
    public DataVO selectbysno(String sno){
        System.out.println(sno);
        Integer sno1=Integer.valueOf(sno);

     return  studentService.selectbyid(sno1);

    }

    @PostMapping("/stulogin")
    @ResponseBody
    public student stulogin(@RequestParam(value="sno") String sno,
                      @RequestParam(value="password") String password){
       student stu = new student();
       stu.setSno(Integer.valueOf(sno));

        if(password.equals(studentService.login(sno))){

            return studentService.selectbysno(Integer.valueOf(sno));
        }
        else
            return null;
    }

    @PostMapping("/stulocation")
    @ResponseBody
    public String stulocation(@RequestParam(value = "sno")String sno,
                              @RequestParam(value = "status") String status){

        if(studentService.stulocation(Integer.valueOf(sno),status)==1){
        return "200";}
        else
            return "0";
    }

    @PostMapping("/clientStudent")
    @ResponseBody
    public student clientStudent(@RequestParam(value = "sno")String sno){

        return studentService.clientselect(Integer.valueOf(sno));

    }





}
