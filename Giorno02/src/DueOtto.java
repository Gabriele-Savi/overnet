import java.util.Random;

public class DueOtto {

	public static void main(String[] args) {
		int cont = 0;
		
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int number = random.nextInt(800 + 1 + 200) - 200;
			String numberConvert = "" + number;
			System.out.println(numberConvert);

			
			for (int a = 0; a < numberConvert.length(); a++) {
				char n = numberConvert.charAt(a);

				if((n == '8') || (n == '3'))
					cont++;
			}	
		}
		
		if(cont > 20) 
			System.out.println("\nSUCCESS " + cont);
		else
			System.out.println("\nFAIL " + cont);

	}

}
