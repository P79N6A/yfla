package weimall.weimallfrontweb;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;




//加上注解就可以 Cacheable（"方法名"）
@EnableCaching
@EnableTransactionManagement
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WeimallFrontWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeimallFrontWebApplication.class, args);
    }

}

