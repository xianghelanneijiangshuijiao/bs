package china.jdl.visualizationsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("china.jdl.visualizationsystem.mapper")
public class VisualizationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisualizationSystemApplication.class, args);
    }

}
