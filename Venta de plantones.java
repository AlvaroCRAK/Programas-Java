import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int cantidad, obsequio, continuar;
		double precio=1, importe;
		int producto;
		
		do {
			do {
			System.out.println("========= VENTA DE PLANTONES =========");
			System.out.println("Ingrese el producto a comprar: \nForestal   			 S/.0.35 [1]\nForestal ornamental  		 S/.0.50 [2]\nFrutal   			 S/.2.00 [3]"
					+ "\nFrutal injertado  		 S/.3.00 [4]\nBonsai   			 S/.5.00 [5]");
			producto = scanner.nextInt();
			}while(producto!=1 && producto!=2 && producto!=3 && producto!=4 &&producto!=5 );
			switch(producto){
				case 1:
					precio = 0.35;
					break;
				case 2:
					precio = 0.35;
					break;
				case 3:
					precio = 2;
					break;
				case 4:
					precio = 3;
					break;
				case 5:
					precio = 5;
					break;	
			}
			System.out.print("Ingrese la cantidad: ");
			cantidad = scanner.nextInt();
			
			importe = cantidad*precio;
			
			if(cantidad>120) {
				obsequio = 3*(cantidad/12);
			}else {
				obsequio = cantidad/12;
			}
			
			System.out.println("===== Resultados: =====");
			System.out.println("Importe a pagar: " + importe);
			System.out.println("Plantones de obsequio: " + obsequio);
			
			
			System.out.print("\nDesea continuar:\nSi   [1]\nNo   [otro numero]");
			continuar = scanner.nextInt();
		}while(continuar==1);
		scanner.close();
	}
}
