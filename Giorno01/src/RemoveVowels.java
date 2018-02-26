import java.util.Arrays;

public class RemoveVowels {

	public static void main(String[] args) {		
		
		String[] array = {"cello", "guitar", "violin", "double bass"};
		
		String str = Arrays.toString(array);
		System.out.println(str);
		
		for(int a = 0; a < str.length(); a++) {
			char c = str.charAt(a);
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				str = str.replaceAll(""+ c, "");
				System.out.println(str);
				break;
			}
		}	
	}
}
