package china.jdl.visualizationsystem.service;

import china.jdl.visualizationsystem.entity.student;
import china.jdl.visualizationsystem.vo.*;

import java.util.List;

public interface StudentService {
    public DataVO<StudentVO> findData(Integer page,Integer limit);
    public BarVO getBarVO();
    public List<PieVO> getPieVO();

    void updatastudent(student student);

    void deletebyid(Integer sno);

    public DataVO<StudentVO> selectbyid(Integer sno);

    Bar2VO getBar2VO();

    List<Pie2VO> getPie2VO();

    String login(String id);

    Integer stulocation(Integer valueOf, String status);

    student clientselect(Integer valueOf);

    student selectbysno(Integer valueOf);
}
