package controlador;
import vista.*;
public class Programa{
    Ventana ventana;

    Programa(){
        ventana = new Ventana();
        mostrarVentana();
    }
    void mostrarVentana(){
        ventana.setVisible(true);
    }

    public static void main(String[] args){
        new Programa();
    }
}