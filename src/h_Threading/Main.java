package h_Threading;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // Threading = Allows a program to run multiple tasks simultaneously
        //             Helps to improve performance with time-consuming operations
        //             (File I/O, network communications, or any background tasks)
        // How to create a Thread:
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        // Let's consider the quiz, if user don't answer the question in time, he fails.

        Scanner sc = new Scanner(System.in);

/*
        for(int i = 0; i<5; i++) {

            try{ //we need to handle 'Interruption' extension of Threads
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Thread Interrupted");
            }
            if(i ==5){
                System.out.println("Time's up");
            }
        }
        System.out.println("You have 5 sec. to enter your name");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

*/

        // We're waiting for prompt to enter our name, but since the all upper code is in main thread, it will go
        // line by line consequently.



        //1. We need to create new class 'MyRunnable'


        //2.
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable); //New thread and passing the runnable object as an argument
        thread.setDaemon(true); //if the main thread is finished, others will imediately finish too
        thread.start(); //starting the thread
        System.out.println("You have 5 sec. to enter your name");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        //If we run of the time, the program will be done
        sc.close();
    }
}
