import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double contrato, consumo;
		double importe, relleno, mantenimiento, igv,pagototal;
		System.out.println("============= Sedapal =============");
		System.out.println("Ingrese el numero de contrato: ");
		contrato = scanner.nextDouble();
		System.out.println("Ingrese el numero de metros cubicos consumidos: ");
		consumo = scanner.nextDouble();
		System.out.println("======== PAGOS ========");
		importe = contrato*consumo;
		relleno = importe*0.014;
		mantenimiento = importe*0.021;
		igv = (relleno+mantenimiento+importe)*0.19;
		pagototal = importe +relleno+mantenimiento+igv;
		System.out.println("Importe: " + importe);
		System.out.println("Relleno Sanitario: " + relleno);
		System.out.println("Mantenimiento General: " + mantenimiento);
		System.out.println("IGV: " + igv);
		System.out.println("Pago total: " + pagototal);
	}		
}
