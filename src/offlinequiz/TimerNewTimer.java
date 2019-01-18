/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinequiz;

import java.time.Duration;
import java.util.TimerTask;
import java.util.Timer;
        

/**
 *
 * @author Ludde
 */

import java.sql.Timestamp;

public class TimerNewTimer {

Timestamp timestamp = new Timestamp(System.currentTimeMillis());
static long starter;
static long stop;
static long finalsMinute;
static long finalsSeconds;
static long finals;

public void setStarterTime(){
 starter= timestamp.getTime()/1000; //long starter = timestamp.getTime()/1000*60; // sätter en timestamp på start i millesekuder som förändras till minuter
    }

public void setStopTime(){
stop = timestamp.getTime()/1000;// sätter en timestamp på stop i millesekunder som förändras till minuter
}



public long getFinals(){
    finals = stop-starter;
    return finals;
}

public long returnFinalsMinute(){
finalsMinute = (stop - starter)/60;

return finalsMinute;
}
public long returnFinalsSeconds(){
    finalsSeconds = (stop-starter)%60;
    return finalsSeconds;
}
}














