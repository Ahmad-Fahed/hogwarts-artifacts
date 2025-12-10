package akumaz.hogwartsartifacts;

import akumaz.hogwartsartifacts.artifact.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HogwartsArtifactsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HogwartsArtifactsApplication.class, args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }

}
