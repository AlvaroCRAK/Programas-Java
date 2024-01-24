import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char producto;
		do {
		System.out.println("============== COMPRAR UN PRODUCTO =============");
		System.out.println("Ingrese el producto que desea: ");
		System.out.println("Televisor         [A]");
		System.out.println("Computadora       [B]");
		System.out.println("Laptop            [C]");
		System.out.println("Guitarra          [D]");
		producto = scanner.next().charAt(0);
		}while(producto !='A' && producto !='B' && producto !='C' && producto !='D');
		
		double importe = 0, impuesto,importeFinal;
		switch(producto) {
			case 'A':importe = 2000;
				break;
			
			case 'B':importe = 5000;
				break;
			
			case 'C':importe = 3000;
				break;
				
			case 'D':importe = 1000;
				break;
		}
		impuesto = importe*0.18;
		importeFinal = importe + impuesto;
		System.out.printf("El importe de compra es de: %.2f\n",importe);
		System.out.printf("El impuesto es de: %.2f\n",impuesto);
		System.out.printf("El importe final es de: %.2f",importeFinal);
		scanner.close();
		
	}
}
