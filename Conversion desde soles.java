import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char conversion;
		double soles, moneda=0;
		int continuar=0;
		do {
			
			System.out.println("=========== CONVERSION DESDE SOLES ============");
			System.out.println("Ingrese la conversion: ");
			System.out.print("Soles --> Euro:     [E]\nSoles --> Dolar:    [D]\nSoles --> Yen       [Y]\n");
			conversion = scanner.nextLine().charAt(0);
			
			System.out.print("Ingrese la cantidad de soles a convertir: ");
			soles = scanner.nextDouble();
			
			if(conversion=='E' || conversion =='e') {
				moneda = soles/3.5;
				System.out.printf("%.2f euros",moneda  );
			}else if(conversion=='D' || conversion == 'd') {
				moneda = soles/2.8;
				System.out.printf("%.2f dolares",moneda  );
			}else if(conversion=='Y' || conversion=='y') {
				moneda = soles/0.03;
				System.out.printf("%.2f yenes",moneda  );
			}
			System.out.print("\nDesea contiuar: \nSi   [1]\nNo[otro numero]");
			continuar = scanner.nextInt();
			scanner.nextLine();
		}while(continuar==1);
		scanner.close();
		
	}
}
