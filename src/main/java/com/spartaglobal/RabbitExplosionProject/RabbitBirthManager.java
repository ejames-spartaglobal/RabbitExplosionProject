package com.spartaglobal.RabbitExplosionProject;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

 class RabbitBirthManager {

    private Random random = new Random();
    private RabbitManager rabbitManager=new RabbitManager();
    private List<IMaleRabbit> maleRabbitList=new ArrayList<>();
    private List<IFemaleRabbit> femaleRabbitList=new ArrayList<>();
 //   private List<Rabbit> deadRabbitList=new ArrayList<>();
     private int breedingPairs;

    public void addFemaleRabbitToPopulation() {
        femaleRabbitList.add(rabbitManager.createFemaleRabbit(true, 0));
    }
    public void addMaleRabbitToPopulation(){
        maleRabbitList.add(rabbitManager.createMaleRabbit(false,0));
    }

    int numOfBirths(){

        int birthNum = random.nextInt(14)*breedingPairs;
        return birthNum;
    }

    public int breeding(){
        if(maleRabbitList.size()<femaleRabbitList.size()){
            breedingPairs=maleRabbitList.size();
        }
        else if(maleRabbitList.size()>femaleRabbitList.size()){
            breedingPairs=femaleRabbitList.size();
        }
        else breedingPairs=1;

        return breedingPairs;
    }

    public void addRabbit() {
        for (int i = 0; i < numOfBirths(); i++) {
           // birthMonth=currentMonth;
            boolean gBool = random.nextBoolean();
            // System.out.println(gBool);
            if (gBool) {
                addFemaleRabbitToPopulation();
            } else {
                addMaleRabbitToPopulation();
            }
        }
    }

    public void initExistence(){
        for (int j = 0; j < 1000; j++) {
//            death();
//            System.out.println(monthsPassed);
            breeding();
            numOfBirths();
            addRabbit();
//            monthsPassed=currentMonth-birthMonth;
            //currentMonth++;
     //       System.out.println(currentMonth);
            printMalePop();
            printFemalePop();
        }
    }

//    public void death(){
//        for (int i = 0; i < maleRabbitList.size()-1; i++) {
//            if (maleRabbitList.get(i).getAge()==60){
//                maleRabbitList.remove(i);
//                deadRabbitList.add(rabbitManager.createMaleRabbit(false,60));
//                System.out.println("Dead: " + deadRabbitList.size());
//            }
//        }
//    }


    public void printMalePop(){
        System.out.println("Male Population: " + maleRabbitList.size());
    }
    public void printFemalePop(){
        System.out.println("Female Population: " + femaleRabbitList.size());
    }

}
