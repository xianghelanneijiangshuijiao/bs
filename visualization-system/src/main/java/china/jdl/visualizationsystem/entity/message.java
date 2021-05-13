package china.jdl.visualizationsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import java.sql.Timestamp;
@Data
public class message {
    @TableId(value="mesno",type = IdType.AUTO)
    private Integer mesno;
    private String title;
    private String notice;
    private Timestamp mesdate;

}
