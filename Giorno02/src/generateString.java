import java.util.Random;

public class generateString {

	public static void main(String[] args) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char generated;
		String str = "";
		
		for(int i = 0; i < 10; i++) {
			Random random = new Random();
			int randomNumber = random.nextInt(0 + 1 + 25) - 0;
			generated = alphabet.charAt(randomNumber);
			str = str + generated;
		}
		//stampa stringa generata
		System.out.println(str);
		
		//reverse stringa generata
		str = new StringBuilder(str).reverse().toString();
		System.out.println(str);
		
		//salva la stringa 
		String oldStr = str;
		
		//Taglia la stringa a 7 caratteri
		str = str.substring(7);
		str = new StringBuilder(str).reverse().toString();
		System.out.println(str);
		
		//cut oldstring dal carattere 3 all'8
		oldStr = oldStr.substring(3, 8);
		
		
		System.out.println(oldStr + str);
		
		
		
	}

}
