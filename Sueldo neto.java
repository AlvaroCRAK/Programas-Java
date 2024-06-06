import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sueldo, sueldoNeto;
		int continuar;
		do {
		System.out.println("============== SUELDO NETO =============");
		System.out.print("Ingese el sueldo del trabajador: ");
		sueldo = scanner.nextInt();
		
		if(sueldo >= 850)sueldoNeto = sueldo*1.2;
		else sueldoNeto = sueldo*1.3;
		
		System.out.print("El salario neto es de: " + sueldoNeto);
		System.out.print("\nDesea continuar el programa: \nSi    [1]\nNo    [otro numero]");
		continuar=scanner.nextInt();
		}while(continuar == 1);
		scanner.close();
		
	}
}
