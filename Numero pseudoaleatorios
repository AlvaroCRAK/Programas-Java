import java.util.*;
public class Main{
	int[] A = new int[50];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Main programa = new Main();
		
		MenuOpciones(scanner, random,programa);
		
	}
	static void MenuOpciones(Scanner scanner, Random random, Main programa) {
		int opc;
		do {
			
			do {
				System.out.println("========= MENU DE OPCIONES =========");
				System.out.println("Llenar elementos:         [1]");
				System.out.println("Mostrar elementos:        [2]");
				System.out.println("Ordenar de menor a mayor: [3]");
				System.out.println("Ordenar de mayor a menor: [4]");
				System.out.println("Salir:                    [5]");
				opc = scanner.nextInt();
			}while(opc!=1 && opc!=2 && opc!=3 && opc!=4 && opc!=5);
			switch(opc) {
			case 1:
				programa.LlenarElementos(random);
				break;
			case 2:
				programa.MostrarElementos();
				break;
			case 3:
				programa.OrdenardeMenoraMayor();
				break;
			case 4:
				programa.OrdenardeMayoraMenor();
				break;
			default:
				break;
			}
		}while(opc!=5);
	}
	void LlenarElementos(Random random) {
		
		for(int i=0;i<A.length;i++) {
			int x = random.nextInt(100)+1;
			A[i]=x;
		}
	}
	void MostrarElementos() {
		for(int i:A) {
			System.out.print(i+", ");
		}
	}
	void OrdenardeMenoraMayor(){
		for(int i=1;i<A.length;i++) {
			int temp = A[i];
			int j = i-1;
			while(j>=0 && A[j]>temp) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = temp;
		}
	}
	void OrdenardeMayoraMenor() {
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length - i -1;j++) {
				if(A[j]<A[j+1]) {
					int temp = A[j+1];
					A[j+1]=A[j];
					A[j] = temp;
				}
			}
		}
	}
}
