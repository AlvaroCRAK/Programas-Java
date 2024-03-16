import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            File file = new File("salsaValentina.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            System.out.println("Salsa Valentina (Rojuu) :\nPlay: [p]\nStop: [s]\nReset: [r]\nSalir: [Q]");
            char input = 0;
            final long n = 1_000_000L;
            while(input != 'Q'){
                input = scanner.next().charAt(0);
                input = Character.toUpperCase(input);
                switch(input){
                    case 'P': clip.start(); break;
                    case 'S': clip.stop(); break;
                    case 'R':
                    case '1': clip.setMicrosecondPosition(0); break;
                    case 'Q': clip.close(); break;
                    case '2': clip.setMicrosecondPosition(185 * n); break;
                    case '3': clip.setMicrosecondPosition(373 * n); break;
                    case '4': clip.setMicrosecondPosition(501 * n); break;
                    case '5': clip.setMicrosecondPosition(734 * n); break;
                    case '6': clip.setMicrosecondPosition(971 * n); break;
                    default:
                        System.out.println("Opcion no valida :c"); break;
                }

            }
        }catch(IOException | LineUnavailableException | UnsupportedAudioFileException e){
            e.printStackTrace();
        }
    }
}
