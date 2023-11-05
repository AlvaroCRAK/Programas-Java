import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("============= POLIZA DE SEGUROS ==========");
		char cobertura; 
		double poliza;
		do {
			System.out.println("Ingrese la poliza  a contratar:");
			System.out.println("Cobertura amplia (A)");
			System.out.print("Dan;os a terceros (B)");
			cobertura = scanner.nextLine().charAt(0);
		}while(cobertura!='a' && cobertura!='A' && cobertura!='B' && cobertura!='b');
		
		if(cobertura == 'a' || cobertura == 'A')poliza = 1200*1.1;
		else poliza = 950*1.1;
		System.out.println("Ingrese '1' SI o 'otra tecla' NO de acuerdo a su accionar: ");
		System.out.print("Bebe alcohol seguidamente: ");
		int alcohol = scanner.nextInt();
		if(alcohol == 1)poliza *=1.1;
		
		System.out.print("Utiliza lentes: ");
		int lentes = scanner.nextInt();
		if(lentes== 1)poliza *= 1.05;
		
		System.out.print("Padece alguna enfermedad: ");
		int enfermedad = scanner.nextInt();
		if(enfermedad== 1)poliza *= 1.05;
		
		System.out.print("Es mayor de 40 an;os: ");
		int mayor = scanner.nextInt();
		if(mayor== 1)poliza *= 1.1;
		
		System.out.print("El costo de la poliza es de: " + poliza);
		scanner.close();
		
	}
}
