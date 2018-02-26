import java.util.Random;

public class maxNumber2 {

	public static void main(String[] args) {
		int max = 100;
		int min = -100;
		
		int average = 0;
		
		for(int i = 0; i < 10; i++) {
			Random random = new Random();
			int randomNumber = random.nextInt(100 + 1 + 100) - 100;
			System.out.println(randomNumber);

			average = ((average + randomNumber) / 10);
			
		}
		System.out.println("The average is: " + average);
	}

}
