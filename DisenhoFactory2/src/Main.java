public class Main {
    public static void main ( String[] args ){
        FabricaElectronica fabrica = new FabricaElectronica();

        ProductoElectronico producto1 = fabrica.crearProducto("televisor");
        producto1.encender();

        ProductoElectronico producto2 = fabrica.crearProducto("Computadora");
        producto2.encender();
    }
}