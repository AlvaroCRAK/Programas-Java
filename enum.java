public class Main{
    public static void main(String[] args){
        Main main = new Main();
        main.mostrar();
    }
    void mostrar(){
        for(Planet planet : Planet.values()) System.out.printf("Planet: %s\n\tName: %s\n\tNumero: %d\n\tKm: %f\n\tArray: %d\n\n",
                planet.name(), planet.getNombre(), planet.getNumber(), planet.getKm(), planet.ordinal());
    }
}
public enum Planet{
    MERCURY(1, "Mercurio", 2134.2314),
    VENUS(2, "Venus", 1234.4321),
    EARTH(3, "Tierra", 6543.3456),
    MARS(4, "Marte", 0987.7890),
    JUPITER(5, "Jupiter", 1234.1234),
    SATURN(6, "Saturno", 2345.543),
    URANUS(7, "Urano", 2345.5432),
    PLUTO(8, "Pluton", 5432.1234);
    private int number;
    private String nombre;
    private double km;
    Planet(int number, String nombre, double km){
        this.number = number;
        this.nombre = nombre;
        this.km = km;
    }
    public int getNumber(){
        return this.number;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getKm(){
        return this.km;
    }
}
