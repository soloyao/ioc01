package com.zmy.ioc;

import com.zmy.ioc.javaconfig.JavaConfig;
import com.zmy.ioc.javaconfig.SayHello;
import com.zmy.ioc.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description:
 * @Date: Created in 19:43 2022/1/18
 */
public class JavaConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        SayHello sayHello = ctx.getBean("sh", SayHello.class);
        System.out.println(sayHello.sayHello("zmy"));
        UserService userService = ctx.getBean(UserService.class);
        List<String> allUsers = userService.getAllUsers();
        System.out.println("allUsers = " + allUsers);
    }
}
