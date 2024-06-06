import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int termino, continuar;
		double x, respuesta, fac;
		do{
			respuesta = 0;
			fac = 1;
			
			System.out.println("======= ECUACION SUMA DE LOS PRIMEROS TERMINOS =======");
			System.out.println("=== 1 + X + (X^2)/2! + (X^3)/3! + (X^4)/4! + .... ====");
			System.out.print("Ingrese el termino: ");
			termino = scanner.nextInt();
			System.out.print("Ingrese el valor de x: ");
			x = scanner.nextDouble();
			
			for(int i=1;i<=(termino-1);i++) {
				fac *= i;
				respuesta += (Math.pow(x,i))/fac;
			}
			System.out.println("===== RESULTADO ======");
			System.out.println((respuesta+1));
			
			System.out.print("Desea continuar: \nSi   [1]\nNo   [otro numero]");
			continuar = scanner.nextInt();
		}while(continuar==1);
		scanner.close();
		
	}
}
