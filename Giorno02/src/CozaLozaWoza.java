public class CozaLozaWoza { // Save as "CozaLozaWoza.java"
	public static void main(String[] args) {
		int lowerbound = 1, upperbound = 100;
		String res = null;
		Boolean printed = false;
		
		for(int number = lowerbound; number <= upperbound; number++) {
			if(number % 3 == 0) {
				res = "Coza";
			}
			else if(number % 5 == 0) {
				res = "Loza";
			}
			else if(number % 7 == 0) {
				res = "Woza";
			}else {
				res = "" + number;
			}
			System.out.print(" " + res);
		}
		
		System.out.println("\n");
		
		for(int number = lowerbound; number <= upperbound; number++) {
			if(number % 3 == 0) {
				printed = true;
				res = "Coza";
			}else if(number % 5 == 0) {
				printed = true;
				res = "Loza";
			}else if(number % 7 == 0) {
				printed = true;
				res = "Woza";
			}else {
				printed = false;
			}
			
			if(printed == false) {
				res = "No";
			}
			
			System.out.print(" " + res);
		}
		
		
		
		
	}
}
