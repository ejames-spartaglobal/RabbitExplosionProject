package com.spartaglobal.RabbitExplosionProject;

import java.util.Timer;
import java.util.TimerTask;

public class RabbitExplosionTimer {

    public void timeTrack(){
        Timer timer = new Timer();
        RabbitTimerTask timerTask = new RabbitTimerTask();
        timer.schedule(timerTask,0,1000);
    }


}
