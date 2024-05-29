import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int libro, sede, cantidad;
		double precio = 0, importe;
		System.out.println("======== VENTA DE LIBRO ==========");
		System.out.print("Ingrese el libro:\nManual P.C.   [1]\nManual P.I.S.  [2]\nManual P.I.E.  [3]\nManual P.A.  [4]");
		libro = scanner.nextInt();
		System.out.print("Ingrese la cantidad: ");
		cantidad = scanner.nextInt();
		System.out.print("Ingrese el lugar de compra: \nSede   [1]\nDesde casa   [2]");
		sede = scanner.nextInt();
		
		switch(libro) {
		case 1:precio = 30;
		break;
		case 2:precio = 27;
		break;
		case 3:precio = 20;
		break;
		case 4:precio = 35;
		break;
		default:
			break;
		}
		importe = precio *cantidad;
		if(sede ==2)importe *=1.02;
		System.out.print("Su importe a pagar es de: " + importe);
		scanner.close();
	
