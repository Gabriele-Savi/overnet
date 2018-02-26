
public class Diagonally {

	public static void main(String[] args) {
		String diagonally = "diagonally";
		char space = ' ' ;
		char c;
		for(int x = 0; x < diagonally.length(); x++) {
			
			for(int y = 0; y <= x; y++) {
				c = diagonally.charAt(y);
				
				if(x == y) {
					
					for(int a = 0; a < y; a++) {
						System.out.print(space);
					}
					
					System.out.println(c);
					
				}
			}
		}

	}

}
