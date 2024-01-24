import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Car myCar = new Car();
		
		System.out.println("La marca del carro es: "+ myCar.marca);
		System.out.println("El modelo del carro es: " + myCar.modelo);
		System.out.println("El color del carro es: " + myCar.color);
		System.out.println("El precio del carro es: "+ myCar.precio);
		System.out.print("Usted conduce el coche: \nSi   [1]\nNo   [otro numero]");
		int i = scanner.nextInt();
		if(i ==1) {
			myCar.conducir();
		}else myCar.frenar();
		
		scanner.close();
	}
}
class Car{
	String marca = "Chevrolet";
	String modelo = "Corvette";
	int year = 2023;
	String color = "Rojo";
	double precio = 500000;
	
	void conducir() {
		System.out.println("Conduzco el coche. ");
	}
	void frenar() {
		System.out.println("No conduzco el coche. ");
	}
}
