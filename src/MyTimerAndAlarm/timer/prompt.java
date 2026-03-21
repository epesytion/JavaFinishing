package MyTimerAndAlarm.timer;

import java.util.Scanner;

public class prompt {
    Scanner scanner = new Scanner(System.in);
    int minutes(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    int seconds(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}