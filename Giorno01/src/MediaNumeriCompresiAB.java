
public class MediaNumeriCompresiAB {

	public static void main(String[] args) {
		double a = 2;
		double b = 6;
		double cont = 0;
		double num = a;
		
		while(a != b) {
			a++;
			num = num + a;
			cont++;
		}
		double average = num / cont;

		System.out.println("Sum is " + num + " evarage is " + average);
	}

}
