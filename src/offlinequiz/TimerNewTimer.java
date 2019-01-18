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
static long finals;


public void setStarterTime(){
 starter= timestamp.getTime()/1000*60; //long starter = timestamp.getTime()/1000*60; // sätter en timestamp på start i millesekuder som förändras till minuter
    }

public void setStopTime(){
stop = timestamp.getTime()/1000*60;// sätter en timestamp på stop i millesekunder som förändras till minuter
}

public void setFinalTime(){
finals = stop-starter; // tar stop minus start. Eftersom stopvärdet är högre än startvärdet. och får ut totala tiden spelets gång.
}

public long returnFinal(){
return finals;
}
}














