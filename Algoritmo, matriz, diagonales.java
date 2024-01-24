import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class Main{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] m = new int[6][6];
		
		menuOpciones(scanner, m);
	}
	static void menuOpciones(Scanner scanner, int m[][]) {
		int opc = 0;
		int sumDI = 0, sumDD = 0, sum = 0;
		boolean a = true;
		do {
			
			do {
				try {
					System.out.print("\n================ MENU DE OPCIONES ================\n");
					System.out.print("Ingrese una opcion:\nVisualizar matriz: [1]\nSumatoria diagonal izquierda:  [2]\nSumatoria diagonal derecha:  [3]\nSumatoria de diagonales:  [4]\nDatos extras:  [5]\nSalir:  [6]\n");
					opc = scanner.nextInt();
					if(opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5 && opc != 6) System.out.print("Ingrese una opcion valida:\n");
				}catch(InputMismatchException exception) {
					System.out.print("Ingrese un valor correcto\n"); scanner.nextLine();
				}
			}while(opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5 && opc != 6);
			
			if( a == true )llenarMatriz(m);
			a = false;
			
			switch(opc) {
			case 1:
				visualizarMatriz(m); break;
			case 2:
				sumDI = sumatoriaDI(m); System.out.print(sumDI); break;
			case 3:
				sumDD = sumatoriaDD(m); System.out.print(sumDD); break;
			case 4:
				sum = sumatoriaDiagonales(sumDI, sumDD); System.out.print(sum); ;break;
			case 5:
				datosExtras(m); break;
			case 6:
				System.out.print("Gracias por usarme1\n");
			}
			
		}while(opc != 6);
	}
	static int numeroAleatorio() {
		Random random = new Random();
		int num = random.nextInt(100);
		return num;
	}
	static void llenarMatriz(int m[][]) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = numeroAleatorio();
			}
		}
	}
	static void visualizarMatriz(int m[][]) {
		for(int i = 0; i < m.length; i++) {
			System.out.print("|");
			for(int j = 0; j < m[i].length; j++) {
				if(j < m[i].length - 1)
					System.out.printf("%2d ", m[i][j]);
				else 
					System.out.printf("%2d|", m[i][j]);
			}
			System.out.println();
		}
	}
	static int sumatoriaDI(int m[][]) {
		int suma = 0;
		for(int i = 0; i < m.length; i++) {
			suma += m[i][i];
		}
		return suma;
	}
	static int sumatoriaDD(int m[][]) {
		int suma = 0;
		for(int i = 0; i < m.length; i++) {
			suma += m[i][m.length - 1 - i];
		}
		return suma;
	}
	static int sumatoriaDiagonales(int x, int y) {
		return (x + y);
	}
	static void datosExtras(int x[][]) {
		int pares = 0, impares = 0, sumPares = 0, sumImpares = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] % 2 == 0) {
					pares ++;
					sumPares += x[i][j];
				}
				else {
					impares ++;
					sumImpares += x[i][j];
				}
			}
		}
		System.out.print("xd\n");
		System.out.printf("Digitos pares: %d\nDigitos impares: %d\nSuma de digitos pares: %d\nSuma de digitos impares: %d\n", pares, impares, sumPares, sumImpares);
	}
}
//zublime
