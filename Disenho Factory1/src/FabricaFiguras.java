public class FabricaFiguras {
    public Figura crearFigura(String tipo){
        if( tipo.equalsIgnoreCase("Circulo")) return new Circulo();
        else if( tipo.equalsIgnoreCase("Cuadrado")) return new Cuadrado();
        else return null;
    }
}
