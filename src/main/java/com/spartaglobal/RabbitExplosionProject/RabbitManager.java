package com.spartaglobal.RabbitExplosionProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RabbitManager {

    //RabbitBirthManager rabbitBirthManager=new RabbitBirthManager();

     Rabbit createMaleRabbit(boolean gender,int age){
        Rabbit maleRabbit;
        maleRabbit = new Rabbit();
        maleRabbit.setAge(age);
        maleRabbit.setGender(gender);
        return maleRabbit;
    }

     Rabbit createFemaleRabbit(boolean gender,int age) {
        Rabbit femaleRabbit = new Rabbit();
        femaleRabbit.setAge(age);
        femaleRabbit.setGender(gender);
        return femaleRabbit;
    }
}
