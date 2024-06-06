import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("============ SALARIOS A AUMENTAR ============");
		System.out.print("Ingrese el numero de trabajadores: ");
		int trabajadores = scanner.nextInt();
		System.out.println("Ingrese los contratos de los trabajadores: ");
		double [] contrato = new double[trabajadores];
		double [] antes = new double [trabajadores];
		
		for(int i=0;i<trabajadores;i++) {
			System.out.print("Trabajador " + (i+1)+": ");
			contrato[i] = scanner.nextDouble();
			
			antes[i] = contrato[i];
			
			if(contrato[i]<=6000 && contrato[i]>3000)contrato[i] *=1.05;
			else if(contrato[i]>1500)contrato[i] *=1.1;
			else if(contrato[i]>0)contrato[i] *=1.2;
		}
		
		System.out.println("Ingrese el estado civil del trabajador: casado[1] o soltero [0]");
		int  [] estado = new int[trabajadores];
		for(int i=0;i<trabajadores;i++) {			
			do {
				System.out.print("Trabajador " + (i+1) + ": ");
				estado[i] = scanner.nextInt();
			}while(estado[i]!=1 && estado[i]!=0);
			if(estado[i]==1)contrato[i]+=150;
			else contrato[i]+=100;		
		}
		System.out.println("============== RESULTADOS ==============");
		for(int i=0;i<trabajadores;i++) {
			System.out.println("Trabajador "+(i+1)+":");
			System.out.printf("Bonificacion: %.2f\n" , (contrato[i]-antes[i]));
			System.out.printf("Sueldo Neto: %.2f\n" , contrato[i]);
			System.out.println("================================");
		}
		scanner.close();
	}
}
