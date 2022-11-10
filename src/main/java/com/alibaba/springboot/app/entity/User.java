package com.alibaba.springboot.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author zixian.lxw
 * @date 2022/11/10 11:08
 */
@Data
@AllArgsConstructor
@ToString
public class User {
    private String name;
    private Integer age;
}
