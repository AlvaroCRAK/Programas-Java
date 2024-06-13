public class FabricaElectronica {
    ProductoElectronico crearProducto(String tipo){
        if ( tipo.equalsIgnoreCase("Televisor") ) return new Televisor();
        else if( tipo.equalsIgnoreCase("Computadora") ) return new Computadora();
        else return null;
    }
}
