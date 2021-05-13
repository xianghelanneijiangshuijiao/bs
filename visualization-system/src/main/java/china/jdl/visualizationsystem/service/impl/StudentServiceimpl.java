package china.jdl.visualizationsystem.service.impl;

import china.jdl.visualizationsystem.entity.student;
import china.jdl.visualizationsystem.mapper.studentMapper;
import china.jdl.visualizationsystem.service.StudentService;
import china.jdl.visualizationsystem.vo.*;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
public class StudentServiceimpl implements StudentService {
    @Resource
    private china.jdl.visualizationsystem.mapper.studentMapper studentMapper;

    @Override
    public DataVO<StudentVO> findData(Integer page,Integer limit) {
        DataVO dataVO =new DataVO();
        dataVO.setCode(0);
        dataVO.setMsg("");
   //     dataVO.setCount(studentMapper.selectCount(null));
        //分页操作
        IPage<student> studentIPage=new Page<>(page,limit);
        IPage<student> result=studentMapper.selectPage(studentIPage,null);

        dataVO.setCount(result.getTotal());

        List<student> studentList=result.getRecords();
        List<StudentVO> studentVOList=new ArrayList<>();
        for (student student1:studentList){
            StudentVO studentVO=new StudentVO();
            BeanUtils.copyProperties(student1,studentVO);
            studentVOList.add(studentVO);
        }

        dataVO.setData(studentVOList);
        return dataVO;
    }

    @Override
    public BarVO getBarVO() {
        List<SexVO> list= studentMapper.findAllsexbar();
        List<String> sexs=new ArrayList<>();
        List<Integer> counts=new ArrayList<>();
        for (SexVO sexVO:list){
            sexs.add(sexVO.getSex());
            counts.add(sexVO.getCount());
        }
        BarVO barVO=new BarVO();
        barVO.setSex(sexs);
        barVO.setCount(counts);
        return barVO;
    }

    @Override
    public Bar2VO getBar2VO() {
        List<AgeVO> list= studentMapper.findAllagebar();
        List<Integer> age=new ArrayList<>();
        List<Integer> counts=new ArrayList<>();
        for (AgeVO ageVO:list){
            age.add(ageVO.getAge());
            counts.add(ageVO.getCount());
        }
        Bar2VO bar2VO=new Bar2VO();
        bar2VO.setAge(age);
        bar2VO.setCount(counts);
        return bar2VO;
    }

    @Override
    public List<Pie2VO> getPie2VO() {
        List<ProvinceVO> list=studentMapper.findAllprovincebar();
        List<Pie2VO> pie2VOList=list.stream()
                .map(e->new Pie2VO(
                       e.getCount(),e.getProvince()
                )).collect(Collectors.toList());
        return pie2VOList;
    }

    @Override
    public String login(String id) {
        return studentMapper.login(Integer.valueOf(id));
    }

    @Override
    public Integer stulocation(Integer sno, String status) {
        studentMapper.stulocation(sno);
        return 1;
    }

    @Override
    public student clientselect(Integer sno) {
        return studentMapper.selectById(sno);
    }

    @Override
    public student selectbysno(Integer valueOf) {
        return studentMapper.selectById(valueOf);
    }

    @Override
    public List<PieVO> getPieVO() {
        List<SexVO> list= studentMapper.findAllsexbar();
        List<PieVO> pieVOList=list.stream()
               .map(e ->new PieVO(
                   e.getCount(),e.getSex()
               )).collect(Collectors.toList());


        return pieVOList;
    }

    @Override
    public void updatastudent(student student1) {
        studentMapper.updateById(student1);
    }

    @Override
    public void deletebyid(Integer sno) {
        studentMapper.deleteById(sno);
    }

    @Override
    public DataVO<StudentVO> selectbyid(Integer sno) {
        DataVO dataVO =new DataVO();
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(1L);
        List<StudentVO> studentVOList=new ArrayList<>();
        student student1=new student();
        student1= studentMapper.selectById(sno);
        StudentVO studentVO=new StudentVO();
        BeanUtils.copyProperties(student1,studentVO);
        studentVOList.add(studentVO);
        dataVO.setData(studentVOList);

        return dataVO;
    }



}
