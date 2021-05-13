package china.jdl.visualizationsystem.service.impl;

import china.jdl.visualizationsystem.entity.message;
import china.jdl.visualizationsystem.mapper.messageMapper;
import china.jdl.visualizationsystem.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageServiceimpl implements MessageService {
    @Resource
    private messageMapper messageMapper1;

    @Override
    public void insert(message message1) {
        messageMapper1.insert(message1);
    }

    @Override
    public List<message> findAllMes() {
        return messageMapper1.selectList(null);
    }
}
