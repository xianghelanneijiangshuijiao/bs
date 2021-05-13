package china.jdl.visualizationsystem.service.impl;

import china.jdl.visualizationsystem.entity.baodao;
import china.jdl.visualizationsystem.mapper.baodaoMapper;
import china.jdl.visualizationsystem.service.BaodaoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BaodaoServiceimpl implements BaodaoService {
    @Resource
    private baodaoMapper baodaoMapper;
    @Override
    public void clientadddorm(Integer valueOf, String status,String roomnum) {
        baodao baodao1=new baodao();
        baodao1.setSno(valueOf);
        baodao1.setStatus(status);
        baodao1.setRoomnum(roomnum);
        baodaoMapper.insert(baodao1);
    }
}
