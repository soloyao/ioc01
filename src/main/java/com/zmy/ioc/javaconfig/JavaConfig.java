package com.zmy.ioc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description: Java配置，通过Java代码将Bean注册到Spring容器中
 * @Date: Created in 19:37 2022/1/18
 *
 * @Configuration 注解表示这是一个Java配置类，配置类的作用类似于applicationContext.xml
 */
@Configuration
//Java代码自动扫描注入
@ComponentScan(basePackages = "com.zmy.ioc", useDefaultFilters = false, includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class), @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Repository.class)})
public class JavaConfig {
    @Bean("sh")
    SayHello sayHello() {
        return new SayHello();
    }
}
