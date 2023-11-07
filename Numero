import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int num, ndig, dig, sumpares, sumimpares, continuar;
		do {
			System.out.println("============= NUMERO =============");
			
			System.out.print("Ingrese el numero: ");
			num = scanner.nextInt();
			sumpares =0;
			sumimpares = 0;
			ndig=0;
			for(int i=1;i<=num;i++) {
				dig = num%10;
				
				if(dig%2==0)sumpares+=dig;
				else sumimpares+=dig;
				
				num  /= 10;
				ndig++;
			}
			
			System.out.println("======= DATOS =======");
			System.out.println("Digitos: " + ndig);
			System.out.println("Suma de digitos pares: " + sumpares);
			System.out.println("Suma de digitos impares: " + sumimpares);
			
			System.out.print("Desea continuar:\nSi    [1]\nNo    [otro numero]");
			continuar = scanner.nextInt();
		}while(continuar==1);	
		scanner.close();
	}
}
