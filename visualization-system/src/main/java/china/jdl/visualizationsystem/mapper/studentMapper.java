package china.jdl.visualizationsystem.mapper;

import china.jdl.visualizationsystem.entity.student;
import china.jdl.visualizationsystem.vo.AgeVO;
import china.jdl.visualizationsystem.vo.Bar2VO;
import china.jdl.visualizationsystem.vo.ProvinceVO;
import china.jdl.visualizationsystem.vo.SexVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface studentMapper extends BaseMapper<student> {
    @Select("select s.sex, sum(s.num) count from student s GROUP BY sex")
    public List<SexVO> findAllsexbar();

    @Select("select s.age, sum(s.num) count from student s GROUP BY age")
    public List<AgeVO> findAllagebar();

    @Select("select s.province, sum(s.num) count from student s GROUP BY province")
    List<ProvinceVO> findAllprovincebar();

    @Select("select pwd from student where sno = #{sno}")
    String login(Integer sno);

    @Update(value = "UPDATE student s SET s.status = 1 WHERE s.sno = #{sno} ")
    void stulocation(Integer sno);
}
