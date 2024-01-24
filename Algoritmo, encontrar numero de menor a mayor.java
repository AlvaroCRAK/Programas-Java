import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class Main{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int x[] = new int[400];
		menuOpciones(scanner, random, x);
	}
	static void menuOpciones(Scanner scanner, Random random, int x[]) {
		int opc = 0;
		do {
			do {
				try {
					System.out.print("\n================ MENU DE OPCIONES ================\nIngrese una opcion:\n");	
					System.out.print("Llenar elementos: [1]\nMostrar elementos:  [2]\nEncontrar numero de menor a mayor:  [3]\nSalir:  [4]\n"); opc = scanner.nextInt();
					if(opc != 1 && opc != 2 && opc != 3 && opc != 4) System.out.print("Ingrese un valor valido!\n"); scanner.nextLine();
					}
				catch(InputMismatchException exception) {
					System.out.print("Ingrese un valor valido!\n");
				}
			}while(opc != 1 && opc != 2 && opc != 3 && opc != 4);
			switch(opc) {
			case 1:
				llenarElementos(x); break;
			case 2:
				mostrarElementos(x); break;
			case 3:{
				int num = 0;
				do {
					try {
						System.out.print("Ingrese el numero a encontrar: "); num = scanner.nextInt();
						if(num < 0) System.out.print("Ingrese un valor valido:!\n");
					}catch(InputMismatchException exception) {
						System.out.print("Ingrese un valor correcto:\n"); scanner.nextLine();
					}
				}while(num < 0);
				
				int target = encontrarNumero(x, num);
				
				if(target == -1) System.out.print("El numero no se encontro en el \"array\" \n");
				else System.out.print("Numero encontrado en la posicion:\n" + target);
				
				break;
			}
				
			case 4:
				System.out.print("Gracias por usarme!\n");
				break;
			default:
				System.out.print("No deb`io llegar aqu`i :/\n");
			}
		}while(opc != 4);
	}
	static int numeroAleatorio() {
		Random random = new Random();
		int x = random.nextInt(3000) + 1;
		return x;
	}
	static void llenarElementos(int x[]) {
		for(int i = 0; i < x.length; i++) {
			x[i] = numeroAleatorio();
		}
	}
	static void mostrarElementos(int x[]) {
		int a = 0;
		for(int i : x) {
			if(a != x.length - 1)
				System.out.print("x[" + a + "] = " + i + "  || ");
			else 
				System.out.print("x[" + a + "] = " + i);
			a++;
		}
	}
	static int encontrarNumero(int x[], int target) {
		
		int[] z = new int[x.length];
		for(int i = 0; i < z.length; i++) {
			z[i] = x[i];
		}
		for(int i = 1; i < z.length; i++) {
			int temp = z[i];
			int j = i - 1;
			while(j >= 0 && z[j] > temp) {
				z[j+1] = z [j];
				j--;
			}
			z[j+1] = temp;
		}
		
		int inicio = 0;
		int fin = z.length - 1;
		while(inicio <= fin) {
			int mitad = inicio + (fin - inicio) / 2;
			
			if(z[mitad] == target) return mitad;
			else if(z[mitad] < target) inicio = mitad + 1;
			else fin = mitad - 1;
		}
		return -1;
	}
	
}
//zublime
