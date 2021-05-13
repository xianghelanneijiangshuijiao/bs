package china.jdl.visualizationsystem.vo;

import lombok.Data;

import java.util.List;
@Data
public class DataVO<T> {
    private Integer code;
    private String msg;
    private long count;
    private List<T> data;
}
