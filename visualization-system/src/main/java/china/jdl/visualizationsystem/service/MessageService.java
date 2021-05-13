package china.jdl.visualizationsystem.service;

import china.jdl.visualizationsystem.entity.message;

import java.util.List;

public interface MessageService {
    void insert(message message1);

    List<message> findAllMes();
}
