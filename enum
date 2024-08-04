  GNU nano 7.2                                                                                                                        Main.java
import java.util.Scanner;
enum DiaSemana{
  LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
  boolean esFinSemana(){
    return this == SABADO || this == DOMINGO;
  }
  @Override
  public String toString(){
    return "Dia de la semana: " + name();
  }
}
class Main{
  public static void main(String[] args){
    System.out.print("Ingrese el dia de la semana: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    DiaSemana dia = null;
    try {
      dia = DiaSemana.valueOf(input);
    } catch (IllegalArgumentException e){
      System.out.println("Dia ingresado no es valido.");
      System.exit(1);
    }
    switch ( dia ){
      case DiaSemana.LUNES:
        System.out.println(DiaSemana.LUNES);
        break;
      case DiaSemana.MARTES:
        System.out.println(DiaSemana.MARTES);
        break;
      case DiaSemana.MIERCOLES:
        System.out.println(DiaSemana.MIERCOLES);
        break;
      case DiaSemana.JUEVES:
        System.out.println(DiaSemana.JUEVES);
        break;
      case DiaSemana.VIERNES:
        System.out.println(DiaSemana.VIERNES);
        break;
      case DiaSemana.SABADO:
        System.out.println(DiaSemana.SABADO);
        break;
      case DiaSemana.DOMINGO:
        System.out.println(DiaSemana.DOMINGO);
        break;
    }
    System.out.println( dia.name() );
    System.out.println("Es fin de semana: " + dia.esFinSemana());
    System.out.println( dia.toString() );
  }
}
