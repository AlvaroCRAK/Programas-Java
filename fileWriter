import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        try{
            FileWriter fileWriter = new FileWriter("alvaro.txt");
            System.out.println("Ingrese el texto (\"finish\" para salir): ");
            String texto, texto2;
            do{
                texto = scanner.nextLine();
                texto2 = main.comprobarFinish(texto);
                fileWriter.write(texto2 + '\n');
            }while(texto.equals(texto2));

            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public String comprobarFinish(String texto){
        String[] palabras = texto.split(" ");
        if(palabras[palabras.length - 1].equalsIgnoreCase("finish")){
            return texto.substring(0, texto.length() - 6);
        }else return texto;
    }
}
