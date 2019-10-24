package com.spartaglobal.RabbitExplosionProject;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    RabbitBirthManager rabbitBirthManager = new RabbitBirthManager();
    rabbitBirthManager.addMaleRabbitToPopulation();
    rabbitBirthManager.addFemaleRabbitToPopulation();
    rabbitBirthManager.initExistence();




    }
}
