import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int continuar;
		do {
			System.out.println("============= HELADERIA PALERMO ==============");
			System.out.println("Ingrese el helado: \n101      S/.21.5\n102      S/.30.0\n101      S/.15.5");
			int codigo = scanner.nextInt();
			
			while(codigo != 101 && codigo != 102 && codigo != 103) {
				System.out.print("Ingrese el codigo correcto: ");
				codigo = scanner.nextInt();
			}
			double precio=0;
			switch(codigo) {
			case 101:
				precio = 21.5;
				break;
			case 102:
				precio = 30;
				break;
			case 103:
				precio = 15.5;
				break;
			}
			System.out.print("Ingrese la cantidad a comprar: ");
			int cantidad = scanner.nextInt();
			
			double importe = cantidad * precio;
			double descuento=0;
			
			if(importe>=700)descuento=importe*0.16;
			else if(importe>=500)descuento=importe*0.14;
			else if(importe>=200)descuento = importe*0.12;
			else if(importe>0)descuento = importe*0.1;
			System.out.println("======= DATOS =======");
			System.out.println("Importe: "+ (importe));
			System.out.println("Descuento: "+ descuento);
			System.out.println("Importe a pagar: "+ (importe-descuento));
			
			System.out.print("Desea continuar el programa: \nSi   [cualquier numero]\nNo   [1]");
			continuar = scanner.nextInt();
		}while(continuar !=1);
		System.out.print("====== GRACIAS POR SU COMPRA ! =======");
		scanner.close();
	}
}
