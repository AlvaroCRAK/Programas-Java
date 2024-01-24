public class Main{
	public static void main(String[] args) {
		int[][] m = {{67, 89, 90, 12, 13, 15},
					 {11, 23, 32, 65, 87, 98},
					 {31, 41, 51, 61, 71, 91},
					 {55, 66, 77, 88, 99, 36},
					 {54, 64, 74, 84, 94, 14},
					 {43, 53, 63, 73, 83, 93}};
		int num = 0;
		int par = 0, impar = 0, sumaPares = 0, sumaImpares = 0;
		for(int i = 0; i < m.length; i++) {
			System.out.print("|");
			for(int j = 0; j < m[i].length; j++) {
				if(j < m[i].length -1)System.out.print(m[i][j] + ", ");
				else System.out.print(m[i][j] + "|\n");
				num ++;
				if(m[i][j] % 2 == 0) {
					par++; sumaPares += m[i][j];
				}else {
					impar++; sumaImpares += m[i][j];
				}
			}
		}
		System.out.printf("\nNumeros pares: %d\nNumeros impares: %d\nSuma de numeros pares: %d\nSuma de numeros impares: %d\n", par, impar, sumaPares, sumaImpares);
		int[] z = new int[num];
		System.out.print("\nElmentos z:\n");
		for(int i = 0, temp = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				z[temp] = m[i][j];
				if(temp < num -1) System.out.print(z[temp] + ", ");
				else System.out.print(z[temp]);
				temp ++;
			}
		}
	}
}
//zublime
