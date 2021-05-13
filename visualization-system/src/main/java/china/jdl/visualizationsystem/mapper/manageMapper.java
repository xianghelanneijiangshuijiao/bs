package china.jdl.visualizationsystem.mapper;

import china.jdl.visualizationsystem.entity.manage;
import china.jdl.visualizationsystem.entity.student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

public interface manageMapper extends BaseMapper<manage> {
    @Select("select password from manage where id=manage.id")
    String selectid(String id);
}
