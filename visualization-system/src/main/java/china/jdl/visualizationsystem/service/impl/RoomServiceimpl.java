package china.jdl.visualizationsystem.service.impl;

import china.jdl.visualizationsystem.entity.room;
import china.jdl.visualizationsystem.mapper.roomMapper;
import china.jdl.visualizationsystem.service.RoomService;
import china.jdl.visualizationsystem.vo.DataVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Service
public class RoomServiceimpl implements RoomService {

    @Resource
    private roomMapper roomMapper1;

    @Resource
    private china.jdl.visualizationsystem.mapper.baodaoMapper baodaoMapper;
    @Override
    public DataVO findData(Integer page, Integer limit) {
        DataVO dataVO =new DataVO();
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(roomMapper1.selectCount(null));//有多少宿舍就有多少条记录

        List<room> roomList=roomMapper1.selectList(null);//先把所有的宿舍都查出来

/*        List<RoomVO> roomVOList=new ArrayList<>();//需要把room类型数据转换成RoomVO类型
        for (room room1 :roomList){
            RoomVO roomVO=new RoomVO();//每次取出一个room，就创建一个RoomVO对象
            BeanUtils.copyProperties(room1,roomVO);//将room1里面的值复制给roomVO,除了学号，因为room对象里面没有学号

            //通过宿舍号虽然可以查询到学生的学号，但是它不是一对一的关系，一个宿舍号会对应多个学号，只能用selectList查询
            //但是由于之前给RoomVO类定义的学生是Interge sno,不是 list<Interge> sno,所以这里就不显示学生的学号，不然前端我也不好取出数值
            //所以只能通过修改数据表
            //如果涉及多表查询则可按照下面注释掉的代码来改
        *//*    QueryWrapper wrapper=new QueryWrapper();
            wrapper.eq("roomnum",room1.getRoomnum());
            roomVO.setSno(baodaoMapper.selectOne(wrapper).getSno());//通过宿舍号去查询学号*//*


        }*/
        dataVO.setData(roomList);

        return dataVO;
    }

    @Override
    public void adddorm(room room1) {
        roomMapper1.insert(room1);
    }

    @Override
    public void deletebyroomnum(String roomnum) {
        roomMapper1.deleteById(roomnum);
    }

    @Override
    public void updatanumlive(String roomnum, Integer numlive) {

        roomMapper1.updatenumlive(roomnum,numlive);
    }

    @Override
    public List<room> selectdorm(String sex) {

        return roomMapper1.selectList1(sex);
    }
}
