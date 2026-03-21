package b_anonymousclass;

public class Main2 {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.gender();

        Person person2 = new Person(){ //anonymous
            @Override
            void gender() {
                System.out.println("I am a woman");
            }
        };
        person2.gender();
    }
}
