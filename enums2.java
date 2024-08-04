  GNU nano 7.2                                                                                                       Main.java
import java.util.Scanner;
enum Articulo {
  ROPA("Ropa", "Material que usamos los humanos para poder abregarnos y resaltar un tipo de estilo"),
  ELECTRODOMESTICOS("Electrodomesticos", "Tecnologia que usa la electricidad para facilitarnos la vida como humanos"),
  ANIMALES("Animales", "Tipo de vida al cualpertenecemos  y nuestro significado es preservar los genes");

  String name;
  String description;

  Articulo(String name, String description){
    this.name = name;
    this.description = description;
  }
  void setName(String name){
    this.name = name;
  }
  void setDescription(String description){
    this.description = description;
  }
  String getName(){
    return name;
  }
  String getDescription(){
    return description;
  }
}
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Selecciones una categoria de producto: ");
    Articulo[] articulos = Articulo.values();
    for ( int i = 0; i < Articulo.values().length; i++ )
      System.out.printf("%d. %s: %s\n", i + 1, articulos[i].getName(), articulos[i].getDescription());
    int n = scanner.nextInt();
    if ( n < 1 || n > articulos.length ){
      System.out.println("no valido");
      System.exit(1);
    }
    Articulo articuloSeleccionado = articulos[n - 1];
    System.out.println("Articulo seleccionado: " + articuloSeleccionado.getName());
    System.out.println("Description: " + articuloSeleccionado.getDescription());
  }
}
