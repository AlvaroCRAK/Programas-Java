import java.io.IOException;
import java.io.FileNotFoundException;
import javax.sound.sampled.*;
import java.io.File;
public class Main{
    public static void main(String[] args){
        File file = new File("saraMusic.wav");
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            new Gui();
        } catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("error xd");
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException e){
            e.printStackTrace();
        }
    }
}