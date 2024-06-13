public class Main{
    public static void main(String[] args){
        FabricaFiguras fabrica = new FabricaFiguras();
        Figura figura1 = fabrica.crearFigura("circulo");
        figura1.dibujar();

        Figura figura2 = fabrica.crearFigura("cuadrado");
        figura2.dibujar();
    }
}