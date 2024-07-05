import java.util.*;
public class Main{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========= PRESUPUESTO PARA SALUD =========");
		System.out.println("Ingrese el presupuesto: ");
		double presupuesto = scanner.nextDouble();
		System.out.println("Ginecologia: " + presupuesto*0.4);
		System.out.println("Traumatologia: " + presupuesto*0.3);
		System.out.println("Pediatria: " + presupuesto*0.3);
		scanner.close();
	}
}
