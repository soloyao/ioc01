package com.zmy.ioc.model;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description:
 * @Date: Created in 20:12 2022/1/17
 */
public class User {

    private String username;
    private String address;
    private Integer id;

    public User(Integer id) {
        this.id = id;
    }

    public User(String username, String address, Integer id) {

        this.username = username;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

    public User() {
        System.out.println("----------init----------");
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        System.out.println("username = " + username);
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
