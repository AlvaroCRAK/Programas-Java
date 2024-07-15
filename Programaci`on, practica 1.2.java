import java.util.Scanner;
import java.util.InputMismatchException;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int categoria = 0, material = 0, cantidad = 0;
		double precio = 0, bonificacion = 0;
		do {
			try {
				System.out.print("Ingrese la categoria: \nA:     [1]\nB:     [2]\nC:     [3]\n"); categoria = scanner.nextInt();
			}catch(InputMismatchException exception) {
				System.out.print("Ingrese una opcion valida"); scanner.nextLine();
			}
		}while(categoria != 1 && categoria != 2 && categoria != 3);
		do {
			try {
				System.out.print("Ingrese el material a comprar:\nTejas:    [1]\nLosetas:   [2]\n"); material = scanner.nextInt();
			}catch(InputMismatchException exception) {
				System.out.print("Ingrese una opcion valida"); scanner.nextLine();
			}
		}while(material != 1 && material != 2);
		
		do {
			try {
				System.out.print("Ingrese la cantidad a comprar: "); cantidad = scanner.nextInt();
			}catch(InputMismatchException exception) {
				System.out.print("Ingrese una opcio valida"); scanner.nextLine();
			}
		}while(cantidad <= 0);
		
		switch(categoria) {
		case 1:
			if(material == 1) precio = 2.5;
			else precio = 2;
			break;
		case 2:
			if(material == 1) precio = 2;
			else precio = 1.5;
			break;
		case 3:
			if(material == 1) precio = 1.5;
			else precio = 1;
			break;
	
		}
		
		if(cantidad > 1000) bonificacion = 150;
		else if(cantidad > 500) bonificacion = 100;
		else if(cantidad > 250) bonificacion = 50;
		else bonificacion = 0;
		
		System.out.printf("Importe de compra: %.2f\nBonificacion: %.2f\nDescuento por seguro: %d\nImporte total: %.2f", (precio * cantidad), bonificacion, 75, (precio * cantidad + bonificacion - 75));
		scanner.close();
	}
}
//zublime
