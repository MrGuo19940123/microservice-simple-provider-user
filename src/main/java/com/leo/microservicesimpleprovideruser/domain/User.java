package com.leo.microservicesimpleprovideruser.domain;

import javax.validation.constraints.Min;
import java.util.Objects;

/**
  * @Company     不如吃茶去
  * @Author      郭志学
  * @Date        2018/11/20
  * @Version     1.0
  * @Description TODO 用户实体类
  */
public class User {
    private Integer id;
    private String username;
    private String password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Min(value = 18, message = "未成年人禁止入内!")
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
                Objects.equals(password, user.password) &&
                Objects.equals(age, user.age) &&
                Objects.equals(balance, user.balance);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, username, password, age, balance);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + password + '\'' +
                ", age=" + age +
                ", balance='" + balance + '\'' +
                '}';
    }
}
