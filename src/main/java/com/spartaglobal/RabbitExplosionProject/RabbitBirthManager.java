package com.spartaglobal.RabbitExplosionProject;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RabbitBirthManager {

    private Random random = new Random();
   // int birthNum=0;

    private RabbitManager rabbitManager=new RabbitManager();
    private List<IMaleRabbit> maleRabbitList=new ArrayList<>();
    private List<IFemaleRabbit> femaleRabbitList=new ArrayList<>();

    private void addFemaleRabbitToPopulation() {
        femaleRabbitList.add(rabbitManager.createFemaleRabbit(true, 0));
    }
    private void addMaleRabbitToPopulation(){
        maleRabbitList.add(rabbitManager.createMaleRabbit(false,0));
    }

    int numOfBirths(){

        int birthNum = random.nextInt(14);
        return birthNum;
    }


    public void addRabbit() {
        for (int i = 0; i < numOfBirths(); i++) {

            boolean gBool = random.nextBoolean();
            // System.out.println(gBool);
            if (gBool) {
                addFemaleRabbitToPopulation();
            } else {
                addMaleRabbitToPopulation();
            }
        }
    }

    public void initBirth(){
        for (int j = 0; j < 500; j++) {
            numOfBirths();
            addRabbit();
            printMalePop();
            printFemalePop();
        }
    }


    public void printMalePop(){
        System.out.println("Male Population: " + maleRabbitList.size());
    }
    public void printFemalePop(){
        System.out.println("Female Population: " + femaleRabbitList.size());
    }

}
