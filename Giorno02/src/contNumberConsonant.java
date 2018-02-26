
public class contNumberConsonant {

	public static void main(String[] args) {
		String str = "123AABEPOU QQAAZ";
		str = str.toUpperCase();
		char a;
		int countV = 0;
		int countC = 0;
		int countN = 0;
		
		for(int i = 0; i < str.length(); i++) {
			a = str.charAt(i);
			switch(a){
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					countV++;
					break;
				case ' ':
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					countN++;
				break;
				default:
					countC++;		
			}
		}
		System.out.println("Il numero delle non lettere è " +countN);
		System.out.println("Il numero delle vocali è " + countV);
		System.out.println("Il numero delle consonanti è " +countC);
	}
}
