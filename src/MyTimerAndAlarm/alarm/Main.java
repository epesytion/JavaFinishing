package MyTimerAndAlarm.alarm;


import MyTimerAndAlarm.logicOfLogic;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        logicOfLogic ll = new logicOfLogic(); //It's better to use ready class for audioplaying and prompt logic
        System.out.print("Enter an hour: ");
        int hour = scanner.nextInt();
        System.out.print("Enter an minute: ");
        int minute = scanner.nextInt();
        System.out.print("Enter an second: ");
        int second = scanner.nextInt();

        LocalTime alarm = LocalTime.of(hour, minute, second);
        TimerTask timerTask = new TimerTask() {
            public void run() {
                LocalTime now1 = LocalTime.now(); //everytime we should update the 'now' time.
                LocalTime now = LocalTime.of(now1.getHour(), now1.getMinute(), now1.getSecond());
                //Bcs, if we will declare LocalTime out of run() it won't update everytime. So I put the declaration
                // within the run(). It will run everytime and declare new 'now' time everytime.

                if(now.isAfter(alarm)) {
                    ll.alarm();
                    System.out.println("Alarm has been stopped");
                    timer.cancel();
                }
            }

        };
        timer.schedule(timerTask, 1000, 1000);
    }
}


