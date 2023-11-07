import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int personas, dia;
		
		System.out.println("========== ENTRADAS =========");
		System.out.print("Ingrese el numero de personas: ");
		personas = scanner.nextInt();
		
		int [] entradasAdulto = new int [personas];
		int [] entradasNino = new int [personas];
		int [] importe = new int [personas];
		double [] descuento = new double [personas];
		
		llenarDatos(entradasAdulto, entradasNino, scanner, personas);
		
		dia = llenarDia(scanner);
		
		importe(entradasAdulto, entradasNino, scanner, dia, importe, descuento);
		
		mostrarImporte(importe, descuento);
		
		scanner.close();
		
	}
	static void llenarDatos(int x[], int y[], Scanner scanner, int length) {
		System.out.println("Ingrese la cantidad de entradas a comprar, segun persona y etapa de vida:");
		for(int i=0;i<length;i++) {
			System.out.println("Persona " + (i+1) + ": ");
			System.out.print("Entradas adulto: ");
			x[i] = scanner.nextInt();
			System.out.print("Entradas nino");
			y[i] = scanner.nextInt();
		}
		
	}
	static int llenarDia(Scanner scanner) {
		int dia;
		do {
			System.out.print("Ingrese el dia: \nLunes    [1]\nMartes    [2]\nMiercoles a Viernes    [3]\nSabado y Domingo    [4]");
			dia = scanner.nextInt();
		}while(dia != 1 && dia != 2 && dia != 3 && dia != 4);
		return dia;
	}
	static void importe(int x[], int y[], Scanner scanner, int dia, int importe[], double descuento[]) {
		int a=0, b=0;
		switch(dia) {
			case 1:
				a = 9;
				b = 7;
				break;
			case 2:
				a=7;
				b=7;
				break;
			case 3:
				a=10;
				b=8;
				break;
			case 4:
				a = 12;
				b=9;
				break;
		}
		for(int i=0;i<x.length;i++) {
			importe[i] = (x[i]*a) + (y[i]*b);
			if(x[i]+y[i]>5) {
				descuento[i]=(double)importe[i]*0.1;
			}else {
				descuento[i]=0;
			}
		}
		
	}
	static void mostrarImporte(int importe[], double descuento[]) {
		System.out.println("============== IMPORTE ==============");
		for(int i =0;i<importe.length;i++) {
			System.out.println("Persona "+ (i+1) + ": " + (importe[i]-descuento[i]));
			System.out.println("============");
		}
	}
	
	
}
