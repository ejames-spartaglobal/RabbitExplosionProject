package com.spartaglobal.RabbitExplosionProject;

import java.util.Map;
import java.util.Random;

public class Rabbit implements IRabbit{
    boolean gender;
    int age;

    @Override
    public boolean getGender() {
        return gender;
    }

    @Override
    public void setGender(boolean gender) {
        this.gender=gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age=age;
    }

}
