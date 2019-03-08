package com.leo.microservicesimpleprovideruser.domain;

/**
 * @author <郭志学>
 * @version <1.0>
 * @company <刺客伍六七有限公司>
 * @description <Apple实体类>
 * @createDate 2019/2/16 14:24
 */
public class Apple {

    private String color;
    private Integer weight;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
