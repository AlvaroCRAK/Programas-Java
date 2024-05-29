import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int continuar, codigo, cantidad;
		double precio=0, descuento, importe;
		do {
			System.out.println("======== VENTA ========");
			do {
				System.out.print("Ingrese el codigo del producto: ");
				codigo = scanner.nextInt();
			}while(codigo!=101 && codigo!=102 && codigo!=103);
			
			System.out.print("Ingrese la cantidad a comprar: ");
			cantidad = scanner.nextInt();
			
			switch(codigo) {
				case 101:
					precio=21.5;
					break;
				case 102:
					precio = 30;
					break;
				case 103:
					precio = 15.5;
					break;
			}
			
			importe = cantidad*precio;
			if(importe>=700)descuento=importe*0.16;
			else if(importe>=500)descuento=importe*0.14;
			else if(importe>=200)descuento=importe*0.12;
			else descuento = importe*0.1;
			
			System.out.println("=== RESULTADO ===");
			System.out.printf("Importe de compra: S/.%.2f\n",importe );
			System.out.printf("Descuento: S/.%.2f\n", descuento);
			System.out.printf("Importe a pagar: S/.%.2f\n", (importe-descuento));
			
			
			System.out.print("Desea continuar: \nSi   [1]\nNo   [otron numero]");
			continuar = scanner.nextInt();
		}while(continuar==1);
		scanner.close();
	}
}
