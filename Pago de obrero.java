import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int categoria=0, material, bonificacion=0, cantidad;
		double importe=0, precio=0, importef;
		int continuar;
		do {
			System.out.println("============ PAGO DE OBRERO A DESTAJO ===========");
			do {
				System.out.println("Ingrese el material: \nTejas     [1]\nLosetas   [2]");
				material = scanner.nextInt();
			}while(material!= 1 && material!=2);
			do {
				System.out.println("Ingrese la categoria: \nA   [1]\nB   [2]\nC   [3]");
				categoria = scanner.nextInt();
			}while(categoria!=1 && categoria!=2 && categoria!=3);
			do {
				System.out.print("Ingrese la cantidad a preducir: ");
				cantidad = scanner.nextInt();
			}while(cantidad<=0);
			switch(categoria) {
			case 1:
				switch(material) {
				case 1:
					precio = 2.5;
					break;
				case 2:
					precio = 2;
					break;
				}
				break;
			case 2:
				switch(material){
				case 1:
					precio = 2;
					break;
				case 2:
					precio = 1.5;
					break;
				}
				break;
			case 3:
				switch(material) {
				case 1:
					precio = 1.5;
					break;
				case 2:
					precio = 1;
					break;
				}
				break;
			}
			if(cantidad>1000)bonificacion=150;
			else if(cantidad > 500)bonificacion=100;
			else if(cantidad > 250)bonificacion=50;
			else if(cantidad>0)bonificacion =0;
			
			importe = cantidad*precio;
			
			importef= importe- bonificacion-75;
			
			System.out.println("========= RESULTADOS =========");
			System.out.printf("Importe: %.2f \n",importe );
			System.out.printf("Bonificacion: %d \n", bonificacion);
			System.out.printf("Seguro: %d\n",75 );
			System.out.printf("Importe a pagar: %.2f\n\n", importef);
			
			System.out.print("Desea continuar: \nSi   [otro numero]\nNo    [1]");
			continuar = scanner.nextInt();
		}while(continuar!=1);
		scanner.close();
	}
}
