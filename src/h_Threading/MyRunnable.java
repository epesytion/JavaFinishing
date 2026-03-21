package h_Threading;

public class MyRunnable implements Runnable {//it will implement Runnable interface
    @Override //Bcs we implement interface, we MUST declare/override existing methods
    public void run() {
        //and here we can past countdown timer
        for(int i = 1; i<=5; i++) {

            try { //we need to handle 'Interruption' extension of Threads
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
            if (i == 5) {
                System.out.println("Time's up");
                System.exit(0); //exit program if user didnt write any string
            }
        }
    }//2. Okay inherit it to Main
}
