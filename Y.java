import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double x, y;
		System.out.println("Ingrese el valor de x: ");
		x = scanner.nextDouble();
		if(x>=500)y = (3*(Math.pow(x,2))-x)/7;
		else if(x>=0)y = 2*x +5;
		else y=0;
		System.out.print("y = " + y);
		scanner.close();
	}
}
