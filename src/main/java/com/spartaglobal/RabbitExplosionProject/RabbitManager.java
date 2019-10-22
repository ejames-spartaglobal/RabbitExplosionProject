package com.spartaglobal.RabbitExplosionProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RabbitManager extends Rabbit{

    //RabbitBirthManager rabbitBirthManager=new RabbitBirthManager();

    public Rabbit createMaleRabbit(boolean gender,int age){
        Rabbit maleRabbit;
        maleRabbit = new Rabbit();
        maleRabbit.setAge(age);
        maleRabbit.setGender(gender);
        return maleRabbit;
    }

    public Rabbit createFemaleRabbit(boolean gender,int age){
        Rabbit femaleRabbit=new Rabbit();
        femaleRabbit.setAge(age);
        femaleRabbit.setGender(gender);
        return femaleRabbit;
    }

    public void Birth(){
        boolean gBool;
        Random random = new Random();
        gBool=random.nextBoolean();

        if(gBool=true){
            createFemaleRabbit(true,0);

        }
        else {
           createMaleRabbit(false,0);
        }

    }

}
