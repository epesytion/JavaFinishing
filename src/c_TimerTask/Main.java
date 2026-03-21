package c_TimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static void main(String[] args) {
        // Timer = Class that schedules tasks at specific times or periodically.
        //         Useful for: sending notifications, scheduled updates, repetitive actions

        // TimerTask = Represents the task that will be executed by the Timer.
        //             You will extend the TimerTask class to define your task (by anonymous classes)
        //             Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){ //Need to use anonymous func to override run() method
            int count = 3;
            @Override
            public void run() { //Actually the run() goes infinitely. To stop it at some exact time,
                                // we need to make a condition to stop and use .cancel() method
                System.out.println("Hello");
                count--;
                if(count <= 0){
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };
        //Let's display "Hello in 3 sec"
        timer.schedule(task,1000, 1000); //In 1 second there are 1000 milliseconds
        // Delay - the second parameter -> after how many milliseconds need to start?
        // Period - the third parameter -> periodically execute the task in period of some num
        //timer.schedule(task, 0, 1000) - means start immediately, and continue displaying "hello" every 1000 ms

    }


}
