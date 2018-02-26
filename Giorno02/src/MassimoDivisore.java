import java.util.Random;

public class MassimoDivisore {

	public static void main(String[] args) {
		int app = 0;
		
		Random random = new Random();
		int randomNumber = random.nextInt(100 + 1 + 0) - 0;
		
		for(int i = 1; i < randomNumber -1 ; i++) {
			if (randomNumber % i == 0) {
				app = i;
			}
		}
		System.out.println(randomNumber + "  " + app);

	}

}
