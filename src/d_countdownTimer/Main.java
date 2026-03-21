package d_countdownTimer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();

        System.out.print("Enter time greater than 0: ");
        TimerTask timerTask = new TimerTask() {
            int time = sc.nextInt();

            @Override
            public void run() {
                System.out.println(time);
                if (time <= 0) {
                    System.out.println("Time is over!");
                    timer.cancel();
                }
                time--;
            }
        };
        timer.schedule(timerTask, 0, 1000);


    }

}
