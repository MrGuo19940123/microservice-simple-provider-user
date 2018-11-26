package com.leo.microservicesimpleprovideruser.domain;

import java.util.Objects;

/**
  * @Company     橙优科技-择所爱,爱所选
  * @Author      郭志学
  * @Date        2018/11/20
  * @Version     1.0
  * @Description TODO 用户实体类
  */
public class User {
    private Integer id;
    private String username;
    private String name;
    private Integer age;
    private String balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(name, user.name) &&
                Objects.equals(age, user.age) &&
                Objects.equals(balance, user.balance);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, username, name, age, balance);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", balance='" + balance + '\'' +
                '}';
    }
}
