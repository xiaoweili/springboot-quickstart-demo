package com.alibaba.springboot.app.provider;

import com.alibaba.springboot.app.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zixian.lxw
 * @date 2022/11/10 11:26
 */
@Configuration
public class UserConfig {
    @Bean
    public User genUser() {
        return new User("zixian", 30);
    }
}
