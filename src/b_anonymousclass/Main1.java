package b_anonymousclass;

public class Main1 {
    static void main(String[] args) {
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        //Let's have a dog class with method sound.
        Dog dog = new Dog();

        //If we wanna create unique implementation for some method, we could create new class
        // (TalkingDog) and then override the method of super class
        TalkingDog talkingDog = new TalkingDog();

        dog.sound();
        talkingDog.sound();
        //And it works!
        //But for just one instance of Dog we create the whole class. Instead of this it's better to use
        //Anonymous classes (Go to Main2)

    }
}
