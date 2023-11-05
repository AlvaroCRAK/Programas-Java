import java.util.*;
public class Main{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========== PAGO POR JORNALES OBRERO ================");
		
		System.out.print("Ingrese el numero de obreros: ");
		int obreros = scanner.nextInt();
		
		int ht;
		double jextra,jtotal,jsemanal;
		
		for(int i=0;i<obreros;i++) {
			System.out.print("Ingrese el numero de hora laburadas Obrero "+(i+1)+": ");
			ht = scanner.nextInt();
			
			if(ht<=40) {
				jextra = 0;
				jsemanal = ht*10;
			}else {
				jextra = 15*(ht-40);
				jsemanal = 400;
			}
			jtotal = jextra + jsemanal;
			System.out.println("El jornal semanal es de: " + jsemanal);
			System.out.println("El jornal extra es de: " + jextra);
			System.out.println("El jornal total es de: " + jtotal);
			System.out.println("================================================");
			
		}
		
	}
}
