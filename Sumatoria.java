import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, temp, fac, termino, continuar =0;
		double respuesta;
		do {
			fac =2;
			respuesta =0;
			num1 = 1;
			num2 = 2;
			System.out.println("====================== SUMATORIA ========================");
			System.out.println("==== 1/1! + 2/2! + 3/3! + 5/4! + 8/5! + 13/6! + ... =====");
			System.out.print("Ingrese el termino: ");
			termino = scanner.nextInt();
			if(termino==1) {
				System.out.println("==== RESPUESTA ====");
				System.out.println(1);
				System.out.print("Desea continuar: \nSi   [1]\nNo    [2]");
				continuar = scanner.nextInt();
			}
			else {
				for(int i=3;i<=(termino);i++) {
					temp = num2;
					num2 = num2 + num1;
					num1 = temp;
					fac *= i;
					respuesta += (double)num2/fac;
				}
				System.out.println("==== RESPUESTA ====");
				System.out.println(respuesta + 2);
				
				System.out.print("Desea continuar: \nSi   [1]\nNo    [2]");
				continuar = scanner.nextInt();
			}
		}while(continuar==1);
		scanner.close();
	}
}
