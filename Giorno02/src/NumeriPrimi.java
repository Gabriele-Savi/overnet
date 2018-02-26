
public class NumeriPrimi {

	public static void main(String[] args) {
		Boolean isPrime;
		
		
		for(int x = 1; x < 100; x++) {
			
			isPrime = true;

			for(int y = 2; y < x; y++) {	
				
				if(x % y == 0) {
					isPrime = false;
				}			
			}	
			
			if(isPrime) {
				System.out.println("Il numero " + x + " è un numero primo.");
			}
		}
	}
}
