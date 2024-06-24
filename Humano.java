import java.util.*;
public class Main{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el primer nombre: ");
		String name1 = scanner.nextLine();
		System.out.print("Ingrese sus caracteristicas: \nAltura: ");
		double altura1 = scanner.nextDouble();
		System.out.print("Peso: ");
		double peso1 = scanner.nextDouble();
		System.out.print("Personalidad: ");
		scanner.nextLine();
		String personalidad1 = scanner.nextLine();
		System.out.print("Edad: ");
		int edad1 = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("Ingrese el segundo nombre: ");
		String name2 = scanner.nextLine();
		System.out.print("Ingrese sus caracteristicas: \nAltura: ");
		double altura2 = scanner.nextDouble();
		System.out.print("Peso: ");
		double peso2 = scanner.nextDouble();
		System.out.print("Personalidad: ");
		scanner.nextLine();
		String personalidad2 = scanner.nextLine();
		System.out.print("Edad: ");
		int edad2 = scanner.nextInt();
		
		scanner.close();
		
		Humano humano1 = new Humano(name1, altura1, peso1, personalidad1, edad1);
		Humano humano2 = new Humano (name2, altura2, peso2, personalidad2, edad2);
		
		humano1.tomar();
		humano2.comer();
		
	}
}
class Humano{
	String name;
	double altura;
	double peso;
	String personalidad;
	int edad;
	Humano(String name, double altura, double peso, String personalidad, int edad){
		this.name = name;
		this.altura = altura;
		this.peso = peso;
		this.personalidad = personalidad;
		this.edad = edad;
	}
	void tomar() {
		System.out.println(this.name + " esta tomando ron");
	}
	void comer() {
		System.out.println(this.name + " esta comiendo ajinomen");
	}
	
}
