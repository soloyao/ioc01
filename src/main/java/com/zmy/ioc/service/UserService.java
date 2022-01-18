package com.zmy.ioc.service;

import com.zmy.ioc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description:
 * @Date: Created in 19:55 2022/1/18
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<String> getAllUsers() {
        String hello = userDao.hello();
        System.out.println("hello = " + hello);
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            users.add("zmy:" + i);
        }
        return users;
    }
}
