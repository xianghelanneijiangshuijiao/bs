package china.jdl.visualizationsystem.mapper;

import china.jdl.visualizationsystem.entity.room;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface roomMapper extends BaseMapper<room> {
    @Update(value = "UPDATE room r SET r.numlive = #{numlive} WHERE r.roomnum = #{roomnum} ")
    void updatenumlive(String roomnum, Integer numlive);

    @Select("select * from room where room.allstu>room.numlive and room.sex=#{sex}")
    List<room> selectList1(String sex);
}
