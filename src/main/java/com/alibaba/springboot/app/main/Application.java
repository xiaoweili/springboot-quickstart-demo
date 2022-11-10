package com.alibaba.springboot.app.main;

import com.alibaba.springboot.app.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author zixian.lxw
 * @date 2022/11/10 10:53
 * 参考文档：
 *  1. https://www.baeldung.com/spring-boot-start
 *  2. https://www.jianshu.com/p/4e1cab2d8431
 */
@SpringBootApplication(scanBasePackages = "com.alibaba.springboot.app")
public class Application {
    @Bean
    public Runnable createRunnable(){
        return () -> System.out.println("spring boot is running");
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
        ctx.getBean(Runnable.class).run();

        User userConf = ctx.getBean(User.class);
        System.out.println(userConf);
    }
}
