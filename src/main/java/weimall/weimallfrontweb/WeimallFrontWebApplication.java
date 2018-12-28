package weimall.weimallfrontweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableCaching
@EnableTransactionManagement
@SpringBootApplication
public class WeimallFrontWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeimallFrontWebApplication.class, args);
    }

}

