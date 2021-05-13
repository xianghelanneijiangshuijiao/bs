package china.jdl.visualizationsystem.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class room {
    @TableId(value="roomnum")
    private String roomnum;
    private String sex;
    private Integer allstu;
    private Integer numlive;
}
