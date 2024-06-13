public class Main{
    public static void main(String[] args){
        FabricaBebidas fabrica = new FabricaBebidas();

        Bebida bebida1 = fabrica.crearBebida("cocacola");
        bebida1.beber();

        Bebida bebida2 = fabrica.crearBebida("incacola");
        bebida2.beber();

        Bebida bebida3 = fabrica.crearBebida("pepsi");
        bebida3.beber();
    }
}
