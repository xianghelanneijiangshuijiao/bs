package china.jdl.visualizationsystem.service;

import china.jdl.visualizationsystem.entity.room;
import china.jdl.visualizationsystem.vo.DataVO;
import china.jdl.visualizationsystem.vo.RoomVO;

import java.util.List;

public interface RoomService {


   public DataVO<RoomVO> findData(Integer page, Integer limit);

    void adddorm(room room1);

    void deletebyroomnum(String roomnum);

    void updatanumlive(String roomnum, Integer numlive);

    List<room> selectdorm(String sex);
}
