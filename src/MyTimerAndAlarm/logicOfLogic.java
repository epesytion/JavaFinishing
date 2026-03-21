package MyTimerAndAlarm;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Scanner;

public class logicOfLogic {
    public void alarm(){
        String path = "/home/epes/IdeaProjects/DRAFT/src/draft/IN_MY_HEAD.wav";
        File f = new File(path);
        String response = " ";
        try(Scanner scanner = new Scanner(System.in); AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(f)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            while(!response.equals("q")){
                clip.start();
                System.out.print("Type 'q' to quit: ");
                response = scanner.nextLine().trim().toLowerCase();
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());

        }
    }
}
