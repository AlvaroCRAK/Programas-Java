import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String num;
		char dig;
		int dign, digitos, sumpares, sumimpares, continuar;
		do {
			digitos = sumpares = sumimpares = 0;
			System.out.println("========= NUMERO =========");
			System.out.println("Ingrese el numero: ");
			num = scanner.nextLine();
			
			for(int i=0;i<num.length();i++) {
				dig = num.charAt(i);
				dign = dig - '0';
				digitos++;
				if(dign%2==0)sumpares +=dign;
				else sumimpares += dign;
			}
			System.out.println("===== DATOS =====");
			System.out.println("Digitos: " + digitos);
			System.out.println("Suma de digitos pares: " + sumpares);
			System.out.println("Suma de digitos impares: "+ sumimpares);
			
			System.out.print("Desea continuar:\nSi    [1]\nNo    [otro numero]");
			continuar = scanner.nextInt();
			scanner.nextLine();
		}while(continuar==1);
		scanner.close();
	}
}
