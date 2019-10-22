package com.spartaglobal.RabbitExplosionProject;

import java.util.TimerTask;

public class RabbitTimerTask extends TimerTask {


    @Override
    public void run() {
        RabbitManager rabbitManager = new RabbitManager();
        RabbitBirthManager rabbitBirthManager = new RabbitBirthManager();
        rabbitManager.Birth();
        System.out.println(rabbitBirthManager.femaleRabbitList.size());
        System.out.println(rabbitBirthManager.maleRabbitList.size());

    }
}
