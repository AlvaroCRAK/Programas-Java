import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		char destino;
		double precio=0, cantidad, descuento=0;
		
		System.out.println("============ OFERTA DE PASAJES ============");
		System.out.println("Ingrese el destino: ");
		System.out.print("Paris      [A]\n");
		System.out.print("Italia     [B]\n");
		System.out.print("Grecia     [C]\n");
		destino = scanner.nextLine().charAt(0);
		
		System.out.println("Ingrese la cantidad de pasajes: ");
		cantidad = scanner.nextInt();
		
		if(destino == 'A'||destino=='a') {
			precio = 184;
			if(cantidad<5)descuento = 0.9;
			else descuento = 0.85;
		}else if(destino == 'B' || destino == 'b') {
			precio = 139.7;
			if(cantidad<5)descuento =0.85;
			else descuento = 0.8;
		}else if(destino == 'C' || destino == 'c') {
			precio = 127.4;
			if(cantidad<5)descuento = 0.8;
			else descuento = 0.75;
		}
		precio = precio*cantidad*descuento;
		
		System.out.print("El total a pagar es de: " + precio);
		scanner.close();
	}
}
