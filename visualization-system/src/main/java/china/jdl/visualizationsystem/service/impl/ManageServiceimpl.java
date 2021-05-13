package china.jdl.visualizationsystem.service.impl;

import china.jdl.visualizationsystem.mapper.manageMapper;
import china.jdl.visualizationsystem.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service
public class ManageServiceimpl implements ManageService {

    @Resource
    private manageMapper manageMapper;

    @Override
    public String selectbyid(String id) {
            return manageMapper.selectid(id);
    }
}
