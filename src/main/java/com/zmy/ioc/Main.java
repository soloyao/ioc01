package com.zmy.ioc;

import com.zmy.ioc.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description:
 * @Date: Created in 20:12 2022/1/17
 */
public class Main {
    public static void main(String[] args) {
//        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\ideaworkspace\\ioc01\\src\\main\\resources\\applicationContext.xml");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        m1(ctx);
//        m2(ctx);
        m3(ctx);
    }

    /**
     * p名称空间注入
     * @param ctx
     */
    private static void m3(ClassPathXmlApplicationContext ctx) {
        User u3 = ctx.getBean("user3", User.class);
        System.out.println("u3 = " + u3);
    }

    /**
     * set方法注入
     * @param ctx
     */
    private static void m2(ClassPathXmlApplicationContext ctx) {
        User u2 = ctx.getBean("user2", User.class);
        System.out.println("u2 = " + u2);
    }

    /**
     * 构造方法注入
     * @param ctx
     */
    private static void m1(ClassPathXmlApplicationContext ctx) {
        User u1 = (User) ctx.getBean("user");
        User u2 = ctx.getBean("user", User.class);
        User u3 = ctx.getBean(User.class);
        System.out.println("u1 = " + u1);
        System.out.println("u2 = " + u2);
        System.out.println("u3 = " + u3);
    }
}
