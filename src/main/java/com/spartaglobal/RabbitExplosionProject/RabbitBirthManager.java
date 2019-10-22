package com.spartaglobal.RabbitExplosionProject;


import java.util.ArrayList;
import java.util.List;

public class RabbitBirthManager {

    List<Rabbit> maleRabbitList=new ArrayList<>();
    List<Rabbit> femaleRabbitList=new ArrayList<>();
    RabbitManager rabbitManager=new RabbitManager();

    public void addFemaleRabbitToPopulation(boolean gender, int age){
        femaleRabbitList.add(rabbitManager.createFemaleRabbit(gender,age));
    }

    public void addMaleRabbitToPopulation(boolean gender,int age){
        maleRabbitList.add(rabbitManager.createFemaleRabbit(gender,age));
    }

}
