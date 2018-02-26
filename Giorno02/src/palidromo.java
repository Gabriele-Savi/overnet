
public class palidromo {

	public static void main(String[] args) {
		String word = "ABBA";
		
		int numberLetter = word.length();
	
		int center = numberLetter / 2;
		
		String left = word.substring(0, center);
		String right = word.substring(center, numberLetter);
		
		right = new StringBuilder(right).reverse().toString();
		
		if(left.equals(right) == true) {
			System.out.println("The word " + word + " is a palidromo");
		}else {
			System.out.println("La parola " + word + " non è un palidromo");
		}

	}

}
