
public class NumeroDispariGriglia {

	public static void main(String[] args) {
		int number = 5;
		if(number % 2 == 1) {
			System.out.println("Il numero è dispari");
		}
		
		for(int a = 1; a <= number; a++) {
			System.out.print("\n");
			for(int b = 0; b < 10; b++) {
				System.out.print(a);
			}
		}

	}

}
