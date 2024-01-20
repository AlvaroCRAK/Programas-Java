public class Main{
	public static void main(String[] args) {
		int[] w = {45, 67, 45, 67, 89, 45, 56, 67, 89, 90, 90, 90, 45, 67, 56, 11, 11, 11, 56, 89, 56};
		for(int i : w) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		for(int i = 0; i < w.length; i++) {
			int rep = 0; int temp = 0;
			for(int j = 0; j < w.length; j++) {
				if(w[i] == w[j]) {
					rep++;
					temp = j;
				}
			}
			if(i == temp) {
				System.out.println(w[i] + " = " + rep);
			}
		}
	}
}
//zublime
