package MyTimerAndAlarm.timer;

import MyTimerAndAlarm.logicOfLogic;

import java.util.Timer;
import java.util.TimerTask;
public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        prompt p = new prompt();
        logicOfLogic ll = new logicOfLogic();

        TimerTask timerTask = new TimerTask() {
            int minutes = p.minutes("How many minutes would you like to enter?: ");
            int seconds = p.seconds("How many seconds would you like to enter?: ");
            @Override
            public void run() {
                if(minutes<10 && seconds<10) {
                    System.out.println("0"+minutes + ":" + "0"+seconds);
                    seconds--;
                    if(seconds < 0) {
                        seconds = 59;
                        minutes--;
                    }
                    if(minutes < 0){
                        ll.alarm();
                        System.out.println("Timer has been stopped");
                        timer.cancel();
                    }
                }
                else if (minutes<10) {
                    System.out.println("0"+minutes + ":" + seconds);
                    seconds--;
                    if(seconds < 0) {
                        seconds = 59;
                        minutes--;
                    }
                    if(minutes < 0){
                        ll.alarm();
                        System.out.println("Timer has been stopped");
                        timer.cancel();
                    }
                }
                else if (seconds<10) {
                    System.out.println(minutes + ":" + "0"+seconds);
                    seconds--;
                    if(seconds < 0) {
                        seconds = 60;
                        minutes--;
                    }
                    if(minutes < 0){
                        ll.alarm();
                        System.out.println("Timer has been stopped");
                        timer.cancel();
                    }
                }
                else {
                    System.out.println(minutes + ":" + seconds);
                    seconds--;
                    if(seconds < 0) {
                        seconds = 59;
                        minutes--;
                    }
                    if(minutes < 0){
                        ll.alarm();
                        System.out.println("Timer has been stopped");
                        timer.cancel();
                    }
                }
            }
        };

        timer.schedule(timerTask, 0, 1000);
    }
}