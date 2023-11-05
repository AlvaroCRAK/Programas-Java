import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int alumnos;
		
		System.out.println("============== PROMEDIO DE ALUMNOS ==============");
		System.out.print("Ingrese el numero de alumnos: ");
		alumnos = scanner.nextInt();
		
		double [] notasEP = new double [alumnos];
		double [] notasEF = new double [alumnos];
		double [] notasPPC = new double [alumnos];
		double [] notasPTP= new double [alumnos];
		System.out.println("Ingrese la nota PPT de los siguientes estudiantes: ");
		llenarNotas(notasPTP, scanner);
		
		System.out.println("Ingrese la nota PPC de los estudiantes: ");
		llenarNotas(notasPPC, scanner);
		
		System.out.println("Ingrese la nota EP de los estudiantes: ");
		llenarNotas(notasEP, scanner);
		
		System.out.println("Ingrese la nota EF de los estudiantes: ");
		llenarNotas(notasEF, scanner);
		System.out.println("=============== NOTAS FINALES ================");
		notasAlumnos(notasEP, notasEF, notasPPC, notasPTP);
		System.out.println("==============================================");
		scanner.close();
	}
	static void llenarNotas(double x[], Scanner scanner) {
		for(int i=0; i<x.length; i++) {
			System.out.println("Alumno " + (i+1) + ": ");
			x[i]=scanner.nextDouble();
		}	
	}
	static void notasAlumnos(double a[], double b[], double c[], double d[]) {
		double [] promedio = new double [a.length];
		for(int i=0;i<a.length;i++) {
			promedio[i] = a[i]*0.3 + b[i]*0.4 + c[i]*0.15 + d[i]*0.15;
			System.out.print("= Alumno " + (i+1) + ": ");
			System.out.printf("%.2f                             =\n",promedio[i]);
		}
	}
	
}

