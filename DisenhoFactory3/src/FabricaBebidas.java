public class FabricaBebidas {
    public Bebida crearBebida(String tipo){
        if( tipo.equalsIgnoreCase("CocaCola") ) return new CocaCola();
        else if( tipo.equalsIgnoreCase("IncaCola") ) return new IncaCola();
        else if( tipo.equalsIgnoreCase("Pepsi") ) return new Pepsi();
        else return null;
    }
}