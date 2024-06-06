import java.util.*;
public class Main{
	public static void main(String [] args) {
		Scanner scanner = new Scanner (System.in);
		int trabajadoras;
		System.out.println("=========== SUELDO DE ACUERDO A LOS HIJOS ===========");
		System.out.print("Ingrese el numero de trabajadoras: ");
		trabajadoras = scanner.nextInt();
		int [] hijos = new int [trabajadoras];
		//Datos de hijos
		System.out.println("Ingrese el numero de hijos: ");
		for(int i=0;i<trabajadoras;i++) {
			System.out.print("trabajadora " + (i+1) +": ");
			hijos[i]=scanner.nextInt();
		}
		double sueldo;
		double bonificacion;
		System.out.println("============= Sueldos ===========");
		for(int i=0;i<trabajadoras;i++) {
			sueldo =2000;
			System.out.print("Trabajadora " + i +": ");
			bonificacion = sueldo*hijos[i]*0.04;
			System.out.print((sueldo +bonificacion) + "\n");
		}
		System.out.println("============ Bonificaciones ===========");
		for(int i=0;i<trabajadoras;i++) {
			sueldo=2000;
			System.out.print("Trabajadora " + (i+1) + ": ");
			bonificacion = sueldo*hijos[i]*0.04;
			System.out.println(bonificacion);
		}
		scanner.close();
	}
}
